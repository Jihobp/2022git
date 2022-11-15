import java.util.*;

/*Person 클래스를 부모 클래스로
Student와 Teacher 클래스를 자식 클래스로 두기

person -> 이름, 나이
student -> 학교이름
teacher -> 소속

자신의 정보(student)와	-> 이름, 나이, 학교이름 출력
앞에 있는 사람 정보(teacher) 출력하게끔 하기 -> 이름, 나이, 소속 출력
- super() 이용해서 멤버들 초기화*/

class Personz{ //상속: 상위 클래스의 멤버를 하위 클래스가 복붙해서 자신의 것으로 만듬. ㅇㅅㅇ
				//Personz의 멤버 : name, age
	private String name; 	//private은 class 안에서만. 못불러온다.
	private int age;
	//private String school;
	//private String teacher;
	
	//생성자
	public Personz(String n, int a) {
		this.name=n;
		this.age=a;
		//상속을 받아야한다, 나도 있으니까 자식인 너도 생성자=매개변수 받아라!!!!
	}
	public void setName(String n) {this.name=n;}
	//setName함수에 문자열 변수String= 매개변수
	//여기의 name을 문자n 변수에 set한다.
	public String getName() {return this.name;} //name get 반환
	public int getAge() {return this.age;}
	public void print_P() {
		System.out.println("자신 정보");
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
	}
}


class Studentz extends Personz{	//Personz의 멤버변수 name, age
								//private String name, int age가 포함되어 있음. 
	private String school; //학교
	
	//상속: 상위 클래스의 멤버를 하위 클래스가 복붙해서 자신의 것으로 만듬. ㅇㅅㅇ
	//상속을 받아야한다, 나도 있으니까 자식인 너도 생성자=매개변수 받아라!!!!
	// super(): 부모 클래스의 생성자를 호출해서 실행, super를 통해서 실행!
	public Studentz(String n, int a, String s) {	//
		super(n,a); 	//super 쓸때 사용하는 변수를 매개변수로 넣는다,.!! by.yt
						//이걸 받아줘야 Studentz 에 String n, int a에 받아줄 수 있다. 
						//문법이므로 외워야함
		this.school=s;	//>>생성자 안에선 초기화 문장 말고도 다른 명령문 정의 가능.
	}
	
	public void setSchool(String sc) {this.school=sc;}
	//setSchool함수에 문자열 변수String= 매개변수 여기의 school을 문자sc 변수에 set한다.
	public String getSchool() {return this.school;}
	//getSchool 값을 받아서(받을 곳)반환한다.
	public void print_S() {
		System.out.println("학생 정보");
		System.out.println("이름: "+this.getName()); //!!!!!!!!!!! get 
		System.out.println("나이: "+this.getAge());
		System.out.println("학교: "+this.school);
	}
}

class Teacherz extends Personz{
	private String teacher; //선생님
	
	public Teacherz(String n, int a, String s) {
		super(n,a); 
		this.teacher=s;
	}
	
	public void setTeacher(String T) {this.teacher=T;}
	public String getTeacher() {return this.teacher;}
	public void print_T() {
		System.out.println("사람 정보");
		System.out.println("이름: "+this.getName());
		System.out.println("나이: "+this.getAge());
		System.out.println("소속: "+this.teacher);
	}
}
public class java0823_Q2_heir {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		//객체 생성부ㄱ
		Personz p=new Personz("박지호", 28); //person 클래스의 p안에 박지호, 나이가 들어가 있다.
		//person 클래스로 이름, 나이 받음. //클래스 Personz에 관한 객체 생성
		Studentz stu=new Studentz("박지호", 28,"경북산업직업학교");
		//student 클래스로 이름, 나이, 학교ㅗ 받음. //클래스 Studentz에 관한 객체 생성
		Teacherz tea=new Teacherz("박지호", 28,"유나쌤");
		//teacher 클래스로 이름, 나이, 소속 받음. ////클래스 Teacherz에 관한 객체 생성
		
		p.print_P(); 			//person 클래스 출력
		System.out.println();
		
		stu.print_S();			//student 클래스 출력
		System.out.println();	
	
		tea.print_T();			//teacher 클래스 출력
		System.out.println();
	}
	
}
