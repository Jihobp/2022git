package my.hello.javastudy04_1005;

public class Circle {
	
	//�ν��Ͻ� ���� �ٸ���!
	//�׷��� �ν��Ͻ� ������ �ȴ�.
	//alt shift s > r > ���ͼ���
	//alt shift s > o > ������-�����ε�
	
	private int r;
	//PI�� ���� ��� Ŭ������ ���������� �����ϰ� 
	//���������� �� �� �ִ� ������ Ŭ���� ����
	//�ν��Ͻ� ���� �ٸ��� �ƴϴ�!
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	//���������� �� �� �ִ� �޼ҵ带 Ŭ���� �޼ҵ�
	//�ν��Ͻ� ���� �ٸ��� �ƴϴ�!
	private static double PI;

	public static double getPI() {
		return PI;
	}

	public static void setPI(double pI) {
		PI = pI;
	}

	
	//<������> 
	
	//�Ű������� �ִ� �����ڸ� ����鼭 ����Ʈ �����ڴ� ��������.
	//����Ʈ ������ : �Ű����� ���� �ƹ� ���۵� �� �ϴ� ������
	
	//�ݵ�� ���������� ó���� ������ ����� ��.
	//PI���� �⺻������ 3.14�� ������ ��.
	public Circle(int r) {
		super();
		this.r = r;
		PI=3.14;
	}

	public double getArea() {
		return r*r*PI;
	}
	
}

