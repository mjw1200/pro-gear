using Moq;
using NUnit.Framework;

namespace ConsoleApp1.Author
{
    [TestFixture]
    public class PropertyTests
    {
        [Test]
        public void Please_Just_Work_For_The_Love_Of_Fuck()
        {
            Mock<Person> mockPerson = new Mock<Person>(It.IsAny<string>(), It.IsAny<string>());
            mockPerson.SetupGet(o => o.Firstname).Returns("Keven");
            mockPerson.SetupGet(o => o.Lastname).Returns("Sting");

            IAuthor author = new Author(mockPerson.Object);
            Assert.That(author.Person.Firstname == "Keven");
        }

        [SetUp]
        public void Init()
        {
        }

        [TearDown]
        public void Cleanup()
        {
        }
    }
}
