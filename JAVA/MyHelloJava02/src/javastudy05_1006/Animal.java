package javastudy05_1006;

public class Animal {
	private String name;
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
	private int age;
	
	//동물이라면 누구나 다 잠을 잔다.
	public void Sleep() {
		System.out.println("zZz...");
	}
}
