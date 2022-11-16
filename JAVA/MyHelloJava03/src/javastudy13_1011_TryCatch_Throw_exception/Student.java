package javastudy13_1011_TryCatch_Throw_exception;

public class Student {
	private int age;
	private String Name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age<=0)
			throw new Exception("age값이 적음,"+age);
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
