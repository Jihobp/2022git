package javastudy14_1012;

import java.util.Scanner;

public class J1012_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//catch ������ �޸� �� ����
		//�� �� �Ʒ����� Exception�� �޷�����
		//Ȥ�� exception �ϰ�, �� �ؿ� throwable �߰��ؾ� ��.
		
		int a=0,b=0,c=0;
		
		//try catch �� �Ŵµ�, ���ڸ� �߸��Է��� ���.
		//�߸��� ������ �� ��� 2������ ���ؼ� �غ���.
		Scanner s = new Scanner(System.in);
		try {
			a=10;
			System.out.println("b��?");
			b=Integer.parseInt(s.nextLine()); //?????????
			c=a/b;
		} catch (NumberFormatException e) {
			System.out.println("���� ����(����)"+e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println("���� ����(����)"+e.getMessage());
		} catch (Exception e) {
			System.out.println("���� �ߤ�����");
			e.printStackTrace();
		}
		System.out.println("���� c ����?" +c);
		
	}

}
