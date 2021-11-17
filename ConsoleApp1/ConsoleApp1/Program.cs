namespace ConsoleApp1
{

    class Program
    {
        static void Main(string[] args)
        {
            Insite.PaymentGateway.Cenpos.Level3.Runner r = new Insite.PaymentGateway.Cenpos.Level3.Runner();
            // Xml.Runner r = new Xml.Runner();

            r.Go();
        }
    }
}
