package javastudy13_1011_TryCatch_Throw_exception;

import java.util.Scanner;

public class J1011_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Է��� ���ڿ��� ���ڷ� �ٲٴ� �ΰ��� �ٽ��� �ִ�.
		Scanner s = new Scanner(System.in);
		//1. nextInt�� Ȱ��
		System.out.println("���� �Է���");
		int num = s.nextInt();
		//�׷��� ! �̷��� �Է��� ��� ������ nextLine �Է��� �ȵ�
		
		String name = s.nextLine();
		System.out.println("num="+num+", name"+name);
		
		//2. Integer.parseInt Ȱ��
//		System.out.println("�ٽ� ���� �Է�");
//		int age = Integer.parseInt(s.nextLine());
//		System.out.println("���ڿ� �Է�");
//		String alias = s.nextLine();
//		System.out.println("age="+age+", alias="+alias);
//		
//		System.out.println("���ڿ��� ���ڷ� ��ȯ");
//		age = Integer.parseInt("�̵���"); //�� �κп��� ������ ��!!!!
		
		//�߰��� nextLine�� ���� �ʿ䰡 ����.
		try {
			System.out.println("�ٽ� ���� �Է�");
			int age = Integer.parseInt(s.nextLine());
			System.out.println("���ڿ� �Է�");
			String alias = s.nextLine();
			System.out.println("age="+age+", alias="+alias);
			
			System.out.println("���ڿ��� ���ڷ� ��ȯ");
			age = Integer.parseInt("�̵���"); //�� �κп��� ������ ��!!!!
		} catch (Exception e) {
			System.out.println("age���� �߸��Ǿ����ϴ�.");
			e.printStackTrace(); //�������.
			//������ ����ϵ�, �ؿ� �ִ� �ڵ�� �����Ѵ�.
			//�ֳĸ� ����� �� �ƴϰ�, ������ �����ش�. �ڵ�� ��� ������.
			
		}
		System.out.println("��");	//�� �κ��� �������� ����.
		
		/*
		 * ������ : �Լ��� ���°� �����. �Ȱ���. 
		 * �Լ� : ���Ҷ����� �ҷ����� ����
		 * ��ü object �����ҋ� �ѹ��� ����, �̹� �����Ȱ� �ٽ� ����.xxxx �¾�� �ѹ���. ��N����x.
		 * ��ü ������ ���ÿ� �Լ� ����.�̰� �� ȿ����. Circle c2 = new Circle(2)
		 * private �� get�� ������ !! ���� ��.
		 * ������ �ʱ�ȭ�ϸ� �Ⱦ�.
		 * get�� �ݰ����� ���̾���, set�� new Circle ���·�.*/
	}

}
