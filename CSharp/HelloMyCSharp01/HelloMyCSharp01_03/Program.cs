using System;
using System.Collections.Concurrent;
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
            //탁오빠 quiz
            //1번 1.5와 2.3을 문자열로 받아서, 더해서 숫자로 반환. 
            //2번 문자열 1에다가 숫자 20을 붙여서 숫자로 반환.
            Console.WriteLine("숫자입력입력~~~~~");
            string num1 = Console.ReadLine();
            string num2 = Console.ReadLine();
            double a = double.Parse(num1) + double.Parse(num2);
            Console.WriteLine(double.Parse(num1) + double.Parse(num2));
            Console.WriteLine(a.GetType().Name); // 자료형을 반환

            string c = "1"; //char ='', string=""
            Console.WriteLine(int.Parse(c) + 20); // 21
            char cc = '1'; // 아스키코드. 공식!! 차형만 아스키코드. 1=49
            Console.WriteLine(cc + 20); // 69
            Console.WriteLine(c + 20); // 120



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
