        public Hitter()
        {
            this.setUpClient();
        }

        public void Hit()
        {
            NamedIDWithParent[] getValuesRv = null;

            try
            {
                getValuesRv = this.client.GetValuesForNamedIDHierarchy(this.cih, "Incident.Disposition");
            }
            catch (Exception e1)
            {
                System.Diagnostics.Debug.WriteLine(exceptionString(e1));
            }

            if (getValuesRv != null)
                System.Diagnostics.Debug.WriteLine("Worked, jerk");
        }

        private void setUpClient()
        {
            // The interface doesn't matter. That path element has to be there, and it has to end in
            // ".cfg", but otherwise it doesn't seem to have any effect. How odd.
            EndpointAddress endpoint = new EndpointAddress("https://vhost/cgi-bin/.cfg/services/soap");
            BasicHttpBinding binding = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
            binding.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
            binding.MaxReceivedMessageSize = 2097152; // 2Mb
            binding.MaxBufferSize = 2097152;

            this.client = new RightNowSyncPortClient(binding, endpoint);
            this.client.ClientCredentials.UserName.UserName = "username";
            this.client.ClientCredentials.UserName.Password = "password";

            BindingElementCollection elements = this.client.Endpoint.Binding.CreateBindingElements();
            elements.Find<SecurityBindingElement>().IncludeTimestamp = false;
            this.client.Endpoint.Binding = new CustomBinding(elements);
            this.client.Endpoint.Binding.SendTimeout = new TimeSpan(0, 5, 0);
            this.client.Endpoint.Binding.ReceiveTimeout = new TimeSpan(0, 5, 0);
            
            this.cih = new ClientInfoHeader() { AppID = "Moo" };
        }
        
        private static string exceptionString(Exception e)
        {
            StringBuilder sb = new StringBuilder(e.Message);

            if (e.InnerException != null)
                sb.Append("(" + e.InnerException.Message + ")");

            return sb.ToString();
        }

        RightNowSyncPortClient client;
        ClientInfoHeader cih;
