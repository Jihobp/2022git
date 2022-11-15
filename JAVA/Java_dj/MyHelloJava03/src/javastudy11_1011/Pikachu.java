package javastudy11_1011;

public class Pikachu implements Animalable, Cloneable {
	
	// 인터페이스 Cloneable 적고, 그 다음에 clone 오버라이딩하기
	//clone 치고 ctrl space
	
	//다른 패키지에서도 모두 활용하려면 protected 를 모두 public으로 바궈야함.
	//Cloneable의 clone메소드는 이미 default로 구현되어 있으나
	//오버라이딩을 해야 쓸 수 있다.
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone(); //그대로 갖고와서 쓰인다고????? /1?!?!?!?!?!
	}
	
	
	//커ㅏㅁ퓨터는 무한대 출력 ㄴㄴ 투ㅢㅇ긴다..
	
	private String Name; //개체별로 트레이너가 부르는 이름
	//BBQ
	
	//생성자 o
	public Pikachu(String name) {
		super();
		Name = name;
	}

	//인터페이스에 의한 메소드 구현
	@Override
	public void charming() {
		// TODO Auto-generated method stub
		System.out.println("피카피카");
	}

	//getter setter
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
