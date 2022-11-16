package my.hello.javastudy02;

public class Student {
	//name, age, score
	
	private String name;
	private int age;
	private double score;
	
	//student 클래스를 이용해서 변수를 선언한다 >  변수 선은은 메모리 공간 어딘가 공간을 차지하겠다는거. = 메모리 공간안에서 변수를 생성한다.
	//변수를 생성할떄 아무것도 하지않을거라면 생성해도 되고 안해도 된다.
	//문제는 변수를 생성함과 동시에 ,  네임 에이지 스코어 값을 정의해 주고 싶으면, 생성자 안에 매개변서 this.name = name;  집어 넣어야한다. 
	//
	
	//get set 이용. set 이용해서 함수 안에 들어가는 값을 바꿀 수도 있다 . ㅇㅅㅇ>
	//생성자를 이욯새ㅓ .
	//만약 속성들이랑, getter, setter 만 적었다면
	//암묵적으로 아래와 같이 아무 것도 없는 생성자가
	//자동으로 만들어진 것이다. ★
	public Student() {
		
	}
	
	
	
	//생성자
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
//	1. 이름만 아는 경우를 대비하여 생성자 만들기
//	(지금은 모든 정보를 다 알거나  하나도 모를 경우에 대한 생성자만 있음)
	//매개변수가 속성명이랑 같으면 ... this.name= name;
	
	
		//1번 문제
		public Student(String name) {
			this.name = name;
		}	

		
		//오버로딩
				//함수나 생성자에서 매개변수의 개수나 타입이 다르면
				//이름이 똑같아도 된다. 이름이 똑같아도
				//다른 걸로 취급해준다.
//오버라이딩 vs 오버로딩. 
	//오버로딩(Overloading) : 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
//오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용
//출처: https://private.tistory.com/25 [오토봇팩토리:티스토리]
	
	
	
	//alt shift s 누르고 그 다음 r 키 누르기
		//마우스 오른쪽 클릭 - >  source - > Generate Getter and Setter 
		//select all -> generate. 

	

	
	//Getter Setter
	//2번문제

	//alt shift s 누르고 그 다음 r 키 누르기
	//마우스 오른쪽 클릭 -> Source-> Generate Getter and Setter
	
	//select All 누르고 Generator 누르세요.
	
	public String getName() {
		return name;
	}
	//오버로딩!!!
	public String getName(String title) {
		return name+title;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}

	
}

