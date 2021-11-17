namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Xml.Serialization;

    [XmlRoot("LevelIIIData")]
    public class LevelIIIData
    {
        public Header Header { get; set; }

        public Product[] Products { get; set; }

        public Note[] Notes { get; set; }
    }
}
