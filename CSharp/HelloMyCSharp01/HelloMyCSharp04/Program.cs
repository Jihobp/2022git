using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp04
{
    internal class Program
    {
        static void Main(string[] args)
        {
     

            //문제
            Console.WriteLine("이름이 뭐예요?");
            string namen = Console.ReadLine();
            Console.WriteLine("나이가 어떻게 되죠?");
            int numer = int.Parse(Console.ReadLine());
            Console.WriteLine("MBTI가 뭐예요?");
            string mbti = Console.ReadLine();
            Console.WriteLine("혈액형이 뭐예요?");
            string bloodtype = Console.ReadLine();

            Console.WriteLine(namen);
            Console.WriteLine(numer);
            Console.WriteLine(mbti);
            Console.WriteLine(bloodtype);

            //내가 태어난 연도를 입력해서 내 나이 출력하게 하기.
            Console.WriteLine("태어난 년도가 언제예요?");
            int year= int.Parse(Console.ReadLine());
            Console.WriteLine(2022 - year + 1);

            //원이 반지름 값을 입력한 뒤에, 그에 맞는 원의 넓이와 둘레값 출력하기.
            Console.WriteLine("원의 반지름 값이 뭐예요?");
            double num = double.Parse(Console.ReadLine());
            Console.WriteLine("반지름은"+ 2 * 3.14 * num);
            Console.WriteLine("넓이는"+ num*num*3.14);

            //내 시력을 입력해보세요.(=실수형 변수를 입력 후 출력)
            Console.WriteLine("시력이 뭐예요?");
            double sight = double.Parse(Console.ReadLine());
            Console.WriteLine("내 시력은 " + sight + " 입니다. ");

            /*----------------------------------------------------*/
            Console.ReadLine();
            //1.
            Console.WriteLine("나이는?");
            int age = int.Parse(Console.ReadLine());
            Console.WriteLine("내 이름은?");
            string name = Console.ReadLine();
            Console.WriteLine("MBTI는?");
            string mbti2 = Console.ReadLine();
            Console.WriteLine("혈액형은?");
            string bType = Console.ReadLine();

            Console.WriteLine($"내 나이는 {age}살, " +
                $"내 이름은 {name}, mbti는 {mbti2}, 그리고 혈액형은 {bType}입니다.");

            //2. 내가 태어난 연도 입력
            Console.WriteLine("언제 태어났니?");
            int birth = int.Parse(Console.ReadLine());
            Console.WriteLine(DateTime.Now.Year - birth + 1);

            //3. 원의 반지름 입력 후 그에 맞는 원의 넓이와 둘레값 출력
            Console.WriteLine("원의 반지름은?");
            int r = int.Parse(Console.ReadLine());
            const double PI = 3.14; //상수
            Console.WriteLine($"원의 둘레 {2 * r * PI}");
            Console.WriteLine($"원의 넓이 {r * r * PI}");

            //4. 시력 문제
            Console.WriteLine("시력이?");
            double eye = double.Parse(Console.ReadLine());
            Console.WriteLine("내 시력은 " + eye + "입니다.");

            Console.WriteLine("키가 얼만가요");

            double kg = double.Parse(Console.ReadLine());

            Console.WriteLine("내      몸무게는 " + kg + "입니다.");
            /*----------------------------------------------------*/



            Console.WriteLine("숫자를 입력하세요.");
            int n= int.Parse(Console.ReadLine());
            if(n==0)
            {
                Console.WriteLine(0);
            }
            else if (n > 0)
            {
                Console.WriteLine("양");
            }
            else
            {
                Console.WriteLine("음");
            }



            int rInt = new Random().Next(6) + 1;

            switch (rInt)
            {
                case 1:
                    Console.WriteLine("일!");
                    break;
                case 2: Console.WriteLine("이!");
                    break;
                case 3:
                    Console.WriteLine("삼!");
                    break;
                case 4:
                    Console.WriteLine("사!");
                    break;
                case 5:
                    Console.WriteLine("오!");
                    break;
                case 6:
                    Console.WriteLine("육!");
                    break;

            }

            //---------------------------

            /*
            1. 숫자를 입력받고,
            그 결과가 0이면 0을 출력하고
            양수면 양, 음수면 음을 출력한다.
            1-1 삼항연산자
            1-2 if문으로 해보세요.

            2. 정육면체 주사위(1~6까지 값 있는 것)
            던져서 나오는 결과에 따라서 값 출력
            ex) 1 => 일! 2=> 이!
            switch문으로 하기

            2-1) 숫자를 내가 입력해보기
            2-2) 컴퓨터가 입력하게 하기 (Random으로 써야 함)

            3. 2번 문제랑 연장선상인 데, 짝수냐 홀수냐에 따라서 결과 다르게
            출력하되, switch문을 이용한다.

            4. 나이를 입력하라고 한 뒤, 다음 경우에 따라서 다른 출력을 한다. (if문으로 하면 됨)
            1) 나이가 0미만인 경우 => 무효
            2) 나이가 20미만인 경우 => 미성년자
            3) 나이가 20이상 ~ 150미만인 경우 => 성인
            4) 150 이상인 경우 => 불가사의한 존재*/

            Console.WriteLine("1");
            Console.WriteLine("숫자 입력받기");
            int num1 = int.Parse(Console.ReadLine());

            string result1 = num1 == 0 ? "0" : (num1 > 0 ? "양" : "음");
            Console.WriteLine(result1);

            if (num1 == 0)
            {
                Console.WriteLine("0");
            }
            else
            {
                if (num1 > 0)
                {
                    Console.WriteLine("양");
                }
                else
                {
                    Console.WriteLine("음");
                }
            }

            if (num1 == 0)
            {
                Console.WriteLine("0");
            }
            else if (num1 < 0)
            {
                Console.WriteLine("양");
            }
            else
            {
                Console.WriteLine("음");
            }

            Console.WriteLine("숫자 입력");
            int dice = int.Parse(Console.ReadLine());

            switch (dice)
            {
                case 1:
                    Console.WriteLine("일");
                    break;
                case 2:
                    Console.WriteLine("이");
                    break;
                case 3:
                    Console.WriteLine("삼");
                    break;
                case 4:
                    Console.WriteLine("사");
                    break;
                case 5:
                    Console.WriteLine("오");
                    break;
                case 6:
                    Console.WriteLine("육");
                    break;
                default:
                    Console.WriteLine(dice);
                    break;
            }

            int comDice = new Random().Next(6) + 1; //(배열)
            /*
             comDice = new Random().Next(1,7);

             Random random = new Random();
             comDice = random.Next(6)+1;

             Random random = new Random();
             comDice = random.Next(1,7);
             */
            switch (comDice)
            {
                case 1:
                    Console.WriteLine("일");
                    break;
                case 2:
                    Console.WriteLine("이");
                    break;
                case 3:
                    Console.WriteLine("삼");
                    break;
                case 4:
                    Console.WriteLine("사");
                    break;
                case 5:
                    Console.WriteLine("오");
                    break;
                case 6:
                    Console.WriteLine("육");
                    break;
                default:
                    Console.WriteLine(comDice); //컴퓨터가 default로 빠질 일은 없당 1~6까지 무조건 출력할테니까.
                    break;
            }

            switch (dice)
            {
                case 1:
                case 3:
                case 5:
                    Console.WriteLine("홀수");
                    break;
                case 2:
                case 4:
                case 6:
                    Console.WriteLine("짝수");
                    break;
                default:
                    Console.WriteLine(dice);
                    break;
            }

            Console.WriteLine("나이?");
            int age2 = int.Parse(Console.ReadLine());
            if (age2 < 0)
            {
                Console.WriteLine("무효");
            }
            else if (age2 < 20)
            {
                Console.WriteLine("미성년자");
            }
            else if (age2 >= 20 && age < 150)
            {
                Console.WriteLine("성인");
            }
            else
            {
                Console.WriteLine("불가사의한 존재");
            }

            //if 들끼린 관련없이 모두 개개인. if 에서 걸려도 다른 if에서도 걸릴 수 있다. 
            //else if는 별개. 
            if (age2 < 0)
            {
                Console.WriteLine("무효");
            }
            if (age2 >= 0 && age < 20)
            {
                Console.WriteLine("미성년자");
            }
            if (age2 >= 20 && age < 150)
            {
                Console.WriteLine("성인");
            }
            if (age2 >= 150)
            {
                Console.WriteLine("불가사의한 존재");
            }

            if (age2 < 0)
            {
                Console.WriteLine("무효");
            }
            else //중첩조건문.
            {
                if (age2 >= 0 && age2 < 20)
                {
                    Console.WriteLine("미성년자");
                }
                else if (age2 >= 20 && age2 < 150)
                {
                    Console.WriteLine("성인");
                }
                else
                {
                    Console.WriteLine("불가사의한 존재");
                }
            }


        }
    }
}
