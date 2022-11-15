package my.hello.javastudy03;
//1. Circle Ŭ���� �����
//������ �� r
//������ �� pi(����� �� ��. final Ű����)
// ������ ���� ���� �˻��ϸ� �ȴ�. ������

//2. Circle �����ϰ� r �� set �� ��
//0������ ���� ������ ���� �޽��� ����
//r ���� 0���� �ϱ�

//3. ���� �ѷ�(getRound)�� ���� ����(getArea) �޼ҵ�(=�Լ�) �����
//ȣ���غ���
//ex)
//Circle a = new Circle();
//a.setR(10);
//System.out.println(a.getArea());
//System.out.println(a.getRound());
public class Circle {
	private int r; // �������� //circle �ȿ� �վ �Ű������� �ʿ����.
	private final double pi = 3.14; // ��������

	// alt shift s ������ r ������
	// r�κи� üũ�� ���� generate
	public int getR() {//���������� private�� ������ �� �ְ� 
		return r;
	}

	//get�� private�� ���� �������°Ű�, 
	//set�� private�� ���� �ٲ��� �� �մ�. 
	
	// ������ ���� 0������ ��� 0���� �������ѹ�����.
	public void setR(int r) {
		if (r <= 0)
			this.r = 0;
		else
			this.r = r;
	}

	// public Ÿ���� �Լ� (=�޼ҵ�)�� 2�� ���� �����.
	// ���� ���ϱ�� �ѷ� ���ϱ�.

	public double getArea() {
		if (r <= 0) {
			System.out.println("������ �� Ȯ�ιٶ�");
			return 0;
		}
		return r * r * pi;
	}

	
	
	public double getRound() {
		if (r <= 0) {
			System.out.println("������ �� Ȯ�ιٶ�");
			return 0;
		}
		return 2 * r * pi;
	}

	// public MyCircle() {

	// }

	// ������
	// �⺻ ���´� �Ʒ��� ���� �ƹ��͵� �������� �ʴ� �ڵ��.
	// public Mycircle(){}
	// ������ == ���ϰ� ���� �Լ���� ����.

	// �����ڴ� ���� �״�� ������ �� ȣ���ϹǷ�
	// ������ �����԰� ���ÿ� �Ӽ����� �ٷ� ������ �� �ִ�.
	// new Circle()�̶�� ������ r ���� ���߿� ���� �����ؾ� ������
	// �̷��� �Ű������� r �� ������ ����� ���ÿ� r �� ���� ������.

	public Circle(int r) {
		setR(r);
	}

	// ���� 1!!!! problem
	// �̷��� �����ڸ� ��������� ���� �Ǹ�
	// ������ �ִ� �����ڰ� ������
	// ������ �ִ� ������ => public Circle(){}
	// �׷��� �� ���·� �ٽ� main �ִ� �ڵ� ������ �������� �ִ�.

	// �ذ�å!!
	// �ƹ��͵� ���� �����ڸ� �̹��� '���������' �ٽ� ���ش�.
	public Circle() {

	}
	// �̷���!!!!
	// <<<<<<<<<<<<<<< �����ε�>>>>>>>>>>>>>>>
	// �����ڳ� �Լ�)=�޼ҵ�) ���鶧,
	// �̸��� �Ȱ����� �Ű������� ������ Ÿ���� �ٸ� ��쿣
	// ���� �ٸ��ɷ� �����
	// �� MyCircle(r)�̶� MyCircle()�� ���� ���� �ٸ� ��
	// �� �ߺ��� �����ڳ� �Լ��� �ƴ϶� ��!

}
