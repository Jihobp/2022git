package my.hello.javastudy02;
import java.util.*;
public class JavaStudy03_List_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		4. 앞에서 만든 Student 클래스 배열과 List를 모두 값 출력해보기.
//		단, Scanner로 입력받아서 띄우기
	//
//		5. 3번에서 만든 클래스로도 Tourist 클래스 배열과  List를 모두 값 출력해보기.
//		단, Scanner로 입력받아서 띄우기
		
		
		
		
		
		System.out.println("몇 명 관리할까요?");
		int count = s.nextInt();
		Student[] students_arr = new Student[count]; //힙영역이기 때문에 동적 할당가능.
		
		
		
		for(int i =0; i<count; i++)
		{
			s.hasNextLine(); //위에서 적은 s.nextInt때문
			System.out.println("이름?");
			String name = s.next();
			System.out.println("나이?");
			int age=s.nextInt();
			System.out.println("점수?");
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
			s.hasNextLine(); //위에서 적은 s.nextInt때문
			System.out.println("이름?");
			String name = s.next();  			//s.nextLine(); 
			System.out.println("나이?");
			int age=s.nextInt();
			System.out.println("점수?");
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
