package my.hello.javastudy05_1006;

import my.hello.javastudy04_1005.Student;

public class J1005_01_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my.hello.javastudy04_1005.Student s1 = new
				my.hello.javastudy04_1005.Student();
		s1.setAge(25);
		s1.setName("�輺ȯ");
		s1.DoStudy();
		//���� ���� ���� Student
		Student ss= new Student();
		
		
		KBStudent kb1 = new KBStudent();
		//�⺻�����ڸ� �ҷ����µ�(����� �⺻��������)
		//public KBStudent(){}�� �̹� ��������ִ�!!
		//, ���� ������ ���� �Ф� null�� �Ⱥҷ�����. 
//		public KBStudent(String gender, String education) {
//		super();
//		this.gender = gender;
//		this.education = education; }
		
		kb1.setName("������");
		kb1.setAge(40);
		kb1.setEducation("����");
		kb1.setGender("����");
		kb1.DoStudy();
		kb1.attend("�Խ�");
		kb1.attend("���");
	
	
//	1. Student Ŭ������ study �޼ҵ� �߰��ϱ�
//		{"�л��̸� ���θ� �ؾ���~ ���� ���� �߰�"}
//	2. Student Ŭ������ ��ӹ޾Ƽ� KBStudent�� �����
//		- gender
//		- education �߰�
//		- attend �޼ҵ� �߰�(�⼮�ϱ�) 
//			{ �̸� ���� ���� �з� ��� �ϰ� �Խ���� ��� }
//	3. Main���� �׽�Ʈ�غ��� 
//
//	4. javastudy02�� �ִ� Circle Ŭ������ ��ӹ޾Ƽ�
//	sphere Ŭ���� �����
//
//	5. sphere Ŭ�������� getvolume �޼ҵ� �߰�(���Ǳ��ϱ�)
//	(4/3)*pi*r^3
//
//	6. Main���� �׽�Ʈ�غ��� 
//
//	7 javastudy01�� �ִ� Rectangle Ŭ������ ��� �޾Ƽ� cuboid(������ü) Ŭ���� �����
//		- z �Ӽ� �߰�
//		- getCuvoidVolumn �߰�(w*h*z)
//
//	8. Main���� �׽�Ʈ�غ���
	}

}
