package javastudy14_1012;
//interface는 소문자, Comparable은 클래스라 대문자 
public class KBStudent implements Comparable<KBStudent> {
	//클래스 이름은 반드시 첫글자 대문자, 앞글자 m_name이렇게 멤버변수로 선언해도 ㄱㅊ
	private String Name;
	private String Gender;
	private int Age;
	private int Number;
	//생성자
	public KBStudent(String name, String gender, int age, int number) {
		//super();
		Name = name;
		Gender = gender;
		Age = age;
		Number = number;
	}
	
	//생성쟈
	public KBStudent() {
		// TODO Auto-generated constructor stub
	}


	//alt shift s  + generate ToString. 
	//Object 클래스의 toString 메소드를 오버라이딩함
	@Override
	public String toString() {
		return String.format("이름:%s,  성별:%s, 나이:%d, 번호:%d",
				Name,Gender,Age,Number);
		//return "KbStudent [이름=" + Name + ", 성별=" + Gender + ", 나이=" + Age + ", 번호=" + Number + "]";
	}

	
	//int 타입은 ==, string 타입은 equals 로 비교,.
	//비교하는 기준은 오직 number 뿐이다.
	@Override
	public boolean equals(Object obj) {
		/*
		kBStudent k =(KBStudent)obj; //kb랑 obj는 같은 곳을 가리킴/이거 없음 오류뜸.
		return k.getNumber() ==number;
		*/
		
		return ((KBStudent)obj).getNumber()==Number;

	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}

	
	
	@Override
	public int compareTo(KBStudent o) {
		// TODO Auto-generated method stub
		return Age - o.getAge();
	}
	
//	@Override
//	public int compareTo(KBStudent o) {
//		// TODO Auto-generated method stub
//		//return 0;
//		return Age - o.getAge();
//	}
	
	//Shift + Alt + S 누르고 Override/Implement Methods(V) 누르면 Object 객체 상속할수 있습니다. 
	//toString(), equals(), hashCode() 등.. 아니면 오버라이딩 할 메소드명 위에 @over 치고 Ctrl + Space 누르면 자동 완성
	
	//
	
	
	
}
