namespace ConsoleApp1.Xml
{
    using System.Xml.Serialization;

    public class BigFatData
    {
        [XmlElement("Farter")]
        public string Name { get; set; }
    }
}
