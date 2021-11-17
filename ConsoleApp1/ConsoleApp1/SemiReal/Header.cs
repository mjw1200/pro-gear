namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Xml.Serialization;

    public class Header
    {
        public string CustomerCode { get; set; }

        public string ShiptofromZIPcode { get; set; }

        public string Destinationcountrycode { get; set; }

        public string VATinvoicereferencenumber { get; set; }

        public double VATtaxamountrate { get; set; }

        public double Freightshippingamount { get; set; }

        public double Dutyamount { get; set; }

        public string Orderdate { get; set; }

        public double Discountamount { get; set; }
    }
}
