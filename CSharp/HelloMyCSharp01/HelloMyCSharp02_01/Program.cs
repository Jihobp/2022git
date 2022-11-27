using System;
using System.Collections.Generic;
using System.Linq;

namespace HelloMyCSharp02_01
{
    public class Program
    {
        static void Main(string[] args)
        {
            son son = new son(); //클래스 자체는 못불러오고 객체를 생성후 함수를 쓸 수 있다!
            son.randomE();
            Console.WriteLine();

            //LIst 랑 foreach 는 찰떡궁합!!
            List<int> list5 = new List<int>();
            list5.Add(5);
            list5.Add(7);
            list5.Add(5);
            list5.Add(3);
            list5.Add(10);
            list5.Remove(5);
            list5.Sort(); //오름차순 정렬. list에선 꽁짜다!!! desc 내림차순. 
            foreach (var item in list5) //list 출력하는법!
            {
                Console.WriteLine(item);
            }
            Console.WriteLine();

            /*배열에선 sort 못쓴다!
             * int[] add = { 1, 5, 3, 7 };
            add.Sort();*/
            //add를 list에 넣어서 오름차순 sort 쓰기? 
            int[] add = { 1, 5, 3, 7 };
            List<int> abcd = new List<int>(add);
            abcd.Sort();
            foreach (var item in abcd) //list 출력하는법!
            {
                Console.WriteLine(item);
            }
            Console.WriteLine();

            Console.WriteLine(list5.Min());
            Console.WriteLine(list5.Max());
            Console.WriteLine();

            Console.WriteLine(father.staticA); // 5
            father.staticA++; // 아빠의 클래스변수를 수정하니깐 자식꺼도 같이 바뀐다. 공유되니깐.
            Console.WriteLine(son.staticA); // 6

            father.staticB();
            son.staticB(); // 클래스메소드도 공유한다.
            Console.WriteLine();

            grandmother Gm = new grandmother(); //객체 생성
            Gm.age = 10; //값 넣고
            Console.WriteLine(Gm.age); //출력.
            Gm.Setname(Console.ReadLine()); // set을 통해 프리바트 입력.
            Console.WriteLine(Gm.Getname()); //get을 통해 프리바트 출력.

            int inta = 0;
            string stringa = "0";
            father2 f2 = new father2(5, 5);
            f2.overloding();
            f2.overloding(inta);
            f2.overloding(stringa);

            Console.WriteLine("시작");
            Console.WriteLine("시작");

            father f3 = new father(); //클래스 객체
            father f4 = f3; //클래스는 복사하면 얕아서 사실 한몸이다.
            mother m3 = new mother(); //구조체 객체
            mother m4 = m3; //구조체는 복사하면 깊어서 다른 몸이다.

            //참조복사
            f3.dd = 3; //사실 한몸이다. 
            f4.dd = 4;
            Console.WriteLine(f3.dd); //4, 값 참조, 주소형식
            Console.WriteLine(f4.dd); //4, 값 참조, 주소형식
            m3.dd = 3;
            m4.dd = 4;
            Console.WriteLine(m3.dd); //3, 객체 완전 복사
            Console.WriteLine(m4.dd); //4, 객체 완전 복사
            Console.WriteLine();

            //오버라이딩
            son2 s5 = new son2(3);
            s5.overloding();
            s5.overloding(2); //아들꺼 메소드 덮어써서 사용한다.
            Console.WriteLine();


            father2 f5 = new father2(3);
            //다형성 :: 자식을 부모로 위장, 부모몸에 집어넣지만 실제론 아들이 들어있어서 아들은 쓸수있다.
            //부모는 자식 못쓴다. 

            //왜쓰냐????????????????????????????????????????????
            //종류가 아무리 많아도 다형성 쓰면 아래처럼 끝나는데, 다형성 안쓰면 곱하기로 늘어난다.
            //코드를 줄이기 위해서다. 
            List<father2> a6 = new List<father2>(); // 아빠의 몸 배열 만듬
            a6.Add(f5); // 아빠를 아빠의 몸에 넣었다.
            a6.Add(s5); // 아들을 아빠의 몸에 우겨넣었다. 그래서 아들의 기술을 쓸 수도 있다.
            foreach (var item in a6)
            {
                item.overloding(); // 아빠와 아들을 함수실행한다.
                                   // 아빠의 몸에서 실행하기 때문에 기본적으로 아빠 메소드를 사용한다.
            }
            foreach (var item in a6)
            {
                if (item is son2) // 아들 기술 사용 가능하면 사용해라.
                    (item as son2).overloding(); // item as son2:: item을 son2로 형변환!!! 아들 기술 사용.
                else
                    item.overloding(); // 아빠는 아들 기술 못 쓰니 아빠 기술 써라.
            }
            Console.WriteLine();

            string aaa = Console.ReadLine();
            //Console.WriteLine(int.Parse(aaa));
            //예외처리
            try
            {
                //예외가 발생하면
                Console.WriteLine(int.Parse(aaa)); // 오류가 나도 프로그램이 안 터진다!
                Console.WriteLine("성공했습니다!");
            }
            catch (Exception)
            {
                //여기서 처리합니다.
                Console.WriteLine("실패시 오류가 났습니다!!!! ");
            }
            finally
            {
                Console.WriteLine("성공 및 실패 모두 무조건 실행합니다!!!!!");
                //무조건 실행합니다.
            }







            Console.WriteLine();
            Console.WriteLine();
            Console.WriteLine();
            //-----------------------------------------------------------------------------------





            int a = 10;
            string b = "안녕";
            char c = 'A';
            double d = 3.14;
            bool e = false;

            //1개의 변수인 데, 여러 개의 값을 갖게 하고 싶다면?
            //ex) 학생
            //이름값 = "오세룡"
            //나이 = 20
            //성별 = 남
            //시력 = 0.01
            //학점 = 'A'
            //결혼여부 = false
            //MBTI = "ISTJ"

            int 나이_오세룡 = 20;
            string 이름_오세룡 = "오세룡";
            char 학점_오세룡 = 'A';
            bool 결혼_오세룡 = false;
            string MBTI_오세룡 = "ISTJ";
            string 성별_오세룡 = "남";
            double 시력_오세룡 = 0.01;

            int 나이_조영탁 = 20;
            string 이름_조영탁 = "오세룡";
            char 학점_조영탁 = 'A';
            bool 결혼_조영탁 = false;
            string MBTI_조영탁 = "ISTJ";
            string 성별_조영탁 = "남";
            double 시력_조영탁 = 0.01;

            //하나의 변수로 여러 개의 값을
            //저장할 수 있는 자료형
            //=> 사용자 정의 자료형
            //int등과 같이 해당 언어에서 만든 자료형이
            //아니고, 프로그래머가 직접 만들었기 때문.
            //C -> 구조체(struct)
            //Java -> class
            //c++,C# -> struct, class

            //c 언어에서는 사용자 정의 자료형이라고 함
            //C++ C#, Java에서는 객체라는 말을 쓴다.
            //사용자 정의 객체 혹은 그냥 객체라고 함

            Student s1 = new Student();
            s1.Name = "오세룡";
            s1.Age = 20;
            s1.eye = 0.01;
            Student[] students = new Student[2];
            students[0] = s1;
            students[1] = new Student();
            students[1].Name = "박지호";
            students[1].Age = 25;
            students[1].eye = 0.1;

            Console.WriteLine(s1.Name);
            Console.WriteLine(students[1].Name);


            //문제-------------------------------------------------
            //1.Student 이용해서 학생 1명을 만든다.
            //Name, Age, eye 값도 추가한다.
            //자료형 도 중 요 하 다 ! 익 숙 해 지 기!!!!
            Student stu1 = new Student();
            stu1.Name = "이동준";
            stu1.Age = 20;
            stu1.eye = 0.4;
            Console.WriteLine($"{stu1.Name}학생은" +
                              $"{stu1.Age}살이고, 시력은 {stu1.eye}이다.");



            //2.Student 이용해서 학생 1명을 만들고
            //이 번엔 Console.ReadLine으로 값 받기
            Student stu2 = new Student();
            Console.WriteLine("이름은?");
            stu2.Name = Console.ReadLine();
            Console.WriteLine("나이는?");
            stu2.Age = int.Parse(Console.ReadLine());
            Console.WriteLine("시력은?");
            stu2.eye = double.Parse(Console.ReadLine());

            Console.WriteLine($"{stu2.Name}학생은 " +
                $"{stu2.Age}살이고, 시력은 {stu2.eye}입니다.");


            //3.Student 타입의 배열을 만들고, 3명의 학생 집어넣기
            //각각 Name, Age, eye 값도 추가한다.
            Student[] stus = new Student[3]; //3칸짜리 배열을 만들고 학생들을 집어넣느ㅏㄴ당.
            stus[0] = new Student();
            stus[0].Name = "조영탁";
            stus[0].Age = 30;
            stus[0].eye = 1.2;
            stus[1] = new Student();
            stus[1].Name = "이범식";
            stus[1].Age = 30;
            stus[1].eye = 1.9;
            stus[2] = new Student();
            stus[2].Name = "김혜민";
            stus[2].Age = 30;
            stus[2].eye = 2.0;


            //4.Student 타입의 배열을 만들고, 3명의 학생 집어넣기
            //반복문과 Console.ReadLine 이용해서 각 학생들의 정보(Name, Age, eye)도 추가한다.
            for (int i = 0; i < stus.Length; i++)
            {
                Console.WriteLine($"{stus[i].Name}학생은" +
                    $" {stus[i].Age}살이고, 시력은{stus[i].eye}이다.");
            }


            //5. 1~4번 학생들의 정보를 출력한다.
            Student[] stus2 = new Student[3];
            for (int i = 0; i < stus2.Length; i++)
            {
                stus2[i] = new Student();

                Console.WriteLine("이름?");
                stus2[i].Name = Console.ReadLine();
                Console.WriteLine("나이?");
                stus2[i].Age = int.Parse(Console.ReadLine());
                Console.WriteLine("시력?");
                stus2[i].eye = double.Parse(Console.ReadLine());

                Console.WriteLine("이름 : " + stus2[i].Name);
                Console.WriteLine("나이 : " + stus2[i].Age);
                Console.WriteLine("시력 : " + stus2[i].eye.ToString()); //소수점 안되서 string으로
            }


            //6.KBStudent라는 구조체를 만든다. (이름, 시력, 나이, MBTI)
            //7.이 구조체를 이용하여 학생을 1명이상 만들고 그 학생의 정보를 출력해본다.
            Console.WriteLine("KB 학생 만들기!");
            KBStudent kb1 = new KBStudent();
            kb1.Name = "장혜정";
            kb1.Age = 20;
            kb1.Eye = 1.5;
            kb1.MBTI = "ISFP";

            Console.WriteLine("이름 : " + kb1.Name);
            Console.WriteLine("나이 : " + kb1.Age);
            Console.WriteLine("시력 : " + kb1.Eye);
            Console.WriteLine("mbti : " + kb1.MBTI);

            KBStudent kb2 = new KBStudent();
            kb2.Name = "김성환";
            kb2.Age = 20;
            kb2.Eye = 1.7;
            kb2.MBTI = "ENFP";
            kb2.introduce(); //kb2의 모든 정보를 다 출력함


        }
    }


}
