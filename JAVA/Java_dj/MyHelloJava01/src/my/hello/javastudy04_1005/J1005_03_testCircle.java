package my.hello.javastudy04_1005;

public class J1005_03_testCircle {

	//Ŭ���� �޼ҵ� 
	public static void sayHello() {
		System.out.println("Hello World!");
	}
	//�ν��Ͻ� �޼ҵ�
	//�̰� static�ȿ��� ȣ���Ϸ��Ť���, �ν��Ͻ��� ����� ����
	//�� �ȿ��� ȣ���ؾ���
	public void toSay(String name) {
		System.out.println(name+"��, �ȳ�");
	}
	public static void main(String[] args) {
//		1.Circle class �̿��ؼ� �� 2�� ������
//		�������� 2�� ��, 3�� �� ������
//
//		2. 1������ ���� ���鿡 ���ؼ� getArea ȣ��
//
//		3. PI���� set���� �����ϱ�
//
//		4. 1������ ���� ���� ���ؼ� getArea ȣ��
		
		Circle c1 = new Circle(2);	//w�� h ��� 0�� ����
		Circle c2 = new Circle(3);		

		System.out.println(c1.getArea());//12.56
		System.out.println(c2.getArea());//28.26
		
		Circle.setPI(3.0);		//PI���� �ٲٸ� ��� Circle�鿡�� 
								//������ ��ģ��.
		//Ŭ��������, Ŭ���� �޼ҵ�� �����Ǵϱ� ��0��

		System.out.println(c1.getArea());	//12.0
		System.out.println(c2.getArea());	//27.0
		
		//Ŭ���� �޼ҵ� Ư¡
		//Ŭ���� �޼ҵ� �ȿ��� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ尡 ������.
		//���� : static �� ���� �͵��� �޸𸮿� ���� �ö󰡱� �����̴�.
		//Ŭ���� ������ Ŭ���� �޼ҵ�� ���α׷� �������ڸ��� �ö�
		//�ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� new Ű���� ���� ��
		//�޸𸮿� �ö󰣴�.
		
		//static�� �پ������� ���� �ö󰣴�. 
		sayHello();
		//toSay("����ȣ"); //static�� �پ��ִ� �޼ҵ� �ȿ���
						//static�� �پ��ִ� �޼ҵ峪 ������ �´�.
						//static ���� �޼ҵ� �ȿ���
						//static �� ���� ������ �޼ҵ� �� �� �ִ�. 
		//����ƽ�� ���� �ִ� ���� �ֵ鳢�� �����̰� ����ƽ�� ���°Ŵ� ����ƽ�� ���� ������ �޼ҵ� �� �� �ִ�.
		//static �پ� �ִ� �޼ҵ� �ȿ���
		//static ���� �޼ҵ�(=�ν��Ͻ� �޼ҵ�)
		//ȣ���ϰ� ������ �ν��Ͻ��� ����� ���� ȣ���ϸ��.
		//�̷��� ��üȭ��� ��(=�ڱ��ڽ��� �̿��� �ν��Ͻ� �����)
		new J1005_03_testCircle().toSay("�̵���");
		J1005_03_testCircle temp = 
				new J1005_03_testCircle();
		temp.toSay("������");
		
	
	}

}
