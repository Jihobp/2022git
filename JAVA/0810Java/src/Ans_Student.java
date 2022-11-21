// 1. Student 클래스 생성
// 멤버 변수: 이름(String), 학번(int), 학과(String) -> private
// 멤버 함수: 이름 반환하는 함수, 학번 반환하는 함수, 학과 반환하는 함수
// 생성자: 3개의 변수 초기화하는 생성자 (매개변수 3개)

// 2. main에서 자신의 이름, 학번, 학과 전달하여 객체 생성하기

// 3. 멤버 함수 통해서 3개의 멤버 출력 수행

class Student{
	//멤버 변수 선언부
	private String name;
	private int num;
	private String major;
	
	//멤버 함수 선언부
	public String getName() {return this.name;}
	public int getNum() {return this.num;}
	public String getMajor() {return this.major;}
	public void setName(String n) {this.name=n;}
	public void setNum(int n) {this.num=n;}
	public void setMajor(String m) {this.major=m;}
	
	//생성자 선언부
	public Student(String na, int n, String m) {
		this.name=na;
		this.num=n;
		this.major=m;
	}
}

public class Ans_Student {
	public static void main(String args[]) {
		//객체 선언부
		//클래스명 객체이름=new 클래스명();
		Student stu=new Student("LeeYuna", 18130956, "컴공");
		//객체 생성시 생성자가 즉시 실행됨
		//생성자는 일부러 호출할 수 없음
		
		//멤버 함수 호출 및 출력문 수행
		System.out.println("이름은 "+stu.getName());
		System.out.println("학번은 "+stu.getNum());
		System.out.println("전공은 "+stu.getMajor());
	}
}





