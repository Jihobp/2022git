package Jello;

public class Student {
	private String name;
	private int age;
	
	//bean 만들땐 생성자, + 안에 매개변수 없당 ㅇㅅㅇ
	//Student를 bean으로 써봅시다!!!!
	
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
	
}
