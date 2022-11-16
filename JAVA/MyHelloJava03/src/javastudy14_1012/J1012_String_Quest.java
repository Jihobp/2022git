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
		System.out.println("추가할 학생 수는?");

		try {
			count = Integer.parseInt(s.nextLine()); // 앞에 int빼고 int count = 0;선언 바깥에.
			if (count <= 0)
				throw new Exception("길이가 0 이하일 수 없다.");
		} catch (Exception e) {
			System.out.println("숫자 입력 잘못됨," + e.getMessage());
			return;
		} finally {
			// 프로그램이 종료되도 무조건 실행을함
			if(count<=0) //0보다 커지면 finally가 무조건 한번 실행하기때문에..오류다 ㅇㅅㅇ
			System.out.println("프로그램을 재시작해주세여");
		}

		//List 써도 대고 ArrayList 써도댐 ㅇㅅㅇ
		
		ArrayList<KBStudent> students = new ArrayList<KBStudent>();
		students.add(k1); // students 라는 배열 안에 저장.
		// students.add(k2);

		// 타입=클래스,|| kbStudent(객체에서 한개씩 순차적으로 var=KBS에 대입되어 for문 수행) || students 배열안,루프를
		// 돌릴 객체
		/*for (KBStudent kbStudent : students) {
			System.out.println(kbStudent.getName());
			System.out.println(kbStudent.getGender());
			System.out.println(kbStudent.getAge());
			System.out.println(kbStudent.getNumber());
		}*/
				
		for (int i = 0; i < count; i++) {
			String name = "";
			String gender = "";
			int age = 0; // 잘못 출력되도 0값은 기본적으로 들어간다.
			int number = 0;
			;
			System.out.println("이름은?");
			name = s.nextLine();
			System.out.println("성별은?");
			gender = s.nextLine();
			try {
				System.out.println("나이?");
				age = Integer.parseInt(s.nextLine());
				System.out.println("번호?");
				number = Integer.parseInt(s.nextLine());
				if (age <= 0) // age에 예외처리
				{
					System.out.println("나이 값이 잘못되었습니다.");
					age = 0;
				}
			} catch (Exception e) {
				e.printStackTrace(); // 오류 촐력은 하고 프로그램은 계속된다.
			}
			KBStudent k = new KBStudent(name, gender, age, number);
			if(students.contains(k)) { //특정값이 있는지 포함하는거.?어떻게 동작해?.
				//java8api검색, contain이라는 메소드? ? java.util.list안에 이따.interface에 리스트. 
				//equals는 기준을 제시하고 비교해줌, contains쓰면 equals 기능이 자동으로 들어가이따.
				//co
				System.out.println("중복!");
				i--;
				continue;
			}
			students.add(k);
		}
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
		Collections.sort(students);
		System.out.println("----나이순출력(오룸차순)----");
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
			System.out.println("학생 이름은?");
			k1.setName(s.nextLine());
			System.out.println("학생 성별은?");
			k1.setGender(s.nextLine());
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			k1.setAge(age);
			System.out.println("학생 넘버는?");
			int num = Integer.parseInt(s.nextLine());

		} catch (NumberFormatException e) {// 숫자를 잘못입력했을때만 발생.
			System.out.println("잘못된 값입니당.");
			// e.printStackTrace(); //???
			k1.setName("다시 입력하세욥");
		}
		 */
		


//		KBStudent 클래스작성하기
//		생성자는 하나만 만들기(4개의 속성 다 입력받는 것)
//		-String Name
//		-String gender
//		-int Age
//		-int Number; 
//
//		몇 명 추가할지 입력받기
//		그에 따라서 ArrayList에 값 입력받아서 넣기
//		단, Number는 겹치면 안 됨 (equals 사용하여 중복체크) + contain이 이용되어야 겠죠!?
//		(숫자 입력받을 경우 try catch 구문 이용하여 오류 메시지 출력)
//
//		ArrayList에 있는 내용들 모두 출력(toString 이용)
//
//		그 다음 ArrayList에 있는 내용들을 Age 순으로 정렬하기(구글링 필요함)

	}
}
