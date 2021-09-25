        private void setUpClients()
        {
            EndpointAddress endpoint = new EndpointAddress("https://opn-helix2.rightnowdemo.com/cgi-bin/opn_helix2.cfg/services/chat_soap");
            BasicHttpBinding binding = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
            binding.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
            binding.MaxReceivedMessageSize = 2097152;
            binding.MaxBufferSize = 2097152;

            WSChatCommonPortClient client = new WSChatCommonPortClient(binding, endpoint);
            //client.ClientCredentials.UserName.UserName = "chat_api";
            //client.ClientCredentials.UserName.Password = "a1b2c#d$";
            client.ClientCredentials.UserName.UserName = "RNT_mwaldron";
            client.ClientCredentials.UserName.Password = "ynVAr:V/b#9T";

            BindingElementCollection elements = client.Endpoint.Binding.CreateBindingElements();
            elements.Find<SecurityBindingElement>().IncludeTimestamp = false;
            client.Endpoint.Binding = new CustomBinding(elements);
            client.Endpoint.Binding.SendTimeout = new TimeSpan(0, 5, 0);
            client.Endpoint.Binding.ReceiveTimeout = new TimeSpan(0, 5, 0);

            ClientRequestHeader crh = new ClientRequestHeader() { AppID = "Moo" };
            GetChatUrlResult result = client.GetChatUrl(crh, URLTypeEnum.UQ, (decimal)1.1);
            client.Close();

            // Console.WriteLine("Moo");

            this.chatUrl = result.ChatUrl;
            EndpointAddress endpoint2 = new EndpointAddress(result.ChatUrl);
            BasicHttpBinding binding2 = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
            binding2.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
            binding2.MaxReceivedMessageSize = 2097152;
            binding2.MaxBufferSize = 2097152;

            this.uqclient = new WSChatUQPortTypeV1SV1Client(binding2, endpoint2);
            //this.uqclient.ClientCredentials.UserName.UserName = "chat_api";
            //this.uqclient.ClientCredentials.UserName.Password = "a1b2c#d$";
            this.uqclient.ClientCredentials.UserName.UserName = "RNT_mwaldron";
            this.uqclient.ClientCredentials.UserName.Password = "ynVAr:V/b#9T";

            BindingElementCollection elements2 = client.Endpoint.Binding.CreateBindingElements();
            elements2.Find<SecurityBindingElement>().IncludeTimestamp = false;
            this.uqclient.Endpoint.Binding = new CustomBinding(elements);
            this.uqclient.Endpoint.Binding.SendTimeout = new TimeSpan(0, 5, 0);
            this.uqclient.Endpoint.Binding.ReceiveTimeout = new TimeSpan(0, 5, 0);
        }
