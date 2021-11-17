namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Xml.Serialization;

    public class Product
    {
        [XmlElement]
        public string ItemCommodityCode { get; set; }

        [XmlElement]
        public string ItemDescription { get; set; }

        [XmlElement]
        public int ItemSequenceNumber { get; set; }

        [XmlElement]
        public double LineItemTotal { get; set; }

        [XmlElement]
        public string ProductCode { get; set; }

        [XmlElement]
        public double Quantity { get; set; }

        [XmlElement]
        public bool Selected => true;

        [XmlElement]
        public double UnitCost { get; set; }

        [XmlElement]
        public string UnitofMeasureCode { get; set; }
    }
}

 