package javastudy08_1007_School;

public class JavaProgramingTeacher extends ProgramingTeacher {
	
	
	public JavaProgramingTeacher (String Name, String Major) {
		setName(Name);
		setMajor(Major);
	}
	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("�ڹٴ� �����..T_T �ڹ��ڹ��ڹ��� �ϰ� ������.");
	}
}
