package my.hello.javastudy04_1005;

public class Rectangle {
	private int w;
	private int h;

	// alt shift r
	public int getW() {
		return w;
	}

	public void setW(int w) {	//0이하일때 예외처리
		if (w <= 0) {
			System.out.println("오류!(w)");
			this.w = 0;
			return; // setW를 종료시킴
		}
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {	//0이하일때 예외처리
		if (h <= 0) {
			System.out.println("H오류");
			this.h = 0;
			return;
		}
		this.h = h;
	}

	// alt shift o
	public Rectangle(int w, int h) {
		super();
		setW(w);//this.w = w;
		setH(h);//this.h = h;
	//미리미리 w,h값이 잘못됐을때 예외처리 걸어주고 하면 나중에 넓이 구할대 안정성이 생김. 걸러주는거,
	}


	// w나 h 하나만 알아서 하나만 입력하는 경우를 정사각형으로 간주해보자. ㅇㅅㅇ
	public Rectangle(int wh) {
		super();
		this.w = wh;
		this.h = wh;
	}
	
	public Rectangle() {
		System.out.println("네모네모 클래스 생성★");
	}
	
	
	//생성자 중복 ㄴㄴㄴ
//	public Rectangle() {
//		//super();
//	}
//	
	//인스턴스 메소드 = 함수
	//인트턴스 별로 동작하는ㄱ ㅔ 다르다 .. ㅇㅅㅇ
	//getArea를 r1,r2,r3가 호출하느냐에 따라 다르다. 
	
	public int getArea() {
		if(w<=0||h<=0)
		{
			System.out.println("error!");
			return -1;
		}
		else if(w==h) {
			System.out.println("정사각형!");
		}
		return w*h;		
	}
}
