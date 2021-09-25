// This was done for Barnes & Noble. They have a custom object ExtOrders$orders on their
// site that's a *parent* of Incident. (Usually, Incident is the parent of some other
// custom object.) Incident has a system/custom attribute called ExtOrders$orders, and
// the trick was to populate this custom attribute with the proper value.
// 
// This took three hours of hard heads-down work to figure out, so I thought I'd keep it
// around. Ultimately, I fetched an incident that I'd set up correctly in the console,
// and reverse-engineered the return values to figure out what the API wanted to see.

public void CreateIncident3()
{
    ClientInfoHeader cih = new ClientInfoHeader() { AppID = "B&N Association Example" };
    CreateProcessingOptions cpo = new CreateProcessingOptions();
    Incident incident = new Incident();

    incident.PrimaryContact = new IncidentContact() { Contact = new NamedID() { Name = "Herbert Birdsfoot" } };
    incident.Subject = "Test, please ignore";

    GenericField package = new GenericField();
    package.dataType = DataTypeEnum.OBJECT;
    package.dataTypeSpecified = true;
    package.name = "ExtOrders";
    package.DataValue = new DataValue();
    package.DataValue.Items = new GenericObject[1] { new GenericObject() };
    package.DataValue.ItemsElementName = new ItemsChoiceType[1];
    package.DataValue.ItemsElementName[0] = ItemsChoiceType.ObjectValue;

    GenericField objekt = new GenericField(); // "object" is a C# reserved word
    objekt.dataType = DataTypeEnum.NAMED_ID;
    objekt.dataTypeSpecified = true;
    objekt.name = "orders";
    objekt.DataValue = new DataValue();
    objekt.DataValue.Items = new NamedID[] { new NamedID() };
    ((NamedID)objekt.DataValue.Items[0]).ID = new ID() { id = 198442, idSpecified = true };
    objekt.DataValue.ItemsElementName = new ItemsChoiceType[1];
    objekt.DataValue.ItemsElementName[0] = ItemsChoiceType.NamedIDValue;

    ((GenericObject)package.DataValue.Items[0]).GenericFields = new GenericField[] { objekt };

    incident.CustomFields = new GenericObject();
    incident.CustomFields.GenericFields = new GenericField[1] { package };
    
    cpo.SuppressExternalEvents = true;
    cpo.SuppressRules = true;

    try
    {
        RNObject[] createRv = this.client.Create(cih, new RNObject[] { incident }, cpo);
        Incident i2 = createRv[0] as Incident;

        System.Diagnostics.Debug.WriteLine("i_id: " + i2.ID.id);
    }
    catch (Exception e1)
    {
        System.Diagnostics.Debug.WriteLine(exceptionString(e1));
    }
}
