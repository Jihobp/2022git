package my.hello.javastudy04_1005;

public class J1005_04_testGame_Apex {

	public static void sayHello() {
		System.out.println("안녕안녕~~~");
	}
	public static void sayHi(String name) {
		System.out.println("안녕안녕 나는 "+name+"이야~");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//4.
	System.out.println("총 인원"+GameCharacter.getCount());
	GameCharacter c1 = new GameCharacter();	//0
	System.out.println("총 인원"+GameCharacter.getCount());
	c1.setJob("패스파인더");
	c1.setId("지호");
	
	GameCharacter c2 = new GameCharacter("세룡","블러드하운드");
	System.out.println("총 인원"+GameCharacter.getCount());
	
	GameCharacter c3 = new GameCharacter();
	c3.setJob("레이스");
	c3.setId("동훈");
	c3.setLv(33);
	System.out.println("총 인원 "+ GameCharacter.getCount());

	GameCharacter.sayHello(); //공통
	c1.attack();
	c2.attack();
	c3.attack();
	
	//GameCharacter.cc(); //위에서 스태틱을 지우면 못쓰낟. 그 이유는 위에서 스태틱을 지웠기 때문에
	//이거는 스태틱도 아니고 인스턴스 (new)도 아니라서 못쓰는것이다. 
	}
}
