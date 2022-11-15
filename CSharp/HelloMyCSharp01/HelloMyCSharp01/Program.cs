using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("안녕, 내 이름은 박지호고 여자고 20대야.");
            int age = 28;

            string name = "박지호";
            Console.WriteLine("안녕 내 이름은 "+name+"이고 여자고 나이는 "+age+"야.");
            Console.WriteLine("안녕, 내이름은 {0}이고, 여자이며, {1}대살이야", name,age);
            Console.WriteLine($"안녕, 내 이름은{name}이고, 여자고, {age}살이야.");

            Console.WriteLine(1+1);

            //2. string.format
            string luv = string.Format("내 나이는 {0}", age);
            Console.WriteLine(luv);
            //3. $ 표시
            string luvv = $"내 나이는 {age}";
            Console.WriteLine(luvv);
        }
    }
}
