        public void CreateIncident()
        {
            CreateProcessingOptions cpo = new CreateProcessingOptions();
            Incident newIncident = new Incident();
            GenericObject orders;

            newIncident.Subject = "Incident (Item) Subject Goes Here (Test, please ignore)";
            newIncident.PrimaryContact = new IncidentContact() { Contact = new NamedID() { Name = "Herbert Birdsfoot" } };
            newIncident.Threads = new Thread[1] { new Thread() };
            newIncident.Threads[0].EntryType = new NamedID();
            newIncident.Threads[0].EntryType.ID = new ID() { id = 1, idSpecified = true }; // private note
            newIncident.Threads[0].Text = "This is a private note";
            newIncident.Threads[0].action = ActionEnum.add;
            newIncident.Threads[0].actionSpecified = true;

            cpo.SuppressExternalEvents = true;
            cpo.SuppressRules = true;

            ChainSourceID ci_id = new ChainSourceID();
            ci_id.idSpecified = false;
            ci_id.variableName = "IncidentIdName";
            newIncident.ID = ci_id;
            orders = this.createOrders(ci_id);

            CreateMsg createMessage = new CreateMsg();
            createMessage.ProcessingOptions = new CreateProcessingOptions();
            createMessage.ProcessingOptions.SuppressExternalEvents = true;
            createMessage.ProcessingOptions.SuppressRules = true;
            createMessage.RNObjects = new RNObject[] { newIncident, orders };
            BatchRequestItem bri = new BatchRequestItem() { Item = createMessage };

            BatchResponseItem[] bris = this.client.Batch(new ClientInfoHeader() { AppID = "B&N Batching Example" }, new BatchRequestItem[] { bri });
            foreach (BatchResponseItem bri2 in bris)
            {
                // I don't know. Maybe do something more clever here. Each BatchResponseItem
                // will includes success or failure indicators. The batch() call doesn't seem
                // to throw SOAP exceptions, possibly because it generally has more than one
                // thing to do.
                System.Diagnostics.Debug.WriteLine("Hey");
            }
        }

        // Creates an object of type ExtOrders$Orders, with a few fields populated.
        // This originated from Barnes & Noble and will need to be adapted
        private GenericObject createOrders(ChainSourceID i_id)
        {
            GenericObject go = new GenericObject();

            RNObjectType objType = new RNObjectType();
            objType.Namespace = "ExtOrders"; // Update with package name
            objType.TypeName = "Orders"; // Update with object name
            go.ObjectType = objType;

            List<GenericField> gfs = new List<GenericField>();

            NamedID incident = new NamedID();
            incident.ID = new ChainDestinationID() { idSpecified = false, variableName = i_id.variableName };

            // Update these Add() calls with field names, types, and values
            gfs.Add(createGenericField("i_id", ItemsChoiceType.NamedIDValue, incident));
            gfs.Add(createGenericField("CustomerLastName", ItemsChoiceType.StringValue, "Doe"));
            gfs.Add(createGenericField("CustomerFirstName", ItemsChoiceType.StringValue, "John"));
            gfs.Add(createGenericField("BookfairID", ItemsChoiceType.IntegerValue, 1234));
            gfs.Add(createGenericField("LastUpdatedDTTM", ItemsChoiceType.DateTimeValue, DateTime.Now));

            go.GenericFields = gfs.ToArray();

            return (go);
        }

        private GenericField createGenericField(string Name, ItemsChoiceType itemsChoiceType, object Value)
        {
            GenericField gf = new GenericField();
            gf.name = Name;
            gf.DataValue = new DataValue();
            gf.DataValue.ItemsElementName = new ItemsChoiceType[] { itemsChoiceType };
            gf.DataValue.Items = new object[] { Value };
            return gf;
        }
