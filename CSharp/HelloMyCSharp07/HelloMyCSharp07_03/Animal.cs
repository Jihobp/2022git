using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloMyCSharp07_03
{   // //오버라이딩 = > 강제 형변환해도 부모 클래스의 메소드 호출 X
    //부모 클래스의 메소드를 자식 클래스에서 재구현.  함수만!!!!!!!!!!!!!!!!!!!!! 덮어쓰기~~~!!!!!!!! 가능!!!!!!!!!!
    //여기서 추상 클래스는, 부모에 abstract 붙어있으면 반드시! overriding 해야합니당!

    //추상클래스라고함.
    //인스턴스를 만들 수 없다.
    //해당 클래스를 상속받은 클래스는 반드시 기능 구체화=메소드,변수? 해야함!!!
    //추상 클래스랑 인터페이스가 "다형성"을 많이 활용한다. 
    abstract public class Animal
    {
        public string name { get; set; }
        public int age { get; set; }    
        public void sleep() //자는건 모든 동물이 똑같다고 가정해봄. 
        {
            System.Windows.Forms.MessageBox.Show
                ($"{name}은/는 {age}살이라서 많이 잡니다.");
        }
        //동물마다 먹는 모습이 다 다르다. 
        public abstract void eat(); //Animal을 상속받은 클래스에서 구현해야 함
    }
}
