        private RightNowSyncPortClient setUpClient(IGlobalContext globalContext)
        {
            // Initialize the endpoint address using global context URL
            EndpointAddress endPointAddr = new EndpointAddress(globalContext.GetInterfaceServiceUrl(ConnectServiceType.Soap));

            // Set up the binding, which controls key parts of how the transfer is handled
            // Oracle Service Cloud limits file attachments to 20MB max. FYI.
            BasicHttpBinding binding = new BasicHttpBinding(BasicHttpSecurityMode.TransportWithMessageCredential);
            binding.Security.Message.ClientCredentialType = BasicHttpMessageCredentialType.UserName;
            binding.MaxReceivedMessageSize = 20975616; // 20 MB + 4KB for margin
            binding.MaxBufferSize = 20975616; // 20 MB + 4KB for margin

            RightNowSyncPortClient client = new RightNowSyncPortClient(binding, endPointAddr);
            // Authenticate with session rather than username/password
            globalContext.PrepareConnectSession(client.ChannelFactory);

            // Turn off the timestamp, which chokes OSC's SOAP validation
            BindingElementCollection elements = client.Endpoint.Binding.CreateBindingElements();
            elements.Find<SecurityBindingElement>().IncludeTimestamp = false;
            client.Endpoint.Binding = new CustomBinding(elements);

            return client;
        }
