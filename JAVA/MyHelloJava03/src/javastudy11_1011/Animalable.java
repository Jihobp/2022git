package javastudy11_1011;
public interface Animalable {
	public void charming();
	
	//default ���� ���� �ش� �޼ҵ带 �������� �ʾƵ� �ȴ�.
	//�������̽��� Ư���� �޼ҵ带 �����ؾ��Ѵ�.
	//but, ���� ��Ģ �ٿ��� �ϳ�? ������ default �� �Ѵ�.
	//�ڹٴ� �̷����� ���ܤ��� ���Ƽ� ������ ������������. 
	//�׷��� �ڹ� å�� ���°� ��õ���� �ۤ����
	//�ڹ� �ݳ⿡�� �ϳ� �ɸ��µ� �ǹ����� ���� �ʿ� ������... ��������
	
	
	//protected default void sleep() ������Ƽ��� �� ���� �ִ�.
	//default void sleep() �ƹ��͵� ���ټ��� �Ӥ���. 
	public default void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}


