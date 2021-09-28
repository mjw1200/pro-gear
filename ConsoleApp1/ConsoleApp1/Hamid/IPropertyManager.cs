namespace ConsoleApp1.Hamid
{
    // https://hamidmosalla.com/2017/08/03/moq-working-with-setupget-verifyget-setupset-verifyset-setupproperty/

    public interface IPropertyManager
    {
        string FirstName { get; set; }
        string LastName { get; set; }
        void MutateFirstName(string name);
    }
}
