package javastudy13_1011_TryCatch_Throw_exception;

import java.util.Scanner;

public class tbj_StringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϰ� �ؿ��� ����Ʈ
		Scanner s= new Scanner(System.in);
		
		System.out.println("ù��° ����?");
		String num1 = s.nextLine()	;
		System.out.println("�ι�° ����?");
		String num2 = s.nextLine()	;
		
		//1.	toCharArray �� �迭 ������ ���� ���
		//2.	CharAt�� ���� ��찡 �ִ�.
		//3.	�׸��� �ƽ�Ű�ڵ� �̱� ������ ���� '0�� ���� ���ڸ� ���ϰų�
		//4. Character.getNumericValue('1') �̰� ���⵵��. 
		
		
		//�ڹ��ڿ� �ε����� �����ϰ� -'0'�� �����, ���� �״���� ���� �� �� �ִ�. >> ���ڿ� - '0' ����!!!!
		// (n*(num.charAt(2)-'0'));  num�̶� ���ڿ��� charAt(2)��° ������ 0�� ���ش�. >>���ڳ���.
		int n1=0;
		int n2=0;
		try {
			n1=Integer.parseInt(num1);
			System.out.println(n1*num2.charAt(2)-'0');
			System.out.println(n1*num2.charAt(1)-'0');
			System.out.println(n1*num2.charAt(0)-'0');
			System.out.println(n1*n2);
		} catch (Exception e) {	//�ڵ尡 �����̸� �������� �ʴ´�. =����ó�� = catch, exception ���ܸ� ���..
			n1 =0;
			System.out.println("���� ����!");
			e.printStackTrace();//���� �޼��� ��� ���� ��.
		}
		System.out.println("���α׷� ��!!!");
	}

}
