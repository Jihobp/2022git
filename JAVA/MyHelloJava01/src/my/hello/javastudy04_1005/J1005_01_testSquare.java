package my.hello.javastudy04_1005;

public class J1005_01_testSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s1= new Square();
		s1.setWh(-1); //�߸��� �� //-1�̶� ���� �޾Ƽ� setWh����. = square s1�� �ִ� wh��.
		System.out.println(s1.getWh());
		s1.setWh(10); //����ε� ��
		System.out.println(s1.getWh());
	
		//���̾�~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
//		1. Square Ŭ������ �����.
//		�Ӽ� : int wh(private)
//		���� ��� : getter, setter�� ����
//
//		2. Main���� Square Ŭ������ �̿���
//		��ü ����(=���� 1�� ����)�ϰ�
//		setWh�� wh�� �����ϰ� �ϱ�
//
//		3. Square Ŭ������ �����ڸ� 2������ �����.
//		new Square(), new Square(wh��)
//
//		4. Rectangle Ŭ������ �����.
//		�Ӽ� : int w, int h
//		���� ��� : getter, setter
//		������ : w�� h�� �� ���, �� �� �� ���,
//		��� �� ��쿡 ���ؼ� ����
//
//		5. Rectangle �ȿ� getArea(w * h) �޼ҵ� �߰�
//		���ǻ��� 1) w�� h �� �ϳ��� 0�̸� ���� �޽��� ���� -1 ����
//		���ǻ��� 2) w�� h ���� ���ٸ� '���簢��'�̶�� ���� ���� ����ϰ� w*h����
	}
}
