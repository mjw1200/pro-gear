        public void CreateContact()
        {
            ClientInfoHeader cih = new ClientInfoHeader() { AppID = "Brahmin SOAP Samples" };
            CreateProcessingOptions cpo = new CreateProcessingOptions();
            Contact contact = new Contact();
            RNObject[] createRv = null;

            contact.Name = new PersonName();
            contact.Name.First = "Herbert";
            contact.Name.Last = "Birdsfoot";
            contact.Emails = new Email[1];
            contact.Emails[0] = new Email();
            contact.Emails[0].Address = "herb@gnail.com";
            contact.Emails[0].action = ActionEnum.add;
            contact.Emails[0].actionSpecified = true;
            contact.Emails[0].AddressType = new NamedID() { ID = new ID() { id = 0, idSpecified = true } };
            contact.Address = new Address();
            contact.Address.City = "Memphis";
            contact.Address.Country = new NamedID() { ID = new ID() { id = 1, idSpecified = true } };
            contact.Address.PostalCode = "38125";
            contact.Address.StateOrProvince = new NamedID() { Name = "TN" };
            contact.Address.Street = "8700 Trail Lake Drive, STE 103";
            contact.Phones = new Phone[1];
            contact.Phones[0] = new Phone();
            contact.Phones[0].Number = "406.624.3681";
            contact.Phones[0].PhoneType = new NamedID() { ID = new ID() { id = 0, idSpecified = true } };

            this.setContactCustomFields(contact);

            cpo.SuppressExternalEvents = true;
            cpo.SuppressRules = true;

            try
            {
                createRv = this.client.Create(cih, new RNObject[] { contact }, cpo);
            }
            catch (Exception e)
            {
                StringBuilder sb = new StringBuilder(e.Message);
                
                if (e.InnerException != null)
                    sb.Append("(" + e.InnerException.Message + ")");

                System.Diagnostics.Debug.WriteLine(sb.ToString());
            }

            if (createRv != null)
            {
                System.Diagnostics.Debug.WriteLine("new c_id is " + (createRv[0] as Contact).ID.id);
            }
        }

        private void setContactCustomFields(Contact contact)
        {
            GenericObject customFieldsc = new GenericObject();
            GenericField customField = null;

            customFieldsc.GenericFields = new GenericField[6];

            string column_name = "source";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = "Source Test Value";
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.StringValue;
            customFieldsc.GenericFields[0] = customField;

            column_name = "email_status";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.NAMED_ID;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = new NamedID() { Name = "Bounce" };
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.NamedIDValue;
            customFieldsc.GenericFields[1] = customField;

            column_name = "age_group";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.NAMED_ID;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = new NamedID() { Name = "30's" };
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.NamedIDValue;
            customFieldsc.GenericFields[2] = customField;

            column_name = "address_2";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = "Address 2 Test Value";
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.StringValue;
            customFieldsc.GenericFields[3] = customField;

            column_name = "contact_notes";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = "Contact Notes Test Value";
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.StringValue;
            customFieldsc.GenericFields[4] = customField;

            column_name = "birthday";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = "Feb. 13, 1987";
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.StringValue;
            customFieldsc.GenericFields[0] = customField;

            // You probably don't want to change anything below here
            customFieldsc.ObjectType = new RNObjectType();
            customFieldsc.ObjectType.TypeName = "ContactCustomFieldsc";

            GenericField cField = new GenericField();
            cField.name = "c";
            cField.dataType = DataTypeEnum.OBJECT;
            cField.dataTypeSpecified = true;
            cField.DataValue = new DataValue();
            cField.DataValue.Items = new object[1];
            cField.DataValue.Items[0] = customFieldsc;
            cField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            cField.DataValue.ItemsElementName[0] = ItemsChoiceType.ObjectValue;

            contact.CustomFields = new GenericObject();
            contact.CustomFields.GenericFields = new GenericField[1];
            contact.CustomFields.GenericFields[0] = cField;
            contact.CustomFields.ObjectType = new RNObjectType();
            contact.CustomFields.ObjectType.TypeName = "ContactCustomFields";
        }
