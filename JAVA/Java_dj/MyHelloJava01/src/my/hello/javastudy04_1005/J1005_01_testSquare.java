package my.hello.javastudy04_1005;

public class J1005_01_testSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s1= new Square();
		s1.setWh(-1); //잘못된 값 //-1이란 값을 받아서 setWh실행. = square s1에 있는 wh값.
		System.out.println(s1.getWh());
		s1.setWh(10); //제대로된 값
		System.out.println(s1.getWh());
	
		//나이야~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
//		1. Square 클래스를 만든다.
//		속성 : int wh(private)
//		접근 방법 : getter, setter로 접근
//
//		2. Main에서 Square 클래스를 이용해
//		객체 선언(=변수 1개 선언)하고
//		setWh로 wh값 세팅하게 하기
//
//		3. Square 클래스의 생성자를 2종류를 만든다.
//		new Square(), new Square(wh값)
//
//		4. Rectangle 클래스를 만든다.
//		속성 : int w, int h
//		접근 방법 : getter, setter
//		생성자 : w나 h만 알 경우, 둘 다 모를 경우,
//		모두 알 경우에 대해서 적기
//
//		5. Rectangle 안에 getArea(w * h) 메소드 추가
//		주의사항 1) w와 h 중 하나라도 0이면 오류 메시지 띄우고 -1 리턴
//		주의사항 2) w와 h 값이 같다면 '정사각형'이라는 말도 같이 출력하고 w*h리턴
	}
}
