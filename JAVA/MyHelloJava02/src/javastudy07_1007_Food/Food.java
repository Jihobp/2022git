package javastudy07_1007_Food;

public abstract class Food { //abstract : �߻�����
	//�����̶� �߻����� ������ ������ ��üȭ �Ѵ�.
	//getset�� �����س���, �ٸ� �޼ҵ�� ���� nono.
	//food ����� �ֵ��� eat�� ����ȭ �ؾ��Ѵ�.
	//food ��ü�� �߻�ȭ��,
	//instance��� ��ü���� ��ü�� �� �����. 
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
