package javastudy06_1007;

public class Pizza extends Food{

	public Pizza(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	//eat >  ctrl space >> @Override ����.
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();//����Ŭ������ �ִ°� �״�� ������
		System.out.println("��Ż������ ������ ������~");
	}

}
