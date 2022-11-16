package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.Rectangle;
//
//ctrl 누르고 Rectangle 클릭
public class Cuboid extends Rectangle{
	//생성자 호출하게 되면
	//super 키워드 이용해서 명시적으로 부모클래스 생성 안해도...
	//부모 클래스 무조건 호출함
	public Cuboid() {	//default 생성자.

		//super(); 이런식으로 명시적으로 적지 않아도... 
		
	} // super(); 슈퍼클래스 이코드가 암묵적으로 들어감,. 
	
	public int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//생성자
	public int getCuvoidVolume() {
		return getW()*getH()*z;
	}
}
