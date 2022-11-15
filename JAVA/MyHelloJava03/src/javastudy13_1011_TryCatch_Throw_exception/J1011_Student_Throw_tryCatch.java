package javastudy13_1011_TryCatch_Throw_exception;

import java.util.*;

public class J1011_Student_Throw_tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//����!https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Statements/try...catch
		Student s1 = new Student();
		try {
			System.out.println("�л� ���̴�?");
			int age = Integer.parseInt(s.nextLine());
			s1.setAge(age);	//���⼭ ������ ���� ���� catch�� ������. //���� �ȳ־ exception���� ������.
			System.out.println("�л���?");
			s1.setName(s.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�߸��� ��");
			// age ���� int�̰�, int���� �⺻������ 0 ���̴�.
			//(int ������ �������ڸ��� 0�̴�).
			s1.setName("��������л�1");
		}
		
		
		Student s2 = new Student();
		try {
			System.out.println("�л� ���̴�?");
			int age = Integer.parseInt(s.nextLine());
			s2.setAge(age);
			System.out.println("�л���?");
			s2.setName(s.nextLine());
		} catch (Exception e) {
			System.out.println("�߸��� ��");
			s2.setName("��������л�2");
		}//catch�� ���� error �޼����� �ٸ��� ��� ���� ������
		
		
		
		//........ catch�� ���� error �޼����� �ٸ��� ��� ���� ������
		//�ؼҽ��� ��쿡 catch�� ������ �ޱ⵵ ��. but �б� ����ϱ� �̷��Ե巴�� ĳġ���Ѵ�.. 
		//��> ���� �� �߸��Ѱ���? ���� ���ڸ� �߸��Է��Ѱ���, ���ڸ� �߸� �Է��޴���..
		
		Student s3 = new Student();
		try {
			System.out.println("�л� ���̴�?");
			int age = Integer.parseInt(s.nextLine());
			s3.setAge(age);
			System.out.println("�л���?");
			s3.setName(s.nextLine());
		} catch(NumberFormatException e) {	//���ڸ� �߸��Է��������� �߻�.
			System.out.println("���� ���� ���� ����");
			e.printStackTrace();	//�������˿���
		}
		catch(ArithmeticException e)
		{
			System.out.println("������ ����");
			e.printStackTrace();	//��������� 
		} catch(Exception e) {	//exception �̳� throwable �� ���� �ʹٸ� �������̴ϱ� �ǹ�����, ���� �ִ°͵� �� �Ϻη�,
			System.out.println("����");
			e.printStackTrace();
		} catch(Throwable e) {
			System.out.println("���� ū ������ ���� ����");
			e.printStackTrace();
		}
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for (Student student : students) {
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student);//Student Ŭ���� ����
			//String���� ��ȯ�� �� �ȴ�... 
			//ObjectŬ������ toString �޼ҵ带 ��� ��...
		}
//		
//		//1. Student Ŭ������ �����.
//		private int age;
//		private String Name;
//
//	2. getter, setter�� �����, age ���� 0 ������ ��� Exception�� �߻���Ŵ
//	�� Student Ŭ���� �ȿ� throw ������ ����� �Ǵ� ���̴�.
//
//	3. Main���� Student�� 2�� ���� ����� ����.(Scanner�� �����)
//	(�׸��� �� �� s.nextLine�̿��ϱ�)
//	���� �߻��� age ���� 0���� �ΰ� ���� �޽��� ����Ѵ�.
//
//	4. �� �л����� ArrayList�� ����ְ� �� �л����� ������ ��� ����Ѵ�.
//


	}

}
