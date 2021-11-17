namespace Insite.PaymentGateway.Cenpos.Level3
{
    public class Product
    {
        public string ItemCommodityCode { get; set; }

        public string ItemDescription { get; set; }

        public int ItemSequenceNumber { get; set; }

        public double LineItemTotal { get; set; }

        public string ProductCode { get; set; }

        public double Quantity { get; set; }

        public bool Selected => true;

        public double UnitCost { get; set; }

        public string UnitofMeasureCode { get; set; }
    }
}

 