package javastudy07_1007_Food;

public class Taco extends Food {

	//class 만들떄 javastudy07_Food browse 해서 super부모클래스 이미 가져오면,
	//@Override 자동 생성 ㅇ0ㅇ
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("감싸서 먹는다. 단, ");
		System.out.println("고수(실란트로) 못 먹으면 꼭 빼기. ");
	}

}
