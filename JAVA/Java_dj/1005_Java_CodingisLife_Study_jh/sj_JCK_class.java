//🐺🐺 YT's접근제어자
// Public // 같은 클래스, 같은 패키지, 자식 클래스, 그 외 영역에서 접근 가능
// protected // 같은 클래스, 같은 패키지, 자식 클래스에서 접근 가능
// default // 같은 클래스, 같은 패키지에서 접근 가능
// Private // 같은 클래스에서만 접근 가능
//
// gameC a = new nums(); // 부모클래스 a = new 자식클래스();, 부모 메소드만 사용 가능
// a instanceof gameC // a 객체가 gameC 클래스이거나 상속 받고 있으면 true 반환
// ((nums) a).c(); // 부모타입을 자식타입으로 형변환하여 c 메소드 사용
// nums aa = (nums) a; // a를 aa로 얕은 복사 및 형변환, 이후 형변환 필요 없음

// 오버로딩 = 생성자 만들고 매개변수 덮어 쓰우깅 ???!

class A {
	private String s;

	// 생성자.
	A(String s) {
		this.s = s + "A";
	}

	public void fn(String s) {
		System.out.println(this.s + s);
	}
}

//🍕🍕클래스엔 생성자를 만들어줘야함.
//자식클래스는 절대 부모클래스의 생성자를 사용할 수 없다
//다만 자식클래스의 객체를 생성하기 위해서는 부모클래스의 생성자가 있어야하만 한다. 
//(부모클래스의 생성자를 사용한다는 의미가 아닌, 부모클래스의 생성자가 '존재'하기만 하면 된다.)
//무조건 자식클래스 생성자를 사용하되, 자식클래스 생성자가 없으면 super() 사용.


//-------------------------------------------------------------------
//클래스 A에 매개변수 String s를 받는 생성자를 명시적으로 선언해줬는데,
//매개변수가 없는 기본 생성자가 없으니까
//B에서 상속받을때 A에서 명시적으로 선언해 준 생성자를 같이 선언해줘야 해요.

//생성자 번부 생략 => 매개변수가 없는 생성자가 자동으로 생성. super();
//매개변수가 있는 생성자 => 매개변수가 없는 기본 생성자를 따로 선언해줘야함.
//매개변수가 있는 생성자가 있지만 기본 생성자를 따로 선언 안해주고 상속했을때 => 매개변수가 있는 생성자를 자식 클래스에서 같이 선언해줘야함.

//매개변수가 없는 생성자가 있는 부모 클래스를 상속받으면 자식 클래스를 생성할때 매개변수가 없는 생성자를 자동으로 실행하지만,
//매개변수가 없는 && 생성자가 없는 부모 클래스를 상속받으면 자동으로 생핼할 생성자가 없으니 명시적으로 표시해야한다.



class B extends A {
	private String s;
	
	
//생성자
	B(String s) { 
		super(s);	//부모클래스를 먼저 생성해줘야함. 그안에 매개변수 새로 받아야함.
		this.s = s + "B";
	}

	public void fn(String s) {
		System.out.println(this.s + s);
	}

}

//1. 
//A a = new B("Hello"); //B클래스 Hello 매개변수를 넣어 생성. 값: HelloB
//a.fn("HI");	//fn함수의 내용이 기존 값에 매개변수를 더해서 출력하는 것이어서 위의 값에서 HI를 붙이면 최종 출력값은 HelloBHi.

//-------------------------------------------------------------------------


class C{
	private int a;
	public C(int a) {
		this.a=a;
	}
	public void display() {
		System.out.println("a="+a);
	}
}

class D extends C{
	public D(int a) {
		super(a);
		super.display();
	}
}



//2.
//Parent obj = new Child(); // 자식클래스 Child를 기반으로 한 obj 객체 생성
//System.out.print(obj.compute(4)); // compute 메소드에 4 넣어서 실행.
// if(num<=1) return num; // num이 1이 이하면 1 반환 후 종료.
// compute(num-1)+compute(num-3); //
// compute(4)는 4-3해서 +1과 compute(3) 실행
// compute(3)은 3-3해서 +0과 compute(2) 실행
// compute(2)는 2-3해서 -1과 compute(1) 실행
// compute(1)은 1과 종료.
// +1+0-1+1= 1.
//-------------------------------------------------------------------------
class Parent{
	public int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1)+compute(num-2);
	}
}

//오버라이딩 >> 
class Child extends Parent{
	public int compute(int num) {
		if(num <=1) return num;
		return compute(num-1)+compute(num-3);
				//compute(3)+1
				//compute(2)+0
				//compute(1)-1
				//compute +1
	}
}




class sj_JCK_class {
	public static void main(String[] args) {
		A a = new B("Hello"); 	// B(String s)+"B"
		a.fn("Hi");				//오버라이딩 ㅇㅅㅇ B클래스에 a인스턴스안에.fn함수 출력(안에 HI)넣어줌.
		//an, HelloBHi
	D obj=new D(10);	//a=10
	Parent obj2 = new Child();
	System.out.println(obj2.compute(4));	//1
	}
}
