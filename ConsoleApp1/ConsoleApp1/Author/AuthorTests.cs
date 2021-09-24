using Moq;
using NUnit.Framework;

namespace ConsoleApp1.Author
{
    [TestFixture]
    public class AuthorTests
    {
        Mock<Author> author;

        [SetUp]
        public void Init ()
        {
            author = new Mock<Author>();


        }

        [Test]
        public void Equal()
        {
            //Author mike = new Author(17, "Mike", "Waldron");
            //Assert.AreEqual(mike, author);

        }

        [TestCase(18, "Joe", "Thomas")]
        [TestCase(19, "Thom", "Yorke")]
        [TestCase(20, "Julie", "Hergert")]
        public void Equal(int id, string firstName, string lastName)
        {
            //Author auth = new Author { Id = id, Firstname = firstName, Lastname = lastName };
            //Assert.AreNotEqual(auth, author);
        }

        [TearDown]
        public void Cleanup()
        {
            author = null;
        }
    }
}
