namespace ConsoleApp1.Author
{
    public class Person : IPerson
    {
        public virtual string Firstname { get; set; }
        public virtual string Lastname { get; set; }

        public Person(string firstName, string lastName)
        {
            Firstname = firstName;
            Lastname = lastName;
        }
    }
}
