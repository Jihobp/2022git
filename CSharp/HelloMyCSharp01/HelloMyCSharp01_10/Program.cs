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

            //2번




            /*
             1. 5개의 숫자를 입력받아서 그 중에 최댓값과 최솟값을 출력하기
            - for문이랑 foreach문으로 해보기(참고로 값 넣는 건 for문으로 해야 함)

            2. 저 중에서 최댓값과 최솟값이 몇 번째인지 구해보기
            - for문이랑 foreach문으로 해보기

            3. 숫자를 10개 입력받고, 그 중에서 홀수만 0으로 바꾼다. 그 다음에, 0이 아닌 값들만 출력한다.
            - for문으로 하기*/

        }
    }
}
