package javastudy14_1012;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class J1012_String_Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		KBStudent k1 = new KBStudent();

		int count = 0;
		System.out.println("�߰��� �л� ����?");

		try {
			count = Integer.parseInt(s.nextLine()); // �տ� int���� int count = 0;���� �ٱ���.
			if (count <= 0)
				throw new Exception("���̰� 0 ������ �� ����.");
		} catch (Exception e) {
			System.out.println("���� �Է� �߸���," + e.getMessage());
			return;
		} finally {
			// ���α׷��� ����ǵ� ������ ��������
			if(count<=0) //0���� Ŀ���� finally�� ������ �ѹ� �����ϱ⶧����..������ ������
			System.out.println("���α׷��� ��������ּ���");
		}

		//List �ᵵ ��� ArrayList �ᵵ�� ������
		
		ArrayList<KBStudent> students = new ArrayList<KBStudent>();
		students.add(k1); // students ��� �迭 �ȿ� ����.
		// students.add(k2);

		// Ÿ��=Ŭ����,|| kbStudent(��ü���� �Ѱ��� ���������� var=KBS�� ���ԵǾ� for�� ����) || students �迭��,������
		// ���� ��ü
		/*for (KBStudent kbStudent : students) {
			System.out.println(kbStudent.getName());
			System.out.println(kbStudent.getGender());
			System.out.println(kbStudent.getAge());
			System.out.println(kbStudent.getNumber());
		}*/
				
		for (int i = 0; i < count; i++) {
			String name = "";
			String gender = "";
			int age = 0; // �߸� ��µǵ� 0���� �⺻������ ����.
			int number = 0;
			;
			System.out.println("�̸���?");
			name = s.nextLine();
			System.out.println("������?");
			gender = s.nextLine();
			try {
				System.out.println("����?");
				age = Integer.parseInt(s.nextLine());
				System.out.println("��ȣ?");
				number = Integer.parseInt(s.nextLine());
				if (age <= 0) // age�� ����ó��
				{
					System.out.println("���� ���� �߸��Ǿ����ϴ�.");
					age = 0;
				}
			} catch (Exception e) {
				e.printStackTrace(); // ���� �ͷ��� �ϰ� ���α׷��� ��ӵȴ�.
			}
			KBStudent k = new KBStudent(name, gender, age, number);
			if(students.contains(k)) { //Ư������ �ִ��� �����ϴ°�.?��� ������?.
				//java8api�˻�, contain�̶�� �޼ҵ�? ? java.util.list�ȿ� �̵�.interface�� ����Ʈ. 
				//equals�� ������ �����ϰ� ������, contains���� equals ����� �ڵ����� ���̵�.
				//co
				System.out.println("�ߺ�!");
				i--;
				continue;
			}
			students.add(k);
		}
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
		Collections.sort(students);
		System.out.println("----���̼����(��������)----");
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}

		
		//contains
		//https://docs.oracle.com/javase/8/docs/api/
		
		/*
		 * contains
boolean contains(Object o)
Returns true if this list contains the specified element. 
More formally, returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
Specified by:
contains in interface Collection<E>
Parameters:
o - element whose presence in this list is to be tested
Returns:
true if this list contains the specified element
Throws:
ClassCastException - if the type of the specified element is incompatible with this list (optional)
NullPointerException - if the specified element is null and this list does not permit null elements (optional)
		 * 
		 * try {

			int stu_num = Integer.parseInt(s.nextLine());
			System.out.println("�л� �̸���?");
			k1.setName(s.nextLine());
			System.out.println("�л� ������?");
			k1.setGender(s.nextLine());
			System.out.println("�л� ���̴�?");
			int age = Integer.parseInt(s.nextLine());
			k1.setAge(age);
			System.out.println("�л� �ѹ���?");
			int num = Integer.parseInt(s.nextLine());

		} catch (NumberFormatException e) {// ���ڸ� �߸��Է��������� �߻�.
			System.out.println("�߸��� ���Դϴ�.");
			// e.printStackTrace(); //???
			k1.setName("�ٽ� �Է��ϼ���");
		}
		 */
		


//		KBStudent Ŭ�����ۼ��ϱ�
//		�����ڴ� �ϳ��� �����(4���� �Ӽ� �� �Է¹޴� ��)
//		-String Name
//		-String gender
//		-int Age
//		-int Number; 
//
//		�� �� �߰����� �Է¹ޱ�
//		�׿� ���� ArrayList�� �� �Է¹޾Ƽ� �ֱ�
//		��, Number�� ��ġ�� �� �� (equals ����Ͽ� �ߺ�üũ) + contain�� �̿�Ǿ�� ����!?
//		(���� �Է¹��� ��� try catch ���� �̿��Ͽ� ���� �޽��� ���)
//
//		ArrayList�� �ִ� ����� ��� ���(toString �̿�)
//
//		�� ���� ArrayList�� �ִ� ������� Age ������ �����ϱ�(���۸� �ʿ���)

	}
}
