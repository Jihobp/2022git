package my.hello.javastudy05_1006;

//import javastudy04.Student;
//�ٸ� ��Ű���� ��쿡�� import�� �ϰų� ��Ű����.Ŭ�����ϸ��.

//���� ��Ű���ȿ��� Student�� �ְ�,
	//�ٸ� ��Ű�� �ȿ���Student�� �ִµ�,
	//�ٸ� ��Ű�� �ȿ� �ִ� Student�� ����ϰ� ���� ��쿡�� ��
	//��Ű����.Student�� �Ѵ�.
	//�ٵ� �̷��� Ŭ�������� ��ġ�� ������� ȥ��������Ƿ� �̸��� �ǵ��� ��ġ�� �ʰ� �Ѵ�.
public class KBStudent extends my.hello.javastudy04_1005.Student{

	//name, age
	//setName, get Name, setAge, getAge, study�� �̹� ���� �Ϸ�.
	private String gender;
	private String education; //�з�
	
	
	

	//KBStudent���� �ִ� �޼ҵ��. 
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
		//this.name�̶�� ������ getName���� ���ٵ�. 
		//private �Ⱦ��� =default ��, �� this.name �� �� �ִ�.
		//public, protect, private, default(���� �����ȿ��� �󸶵��� ���ٰ���public. 
		//but �ٸ� �����ȿ��� ���� nono like prviate)
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(gender);
		System.out.println(education);
		System.out.println(att+"!!!");//�⼮�Ἦ �� ����.
	}
	
	
	
}
