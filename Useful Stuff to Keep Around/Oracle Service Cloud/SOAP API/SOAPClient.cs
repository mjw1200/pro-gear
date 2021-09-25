using System.ServiceModel.Channels;
using System.ServiceModel;
using System;

using YourNamespaceHere.OSC;

namespace YourNamespaceHere
{
    class SOAPClient
    {
        /// <summary>
        /// Constructor. Does what a constructor does.
        /// </summary>
        public SOAPClient()
        {
            this.cih = new ClientInfoHeader() { AppID = "OSC SOAP Client" };
            this.setUpClient();
        }

        /// <summary>
        /// This method is here simply for an easy sanity check, to verify connectivity to the
        /// server, and valid authentication. It's the continuity tester of code.
        /// </summary>
        public void ListIncidentDispositions()
        {
            NamedIDWithParent[] getValuesRv = null;

            try
            {
                getValuesRv = this.client.GetValuesForNamedIDHierarchy(this.cih, "Incident.Disposition");
            }
            catch (Exception e1)
            {
                System.Diagnostics.Debug.WriteLine(e1);
            }

            if (getValuesRv != null)
                System.Diagnostics.Debug.WriteLine("Worked, jerk");
        }

        /// <summary>
        /// Set up a client with username/password authentication
        /// </summary>
        private void setUpClient()
        {
            throw new Exception("Set up endpoint properly");
            EndpointAddress endpoint = new EndpointAddress("https://vhost/cgi-bin/.cfg/services/soap");

            this.client = new RightNowSyncPortClient(this.getBinding(), endpoint);
            throw new Exception("Username and password aren't set");
            this.client.ClientCredentials.UserName.UserName = "username";
            this.client.ClientCredentials.UserName.Password = "password";

            this.turnOffTimestamp();
        }

        ///// <summary>
        ///// Set up a client with session authentication
        ///// </summary>
        ///// <param name="globalContext"></param>
        //private void setUpClient(IGlobalContext globalContext)
        //{
        //    EndpointAddress endPointAddr = new EndpointAddress(globalContext.GetInterfaceServiceUrl(ConnectServiceType.Soap));
        //    this.client = new RightNowSyncPortClient(this.getBinding(), endPointAddr);
        //    globalContext.PrepareConnectSession(this.client.ChannelFactory);

        //    this.turnOffTimestamp();
        //}

        /// <summary>
        /// Set up and return a binding for the client
        /// </summary>
        /// <returns></returns>
        private BasicHttpBinding getBinding()
        {
            BasicHttpBinding binding = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
            binding.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
            binding.MaxReceivedMessageSize = 20975616; // 20 MB + 4KB for margin
            binding.MaxBufferSize = 20975616; // 20 MB + 4KB for margin

            return binding;
        }

        /// <summary>
        /// Turn off the timestamp, which chokes OSC's SOAP validation
        /// </summary>
        private void turnOffTimestamp()
        {
            BindingElementCollection elements = this.client.Endpoint.Binding.CreateBindingElements();
            elements.Find<SecurityBindingElement>().IncludeTimestamp = false;
            this.client.Endpoint.Binding = new CustomBinding(elements);
        }

        /// <summary>
        /// 
        /// </summary>
        private static UpdateProcessingOptions getUpdateProcessingOptions()
        {
            UpdateProcessingOptions upo = new UpdateProcessingOptions();
            upo.ReturnExpandedSoapFaultsSpecified = true;
            upo.ReturnExpandedSoapFaults = true;
            upo.SuppressExternalEvents = true;
            upo.SuppressRules = true;

            return upo;
        }

        /// <summary>
        /// 
        /// </summary>
        private static CreateProcessingOptions getCreateProcessingOptions()
        {
            CreateProcessingOptions cpo = new CreateProcessingOptions();
            cpo.ReturnExpandedSoapFaultsSpecified = true;
            cpo.ReturnExpandedSoapFaults = true;
            cpo.SuppressExternalEvents = true;
            cpo.SuppressRules = true;

            return cpo;
        }

        RightNowSyncPortClient client;
        ClientInfoHeader cih;
    }
}
