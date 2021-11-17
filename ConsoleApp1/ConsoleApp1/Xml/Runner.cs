namespace ConsoleApp1.Xml
{
    using System.Xml.Serialization;
    using System;

    public class Runner
    {
        public void Go()
        {
            PurchaseOrder purchaseOrder = new PurchaseOrder();
            purchaseOrder.ItemsOrders = new Item[2];
            purchaseOrder.ItemsOrders[0] = new Item();
            purchaseOrder.ItemsOrders[0].ItemID = "abc";
            purchaseOrder.ItemsOrders[0].ItemPrice = 12.2M;
            purchaseOrder.ItemsOrders[1] = new Item();
            purchaseOrder.ItemsOrders[1].ItemID = "def";
            purchaseOrder.ItemsOrders[1].ItemPrice = 18.2M;

            XmlSerializer xmlSerializer = new XmlSerializer(typeof(PurchaseOrder));

            xmlSerializer.Serialize(Console.Out, purchaseOrder);
        }
    }
}
