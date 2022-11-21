import java.util.*;

//두 클래스를 상속 관계로 포함
class Pointz{		//	1. 부모 클래스 
	//위치정보를 포함(x좌표, y좌표)
	private int x;
	private int y;
	public Pointz(int a, int b) { 	// 4. 멤버 변수 초기화- >매개변수 //생성자
		this.x=a;
		this.y=b;
	}
	
	// x좌표와 y좌표의 값을 반환하는 get() 함수  -- 접근 할 수 있게, 
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	
	public void print() {	//7. 부모 자식 클래스 둘다에 함수 만든다.
		// Pointz 클래스의 객체에 의해 호출될 때 실행됨
		//	8. x좌표와 y 좌표의 위치 정보 출력
		System.out.println("Pointz 클래스의 print()가 실행되었습니다.");
		System.out.println("x좌표: "+this.x);
		System.out.println("y좌표: "+this.y);
	}
}

class ColorPointz extends Pointz{	//	2. 자식 클래스	
	//위치정보, 색상 포함(x/y좌표, 색상)  :: 상속 !!!!!!!!!!!!!!!!!!!!!
	
	private String color; // 이 클래스안 변수 //색상, x,y좌표 설정인데 xy는 상속받아서 할필요x
	public ColorPointz(int a, int b, String s) { //	5. 멤버 변수 선언
			super(a,b);	//super()함수로 각 멤버 변수 초기화.
						//부모 클래스의 생성자 통해 위치 정보 초기화
			this.color=s;
	}
	public void print() {	//7. 부모 자식 클래스 둘다에 함수 만든다.
		//ColorPointz 클래스의 객체에 의해 호출될 때 실행됨.
		//부모 클래스의 함수 중 형태가 같은 함수가 있을 시,
		//자신의 클래스에 있는 함수를 우선시하여 실행함.
		System.out.println("ColorPoint 클래스의 print()가 실행되었습니다");
		System.out.println("x좌표: "+this.getX());
		System.out.println("y좌표: "+this.getY());
		System.out.println("색상: "+this.color);
	}
}

public class java0824_Q1_Answer {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
	//	3. 객체 2개를 생성 //입력받아서 넣어주려면???
		System.out.print("점1에 대한 정보(x,y): ") ;
		int x1=s.nextInt();	//p1 객체 생성 위한 x좌표 입력
		int y1=s.nextInt();	//p1 객체 생성 위한 y좌표 입력
		//	6. Point 클래스의 p1 생성
		Pointz p1=new Pointz(x1, y1);  
		
		System.out.print("점2에 대한 정보(x,y,color): ") ;
		int x2=s.nextInt();	//p2 객체 생성 위한 x좌표 입력
		int y2=s.nextInt();	//p2 객체 생성 위한 y좌표 입력
		String color=s.next(); //nextLine(); //p2 객체 생성 위한
		//ColorPointz 클래스의 p2 생성
		ColorPointz p2=new ColorPointz(x2, y2, color);
		System.out.println();
		
		// 9. 클래스 함수 실행문.
		p1.print();				//Pointz 클래스의 print()가 실행
		System.out.println();
		p2.print();				//ColorPoint클래스의 print()가 실행
	}
}
