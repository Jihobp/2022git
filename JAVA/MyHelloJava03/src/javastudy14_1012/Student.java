package javastudy14_1012;

public class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	//alt shift s  + generate ToString. 
	//Object 클래스의 toString 메소드를 오버라이딩함
	@Override
	public String toString() {
		//return super.toString();
		return "Student [name=" + name + ", age=" + age + "]";
	}


}
