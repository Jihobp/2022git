//덧셈 관련한 클래스 만들어보고
//생성자랑 메소드 오버로딩 학습
	
class ex{
	//멤버 변수 선언부
	private int a;
	private int b;
	private double n1;
	private double n2;
	
	//생성자 선언부
	//오버로딩: 매개변수의 수와 타입이 다르면 같은 이름의 함수도 함께
	//BUT !!!! 반환형만 다른 건 오버로딩이 불가능 ???????????????? 
	//d.f ??
	public ex() { //매개변수가 없음 int형 숫자를 쓸거니까 넣어줬다.
		this.a=1;
		this.b=2;
	}
	public ex(int a, int b) { //int형 매개변수가 있음
		this.a=1;
		this.b=2;
	}
	public ex(double a, double b) {	//double형 매개변수가 있음.
		this.n1=a;
		this.n2=b;
	}
	//멤버 함수 선언부

	public int getA() {return this.a;}
	public int getB() {return this.b;}
	public double getN1() {return this.n1;}
	public double getN2() {return this.n2;}
	
	// 생성자 오버로딩과 비슷한 방식으로 진행하면 됨
		// int형을 반환하는 덧셈 함수 구현
		public int sum(int a, int b) {
			return a+b;
		}
		// double형을 반환하는 덧셈 함수 구현
		public double sum(double a, double b) {
			return a+b;
		}
	/*
	public double sum(int a, int b) { 
		함수에서 불러올때,
		반환형이 다르다고 되는게 아니라 매개변수의 타입과 슈가 달라야 된다.
		어떤거를 찾아야할지 함수가 인식을 못한다.
	}
	public int sum(int a, int b) {
		
	} */
}
public class Thoery_Overload {
	public static void main(String[] args) {
		//매개변수가 없는 생성자를 자동 실행
		ex test1=new ex();
		//int형 매개변수가 있는 생성자 자동 실행
		ex test2=new ex(7,7);
		//double형 매개변수가 있는 생성자 자동 실행
		ex test3=new ex(7.7, 10.7);
		
		int t1=test1.sum(test1.getA(), test1.getB());
		int t2=test2.sum(test2.getA(), test2.getB());
		double t3=test3.sum(test3.getN1(), test3.getN2());
		
		System.out.println("test1의 덧셈 결과: "+t1);
		System.out.println("test2의 덧셈 결과: "+t2);
		System.out.println("test3의 덧셈 결과: "+t3);
		
		
		//객체 배열
		//int i[]=new int[3];
		ex s[]=new ex[3]; //배열선언, 객체를 생성한건 아직 아님. 즉, 생성자 x
		s[0]=new ex();
		s[1]=new ex(3,5);
		s[2]=new ex(1.1, 7.7); //여기까지 객체 배열 생성 끝. the end !
		//s[0]=get.? ??????????????
		
		int r1=s[0].sum(s[0].getA(), s[0].getB());
		int r2=s[1].sum(s[1].getA(), s[1].getB());
		double r3=s[2].sum(s[2].getN1(), s[2].getN2());
		
		System.out.println("s[0]의 덧셈 결과는"+r1);
		System.out.println("s[1]의 덧셈 결과는"+r2);
		System.out.println("s[2]의 덧셈 결과는"+r3);
	}

}
