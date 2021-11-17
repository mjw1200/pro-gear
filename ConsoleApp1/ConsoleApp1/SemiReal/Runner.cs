namespace Insite.PaymentGateway.Cenpos.Level3
{
    using System;
    using System.Collections.Generic;
    using System.Xml.Serialization;

    public class Runner
    {
        public void Go()
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
            products.Add(product);

            Product product1 = new Product();
            product1.ItemCommodityCode = "itcomcode1";
            product1.ItemDescription = "itdesc1";
            product1.ItemSequenceNumber = 2;
            product1.LineItemTotal = 11.7;
            product1.ProductCode = "PC2";
            product1.Quantity = 31.2;
            product1.UnitCost = 12.7;
            product1.UnitofMeasureCode = "unmeascod1";
            products.Add(product1);

            List<Note> notes = new List<Note>();
            Note note = new Note();
            note.Note1 = "moo";
            notes.Add(note);

            Note note1 = new Note();
            note1.Note1 = "quack";
            notes.Add(note1);

            l3.Header = header;
            l3.Products = products.ToArray();
            l3.Notes = notes.ToArray();

            XmlSerializer xmlSerializer = new XmlSerializer(typeof(LevelIIIData));

            xmlSerializer.Serialize(Console.Out, l3);
        }
    }
}
