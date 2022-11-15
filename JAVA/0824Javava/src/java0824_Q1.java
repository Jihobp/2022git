import java.util.*;
/*Point 클래스	(위치 정보 포함)
- 멤버 변수: x좌표, y좌표	(private으로)

ColorPoint 클래스 	(위치 정보, 색상 정보 포함)
- 멤버 변수: x좌표, y좌표, 색상	(private으로)
*** 두 클래스를 상속 관계로 표현할 것

Point와 ColorPoint에 대한 객체 하나씩 생성 (p1, p2)
- 각 멤버 변수의 정보 입력받기
- 생성자 통하여 각 멤버 변수 초기화하기
(super() 함수 사용해볼 것)

- 각 클래스에 대한 print() 함수 만들어 각 정보 출력하기
-> 오버라이딩 이용하여 구현하기
*/

class Point{	//상속
	private int x;
	private int y;

	//생성자
	public Point(int xx, int yy) {
		this.x=xx;
		this.y=yy;
	}
	
	public void setX(int x) {this.x=x;}
	public int getX() {return this.x;}
	public void setY(int y) {this.y=y;}
	public int getY() {return this.y;}
	
	public void print_P() {
		System.out.println("x좌표: "+this.getX());
		System.out.println("y좌표: "+this.getY());
	}
}	
	
class ColorPoint extends Point{	//상속, Point의 멤버변수 x, y
	private String color; //색상, x,y좌표 설정인데 xy는 상속받아서 할필요x
	
	public ColorPoint(int x, int y, String c) {
		super(x,y);	//super()함수로 각 멤버 변수 초기화.
		this.color=c;
	}
	
	//공용에서 setget하겠다,
	public void setColor(String cc) {this.color=cc;} 
	public String getColor() {return this.color;}
	public void print_C() {
		System.out.println("x좌표: "+this.getX());
		System.out.println("y좌표: "+this.getY());
		System.out.println("색상: "+this.color);
	}
}



public class java0824_Q1 {
	public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	
	
	//객체 생성 p1, p2 //입력받아서 넣어주려면???
	Point p=new Point(s.nextInt(),s.nextInt());
	ColorPoint c=new ColorPoint(s.nextInt(),s.nextInt(),s.next()); 
	//문자 입력받는건 s.nextLine() or s.next()
	//Point p=new Point(18,28); 이미 지정된 값을 넣어주는 개념
	//ColorPoint c=new ColorPoint(18,28,"회색");
	
	

	// 오버라이딩: 부모 클래스의 함수를 자식 클래스에서 다시 정의
			// 부모 클래스와 자식 클래스에 동일한 이름의 함수 있어도 정상 작동
			// 자식 클래스의 객체는 부모 클래스의 함수를 실행하지 X
			// 결론적으로, 자식 클래스 입장에선 "덮어쓰기"한 함수 사용
	p.print_P();
	System.out.println();
	
	c.print_C();
	System.out.println();
	
	}
}
