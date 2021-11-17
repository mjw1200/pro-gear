namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System.Xml.Serialization;

    public class Note
    {
        [XmlElement("Note")]
        public string Note1 { get; set; }
    }
}
