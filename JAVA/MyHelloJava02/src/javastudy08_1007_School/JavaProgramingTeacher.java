package javastudy08_1007_School;

public class JavaProgramingTeacher extends ProgramingTeacher {
	
	
	public JavaProgramingTeacher (String Name, String Major) {
		setName(Name);
		setMajor(Major);
	}
	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("자바는 어려워..T_T 자바자바자바자 하고 울지요.");
	}
}
