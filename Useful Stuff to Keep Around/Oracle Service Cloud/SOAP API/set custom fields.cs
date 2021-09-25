        private void setCustomFields(Incident newIncident)
        {
            // You will need these lines every time you set custom fields
            GenericObject customFieldsc = new GenericObject();
            GenericField customField = null;

            // You'll need one slot here for each custom field you want to set
            customFieldsc.GenericFields = new GenericField[5];

            string column_name = "suggestedqueue";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.STRING;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = "Suggested Queue Test";                
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.StringValue;
            // Note that this index increments for each custom field we're setting
            customFieldsc.GenericFields[0] = customField;

            column_name = "order_integration_failure";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.BOOLEAN;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = true;
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.BooleanValue;
            customFieldsc.GenericFields[1] = customField;

            column_name = "mishandled_incident_date_time";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.DATETIME;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = DateTime.Now;
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.DateTimeValue;
            customFieldsc.GenericFields[2] = customField;

            // Using a NAMED_ID data type, but this is actually for a menu type custom field
            column_name = "workspace_context";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.NAMED_ID;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            // You can specify the menu value by name here.
            customField.DataValue.Items[0] = new NamedID() { Name = "Follow Up" };
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.NamedIDValue;
            customFieldsc.GenericFields[3] = customField;

            column_name = "ln_judgements_liens";
            customField = new GenericField();
            customField.name = column_name;
            customField.dataType = DataTypeEnum.INTEGER;
            customField.dataTypeSpecified = true;
            customField.DataValue = new DataValue();
            customField.DataValue.Items = new object[1];
            customField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            customField.DataValue.Items[0] = 842654;
            customField.DataValue.ItemsElementName[0] = ItemsChoiceType.IntegerValue;
            customFieldsc.GenericFields[4] = customField;

            // You probably don't want to change anything below here
            customFieldsc.ObjectType = new RNObjectType();
            customFieldsc.ObjectType.TypeName = "IncidentCustomFieldsc";

            GenericField cField = new GenericField();
            cField.name = "c";
            cField.dataType = DataTypeEnum.OBJECT;
            cField.dataTypeSpecified = true;
            cField.DataValue = new DataValue();
            cField.DataValue.Items = new object[1];
            cField.DataValue.Items[0] = customFieldsc;
            cField.DataValue.ItemsElementName = new ItemsChoiceType[1];
            cField.DataValue.ItemsElementName[0] = ItemsChoiceType.ObjectValue;

            newIncident.CustomFields = new GenericObject();
            newIncident.CustomFields.GenericFields = new GenericField[1];
            newIncident.CustomFields.GenericFields[0] = cField;
            newIncident.CustomFields.ObjectType = new RNObjectType();
            newIncident.CustomFields.ObjectType.TypeName = "IncidentCustomFields";
        }
