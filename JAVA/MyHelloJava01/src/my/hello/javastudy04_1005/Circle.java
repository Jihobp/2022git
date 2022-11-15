package my.hello.javastudy04_1005;

public class Circle {
	
	//인스턴스 별로 다르다!
	//그래서 인스턴스 변수가 된다.
	//alt shift s > r > 게터세터
	//alt shift s > o > 생성자-오버로딩
	
	private int r;
	//PI와 같이 모든 클래스가 공통적으로 접근하고 
	//공통적으로 쓸 수 있는 변수를 클래스 변수
	//인스턴스 별로 다른게 아니다!
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	//공통적으로 쓸 수 있는 메소드를 클래스 메소드
	//인스턴스 별로 다른게 아니다!
	private static double PI;

	public static double getPI() {
		return PI;
	}

	public static void setPI(double pI) {
		PI = pI;
	}

	
	//<생성자> 
	
	//매개변수가 있는 생성자를 만들면서 디폴트 생성자는 지워졌다.
	//디폴트 생성자 : 매개변수 없고 아무 동작도 안 하는 생성자
	
	//반드시 반지름값을 처음에 지정을 해줘야 함.
	//PI값은 기본적으로 3.14로 고정을 함.
	public Circle(int r) {
		super();
		this.r = r;
		PI=3.14;
	}

	public double getArea() {
		return r*r*PI;
	}
	
}

