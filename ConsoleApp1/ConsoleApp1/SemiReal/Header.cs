namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Xml.Serialization;

    public class Header
    {
        [XmlElement]
        public string CustomerCode { get; set; }

        [XmlElement]
        public string ShiptofromZIPcode { get; set; }

        [XmlElement]
        public string Destinationcountrycode { get; set; }

        [XmlElement]
        public string VATinvoicereferencenumber { get; set; }

        [XmlElement]
        public double VATtaxamountrate { get; set; }

        [XmlElement]
        public double Freightshippingamount { get; set; }

        [XmlElement]
        public double Dutyamount { get; set; }

        [XmlElement]
        public string Orderdate { get; set; }

        [XmlElement]
        public double Discountamount { get; set; }
    }
}
