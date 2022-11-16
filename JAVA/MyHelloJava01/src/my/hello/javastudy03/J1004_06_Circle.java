package my.hello.javastudy03;

public class J1004_06_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(); //암묵적으로 있는거 호출했당.
		c1.setR(3);	//3이란 값을 받아서 setR을 실행함.  = Circle c1에 있는 r의 값.
		System.out.println(c1.getArea()); //Circle c1에 있는 함수의 결과를 출력 
		System.out.println(c1.getRound());
		Circle c2 =  new Circle();  //암묵적으로 있는거 호출했당.
		c2.setR(-3); //잘못된 값을 입력함.
		System.out.println(c2.getArea());
		System.out.println(c2.getRound());
		if(c2.getArea()!=0) {
			System.out.println(c2.getArea());
		}
		else {
			System.out.println("c2반지름 확인해요. ");
		}
		
		//위에랑 다르게
		//원을 만들자마자 넓이 등을 구할 수 있다. (생성자 없이) 
		Circle m1= new Circle(4); //원을 만들고 set, r 이런거 없이바로만들고 집어 넣을 수 있다.
		if(m1.getArea()!=0)
			System.out.println(m1.getArea());
		System.out.println(new Circle(5).getArea());
		//참고 : getRound 했을 때,00002 이렇게 나온건
		//고정소수점과(소수점고정) 
		//부동소수점 이슈때문(소수점이 고정이 아님)
		//디지털세계에서 실수를 완벽하게 표현할 수 없고
		//그에 따른 오차때문에 생긴 문제다.
		
		//이름이 달라도 서로 같은거로 생각하는게 오버로뒹 이라고도 함 ㅇ0ㅇ. 
	
	}

}
