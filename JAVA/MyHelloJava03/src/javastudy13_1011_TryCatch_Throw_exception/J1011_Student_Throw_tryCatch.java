package javastudy13_1011_TryCatch_Throw_exception;

import java.util.*;

public class J1011_Student_Throw_tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//공부!https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Statements/try...catch
		Student s1 = new Student();
		try {
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			s1.setAge(age);	//여기서 엉뚱한 값이 들어가면 catch로 빠진댜. //숫자 안넣어도 exception으로 빠진다.
			System.out.println("학생명?");
			s1.setName(s.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된 값");
			// age 값은 int이고, int값은 기본적으로 0 ㅇ이다.
			//(int 변수는 선언하자마자 0이다).
			s1.setName("수정요망학생1");
		}
		
		
		Student s2 = new Student();
		try {
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			s2.setAge(age);
			System.out.println("학생명?");
			s2.setName(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값");
			s2.setName("수정요망학생2");
		}//catch에 따라서 error 메세지를 다르게 출력 가능 ㅇㅅㅇ
		
		
		
		//........ catch에 따라서 error 메세지를 다르게 출력 가능 ㅇㅅㅇ
		//극소스의 경우에 catch를 여러개 달기도 함. but 읽기 힘드니까 이렇게드럽게 캐치안한다.. 
		//ㄴ> 내가 뭘 잘못한건지? 내가 숫자를 잘못입력한건지, 문자를 잘못 입력햇는지..
		
		Student s3 = new Student();
		try {
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			s3.setAge(age);
			System.out.println("학생명?");
			s3.setName(s.nextLine());
		} catch(NumberFormatException e) {	//숫자를 잘못입력했을때만 발생.
			System.out.println("숫자 포맷 형식 에러");
			e.printStackTrace();	//숫자포맷오류
		}
		catch(ArithmeticException e)
		{
			System.out.println("수학적 에러");
			e.printStackTrace();	//산술적오류 
		} catch(Exception e) {	//exception 이나 throwable 을 쓰고 싶다면 보편적이니까 맨밑으로, 위에 있는것들 은 일부로,
			System.out.println("에러");
			e.printStackTrace();
		} catch(Throwable e) {
			System.out.println("가장 큰 범주의 에러 에러");
			e.printStackTrace();
		}
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for (Student student : students) {
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student);//Student 클래스 값이
			//String으로 변환이 안 된다... 
			//Object클래스의 toString 메소드를 써야 함...
		}
//		
//		//1. Student 클래스를 만든다.
//		private int age;
//		private String Name;
//
//	2. getter, setter를 만들되, age 값이 0 이하일 경우 Exception을 발생시킴
//	즉 Student 클래스 안에 throw 구문이 생기게 되는 것이다.
//
//	3. Main에서 Student를 2명 정도 만들어 본다.(Scanner로 만들기)
//	(그리고 이 때 s.nextLine이용하기)
//	예외 발생시 age 값을 0으로 두고 에러 메시지 출력한다.
//
//	4. 이 학생들을 ArrayList에 집어넣고 이 학생들의 정보를 모두 출력한다.
//


	}

}
