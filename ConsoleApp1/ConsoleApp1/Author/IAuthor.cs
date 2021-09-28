namespace ConsoleApp1.Author
{
    public interface IAuthor
    {
        IPerson Person { get; set; }
        string[] Titles { get; set; }
    }
}
