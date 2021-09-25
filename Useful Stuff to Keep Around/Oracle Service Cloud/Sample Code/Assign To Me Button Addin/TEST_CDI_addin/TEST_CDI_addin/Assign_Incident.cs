using System.AddIn;
using System.Drawing;
using System.Windows.Forms;
using RightNow.AddIns.AddInViews;
using RightNow.AddIns.Common;
using api.rightnow.com;
using fault.api.rightnow.com;
using obj.api.rightnow.com;

////////////////////////////////////////////////////////////////////////////////
//
// File: Assign_Incident.cs
//
// Comments:
//
// Notes: 
//
// Pre-Conditions: 
//
////////////////////////////////////////////////////////////////////////////////
namespace TEST_CDI_addin
{
    public class Assign_Incident : Panel, IWorkspaceComponent2
    {
        /// <summary>
        /// The current workspace record context.
        /// </summary>
        private IGlobalContext _GlobalContext;
        private IRecordContext _recordContext;
        private AssignButton _button;
        private string _username = "k_addin";
        private string _password = "1qaz!QAZ";

        /// <summary>
        /// Default constructor.
        /// </summary>
        /// <param name="inDesignMode">Flag which indicates if the control is being drawn on the Workspace Designer. (Use this flag to determine if code should perform any logic on the workspace record)</param>
        /// <param name="RecordContext">The current workspace record context.</param>
        public Assign_Incident(bool inDesignMode, IRecordContext RecordContext, IGlobalContext GlobalContext)
        {
            _GlobalContext = GlobalContext;
            _recordContext = RecordContext;
            _button = new AssignButton();

            this.Dock = DockStyle.Fill;
            this.Controls.Add(_button);

            if (!inDesignMode)
            {
                _button.assignClicked += new AssignButton.buttonHandler(_button_assignClicked);
            }
        }

        void _button_assignClicked()
        {
            //Get & set URL
            string url = _GlobalContext.InterfaceURL;
            url = url.Replace("http:", "https:");
            url = url.Replace("/php/", "/php/xml_api/soap_api.php");

            //Setup connection
            RNOWObjectFactory OF = new RNOWObjectFactory(url);
            bool bLogin = OF.login(_username, _password);
            //Get current workspace
            IIncident _incRecord = _recordContext.GetWorkspaceRecord(WorkspaceRecordType.Incident) as IIncident;
            //Fetch incident info
            RNOWIncident inc = new RNOWIncident(_incRecord.ID);
            OF.get(inc);
            //Fetch agent info
            RNOWAccount acct = new RNOWAccount();
            acct.ID = _GlobalContext.AccountId;
            OF.get(acct);
            //Setup group object
            RNOWGroupAcct g_acct = new RNOWGroupAcct();
            g_acct.AcctID = _GlobalContext.AccountId;
            g_acct.GroupID = acct.GroupID;
            inc.Assigned = g_acct;
            //update incident
            OF.update(inc);
            MessageBox.Show("The incident has been assigned to you.");
        }

        #region IAddInControl Members

        /// <summary>
        /// Method called by the Add-In framework to retrieve the control.
        /// </summary>
        /// <returns>The control, typically 'this'.</returns>
        public Control GetControl()
        {
            return this;
        }

        #endregion

        #region IWorkspaceComponent2 Members

        /// <summary>
        /// Sets the ReadOnly property of this control.
        /// </summary>
        public bool ReadOnly { get; set; }

        /// <summary>
        /// Method which is called when any Workspace Rule Action is invoked.
        /// </summary>
        /// <param name="ActionName">The name of the Workspace Rule Action that was invoked.</param>
        public void RuleActionInvoked(string ActionName)
        {
        }

        /// <summary>
        /// Method which is called when any Workspace Rule Condition is invoked.
        /// </summary>
        /// <param name="ConditionName">The name of the Workspace Rule Condition that was invoked.</param>
        /// <returns>The result of the condition.</returns>
        public string RuleConditionInvoked(string ConditionName)
        {
            return string.Empty;
        }

        #endregion
    }

    [AddIn("Workspace Factory AddIn", Version = "1.0.0.0")]
    public class WorkspaceAddInFactory : IWorkspaceComponentFactory2
    {
        #region IWorkspaceComponentFactory2 Members
        private IGlobalContext _GlobalContext;

        /// <summary>
        /// Method which is invoked by the AddIn framework when the control is created.
        /// </summary>
        /// <param name="inDesignMode">Flag which indicates if the control is being drawn on the Workspace Designer. (Use this flag to determine if code should perform any logic on the workspace record)</param>
        /// <param name="RecordContext">The current workspace record context.</param>
        /// <returns>The control which implements the IWorkspaceComponent2 interface.</returns>
        public IWorkspaceComponent2 CreateControl(bool inDesignMode, IRecordContext RecordContext)
        {
            return new Assign_Incident(inDesignMode, RecordContext, _GlobalContext);
        }

        #endregion

        #region IFactoryBase Members

        /// <summary>
        /// The 16x16 pixel icon to represent the Add-In in the Ribbon of the Workspace Designer.
        /// </summary>
        public Image Image16
        {
            get { return Properties.Resources.AddIn16; }
        }

        /// <summary>
        /// The text to represent the Add-In in the Ribbon of the Workspace Designer.
        /// </summary>
        public string Text
        {
            get { return "Assign_Incident - CDI"; }
        }

        /// <summary>
        /// The tooltip displayed when hovering over the Add-In in the Ribbon of the Workspace Designer.
        /// </summary>
        public string Tooltip
        {
            get { return "Assign_Incident - CDI: Assign an incident to yourself."; }
        }

        #endregion

        #region IAddInBase Members

        /// <summary>
        /// Method which is invoked from the Add-In framework and is used to programmatically control whether to load the Add-In.
        /// </summary>
        /// <param name="GlobalContext">The Global Context for the Add-In framework.</param>
        /// <returns>If true the Add-In to be loaded, if false the Add-In will not be loaded.</returns>
        public bool Initialize(IGlobalContext GlobalContext)
        {
            _GlobalContext = GlobalContext;
            return true;
        }

        #endregion
    }
}