// 클래스 내용 복습

// 클래스 구성 : 필드(멤버 변수), 메소드(멤버 함수), 생성자
// 접근 제어자 : public(외부로 공개), private(외부로 공개X)
// 객체 생성 : new 키워드 사용, 클래스명을 사용
// (클래스명은 int, double과 같은 타입명과 비슷한 취급)
// 멤버 참조 및 호출과 같은 사용은 구조체와 비슷함 (.을 사용)
// 오버로딩 -> 메소드 오버로딩, 생성자 오버로딩
// 오버로딩 : 매개변수의 구성을 다르게 하여 동일한 함수명을 함께 사용하는 것
// this 문법 : 객체 자신을 가리키는 포인터 개념 (저는 습관 들여져있어요.)

//	오늘 예제 : 도형 넓이를 계산하는 클래스 만들고 사용하기
// 도형은 원, 사각형, 직각삼각형ㅇ로 한정
import java.util.Scanner;

class Shape {
	// <<<<<멤버 변수 선언부>>>>>>
	public String name;		// 도형 이름 저장
	public int a;
	public int b;
	public Boolean t;		// 삼각형에서만 쓸 예정, 직각인지 아닌지 판단

	// 원의 넓이를 구하는 데에는 원의 반지름이 필요 -> a만 사용
	// 사각형의 넓이를 구하는 데에는 가로, 세로 길이가 필요 -> a,b 사용
	// 삼각형 넓이를 구하는 데에는 밑변, 높이가 필요 -> a,b 사용 
	// 직각 여부 파악 위해서 t도 함께 사용

	// <<<<<<<<< 생성자 선언부 >>>>>>>> ///////////
	// 원 도형 생성 시 사용
	public Shape(String n, int a) { // 매개변수 2개: 도형이름, 반지름
		this.name = n; // 헷갈리면 다르게 사용하기.
		this.a = a;
	}
	// 사각형 생성 시 사용
		public Shape(String n, int a, int b) {	// 매개변수 3개: 도형 이름, 길이 2개
			this.name=n; // 헷갈리면 이름 다르게 사용하기.'v'
			this.a=a;
			this.b=b;
	}
	// 삼각형 생성 시 사용
		public Shape(String n, int a, int b, Boolean t) {	// 매개변수 4개: 도형 이름, 길이 2개, 직각 여부
			this.name=n;
			this.a=a;
			this.b=b;
			this.t=t;
		}
		
		
	// <<<<<멤버 함수 선언부>>>>>
		public double getSize(int r) {	// 원 넓이 구하는 함수
			return r*r*3.14;
	}

		public int getSize(int n1, int n2) {	// 사각형 넓이 구하는 함수
			return n1*n2;
	}
		public double getSize(int n1, int n2, Boolean t) {	// 삼각형 넓이 구하는 함수 >매개변수 구성 똑같으면 같이사용 ㄴㄴ
			if(t==true) {System.out.println("직각삼각형입니다.");}
			else {System.out.println("직각삼각형이 아닙니다.");}
			return n1*n2/2;
		}		
//	public double getSize(int n1, int n2, Boolean t) { // 직각삼각형 넓이 구하는 함수 >
//		if (t == true) { // 참 또는 거짓의 값을 갖는 자료형을 불 자료형이라고 한다. 자료형의 명칭은 boolean(불린 또는 불리언이라고 부른다)이다.
//			System.out.println("직각삼각형입니다."); // 불 자료형에 대입되는 값은 참(true) 또는 거짓(false)만 가능하다.
//		} else {
//			System.out.println("직각삼각형이 아닙니다.");
//		}
//		return n1 * n2 / 2;
	
}

public class Java0812 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// 객체 배열 선언
		Shape sh[]=new Shape[3];	// 객체 생성은 안되고 배열만 만들어진 상태
		// 객체 생성문 : 입력문 및 반복문과 조건문을 같이 활용해봄
		for(int i=0;i<3;i++) {
			String name=s.next();
			if(name.equals("원")) {	// == 사용하면 안됨
				int a=s.nextInt();
				sh[i]=new Shape(name, a);
			}
			else if(name.equals("사각형")) {
				int a=s.nextInt();
				int b=s.nextInt();
				sh[i]=new Shape(name, a,b);
			}
			else {	// 삼각형일 때
				int a=s.nextInt();
				int b=s.nextInt();
				Boolean t=s.nextBoolean();
				sh[i]=new Shape(name, a, b, t);
			}
		}
		
		// 넓이 출력문 나열
		for(int i=0;i<3;i++) {
			double size;// int, double 둘다 반환 될수 잇는 double
			if(sh[i].name.equals("원")) {		// 원의 넓이를 구하는 조건문
				size=sh[i].getSize(sh[i].a);
				System.out.println("해당 원의 넓이는 "+size);
			}
			else if(sh[i].name.equals("사각형")) {	// 사각형 넓이를 구하는 조건문
				size=sh[i].getSize(sh[i].a, sh[i].b);
				System.out.println("해당 사각형의 넓이는 "+size);
			}
			else {	// 삼각형의 넓이를 구하는 조건문
				size=sh[i].getSize(sh[i].a, sh[i].b, sh[i].t);
				System.out.println("해당 삼각형의 넓이는 "+size);
			}
		}
	}
}
