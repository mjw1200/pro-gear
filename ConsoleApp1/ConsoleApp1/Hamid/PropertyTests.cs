using Moq;
using NUnit.Framework;

namespace ConsoleApp1.Hamid
{
    [TestFixture]
    public class PropertyTests
    {
        Mock<PropertyManager> mockProp;

        [SetUp]
        public void Init ()
        {
            mockProp = new Mock<PropertyManager>();
        }

        [Test]
        public void Please_Just_Do_Something_Im_Tired()
        {
            mockProp.SetupGet(m => m.FirstName).Returns("Someone Nice").Verifiable();

            // Expression<Func<PropertyManager, bool>> foo = p => p.FirstName == "Someone Nice";
            
            //mockProp.VerifyGet(p => p.FirstName == "Someone Nice");
            mockProp.VerifyGet<bool>(p => p.FirstName == "Someone Noice");
        }

        [TearDown]
        public void Cleanup()
        {
        }
    }
}
