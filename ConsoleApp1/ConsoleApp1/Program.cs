using ConsoleApp1.Author;
using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            IAuthor author = new Author.Author(17, "Mike", "Waldron");
            Console.WriteLine(author);
        }
    }
}
