package my.hello.javastudy05_1006;

import my.hello.javastudy04_1005.Student;

public class J1005_01_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my.hello.javastudy04_1005.Student s1 = new
				my.hello.javastudy04_1005.Student();
		s1.setAge(25);
		s1.setName("김성환");
		s1.DoStudy();
		//같은 폴더 안의 Student
		Student ss= new Student();
		
		
		KBStudent kb1 = new KBStudent();
		//기본생성자를 불러오는데(참고로 기본생성자인)
		//public KBStudent(){}은 이미 만들어져있다!!
		//, 내가 생성자 만들어서 ㅠㅠ null로 안불러와짐. 
//		public KBStudent(String gender, String education) {
//		super();
//		this.gender = gender;
//		this.education = education; }
		
		kb1.setName("김혜민");
		kb1.setAge(40);
		kb1.setEducation("대졸");
		kb1.setGender("여성");
		kb1.DoStudy();
		kb1.attend("입실");
		kb1.attend("퇴실");
	
	
//	1. Student 클래스에 study 메소드 추가하기
//		{"학생이면 공부를 해야지~ 등의 내용 추가"}
//	2. Student 클래스를 상속받아서 KBStudent를 만들기
//		- gender
//		- education 추가
//		- attend 메소드 추가(출석하기) 
//			{ 이름 나이 성별 학력 출력 하고 입실퇴실 출력 }
//	3. Main에서 테스트해보기 
//
//	4. javastudy02에 있는 Circle 클래스를 상속받아서
//	sphere 클래스 만들기
//
//	5. sphere 클래스에서 getvolume 메소드 추가(부피구하기)
//	(4/3)*pi*r^3
//
//	6. Main에서 테스트해보기 
//
//	7 javastudy01에 있는 Rectangle 클래스를 상속 받아서 cuboid(직육면체) 클래스 만들기
//		- z 속성 추가
//		- getCuvoidVolumn 추가(w*h*z)
//
//	8. Main에서 테스트해보기
	}

}
