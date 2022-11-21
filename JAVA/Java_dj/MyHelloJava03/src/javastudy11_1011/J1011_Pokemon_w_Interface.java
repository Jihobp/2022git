package javastudy11_1011;

import java.util.ArrayList;
import java.util.List;
//interface??
//1. 특정 기능을 구현하도록 강제 함.
//2. 다중상속이 가능함. 추상클래스는 못한다. 
//3. 인터페이스끼리 상속도 됨.

public class J1011_Pokemon_w_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 피카츄는 생성하자마자 이름이 있어야 함
		// 디폴트 생성자가 없음
		Pikachu p = new Pikachu("아구몬");

		// 디폴트 생성자 이용해서 바로 인스턴스 생성가능
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();

		// 장동완성
		// Animalable 을 구현하는 익명 클래스. 여기선 강아지를 만들었다.
		Animalable d = new Animalable() {

			@Override
			public void charming() {
				// TODO Auto-generated method stub
				System.out.println("멍멍 짖는다.......");

			}
		};

		// Animalable d - Pikachu 등과 다르게 이름이 아예 없는 클래스
		// d 에서만 쓰이는 클래스임...........

		// 익명 클래스 !!!!!!!!!!! 왜 갑자기 함수 안에 public 이 나올까?
		// ㄴ > 익명 클래스 : 이름이 없는 객체.한번만 쓰고 말거.@#@#@#@!!!!@!@클래스로 만들기 애매한거?

		// 부모에 d 인스턴스 만들어서 new Animalable () 클래스를 넣는당.
		// Animalable 클래스를 상속받은 이름없는 클래스 가{ }중괄호 그자체.
		// charming()메소드.은 Animalable()클래스 안에서 왔지만, 쓰이는건 익명클래스{}안에서 쓰인다.

		// ㄱ > 인스턴스 뒤에 중괄호 나오면 {}익명 크래스!!!!!!!!!!
		// 익명클래스1
		// Animalable 클래스 타입, d는 객체명, 인스턴스는 new Food() .
		// 생성자는 Animalable(). new+생성자는 인스턴스.

		Plantable myp = new Plantable() {

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("LG 틔운기계에서 자라는 내꽃.");
			}
		};

		Pokemonable g = new Pokemonable() {

			@Override
			public void grow() {
				System.out.println("바다속에서 자란다.");

			}

			@Override
			public void charming() {
				System.out.println("구워워어웍");

			}

			@Override
			public void fight() {
				System.out.println("거북거북 손Death");

			}
		};

		// ArrayList는 List라는 인터페이스를 상속받은 클래스
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> ns = new ArrayList<Integer>();

		// try Catch 문법 - java, c#에서 자주 쓰임.
		// try 로 지정된 부분이 오류가 나면 catch 부분으로 넘어가고
		// 프로그램이 종료되진 않는다. - 실행.  (try Catch 안 한 상태서 오류나면 그대로 종료됨_)
		try {
			// 얕은 복사 이슈를 해결할 열 쇠 = > Cloneable이라는 인터페이스
			Pikachu pipi = (Pikachu) p.clone();
			// Pikachu pipi = p;
			pipi.setName("노란 똥땡이"); // 피카츄 한마리를 만들어서 pipi의 이름을 노란뚱떙이로 바꿨당.
			// p의 이름은 레옹인데?!! 왜 pip를 노란뚱떙이로 바꾸니,
			// 이유 : pipi랑 p랑 똑같은 위치를 참조하기 때문이다. (
			System.out.println(p.getName());

		} catch (Exception e) {
			// TODO: handle exception
		}

		//LAMBDA 람다
		//메소드가 하나 있는 인터페이스에 대해서 가능함
		//익명 클래스를 줄인것
		
		//Plantable의 grow를 오버라이딩한것
		//이걸 화살표 형태로 줄여버린것 = 람다.
		Plantable myFlower = () -> {
			System.out.println("무럭무럭 자라나요");
		};
		myFlower.grow();
	
	}

}

//1. Animalable 인터페이스 생성
//- public void charming();
//2. Plantable 인터페이스 생성
//- public void grow();
//3. Pokemonable이라는 인터페이스 생성
//단, 1,2번 인터페이스를 상속받아야 한다.
//- public void fight();
//4. 1,2,3번을 상속하는 포켓몬 클래스를
//하나씩 자유롭게 만들어보세요. (최소 3개의 클래스 만들기)
//ex) 피카츄, 이상해씨, 꼬북이 등 
//
//5. 1,2,3을 이용한 익명클래스도 만들어보기
