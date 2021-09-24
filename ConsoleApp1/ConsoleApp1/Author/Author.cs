namespace ConsoleApp1.Author
{
    public class Author : IAuthor
    {
        public virtual int Id { get; set; }
        public virtual string Firstname { get; set; }
        public virtual string Lastname { get; set; }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id"></param>
        public virtual Author Init(int id, string firstName, string lastName)
        {
            Id = id;
            Firstname = firstName;
            Lastname = lastName;

            return this;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id"></param>
        /// <param name="firstName"></param>
        /// <param name="lastName"></param>
        public Author(int id, string firstName, string lastName)
        {
            Id = id;
            Firstname = firstName;
            Lastname = lastName;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            return Id + ": " + Firstname + " " + Lastname;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="obj"></param>
        /// <returns></returns>
        public override bool Equals(object obj)
        {
            Author abj = obj as Author;
            bool equal = false;

            if (abj != null)
            {
                if (abj.Id == Id && abj.Firstname == Firstname && abj.Lastname == Lastname)
                {
                    equal = true;
                }
            }

            return equal;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <returns></returns>
        public override int GetHashCode()
        {
            return base.GetHashCode();
        }
    }
}
