//	상속 	 - >> 특정클래스의 멤버들을 물려받는다.
//	상속 	 - >> 부모클래스와 자식클래스 (상위클래스와 하위클래스)
//ppt 접근 제어자 access control 참고~~~!!!
class A{	//클래스 A가 부모 클래스
	private int n1;	//main에서 접근 못하는 private 멤버
	public int n2;	//public 멤버
	protected int n3; //protected 멤버?
	//	protected : 자기 자신과 자신으로부터 상속한 클래스에서만 접근 가능.
	//	1.	클래스 자기 자신
	//	2.	자신의 클래스를 상속받은 클래스
	//	3.	클래스 자기 자신이 속해있는 패키지 전체
	public void setN1(int n) {this.n1=n;}	//private n1의 값 변경하는 함수
	public int getN1() {return this.n1;}	//private n1의 값 반환하는 함수
	public void setN3(int n) {this.n3=n;}
	public int getN3() {return this.n3;}
}

// 클래스 B는 클래스 A로부터 상속받음
class B extends A{		// 클래스 B가 자식 클래스
	//	public의 멤버 상속 받음 -> n2 멤버가 복사해서 붙여졌다.
	// 	private의 멤버 상속 받음 -> n1의 멤버가 복사해서 붙여졌다.
			//	method 도 함께 상속받기 때문에, 함께 복사해서 붙여졋다.
	//	protected 멤버 상속 받음 -> n3 멤버가 복사해서 붙여졌다.
	private int ex;
	public int q; 	//추가해본 멤버들
	// B 클래스의 멤버는 A클래스의 멤버+추가된 멤버
}

public class Theory0812_legacy { 
	public static void main(String[] args) {
	A a=new A();	//	객체 a 생성
	B b=new B();	// 	객체 b 생성
	
	// public 멤버-변수?? 접근
	a.n2=1; //틀만 복사 붙여넣기한거지, 값은 복사 붙여넣기 안된다.~~ 공유한게 아.니.다 !!!!!!!!
	b.n2=5; //n2의 값을 5로 바군다.
	System.out.println("객체 a에 대한 public 멤버의 값: "+a.n2);
	System.out.println("객체 b에 대한 public 멤버의 값: "+b.n2);
	
	//	private 멤버-변수?? 접근
	a.setN1(10);
	b.setN1(50);
	System.out.println("객체 a에 대한 private 멤버의 값: "+a.getN1());
	System.out.println("객체 b에 대한 private 멤버의 값"+b.getN1());
	
	//	protected 멤버 접근
	a.setN3(100); //set : 저장, get : 값을 준다. 받는다???????????
	b.setN3(500);
	System.out.println("객체 a에 대한 protected 멤버의 값: "+a.getN3());
	System.out.println("객체 b에 대한 protected 멤버의 값: "+b.getN3());
	
	
	}
}
