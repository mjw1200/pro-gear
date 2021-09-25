using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RightNow.AddIns.AddInViews;
using System.AddIn;
using System.Windows.Forms;

namespace AssignToMe
{
    public class AssignButton : IWorkspaceRibbonButton
    {
        public IGlobalContext GlobalContext { get; set; }
        public IRecordContext RecordContext { get; set; }

        public void Click()
        {
            // GlobalContext.CanEditIncidents || GlobalContext.CanCreateIncidents
            /*
            IWorkspaceRecord iwr = RecordContext.GetWorkspaceRecord(RightNow.AddIns.Common.WorkspaceRecordType.Incident);
            if (iwr != null)
                MessageBox.Show(iwr.GetType().ToString());
            else
                MessageBox.Show("null");    
             */
            MessageBox.Show("Bar");
            // GlobalContext.AutomationContext.CurrentWorkspace.GetWorkspaceRecord(
        }
    }

    [AddIn("Assign To Me Factory", Version = "1.0.0.0")]
    public class AssignButtonFactory : IWorkspaceRibbonButtonFactory
    {
        public IGlobalContext GlobalContext { get; set; }

        public IWorkspaceRibbonButton CreateControl(bool inDesignMode, IRecordContext context)
        {
            AssignButton ab = new AssignButton();
            
            ab.GlobalContext = GlobalContext;
            ab.RecordContext = context;

            return ab;
        }

        #region Trivial Properties

        public System.Drawing.Image Image32
        {
            get
            {
                return Properties.Resources.Radio32;
            }
        }

        public System.Drawing.Image Image16
        {
            get
            {
                return Properties.Resources.Radio16;
            }
        }

        public string Text
        {
            get
            {
                return "Assign To Me";
            }
        }

        public string Tooltip
        {
            get
            {
                return "Assign Current Incident To Me";
            }
        }

        #endregion

        public bool Initialize(IGlobalContext context)
        {
            MessageBox.Show("Foo");
            GlobalContext = context;
            return true;
        }
    }
}
