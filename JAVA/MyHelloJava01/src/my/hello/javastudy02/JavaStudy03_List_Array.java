package my.hello.javastudy02;
import java.util.*;
public class JavaStudy03_List_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		4. �տ��� ���� Student Ŭ���� �迭�� List�� ��� �� ����غ���.
//		��, Scanner�� �Է¹޾Ƽ� ����
	//
//		5. 3������ ���� Ŭ�����ε� Tourist Ŭ���� �迭��  List�� ��� �� ����غ���.
//		��, Scanner�� �Է¹޾Ƽ� ����
		
		
		
		
		
		System.out.println("�� �� �����ұ��?");
		int count = s.nextInt();
		Student[] students_arr = new Student[count]; //�������̱� ������ ���� �Ҵ簡��.
		
		
		
		for(int i =0; i<count; i++)
		{
			s.hasNextLine(); //������ ���� s.nextInt����
			System.out.println("�̸�?");
			String name = s.next();
			System.out.println("����?");
			int age=s.nextInt();
			System.out.println("����?");
			double score = s.nextDouble();
			students_arr[i] = new Student(name,age,score);
			//stu_list.add(new Student(name,age,score));
		}
		for(Student ss : students_arr) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getScore());
		}
	
		
		ArrayList<Student> stu_list=new ArrayList<Student>();
		for(int i =0; i<count; i++)
		{
			s.hasNextLine(); //������ ���� s.nextInt����
			System.out.println("�̸�?");
			String name = s.next();  			//s.nextLine(); 
			System.out.println("����?");
			int age=s.nextInt();
			System.out.println("����?");
			double score = s.nextDouble();
			//students_arr[i] = new Student(name,age,score);
			stu_list.add(new Student(name,age,score));
	
		}
		for(Student ss : stu_list) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getScore());
		}
	}

}
