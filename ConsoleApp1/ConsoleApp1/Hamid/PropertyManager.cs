namespace ConsoleApp1.Hamid
{
    public class PropertyManager : IPropertyManager
    {
        public virtual string FirstName { get; set; }
        public virtual string LastName { get; set; }

        public void MutateFirstName(string name)
        {
            FirstName = name;
        }

        public override string ToString()
        {
            return FirstName + " " + LastName;
        }
    }
}
