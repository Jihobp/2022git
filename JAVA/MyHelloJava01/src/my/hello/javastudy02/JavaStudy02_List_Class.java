package my.hello.javastudy02;

import java.util.ArrayList;

public class JavaStudy02_List_Class {

	public static void main(String[] args) {
		//<<<<<객체를 저장하는 배열>>>>>
		//배열, List 모두 숫자만 저장하거나
		//문자열만 저장하는 거 말고
		//객체를 저장하는 것도 된다.
		Student[] students = new Student[3];
		students[0] = new Student();
		students[1] = new Student("이동준",34,1);
		Student s = new Student("박지호",29,2);
		students[2] = s;
		
		//int나 double등으로 변수 선언할 때랑은 다르다.
		//1. new키워드 + 생성자가 있어야지만 객체 생성됨
		//2. 생성자 안에 경우에 따라선 매개변수가 들어가기도 함
		
		ArrayList<Student> mystudents
		= new ArrayList<Student>();
		mystudents.add(new Student("오세룡",25,5));
		mystudents.add(new Student());
		Student ss = new Student("도광현",25,4);
		mystudents.add(ss);
		
		//new 키워드 + 생성자 
		//인스턴스(Instance ) 라고 부름!!!!!
		//Instance  : 예시       >>>>>객체라는 마 ㄹ입니닫객체 설명
		//Student  의  Instance =  Student의 예시
		// = 학생이라는 추상적 개념을 구체적인 예시로 보여준 것. 
		// 이름 나이 점수를 가진 학생을 추상화 시켰으면 구걸 구체화 시켜서 뽑아내야한다 ;ㅅ;  > ex) 박지호 28 2점 이 인스턴스, 객체, 주체적 예시 라고도 함.ㅣ 즉 값을 집어 넣는겻?!!!
		//추상화는 구체화가 덜된것. 
		//클래스 만들어서 만든 변수를 '객체'라고 함.
		//Student라는 개념의 구체적인 데이터가 포함 되어 있습니다앟 ㅐ해씃서ㅡ댣ㄷㄷ소댯댓대샤ㅐㅑ댯닷ㄷㅅㅇㅁ.
		
		//student s= new student("이동준");
		//studnet s 에 "이동준" 값이 들어있는게 아니라, 위치를 가리키는 거 = 참조한다 -> 힙영역안에 할당된 메모리를 가리킨다 >  이 참조한다가 c에 포인터랑 비슷한 개념, 자바에는 없다  단 c++에는 둘다 있다..아마도 그렇다 
		
		//뉴라는 키워드가 힙이란 영약에 새로운 메모리를 만드는거고, 
		//변수 선언 안하고 new  keyword 랑 생성자!!! 만  이용해서 대입 할 수 있다. 내 종이랑 선생님 메세지 참고함. 
		
		//shallow copy 카피, 변수를 선언하면 enw든 null값이든 선언하고 할당해줘야 합니다., => 예방하는 방법은,  1. clone 인터페이스 이용, 2.  숟옹으로 하나하나 복사 해주는 방법이 있다.  
		//ArrayList 에도 new 키워드를 쓰는데, 무조건 heap 메모리 영역을 사용한다. 
		
		
		int ex ; //ex에 기본적으로 숫자 0이 들어감
		//s0이랑 s1은 아무것도 가리키지 않음
		//즉 nullㄱ 값 이 다.
		Student s1 =null; //s1에 뭐라도 넣어줘야한다 null ㅣ이라도 넣어줘야지 이게 작동됩입댜대댜ㅐ쇼ㅑㅐ댜ㅐ샤ㅐ댜ㅐ쇼댜ㅛㄷ샤ㅐ
		mystudents.add(s1);
		students[0]=s1;
	}
}
