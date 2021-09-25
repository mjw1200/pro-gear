using System.AddIn;
using System.Windows.Forms;
using RightNow.AddIns.AddInViews;
using System.ServiceModel;
using System;
using System.ServiceModel.Channels;
using Account_CF_115.CWSS;

namespace Account_CF_115
{
    internal class WebService
    {
        private static RightNowSyncPortClient _client;

        /// <summary>
        /// Create a WebService instance using the global context, initializing the
        /// RightNowSyncPortClient if necessary.
        /// </summary>
        public WebService(IGlobalContext globalContext)
        {
            if (WebService._client == null)
            {
                try
                {
                    BindingElementCollection elements;
                    EndpointAddress endPointAddr;
                    BasicHttpBinding binding;

                    // Set up endpoint
                    endPointAddr = new EndpointAddress(globalContext.InterfaceURL + "../services/soap");

                    // Set up binding
                    binding = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
                    binding.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
                    binding.ReceiveTimeout = new TimeSpan(0, 10, 0);
                    binding.MaxReceivedMessageSize = 1048576; //1MB
                    binding.SendTimeout = new TimeSpan(0, 10, 0);

                    // Create client
                    _client = new RightNowSyncPortClient(binding, endPointAddr);

                    // Set up binding elements. (?)
                    elements = _client.Endpoint.Binding.CreateBindingElements();
                    elements.Find<SecurityBindingElement>().IncludeTimestamp = false;
                    _client.Endpoint.Binding = new CustomBinding(elements);

                    // Specify credentials. 11.5 doesn't seem to have an elegant way to use the existing session
                    _client.ClientCredentials.UserName.UserName = globalContext.Login;
                    _client.ClientCredentials.UserName.Password = "BD6DN5bFJsgH";
                }
                catch (Exception ex)
                {
                    throw ex;
                }
            }
        }

        /// <summary>
        /// Update accounts.c$fakesessionid with fieldValue
        /// </summary>
        /// <param name="pacctID">Account ID to update</param>
        /// <param name="fieldValue">Value for the custom field</param>
        public void UpdateFakeSession(long pacctID, string fieldValue)
        {
            UpdateProcessingOptions updateProcessingOptions;
            ClientInfoHeader clientInfoHeader;
            GenericField customField;
            Account account;
            ID acctID;

            RNObject[] accountObjects;

            // Set up custom field
            customField = new GenericField();
            customField.name = "c$fakesessionid";
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;

            if (fieldValue != string.Empty)
            {
                // Sending empty strings results in a validation error. If we're nulling the CF,
                // we'll just leave the DataValue null
                DataValue dv;

                dv = new DataValue();
                dv.Items = new Object[] { fieldValue };
                dv.ItemsElementName = new ItemsChoiceType[] { ItemsChoiceType.StringValue };

                customField.DataValue = dv;
            }

            // Set up the ID we need
            acctID = new ID();
            acctID.idSpecified = true;
            acctID.id = pacctID;

            // Set up the account object
            account = new Account();
            account.CustomFields = new GenericField[] { customField };
            account.ID = acctID;

            // Set up the final objects needed to actually call the update
            updateProcessingOptions = new UpdateProcessingOptions();
            accountObjects = new RNObject[] { account };
            clientInfoHeader = new ClientInfoHeader();
            clientInfoHeader.AppID = "Update Fake";

            try
            {
                _client.Update(clientInfoHeader, accountObjects, updateProcessingOptions);
            }
            catch (Exception e)
            {
                MessageBox.Show("Exception sending update: " + e.Message);
                throw (e);
            }
        }
    }

    [AddIn("EventConsoleOpen AddIn", Version = "1.0.0.0")]
    public class EventConsoleOpen : IEventConsoleOpen
    {

        #region IAddInBase Members

        /// <summary>
        /// Method which is invoked from the Add-In framework and is used to programmatically control whether to load the Add-In.
        /// </summary>
        /// <param name="GlobalContext">The Global Context for the Add-In framework.</param>
        /// <returns>If true the Add-In to be loaded, if false the Add-In will not be loaded.</returns>
        public bool Initialize(IGlobalContext GlobalContext)
        {
            try
            {
                // "pigfarts" isn't terribly useful...substitute as needed
                new WebService(GlobalContext).UpdateFakeSession(GlobalContext.AccountId, "pigfarts");
                MessageBox.Show("Session ID appears to be " + GlobalContext.SessionId);
            }
            catch (Exception e)
            {
                MessageBox.Show("IEventConsoleOpen exception: " + e.Message);
                return false;
            }

            return true;
        }

        #endregion
    }

    [AddIn("EventConsoleClose AddIn", Version = "1.0.0.0")]
    public class EventConsoleClose : IEventConsoleClose
    {
        IGlobalContext _globalContext;

        #region IEventConsoleClose Members

        /// <summary>
        /// Method which is invoked when the "Console Close" event occurs.
        /// </summary>
        /// <param name="Reason">The reason for the console close.</param>
        public void Notify(CloseReason Reason)
        {
            try
            {
                new WebService(_globalContext).UpdateFakeSession(_globalContext.AccountId, string.Empty);
            }
            catch (Exception e)
            {
                MessageBox.Show("IEventConsoleClose exception: " + e.Message);
            }
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
            _globalContext = GlobalContext;
            return true;
        }

        #endregion
    }
}
