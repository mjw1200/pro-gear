namespace ConsoleApp1
{
    using ConsoleApp1.Xml;
    using System;
    using System.Xml.Serialization;

    class Program
    {
        static void Main(string[] args)
        {
            BigFatData bfd = new BigFatData() { Name = "Herbert Birdsfoot" };
            XmlSerializer xmlSerializer = new XmlSerializer(typeof(BigFatData));
                
            xmlSerializer.Serialize(Console.Out, bfd);
        }
    }
}
