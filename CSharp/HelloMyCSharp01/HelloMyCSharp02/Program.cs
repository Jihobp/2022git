using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //1.
            Console.WriteLine("안녕하세요");

            //2. 
            Console.WriteLine(10+20);
            Console.WriteLine(7/3);
            Console.WriteLine(7-3);
            Console.WriteLine(10*20);

            //3. 
            Console.WriteLine("10"+10);
            Console.WriteLine('2' + 100);
            Console.WriteLine("10" + '2');


            //4. int 변수에 자신의 태어난 연도를 입력 후 출력
            Console.WriteLine("언제 태어나셨어요?");
            int mybirth=int.Parse(Console.ReadLine());
            Console.WriteLine(DateTime .Now.Year -mybirth +1);

            //5. string 변수에 내 이름을 입력받고, 출력
            Console.WriteLine("이름이 뭐예요?");
            string myname=Console.ReadLine();
            Console.WriteLine($"내 이름은 {myname} 입니다.");

            //6. \ escpae 문자를 이용하여 자기 소개 메세지 출력.
            int age = 28;
            string name = "박지호";
            Console.WriteLine($"내 이름은 {name}이고 \n나이는 {age}입니다.");

            //7. 내 나이 입력받은걸 이용하여 내가 몇년생인지 구하기
            Console.WriteLine("몇 살이에요?");
            int myage=int.Parse(Console.ReadLine());
            Console.WriteLine(2022-myage + 1 + "년도에 태어났습니다.");

            //8. 현재 연도 값을 입력 받고, 내가 태어난 연도 값을 입력받아, 한국식 나이 계산해서 출력하기.
            Console.WriteLine("지금 년도는?");
            int nowYear =int.Parse(Console.ReadLine());
            Console.WriteLine("태어난 년도는?");
            int bornYear = int.Parse(Console.ReadLine());
            Console.WriteLine(nowYear-bornYear+1 +"살입니다.");


            //9. 내가 입력한 글자의 첫버째 글자를 출력할 것 ( 수업시간에 한 소스 중에 있음.)
            Console.WriteLine("글자를 입력하세요.");
            string s = Console.ReadLine();
            char c = s[0];
            Console.WriteLine(c);

            //10. 정사각형ㅇ의 변 길이를 입력받고, 정사각형의 넓이 구하기.(정사각형 넓이 : 변x변) ex) 10입력받으면 결과 100
            Console.WriteLine("정사각형의 변 길이는?");
            int square=int.Parse(Console.ReadLine());
            Console.WriteLine($"정사각형의 변길이는 {square*square}입니다.");

            //11. 내가 입력한 숫자가 음수일 경우 "음수"를 출력.
            Console.WriteLine("숫자를 입력하세요.");
            int num =int.Parse(Console.ReadLine());
            if (num < 0)
            {
                Console.WriteLine("음");
            }

            //12. 내가 입력한 숫자가 0을 넘는다면 자연수, 그 외에는 자연수 아님을 출력
            Console.WriteLine("숫자를 입력하세요.");
            int num2 =int.Parse(Console.ReadLine());
            if(num2 > 0) {
                Console.WriteLine("자연수");
            }
            else
            {
                Console.WriteLine("자연수가 아님.");
            }


            //13. Random r = new Random();
            //r.next(3);을 이용하여 0값이 나오면 가위, 1값이 나오면 바위, 2값이 나오면 보를 출력하게 할것.

            int r = new Random().Next(3);
            switch (r)
            {
                case 0: Console.WriteLine("가위");
                    break;
                case 1: Console.WriteLine("바위");
                    break;
                case 2: Console.WriteLine("보");
                    break;
            }

            //14. 사용자도 0,1,2 셋 중 하나의 값을 입력하게 하기.
            //그래서 13번에서 출력한 값이랑 서로 비교해서 가위 바위 보 승패 결정하기.(switch문으로 9개의 모든 경우의 수를 나열하기)
            // 0:가위, 1:바위 2:보

            Random rand = new Random();
            int aiChoice = rand.Next(0, 3); // 0~2사이의 랜덤 값
            int choice = Convert.ToInt32(Console.ReadLine());

            switch (choice)
            {
                case 0:
                    Console.WriteLine("당신의 선택은 가위입니다.");
                    break;
                case 1:
                    Console.WriteLine("당신의 선택은 바위입니다.");
                    break;
                case 2:
                    Console.WriteLine("당신의 선택은 보입니다.");
                    break;
            }
            switch (aiChoice)
            {
                case 0:
                    Console.WriteLine("컴퓨터의 선택은 가위입니다.");
                    break;
                case 1:
                    Console.WriteLine("컴퓨터의 선택은 바위입니다.");
                    break;
                case 2:
                    Console.WriteLine("컴퓨터의 선택은 보입니다.");
                    break;
            }
            // 승리 무승부 패배
            int result = choice - aiChoice;
            if (result == 0)
            {
                Console.WriteLine("무승부입니다");
            }
            else if ((result == 1) || (result == -2))
            {
                Console.WriteLine("승리입니다");
            }
            else
            {
                Console.WriteLine("패배입니다");
            }

            //15. 14번에서 푼 문제를 if문으로 풀되, 구글링하여 간결하게 작성하고 이해해보기. 
            //https://codingdojang.com/scode/643?langby=cs

            List<string> list = new List<string> { "가위", "바위", "보" };
            int input = list.BinarySearch(Console.ReadLine());
            Random random = new Random();
            int com = random.Next(3);

            if (input - com == 1 || input - com == -2)
            {
                Console.WriteLine("이겼습니다.");
            }
            else if (input == com)
            {
                Console.WriteLine("비겼습니다.");
            }
            else
            {
                Console.WriteLine("졌습니다.");
            }

            //16. 반복문을 이용하여 1부터 10까지 출력

            //17. 1부터 10까지 곱한 값을 출력

            //18.안녕하세요 1번째 손님부터 안녕하세요 10번째 손님까지 출력하기


            //19.숫자를 입력하고, 그 숫자의 제곱을 출력하다가 0을 입력하면 종료하기

            //20. 1부터 10까지 값을 곱하되, 홀수만 곱할 것
            //20 - 1) continue 활용
            //20 - 2) continue 활용 x



            //정답------------------------------------------------------------------

            Console.WriteLine("1번");
            Console.WriteLine("안녕하세요");

            Console.WriteLine("2번");
            Console.WriteLine(10 + 20);
            Console.WriteLine(7 / 3);
            Console.WriteLine(7 % 3);
            Console.WriteLine(7 - 3);
            Console.WriteLine(10 * 20);

            Console.WriteLine("3번");
            Console.WriteLine("10" + 10);
            Console.WriteLine('2' + 100);
            Console.WriteLine("10" + '2');

            Console.WriteLine("4번문제 입력받기");
            int mybirth = int.Parse(Console.ReadLine());
            Console.WriteLine("나는 " + mybirth + "생입니다.");

            Console.WriteLine("5번문제 입력받기");
            string myname = Console.ReadLine();
            Console.WriteLine("내 이름은 " + myname + "입니다.");

            Console.WriteLine("6번");
            int age = 30;
            string name = "이동준";
            Console.WriteLine("나는 \"" + name + "\"입니다. \"" + age + "\"대입니다.");
            Console.WriteLine($"나는 \"{name}\"입니다. \"{age}\"대입니다.");

            Console.WriteLine("7번");
            int myage = int.Parse(Console.ReadLine());
            Console.WriteLine(DateTime.Now.Year - myage + 1);

            Console.WriteLine("8번");
            Console.WriteLine("현재 몇년도인가?");
            int nowYear = int.Parse(Console.ReadLine());
            Console.WriteLine("태어난 건 몇년도인가?");
            int bornYear = int.Parse(Console.ReadLine());
            Console.WriteLine(nowYear - bornYear + 1);

            Console.WriteLine("9번");
            string input = Console.ReadLine();
            Console.WriteLine(input[0]);

            Console.WriteLine("10번");
            int w = int.Parse(Console.ReadLine());
            Console.WriteLine(w * w);

            Console.WriteLine("11번");
            int mynum = int.Parse(Console.ReadLine());
            if (mynum < 0)
                Console.WriteLine("음수");

            Console.WriteLine("12번");
            int myinput = int.Parse(Console.ReadLine());
            if (myinput > 0)
                Console.WriteLine("자연수");
            else
                Console.WriteLine("자연수 아님");

            Console.WriteLine("13번");
            Random r = new Random();
            int com = r.Next(3);
            if (com == 0)
                Console.WriteLine("가위");
            else if (com == 1)
                Console.WriteLine("바위");
            else if (com == 2)
                Console.WriteLine("보"); //끝에 else를 안 적고 else if로 끝내도 됨

            Console.WriteLine("14번");
            int mychoice = int.Parse(Console.ReadLine());
            switch (mychoice)
            {
                case 0: //가위
                    switch (com)
                    {
                        case 0:
                            Console.WriteLine("비김");
                            break;
                        case 1:
                            Console.WriteLine("패배");
                            break;
                        case 2:
                            Console.WriteLine("승리");
                            break;
                        default:
                            break;
                    }
                    break;
                case 1: //바위
                    switch (com)
                    {
                        case 0:
                            Console.WriteLine("승리");
                            break;
                        case 1:
                            Console.WriteLine("비김");
                            break;
                        case 2:
                            Console.WriteLine("패배");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: //보
                    switch (com)
                    {
                        case 0:
                            Console.WriteLine("패배");
                            break;
                        case 1:
                            Console.WriteLine("승리");
                            break;
                        case 2:
                            Console.WriteLine("비김");
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    Console.WriteLine("잘못된 값");
                    break;
            }

            Console.WriteLine("15번");
            if (com == mychoice)
                Console.WriteLine("비김");
            else if ((mychoice == 0 && com == 2) || (mychoice == 1 && com == 0) || (mychoice == 2 && com == 1)) //가위(0) -> 보(2), 바위(1) -> 가위(0), 보(2) -> 바위(1)
                Console.WriteLine("이김");
            else
                Console.WriteLine("짐");

            Console.WriteLine("16번");
            for (int i = 1; i <= 10; i++)
                Console.WriteLine(i);

            Console.WriteLine("17번");
            int sum = 1;
            for (int i = 1; i <= 10; i++)
                sum *= i;

            Console.WriteLine("18번");
            for (int i = 1; i <= 10; i++)
                Console.WriteLine($"안녕하세요 {i}번째 손님");

            Console.WriteLine("19번");
            while (true)
            {
                Console.WriteLine("숫자 입력");
                int m = int.Parse(Console.ReadLine());
                if (m == 0)
                    break;
                Console.WriteLine(m * m);
            }
            Console.WriteLine("20-1번");

            sum = 1;
            for (int i = 1; i <= 10; i++)
            {
                if (i % 2 != 0)
                    sum *= i;
            }
            Console.WriteLine("sum=" + sum);
            Console.WriteLine("20-2번");
            sum = 1;
            for (int i = 1; i <= 10; i++)
            {
                if (i % 2 == 0)
                    continue;
                sum *= i;
            }
            Console.WriteLine("sum=" + sum);

        }
    }
}
