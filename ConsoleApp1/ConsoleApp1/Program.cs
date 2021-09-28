using ConsoleApp1.Author;
using ConsoleApp1.Hamid;
using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            //IAuthor author = new Author.Arthur();
            //Console.WriteLine(author);
            IPropertyManager propertyManager = new PropertyManager();
            propertyManager.FirstName = "Mike";
            propertyManager.LastName = "Waldron";
            Console.WriteLine(propertyManager);
            PropertyManagerConsumer propertyManagerConsumer = new PropertyManagerConsumer(propertyManager);
            propertyManagerConsumer.ChangeRemoteName("Whackamole");
            Console.WriteLine(propertyManager);
        }
    }
}
