using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp08
{
    public class Student<T>
    {   //제너릭(T) : 어떤 타입이 올지 모르겠다고 함. 
        /*
         * 클래스 생성자에서 초기화 안하고 멤버 변수 지우면 null 값/ 이 아니라 기본 값.숫자는0, 문자는null. 들어감
        구조체에선 초기화 되지 않은 멤버 변수로 생성자를 만들지 않거나, 생성자를 만들면 생성자에서 반드시 초기화 해줘야 한다.
        선언과 동시에 초기화 할 수 엇ㅂ다. 오류가 발생.

        제네릭: int, string, 등 타입
        인덱서 : 클래스형태로 연산을 하는데 배열을 매개변수 형태로 받는다. 

        “선택(選擇)과 집중(超集中)”
        api : application programming interface ; 공개된 data
        interface : 정보를 주고받기 위해서 정해진 규칙.ex) web에 뒤로가기, 새로고침 등 ; ui(user interface);사람과 소프트웨어 간의 정보 교환
        프로그래밍 에서의 인터페이스 ; 특적기능=method,fx 을 꼭 추가해야한다는 규칙. 특정기능에 대하여 인터페이스를 추가시 특정기능 반드시 구현.


         */
        public T hakbeon { get; set; } 
        public string name { get; set; }
        public int age { get; set; }

        //빈 생성자!!! 
        public Student()
        {

        }

        //빈곳에 alt+ enter  >  생성자 생성 !!!!!!!
        public Student(T hakbeon, string name, int age)
        {
            this.hakbeon = hakbeon;
            this.name = name;
            this.age = age;
        }
    }
}
