namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Collections.Generic;
    using System.Xml.Serialization;

    public class LevelIIIData
    {
        [XmlElement]
        public Header Header { get; set; }

        [XmlElement]
        public List<Product> Products { get; set; }

        [XmlElement]
        public List<Note> Notes { get; set; }
    }
}
