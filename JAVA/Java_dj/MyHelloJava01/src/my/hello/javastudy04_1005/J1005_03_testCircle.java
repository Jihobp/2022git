package my.hello.javastudy04_1005;

public class J1005_03_testCircle {

	//클래식 메소드 
	public static void sayHello() {
		System.out.println("Hello World!");
	}
	//인스턴스 메소드
	//이걸 static안에서 호출하려ㅕㅁㄴ, 인스턴스를 만들고 나서
	//그 안에서 호출해야함
	public void toSay(String name) {
		System.out.println(name+"님, 안녕");
	}
	public static void main(String[] args) {
//		1.Circle class 이용해서 원 2개 만들어보기
//		반지름이 2인 것, 3인 것 만들어보기
//
//		2. 1번에서 만든 원들에 대해서 getArea 호출
//
//		3. PI값을 set으로 변경하기
//
//		4. 1번에서 만든 원에 대해서 getArea 호출
		
		Circle c1 = new Circle(2);	//w와 h 모두 0인 상태
		Circle c2 = new Circle(3);		

		System.out.println(c1.getArea());//12.56
		System.out.println(c2.getArea());//28.26
		
		Circle.setPI(3.0);		//PI값을 바꾸면 모든 Circle들에게 
								//영향을 끼친다.
		//클래스변수, 클래스 메소드는 공유되니까 ㅇ0ㅇ

		System.out.println(c1.getArea());	//12.0
		System.out.println(c2.getArea());	//27.0
		
		//클래스 메소드 특징
		//클래스 메소드 안에는 인스턴스 변수나 인스턴스 메소드가 못들어간다.
		//이유 : static 이 붙은 것들이 메모리에 먼저 올라가기 때문이다.
		//클래스 변수나 클래스 메소드는 프로그램 시작하자마자 올라감
		//인스턴스 변수나 인스턴스 메소드는 new 키워드 만날 떄
		//메모리에 올라간다.
		
		//static이 붙어있으면 먼저 올라간다. 
		sayHello();
		//toSay("박지호"); //static이 붙어있는 메소드 안에는
						//static이 붙어있는 메소드나 변수만 온다.
						//static 없는 메소드 안에는
						//static 이 붙은 변수나 메소드 올 수 있다. 
		//스태틱이 붙은 애는 붙은 애들끼리 움직이고 스태틱이 없는거는 스태틱이 붙은 변수나 메소드 올 수 있다.
		//static 붙어 있는 메소드 안에서
		//static 없는 메소드(=인스턴스 메소드)
		//호출하고 싶으면 인스턴스를 만드록 나서 호출하면됨.
		//이런걸 객체화라고 함(=자기자신을 이용해 인스턴스 만들기)
		new J1005_03_testCircle().toSay("이동준");
		J1005_03_testCircle temp = 
				new J1005_03_testCircle();
		temp.toSay("김혜민");
		
	
	}

}
