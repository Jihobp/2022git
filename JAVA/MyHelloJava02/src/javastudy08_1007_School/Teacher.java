package javastudy08_1007_School;

public abstract class Teacher {
	private String Name;
	private String Major;
	
	
	//Ŭ�������� Teach�� �����Ӱ� ������ �� �ִ� �������� �־�������,
	//������ �ؾ���. ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
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
