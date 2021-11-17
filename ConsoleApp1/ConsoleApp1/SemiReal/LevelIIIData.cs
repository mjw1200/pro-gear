namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Collections.Generic;
    using System.Xml.Serialization;

    [XmlRoot("LevelIIIData")]
    public class LevelIIIData
    {
        public Header Header { get; set; }

        public Product[] Products { get; set; }

        public List<Note> Notes { get; set; }
    }
}
