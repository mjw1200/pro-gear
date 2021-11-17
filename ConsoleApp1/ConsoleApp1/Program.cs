namespace ConsoleApp1
{
    using ConsoleApp1.Xml;
    using System;
    using System.Collections.Generic;
    using System.Xml.Serialization;
    using Insite.PaymentGateway.Cenpos.Level3;

    class Program
    {
        static void Main(string[] args)
        {
            LevelIIIData l3 = new LevelIIIData();

            Header header = new Header();
            header.Destinationcountrycode = "destcountcode";
            header.ShiptofromZIPcode = "98765";
            header.Discountamount = 12.3;
            header.CustomerCode = "custcode";
            header.Dutyamount = 2.56;
            header.Freightshippingamount = 4.11;
            header.Orderdate = DateTime.Now.ToString();
            header.VATinvoicereferencenumber = "vatinvrefno";
            header.VATtaxamountrate = 79.12;

            List<Product> products = new List<Product>();

            Product product = new Product();
            product.ItemCommodityCode = "itcomcode";
            product.ItemDescription = "itdesc";
            product.ItemSequenceNumber = 1;
            product.LineItemTotal = 17.1;
            product.ProductCode = "PCD";
            product.Quantity = 32.1;
            product.UnitCost = 17.2;
            product.UnitofMeasureCode = "unmeascod";

            Product product1 = new Product();
            product.ItemCommodityCode = "itcomcode1";
            product.ItemDescription = "itdesc1";
            product.ItemSequenceNumber = 2;
            product.LineItemTotal = 11.7;
            product.ProductCode = "PC2";
            product.Quantity = 31.2;
            product.UnitCost = 12.7;
            product.UnitofMeasureCode = "unmeascod1";

            products.AddRange(new List<Product>() { product, product1 });

            List<Note> notes = new List<Note>();
            Note note = new Note();
            note.Note1 = "moo";

            Note note1 = new Note();
            note.Note1 = "quack";

            notes.AddRange(new List<Note>() { note, note1 });

            l3.Header = header;
            l3.Products = products;
            l3.Notes = notes;

            XmlSerializer xmlSerializer = new XmlSerializer(typeof(LevelIIIData));
                
            xmlSerializer.Serialize(Console.Out, l3);
        }
    }
}
