package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.Circle;

public class J1005_02_useRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1=new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
		
		//참고
		//클래스 변수는 부모클래스랑 자식클래스가 공유해서 쓴다.
		//즉 static 이 붙은건 자식 클래스든 부모클래스든
		//어디에서 바꾸든지 간에 전부 영향을 받는다.
		//PI 는 클래스 변수 ㅇㅅㅇ
		Circle.setPI(1);
		System.out.println(sp1.getVolume());	//Sphere 에도 영향감.
		
		//4/3 = 1(int)
		//4/3을 실수로 쓰려면 4.0/3 이나 4/3.0 아니면 4.0/3.0 을 해야하맘
		//4/3 * 2*2*2 = 32/3 = 
		
		Sphere.setPI(0); //Sphere 에서 바꿨는데 circle에도 영향감
		System.out.println(c1.getArea());
	
	}

}
