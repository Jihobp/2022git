//부모 클래스로 person 클래스부터 만들기
class Person1{	
		private String name;
		private int age;
		// Person 멤버: 이름, 나이
		
		public Person1(String n, int a) {
			this.name=n;
			this.age=a;
		}
		public String getName() {return this.name;}
		public int getAge() {return this.age;}
		
		public void print() {	//이걸 넣어도 결과는 안바뀐다. "오버라이딩" 이라는 개념...???
			System.out.println("ㅇㅅㅇ");
		}
		
}


//자식 클래스로 Student, Teacher 클래스 만들기
//(이중 상속을 지원하고 있지 않음)
class Student1 extends Person1{ 
	private String school;
	//Student 멤버: 학교이름, 이름, 나이
	public Student1(String n, int a, String s) { //생성자를 부모에서 만들었기 때문에 자식클래스도 만들어야 한다/. 처음엔 이거 빨간 줄 뜰 수 있다.
		// super(): 이를 통해서 부모 클래스의 생성자 호출
		super(n,a); 	//여기에서, 이름과 나이가 초기화됨
		this.school=s;	//학교 이름의 값 초기화
	}	
	public void print() {	// 학생 클래스에 대한 print()
		//	Person 클래스의 print() 덮어쓰기 ???????????????????????????????? ㅇㅅㅇ 위에 .
		System.out.println("학생 정보");
		System.out.println("이름: "+this.getName());
		System.out.println("나이: "+this.getAge());
		System.out.println("학교 이름: "+this.school);
	
	}
}

//자식 클래스의
class Teacher1 extends Person1{
	private String company;
	//Teacher 멤버: 소속, 이름, 나이
	
	public Teacher1(String n, int a, String c) {
		// super(): 이를 통해서 부모 클래스의 생성자 호출
		super(n, a);	// 여기에서, 이름과 나이가 초기화됨
		this.company=c;	// 소속 값 초기화
	}
	public void print() {	// 교사 클래스에 대한 print()
		//	Person 클래스의 print() 덮어쓰기 ???????????????????????????????? ㅇㅅㅇ 위에.
		System.out.println("교사 정보");
		System.out.println("이름: "+this.getName());
		System.out.println("나이: "+this.getAge());
		System.out.println("소속: "+this.company);
	}
}


public class java0823_Q2_Answer {
	public static void main(String args[]) {
		// 학생과 교사의 객체를 하나씩 생성
		Student1 stu=new Student1("이유나", 24, "KB");
		Teacher1 t=new Teacher1("LeeYuna", 24, "KB");
		
		stu.print();
		System.out.println();	// 구분
		t.print();
	}
}
