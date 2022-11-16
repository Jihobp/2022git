package my.hello.javastudy05_1006;

public class J1005_07_playGlobe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Globe g1 = new Globe(10);
		g1.rollTheGlobe("파란색");
		g1.setColor("녹색");
		System.out.println(g1.getColor());
		
		//Color, spin 은 protected 라서
		//Sphere을 상속한 클래스 이거나
		//Sphere와 같은 폴더에 있는 클래스에서만 접근이 가능함.
		//g1.Color
		//g1.spin()
	}

}
