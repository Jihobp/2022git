package my.hello.javastudy04_1005;

public class J1005_06_Check {

	public static void main(String[] args) {
		// Student Ŭ������ UnivStudent�� �� ����ߴ��� üũ
		
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
		UnivStudent us1 = new UnivStudent();
		
		s1.setAge(10);
		s1.setName("��ο�");
		
		u1.setAge(20);
		u1.setName("������");
		u1.setHakbeon("001");
		
		us1.setAge(30);			//univ 
		us1.setName("������");	//
		us1.setHakbeon("002"); //Student�� ��ӹ޾Ƽ� �ִ� ���̴�. 

	}

}
