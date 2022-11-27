using System;

namespace HelloMyCSharp02_01
{
    public class yt1
    {

    }

    //탁오빠 Quiz
    //class abc와 구조체 abcd를 만드세요. 
    //class abc에는 int 타입 cc라는 변수, 
    //struct abcd에는 string 타입 dd라는 변수가 있어야합니다. 


    //인터페이스는 정신, 클래스는 육체. 메소드는 장기.
    //클래스 메소드는 static이 붙었다. 
    //클래스는 주소느낌이다. 클래스는 얕은 복사다.
    //구조체는 객체느낌이다. 구조체는 깊은 복사다. 
    public class father
    {   //get,set은 힘수다!
        private int a; // 밖에서 만질 수 없다. 안에선 만질 수 있다.
        private int b { get; set; } // 밖에서 만질 수 있게 한다.
        static public int c = 0; // 밖에서 만질 수 있다. 
        public int dd = 0;
        static public int staticA = 5; // 클래스 변수. 변수를 공유한다.
        static public void staticB() // 클래스 메소드. 매소드를 공유한다.
        {
            c++;
        }
    }
    public struct mother
    {
        public int dd;
        public string d; //{ get; set; }

    }
    public class son : father
    {
        public void money() //a,b는 private이라 못받음.
        {
            c++; //c+1=c
        }
        public int e { get; set; }
        public void randomE()
        {
            //1부터 10까지 랜덤으로 출력 
            Random random = new Random(); //클래스 선언
            Console.WriteLine(random.Next(1, 11)); //객체로 써야함 
                                                   //random 공식! 1이상 11미만
            Console.WriteLine(random.Next(2, 21)); //2에서 20까지

        }
    }

    //추상화 클래스 > 구체화함.
    public abstract class grandfather
    {
        public int age;
        public string name;
        static int a; // ???????????????????????????????????? 된다... 

        //변수는 만들 수 있다.
        //추상화 변수 만들기. xx 불가.
        //추상화 클래스로 객체 생성 불가.
        //상속받은 클래스로 만들어 줘야 함
        //추상화 메소드는, 반드시 자식 클래스에서 구체화 시켜줘야 함!!!!
        public abstract void nameK(); // 추상화 메소드 만들기.


    }

    public class grandmother : grandfather
    {
        private string name; //밖에서 건드릴 수 없다.
        //그러므로 밑에서 통로를 만들어준다, set/get. 생성/리턴

        public void Setname(string name) //퍼블릭으로 출력한다.
        {
            this.name = name;
        }
        public string Getname() //퍼블릭으로 출력한다.
        {
            return name;
        }

        public override void nameK()
        {

            //throw new NotImplementedException();
        }
    }

    //interface !!! 
    //인터페이스는 변수를 못만든다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    interface ggfather
    {
        int age(); //메소드 만듬.
    }

    public interface ggmother
    {
        string name(); //메소드 만듬.
    }

    //클래스는 하나상속, 인터페이스는 다중상속가능
    //인터페이스에 상속받은 손흥민은 부모들의 메소드들을 무조건 만들어줘야한다!!!! 
    //탁오빠 quiz 인터페이스는 인터페이스를 상속받을 수 있습니까?
    // YES !!!!!!!!!@!@!@!@!~~~~~~~~~~~~ㅇㅅㅇ /

    public class sonheungmin : ggfather, ggmother
    {
        public int age()
        {
            throw new NotImplementedException();
        }

        public string name()
        {
            throw new NotImplementedException();
        }
    }


    public class father2
    {
        public int a;
        public int b;
        public void voidA()
        {
            a++;
        }
        //오버로딩 : 동명이인.과적.같은 메소드랑 생성자 가능.
        //오버라이딩 : 덮어쓰기.재정의.다른 메소드. 

        //동일한 메소드는 존재할 수 없다. 
        //메소드의 이름은 같지만, 형식이 다르다면 존재할 수 있다. 
        public void overloding()
        {
            Console.WriteLine("출력!");
        }
        public virtual void overloding(int a)
        {
            Console.WriteLine(a + " 출력!"); ;
        }
        public void overloding(string a)
        {
            Console.WriteLine(a + " 스트링 출력!"); ;
        }

        //생성자는 육체를 생성하는 거다. feat: 무월 ;  육체는 단한번 생성
        //생성자가 없으면 클래스명()의 기본 생성자를 만든다.

        //기본생성자

        //a만 있는 생성자.
        public father2(int a)
        {
            this.a = a;
        }
        public father2(int a, int b) //덮어쓰기해서 기본생성자가 없어졌다.
        {
            this.a = a;
            this.b = b;
        }
    }
    public class son2 : father2
    {   //부모클래스에서 기본생성자가 없으면, 아들도 부모의 생성자를 만들어 줘야 한다. 
        public son2(int a) : base(a) //super=base = 아빠생성자 만들고, 아들생성자 만든다!!! 
        {
        }


        public void money()
        {
            a++;
        }
        public int e { get; set; }
        public void randomE()
        {
            Random random = new Random();
            Console.WriteLine(random.Next(1, 11));
            Console.WriteLine(random.Next(2, 21));
        }
        //부모의 메소드를 자식에서 재정의할때 new 방법과 override가 있다.
        //new는 여차하면 부모꺼 사용가능
        //override는 아예 덮어쓰기라서 절대 부모꺼 사용 못함!
        public new void overloding() //new 생략 가능
        {
            Console.WriteLine("출력아들이다!!!!!");
        }
        public override void overloding(int a) // 부모에서 버츄얼 써줘야만 오버라이딩 가능!
        {
            Console.WriteLine(a + " 출력아들이다!!!!"); ;
        }

    }




}
