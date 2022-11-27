using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp01_10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int min, max, i;
            //1번
            int[] numbers = new int[5];
            for(i = 0; i<numbers.Length; i++)
            {
                Console.WriteLine("5개의 숫자를 입력하세요.");
                numbers[i] = int.Parse(Console.ReadLine());

            }

            min = numbers[0];  // 첫 항목을 최솟값으로 설정한다.
            for (i = 1; i < 5; i++)
            {
                // 다음 항목의 값이 작다면 최솟값으로 설정한다.
                if (min > numbers[i]) min = numbers[i];
            }

            max = numbers[0];  // 첫 항목을 최댓값으로 설정한다.
            for (i = 1; i < 5; i++)
            {
                // 다음 항목의 값이 크다면 최댓값으로 설정한다.
                if (max < numbers[i]) max = numbers[i];
            }



            /*
             1. 5개의 숫자를 입력받아서 그 중에 최댓값과 최솟값을 출력하기
            - for문이랑 foreach문으로 해보기(참고로 값 넣는 건 for문으로 해야 함)

            2. 저 중에서 최댓값과 최솟값이 몇 번째인지 구해보기
            - for문이랑 foreach문으로 해보기

            3. 숫자를 10개 입력받고, 그 중에서 홀수만 0으로 바꾼다. 그 다음에, 0이 아닌 값들만 출력한다.
            - for문으로 하기*/



            //yt.axiom !!! @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            foreach (var item in numbers) // 배열의 요소 각각만큼 실행을 반복한다. 
            //배열 numbers안의 요소들을 item라는 이름으로 정의해서 아래의 코드들을 반복 실행한다.
            // 인덱스를 건드릴 수 없다.
            {
                Console.WriteLine(item + " 입니다!"); // 넘버즈 배열의 모든 요소들을 출력한다.
                Console.WriteLine("???");//foreach 문에서는 몇번째인지는 못쓴다.
                                         //무조건 한번씩 차례대로 출력하기 때문.
            }

            for (int g = 0; g < numbers.Length; g++)
            {
                Console.WriteLine(numbers[g] + "이랍니다!"); // 넘버즈 배열의 모든 요소들을 출력한다
                Console.WriteLine(g); //foreach랑은 달리 g번째 사용 가능!!! 
                g--;
            }

            //탁오빠 Quiz
            // 배열 abcd를 선언하고 요소에 값을 1,3,5,7,9 넣어라
            // 1은 최공빈다! 출렿ㄱ하고 3은 바보입니다! 출력하고 5이상 은 쏘쏘합니다! 출력해라

            int[] abcd = { 1, 3, 5, 7, 9 };
            foreach (var item in abcd)
            {
                if(item == 1)
                {
                    Console.WriteLine($"{item}은 최고입니다!");
                }
                else if(item == 3) 
                {
                    Console.WriteLine($"{item}은 바보입니다!");
                }
                else if (item >= 5)
                {
                    Console.WriteLine($"{item}은 쏘쏘입니다!");
                }
            }

        }
    }
}
