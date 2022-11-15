package my.hello.javastudy02;

import java.util.ArrayList;

public class Passenger {

//	2. (클래스 안에)이름 나이 번호를 모두 읽고 쓰는 함수들 만들기 :: get,. set
//
//	3. 여행객 클래스를 만든다.(이름,국적,나이,주민번호)
//	단 생성자는 3종류 이상이다.
//	(하나도 없는 거, 하나만 있는 거, 전부 있는 거)
		
		//name, age, score
		
		private String name;
		private int age;
		private int num;
		private int snum;	//주민
		
		
		//get set 이용. set 이용해서 함수 안에 들어가는 값을 바꿀 수도 있다 . ㅇㅅㅇ>
		//생성자를 이욯새ㅓ .
		//만약 속성들이랑, getter, setter 만 적었다면
		//암묵적으로 아래와 같이 아무 것도 없는 생성자가
		//자동으로 만들어진 것이다. ★
		
		public Passenger() {
			
		}
		
		public Passenger(String name) {	
			this.name=name;
		}
		

		//기본 생성자 >>this.name= name 정의 및 필드변수 초기화? 
		//Passenger 클래스를 이용해서 변수를 선언한다 >  변수 선은은 메모리 공간 어딘가 공간을 차지하겠다는거. = 메모리 공간안에서 변수를 생성한다.
				//변수를 생성할떄 아무것도 하지않을거라면 생성해도 되고 안해도 된다.
				//문제는 변수를 생성함과 동시에 ,  네임 에이지 스코어 값을 정의해 주고 싶으면, 생성자 안에 매개변서 this.name = name;  집어 넣어야한다. 
				//integer도 객체
		public Passenger(String name, int age, int num, int snum) {
			this.name = name;
			this.age = age;
			this.num = num;
			this.snum = snum;
		}
}
