package my.hello.javastudy04_1005;

public class KBStudent extends Student {
//2. Student Ŭ������ ��ӹ޾Ƽ� KBStudent�� �����
//	- gender
//	- education �߰�
//	- attend �޼ҵ� �߰�(�⼮�ϱ�) 
//		{ �̸� ���� ���� �з� ��� �ϰ� �Խ���� ��� }
	
	private String gender;
	private String education;
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
	
	public void attend() {
		System.out.println(this.getName()+this.getAge()+gender+education);
		
	
	}
}
