package my.hello.javastudy03;
//1. Circle 클래스 만들기
//반지름 값 r
//원주율 값 pi(상수로 할 것. final 키워드)
// ㅇㅅㅇ 공식 몰라도 검색하면 된다. ㅇㅅㅇ

//2. Circle 생성하고 r 값 set 할 때
//0이하의 값이 나오면 오류 메시지 쓰고
//r 값을 0으로 하기

//3. 원의 둘레(getRound)와 원의 넓이(getArea) 메소드(=함수) 만들기
//호출해보기
//ex)
//Circle a = new Circle();
//a.setR(10);
//System.out.println(a.getArea());
//System.out.println(a.getRound());
public class Circle {
	private int r; // 반지름값 //circle 안에 잇어서 매개변수도 필요없다.
	private final double pi = 3.14; // 원주율값

	// alt shift s 누르고 r 누르고
	// r부분만 체크한 다음 generate
	public int getR() {//간접적으로 private에 접근할 수 있게 
		return r;
	}

	//get은 private의 값을 가져오는거고, 
	//set은 private의 값을 바꿔줄 수 잇다. 
	
	// 반지름 값이 0이하일 경우 0으로 고정시켜버린다.
	public void setR(int r) {
		if (r <= 0)
			this.r = 0;
		else
			this.r = r;
	}

	// public 타입의 함수 (=메소드)를 2개 새로 만든다.
	// 넓이 구하기랑 둘레 구하기.

	public double getArea() {
		if (r <= 0) {
			System.out.println("반지름 값 확인바람");
			return 0;
		}
		return r * r * pi;
	}

	
	
	public double getRound() {
		if (r <= 0) {
			System.out.println("반지름 값 확인바람");
			return 0;
		}
		return 2 * r * pi;
	}

	// public MyCircle() {

	// }

	// 생성자
	// 기본 형태는 아래와 같이 아무것도 수행하지 않는 코드다.
	// public Mycircle(){}
	// 생성자 == 리턴값 없는 함수라고도 본다.

	// 생성자는 글자 그대로 생성할 때 호출하므로
	// 변수를 선언함과 도시에 속성값도 바로 세팅할 수 있다.
	// new Circle()이라고 적을땐 r 값을 나중에 별도 세팅해야 하지만
	// 이렇게 매개변수로 r 값 적으면 선언과 동시에 r 값 선언 가능함.

	public Circle(int r) {
		setR(r);
	}

	// 문제 1!!!! problem
	// 이렇게 생성자를 명시적으로 적게 되면
	// 기존에 있던 생성자가 지워짐
	// 기존에 있던 생성자 => public Circle(){}
	// 그래서 이 상태로 다시 main 있는 코드 가보면 빨간줄이 있다.

	// 해결책!!
	// 아무것도 없는 생성자를 이번엔 '명시적으로' 다시 써준다.
	public Circle() {

	}
	// 이렇게!!!!
	// <<<<<<<<<<<<<<< 오버로딩>>>>>>>>>>>>>>>
	// 생성자나 함수)=메소드) 만들때,
	// 이름은 똑같은데 매개변수의 개수나 타입이 다른 경우엔
	// 서로 다른걸로 취급함
	// 즉 MyCircle(r)이랑 MyCircle()은 서로 전혀 다른 것
	// 즉 중복된 생성자나 함수가 아니란 뜻!

}
