import java.util.Scanner;
// Person 클래스를 부모 클래스로 두고
class Person{ 
	//사람 클래스 :: 부모 클래스, 상위 클래스
	private String name; 	//이름
	private String gender;	//성별
	//멤버: 이름, 성별
	
	public Person() {	//생성자는 이부분이 숨겨져있다. ㅇㅅㅇ 굳이 안만들어두 댄다!
		//생성자는 무월!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//생성자 선언 //초기값.//새로운 공간에 값을 집어넣어주는 것. 
    	//무월!!!! 한번 밖에 못쓰는 초초궁극기 !!!!!!!! 
	}
	
	public Person(String n, String g) { //사람클래스에 객체를 만들기 위해서는 무조건 생성해야함.
		this.name=n;
		this.gender=g;
	}
	
	public void setName(String n) {this.name=n;}	//setName함수에 문자열 변수String= 매개변수
	//여기의 name을 문자n 변수에 set한다.
	public String getName() {return this.name;}	//name을 반환한다.
	public void print_P() {
		System.out.println("사람 정보");
		System.out.println("이름: "+this.name);
		System.out.println("성별: "+this.gender);
	}
}



class Student extends Person{ 
	// 학생 클래스 :: 자식 클래스, 하위 클래스
	//상속이란, 부모 클래스의 멤버를 복붙해서 사용하는 것.
		private int num;		//학번
		//멤버: 학번, 이름, 성별
	//Person 클래스의 멤버를 복붙해서 사용하는 것  ::: 상 !!! 속 !!! 자!!!!!!!!
	
	
		public Student(String n, String g, int num) {
		// super() : 이 구문을 통해서 부모 클래스의 생성자 호출 !!!!!!!!
			//super 쓸때 사용하는 변수를 매개변수로 넣는다,.
		super(n, g); //부모 클래스의 멤버 초기화  !!!!!!!!!
		//>>> 자식 클래스를 만들려면 무조건 부모 클래스의 멤버 초기화를 해야 하므로 이건 무조건 기억해야한다!
		//기본 생성자가 들어가 있다. 부모클래스의 생성자를 재정의, 받아들여야 하니까 초기화.
		//부모클래스의 parameter 매개변수를 받는다.
		this.num=num; //자식 클래스 자신의 멤버 초기화 : num을 통해서 초기화
		//멤버 3개가 초기화
	}
	
		public void setNum(int n) {this.num=n;}
		public int getNum() {return this.num;}
		public void print_S() {
		System.out.println("학생 정보");
		System.out.println("학번: "+this.num);
	}
}
public class java0823_Theory {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		// 객체 생성부
		Person p=new Person("이유나", "여자");	//person 클래스의 p안에 이유나, 여자 값이 들어가 있다.//
		//person 클래스로 사람이름 , 셩별만듬. 
		Student stu=new Student("이유나", "여자", 18); //Student 클래스의 stu 안에 학생정보
		
		p.setName("Leeyuna");	// 이름 저장: 정상 실행 // person 클래스의 사람이름을 leeyuna로 바꿨다.
		// p.setNum(18130956);		// 학번 저장: 비정상 실행
		// Person 클래스는 Student 클래스 멤버 포함X
		stu.setName("Leeyuna");	// 이름 저장: 정상 실행 //stu 클래스의 사람이름을 leeyuna바꿨다.
		// 부모 클래스의 멤버를 복붙해서 자신의 것으로 만들었기 때문
		stu.setNum(18130956);	// 학번 저장: 정상 실행
		
		p.print_P();		//person 클래스 출력
		System.out.println();
		stu.print_S();		//학생 클래스 출력
	}
}
