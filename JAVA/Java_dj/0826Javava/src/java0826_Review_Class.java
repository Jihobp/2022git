import java.util.Scanner;

//클래스와 상속의 내용 총정리
//클래스는 C언어에서 배웠던 구조체의 업그레이드 버전
//이 클래스를 보통 객체를 생성하는 데에 사용
//클래스의 구성 요소: 필드(멤버 변수), 메소드(멤버함수), 생성자


//class 키워드를 통해서 클래스 선언
class A{	//	1. A클래스 선언
	private int n1;		// 멤버 변수의 선언 형태
	// 실무에선 멤버 변수도 public으로 사용
	
	// 생성자: 객체를 생성하는 데에 자동적으로 실행되는 메소드
	// 생성자의 이름은 클래스의 이름과 동일해야함
	public A(int n) {
		System.out.println("n1의 값을 초기화합니다.");
		this.n1=n;
	}
	
	public void setN(int a) {	// 변수 n1의 값을 "변경"
		this.n1=a;
	}
	public int getN() {		// 변수 n1의 값을 "반환"
		return this.n1;
	}
	
	// 오버로딩: 함수명이 같아도 매개변수의 수와 종류가 다르다면
	// 				함께 사용할 수 있다는 의미
	public int Sum() {		// 매개변수가 없음
		System.out.println("매개변수 없는 Sum 함수 사용");
		return 1;
	}
	public int Sum(int a, int b) {	// int형 매개변수가 2개 있음
		System.out.println("매개변수 있는 Sum 함수 사용");
		return a+b;
	}
}


// 상속: 부모 클래스(상위 클래스), 자식 클래스(하위 클래스)
// 부모 클래스의 멤버를 자식 클래스가 복붙하여 자신의 것으로 만듬.
//private 도 상속 받고나면 접근 등 가능 하냠?
//원본의 멤버에 대해 복붙은 가능하지만 
//직접적인 접근은 자유자재로 가능하지 않을 수 있음
//(위는 public이 아닌 멤버에 관한내용)

//상속을 할때, extends 키워드를 이용
class B extends A{ //	2. A: 부모 클래스, B: 자식 클래스
	private int n2;	//B 자신의 멤버 변수
	//B에 대한 멤버 변수 : n1, ,n2(n1 에 대한 직접 접근은 불가능)
	
	//A 클래스에서 생성자를 만든 상태
	//그렇기 때문에 해당 클래스에서 A 클래스의 생성자를 반드시 실행
	//상속을 걸게 되면, 생성자 간에는 종속적인 관계가 생성.
	public B(int a, int b) { //매개변수 설정하니, 클래스 B의 빨간 줄 사라짐! 대신 int a, int b 값이 없어서 빨간줄 뜬다!
		//super() 함수 : 부모 클래스의 생성자를 불러와 실행.
		super(a); 	//A 클래스의 생성자 실행해 n1 값 초기화.
		this.n2=b;  
	}
	
	//									(자식 클래스 입장)
	//오버라이딩: 부모 클래스의 멤버와 자기 자신의 클래스의 멤버 중
	//동일한 멤버가 있을 시, 자기 자신의 것을 우선시하여 사용.
	public void setN(int a) { 	
		this.n2=a;
	}
	public int getN() {	
		return this.n2;		//자기 자신의 값을 우선해서 사용, 상속해서 사용한다.
	}
}
	public class java0826_Review_Class {
		public static void main(String[] args) {
			// 객체 생성을 하는 데에 new 키워드를 사용
			// 객체 생성을 할 때에 생성자의 매개변수에 따라 값을 전송해야함
			// 클래스를 통해서 여러 개의 객체 생성 가능
			A a=new A(1);
			A aaaa=new A(2);
			
			B b=new B(3,4);
			
			// 멤버 참조할 시 .을 사용 (C언의 구조체와 비슷)
			System.out.println("a의 n1 값은 "+a.getN());
			
			// 오버로딩 적용
			a.Sum();
			a.Sum(2,4);
			System.out.println();
			
			// 오버라이딩 적용
			System.out.println("a 객체의 n1값: "+a.getN());
			System.out.println("b 객체의 n2값: "+b.getN());
		}
	}


