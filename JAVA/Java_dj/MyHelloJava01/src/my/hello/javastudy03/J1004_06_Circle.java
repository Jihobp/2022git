package my.hello.javastudy03;

public class J1004_06_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(); //�Ϲ������� �ִ°� ȣ���ߴ�.
		c1.setR(3);	//3�̶� ���� �޾Ƽ� setR�� ������.  = Circle c1�� �ִ� r�� ��.
		System.out.println(c1.getArea()); //Circle c1�� �ִ� �Լ��� ����� ��� 
		System.out.println(c1.getRound());
		Circle c2 =  new Circle();  //�Ϲ������� �ִ°� ȣ���ߴ�.
		c2.setR(-3); //�߸��� ���� �Է���.
		System.out.println(c2.getArea());
		System.out.println(c2.getRound());
		if(c2.getArea()!=0) {
			System.out.println(c2.getArea());
		}
		else {
			System.out.println("c2������ Ȯ���ؿ�. ");
		}
		
		//������ �ٸ���
		//���� �����ڸ��� ���� ���� ���� �� �ִ�. (������ ����) 
		Circle m1= new Circle(4); //���� ����� set, r �̷��� ���̹ٷθ���� ���� ���� �� �ִ�.
		if(m1.getArea()!=0)
			System.out.println(m1.getArea());
		System.out.println(new Circle(5).getArea());
		//���� : getRound ���� ��,00002 �̷��� ���°�
		//�����Ҽ�����(�Ҽ�������) 
		//�ε��Ҽ��� �̽�����(�Ҽ����� ������ �ƴ�)
		//�����м��迡�� �Ǽ��� �Ϻ��ϰ� ǥ���� �� ����
		//�׿� ���� ���������� ���� ������.
		
		//�̸��� �޶� ���� �����ŷ� �����ϴ°� �����ε� �̶�� �� ��0��. 
	
	}

}
