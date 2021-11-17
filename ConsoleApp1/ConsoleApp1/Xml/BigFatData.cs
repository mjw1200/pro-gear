namespace ConsoleApp1.Xml
{
    using System.Collections.Generic;
    using System.Xml.Serialization;

    [XmlRoot (Namespace = "moo")]
    public class BigFatData
    {
        [XmlElement("Farter")]
        public string Name { get; set; }

        public List<Melon> Melons { get; set; }
    }
}
