using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp01_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //반복문
            //대표적인 것 3가지
            //for
            //보통... 시작점과 끝점을 정해놓고 반복을 함.
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("안녕하세요 " + i + "번님");
            }
            //for(int i=1; i<6; i++)
            for (int i = 1; i < 5; i++)
            {
                Console.WriteLine("안녕하세요" + i + "번님");
            }


            int sum = 0;
            for(int i=1; i<=10; i++)
            {
                sum += i; //sum= sum+i;
            }
            Console.WriteLine("1~10까지의 합 : " +sum);


            //while문으로 풀기
            sum = 0;    //sum을 0으로 초기화 하고
            int c = 0;  //임시변수 c를 하나 만듦.
            while(c<11)
            { 
                sum+= c;
                c++;        //c를 하나씩 증가시키면서 sum에 누적시킴.
            }
            Console.WriteLine(sum);


            //while
            //무한루프 돌다가 특정 조건 도달시 종료됨
            //조건이 만족되지 않으면 끝나댱.
            while (true) //c#은 참이어야 돌아간다.
            {
                Console.WriteLine("숫자 입력");
                int num = int.Parse(Console.ReadLine());
                if (num < 0)
                {
                    Console.WriteLine("음수이므로 종료");
                    break; //반복문 종료
                    //무조건 break 는 반복문 바깥으로 나간다! 즉, for문 while문 바깥으로 나감.
                    //조건문if는 상관없다!!!
                }

            }



            //1. 
            for (int i = 1; i <= 5; i++)
            {
                Console.WriteLine("안녕하세요 " + i + "번님");
            }

            //2. 1부터 10까지 합한 값 출력.
            int sum2 = 0;
            for (int i = 0; i < 10; i++)
            {
                i += sum2;
            }
            Console.WriteLine(sum2);

            
            //3. 입력한 숫자에 따라서 별 개수 다르게 출력(반복문 중첩 필요)
            //처음엔 1개 그다음에 ㄴ2개 ... 이렇게 출력 개수가 늘어남.
            
                Console.WriteLine("숫자 입력해");
                int count = int.Parse(Console.ReadLine());
                for(int i=1; i<=count; i++)
                {
                    //1줄에 별을 다 출력
                    for(int j=0; j<i; j++)
                        Console.Write("*"); //출력 후 줄바꿈 없음.
                    
                    //줄을 바꿔줌
                    Console.WriteLine();
                }


            //while문 버전으로 별 찍어본 것.
            int c1 = 1;
            int c2= 0;
            while (c1 <= count)
            {
                while(c2<c1)
                {
                    Console.Write("*");
                    c2++;
                }
                Console.WriteLine();
                c2 = 0;
                c1++;
            }




            //do-while
            //무조건 1번은 실행함
            //while 처럼 대체로 무한반복하되,
            //처음 입력값에 따라서 1번만 실행하거나
            //계속 실행하거나를 결정할 경우.
            int mynum = -1;
            do
            {
                Console.WriteLine("mynum="+mynum);
                Console.WriteLine("mynum은?");
                mynum = int.Parse(Console.ReadLine());  
                //mynum에 무슨 값이 있어도 처음 1번은 실행
                //그 뒤에 입력한 값에 따라서 반복 여부를 결정함
            } while(mynum > 0); //mynum이 음수더라도 무조건 1번은 출력.





            //비공식적인 것 하나 : goto문을 이용한 것
            //웬만하면 안 쓰는 게 좋으나 쓰는 사람도 있다.(참고만 해라)

            //비공식적인 것 하나 : goto문을 이용한것.
            //웬만하면 안쓰는게 좋으나, 쓰는 사람도 있긴 있다. 참고만 해라. (자바엔 고투문이 없다.) 
            MYTEST:
            Console.WriteLine("Hello World");

            //mynum이 -1이면 Hello World 계속출력(사실 반복문 같은것)
            //왜냐면 mynum이 -1이면 MYTEST로 이동하기 때문
            if(mynum==-1)
            {
                goto MYTEST; //hello World 출력한다.
                Console.WriteLine("mynum?");
                mynum = int.Parse(Console.ReadLine());  
            }



        }
    }
}
