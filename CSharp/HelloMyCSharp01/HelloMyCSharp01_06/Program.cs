using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp01_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for(int i=1; i<=10;i++)
            {
                if(i%2==0)  //i가 짝수일 경우
                    Console.WriteLine("짝수");
                Console.WriteLine("i="+i);
            }
            //반복문을 끝내는 것 break; 조건문 X
            //특정 조건에서만 다음 step으로 넘기는 것 : continue;
            for(int i=1; i<=10; i++)
            {
                Console.WriteLine("i=" +i);
                if (i % 2 != 0)
                    continue; //밑에꺼 실행 안 하고 i++ 해버림.
                    //continue도 조건문이랑 관계가 없다! 반복문에서만 쓰인다! 
                Console.WriteLine("짝수");
            }

        

            //-------------------------------------------------------------
            Console.WriteLine("1번");
            //1. 1부터 10까지 순차적으로 출력
            //    - for, while로 해보기
            for (int i = 1; i <= 10; i++)
                Console.Write(i + " ");
            int count = 1;
            //\n : 줄바꿈 코드
            //Environment.NewLine : 줄바꿈
            //환경에 따라서 다른 줄바꿈 코드 제공
            //리눅스냐 윈도우냐 따라서 다르다.
            Console.WriteLine(Environment.NewLine + "while문 버전 \n");
            while (count <= 10)
            {
                Console.Write(count + " ");
                count++;
            }
            //2.a부터 b까지 순차적으로 출력
            //- for, while로 해보기
            Console.WriteLine("\n2번");// 줄 띄어쓰기
            Console.WriteLine("a?");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("b?");
            int b = int.Parse(Console.ReadLine());


            //5번 문제
            //두 숫자 값 바꾸기
            if (a > b)
            {
                int temp = a;
                a = b;
                b = temp;
            }


            for (int i = a; i <= b; i++)
                Console.Write(i + " ");
            count = a;
            Console.WriteLine("\nwhile문 버전 \n");
            while (count <= b)
            {
                Console.Write(count + " ");
                count++;
            }
            Console.WriteLine("\n3번");
            for (int i = 1; i <= 100; i++)
            {
                if (i % 2 == 0)
                    Console.Write(i + " ");
            }
            Console.WriteLine("\nwhile문 버전 \n");
            count = 1;
            while (count <= 100)
            {
                if (count % 2 == 0)
                    Console.Write(count + " ");
                count++;
            }
            Console.WriteLine("\na부터 b까지 출력하되 역순 for");
            for (int i = b; i >= a; i--)
                Console.Write(i + " ");

            Console.WriteLine("\na부터 b까지 출력하되 역순 while");
            count = b;
            while (count >= a)
            {
                Console.Write(count + " ");
                count--;
            }
        }
    }
}
