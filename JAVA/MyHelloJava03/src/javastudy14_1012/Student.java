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
	//Object Ŭ������ toString �޼ҵ带 �������̵���
	@Override
	public String toString() {
		//return super.toString();
		return "Student [name=" + name + ", age=" + age + "]";
	}


}
