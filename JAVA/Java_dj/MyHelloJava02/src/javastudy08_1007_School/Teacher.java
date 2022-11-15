package javastudy08_1007_School;

public abstract class Teacher {
	private String Name;
	private String Major;
	
	
	//클래스별로 Teach를 자유롭게 구현할 수 있는 자율성이 주어지지만,
	//무조건 해야함. 강제!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	public abstract void Teach();
}
