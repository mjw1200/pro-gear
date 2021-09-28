namespace ConsoleApp1.Author
{
    public class Author : IAuthor
    {
        public virtual IPerson Person { get; set; }
        public virtual string[] Titles { get; set; }

        public Author(IPerson person)
        {
            Person = person;
        }
    }
}
