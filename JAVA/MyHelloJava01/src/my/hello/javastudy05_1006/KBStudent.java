package my.hello.javastudy05_1006;

//import javastudy04.Student;
//다른 패키지일 경우에는 import를 하거나 패키지명.클래스하면됨.

//같은 패키지안에도 Student가 있고,
	//다른 패키지 안에도Student가 있는데,
	//다른 패키지 안에 있는 Student를 상속하고 싶을 경우에는 꼭
	//패키지명.Student를 한다.
	//근데 이렇게 클래스명이 겹치면 여러모로 혼란스러우므로 이름은 되도록 겹치지 않게 한다.
public class KBStudent extends my.hello.javastudy04_1005.Student{

	//name, age
	//setName, get Name, setAge, getAge, study는 이미 포함 완료.
	private String gender;
	private String education; //학력
	
	
	

	//KBStudent에만 있는 메소드들. 
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	public void attend(String att) {
		//this.name이라고 못적고 getName으로 접근됨. 
		//private 안쓰면 =default 값, 즉 this.name 쓸 수 있다.
		//public, protect, private, default(같은 폴더안에선 얼마든지 접근가능public. 
		//but 다른 폴더안에서 접근 nono like prviate)
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!");//출석결석 등 적기.
	}
	
	
	
}
