using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp01_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //java의 nextLine
            Console.WriteLine("이름이 뭐예요?");
            string name = Console.ReadLine();
            //java의 nextInt;
            Console.WriteLine("나이가 어떻게 되요?");
            int age = int.Parse(Console.ReadLine());
            //Console.ReadLine() = 문자열 입력
            //int.Parse 는 문자열을 숫자로 바꾸는 것.
            Console.WriteLine("몸무게는?");
            double kg = double.Parse(Console.ReadLine());
            Console.WriteLine(name);
            Console.WriteLine(age);
            Console.WriteLine(kg);

            //문제
            Console.WriteLine("이름이 뭐예요?");
            string namen = Console.ReadLine();
            Console.WriteLine("나이가 어떻게 되죠?");
            int numer = int.Parse(Console.ReadLine());

         

        }
    }
}
