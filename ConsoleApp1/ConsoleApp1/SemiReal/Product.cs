namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Xml.Serialization;

    public class Product
    {
        public string ItemCommodityCode { get; set; }

        public string ItemDescription { get; set; }

        public int ItemSequenceNumber { get; set; }

        public double LineItemTotal { get; set; }

        public string ProductCode { get; set; }

        public double Quantity { get; set; }

        // Could use expression-bodied property (public bool Selected => true); but the serializer
        // ignores properties without setters. Weird. 
        public bool Selected { get { return true; } set { } }

        public double UnitCost { get; set; }

        public string UnitofMeasureCode { get; set; }
    }
}
