package my.hello.javastudy04_1005;

//1. Student 클래스에 study 메소드 추가하기
//{"학생이면 공부를 해야지~ 등의 내용 추가"}

public class Student {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public void DoStudy() {
		System.out.println("학생이면 공부를 하지말고..! 놀다가...! 꾸엥");
		System.out.println(this.name+"학생이");
		System.out.println(this.age+"살 답게");
		System.out.println("공부합니다.");
	}
	
}
