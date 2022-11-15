package javastudy07_1007_Food;

public abstract class Food { //abstract : 추상적인
	//음식이란 추상적인 개념을 점점점 구체화 한당.
	//getset은 구현해놓고, 다른 메소드는 구현 nono.
	//food 상속한 애들은 eat을 구현화 해야한다.
	//food 자체가 추상화라,
	//instance라는 구체적인 객체를 못 만든다. 
	private int price;
	public String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void eat();
	

}
