package my.hello.javastudy03;
import java.util.*;
public class J1004_Customer_manager {

	public static void main(String[] args) {
		
		
		//class를 이용해서 변수를 선언할 땐
		//반드시! new 키워드가 필요하다.
		//왜냐면 사용자 정의 자료형은 일반적인 자료형이 아니다.
		//그래서 메모리를 따로 할당해줘야 함. 
		//new 키워드 = 메모리 할당 키워드 = c으 ㅣmalloc이랑 같음.
		
		//그런데........벗뜌,,.....................................................................................
		//※Integer와 같이 이미 존재하는 객체들도
		//new 키워드를 써서 메모리 할당하기는 한다.
		Integer i = new Integer(5);
		Random r = new Random();
		//다만 Customer처럼 유저가 만든건 '무조건!!!111' 할당해야 한다. 
		//Random이나 몇몇 자바에서 만들어준 클래스들도
		//new 키워드 이용해서 메모리 할당하라고 지정이 되어 잇따.
		
		//new 뒤에 붙은 클래스명()의 의미
		//메모리를 할당하기는 하는데, 얼만큼, 어떤 형태로 할당할지 정해 주는 것.
		
		//Customer 형태로 할당함.
		//여기엔 최소 1개의 int와 2개의 String이 들어갈 수 있는 공간이 필요하죠,
		//c의 포인터와 유사한 개념.
		
		//요약!!
		//내가 만든 class나 며쳧 타입의 변수들은
		//new 키워드와 클래스명을 이용해서 선언해줘야 함.
		//아래의 c2처럼 그냥 선언하면 안되고
		//c1처럼 new 키워드 +클래스명이 필요하다. 
	


		Customer c1 = new Customer();
		c1.name="김혜민";
		c1.age=30;
		c1.cNum="00001";
		c1.age=-300;
		
		Customer c2;
		//c2.name = "이동준";
		//c2.age=34;
		//c2.cNum="00000";
		
		//KBCustomer kb1 = new KBCustomer();
		//kb1.age=100;
		
		
	}
}
