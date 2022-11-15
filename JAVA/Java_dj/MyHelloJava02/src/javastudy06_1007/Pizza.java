package javastudy06_1007;

public class Pizza extends Food{

	public Pizza(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	//eat >  ctrl space >> @Override 적기.
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();//조상클래스에 있는거 그대로 가져옴
		System.out.println("이탈리아의 마지막 자존심~");
	}

}
