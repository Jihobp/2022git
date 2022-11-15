package my.hello.javastudy05_1006;

import my.hello.javastudy04_1005.Circle;

public class Sphere extends Circle {
	//add constructor sphere
	//constructor : ������
	//super : ����Ŭ������ ������ ȣ���� ��
	//KBStudent�ʹ� �ٸ��� �̰� �����ڰ� �־�� ��
	//Circle�� ����Ʈ ������(=�ƹ��͵� ���� ������)�� ���� ������
	//Circle�� �ִ� �����ڸ� ȣ���ؾ����� �� ��ü�� ���� �� �ִ�.
	
	public Sphere(int r) { // �̰� �ȸ���� Circle ������ ��.
		super(r); // Circle Ŭ������ �����ڸ� ȣ���Ѱ�/
		// Circle ������ ȣ��ÿ� PI���� ���ǵǵ��� �س���.
		// PI =3.14
	}

	public double getVolume() {
		return (4.0 / 3.0) * getPI() * getR() * getR() * getR();
	}

	// Sphere ����������
	// KBStudent�ʹ� �ٸ��� ���ο� �Ӽ��� �߱����� �ʾҴ�.
	// ��ſ� ���ο� ����� �߰��ߴ�.

	// ���� ��Ű��=���� ������ public�̶� �Ȱ���.
	// ����Ʈ ���� �������� ����������.

	// ������ �޾����� Sphere�� ��ӹ��� Ŭ���������� �̰� �� �� �ִ�.
	protected String Color;

	protected void spin() {
		System.out.println("���ۺ���~");

	}
}
