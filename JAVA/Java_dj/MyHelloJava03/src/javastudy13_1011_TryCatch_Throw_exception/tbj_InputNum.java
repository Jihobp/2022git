package javastudy13_1011_TryCatch_Throw_exception;
import java.util.*;
public class tbj_InputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("ù����?");
		String num1=s.nextLine();
		System.out.println("�ι�°?");
		String num2=s.nextLine();
		int n1 = 0;
		int n2 = 0;
		try {//�Էµ� ������ ���ڷ� ��ȯ�� ��....
			n1 = Integer.parseInt(num1);	//���߿� �ϳ��� �̻��� ���� ��? ex���ڿ�, 
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {		//catch �κ����� ������, n1=0 �ʱⰪ ���� ����.
			System.out.println("�߸��� �� ��");
			n1=0;
		}
		if(n1!=0) {
			System.out.println(n1*(n2%10));
			System.out.println(n1*((n2/10)%10));
			System.out.println(n1*(n2/100));
			System.out.println(n1*n2);
		}
		System.out.println("���α׷��� �����մϴ�. �����մϴ�.");
	}

}

//�� ���� ���ڸ� �Է��Ѵ�.(�� �� �� ���ڿ��ν� �޾ƿ��� ���̴�.)
//1) ù��° ���� ���ϱ� �ι�° ������ 1�� �ڸ� ��(472*5)
//2) ù��° ���� ���ϱ� �ι�° ������ 10�� �ڸ� ��(472*8)
//3) ù��° ���� ���ϱ� �ι�° ������ 100�� �ڸ� ��(472*3)
//4) ù��° ���� ���ϱ� �ι�° ����(472*385)
//ex) ù��° ���� : 472
//    �ι�° ���� : 385
//    ��� ��� : 2360, 3776, 1416, 181720
//
//�� ������ Ǯ��ÿ�.
//1. try catch �̿�
//=> ������ ���� �Է��� ���
//���ڸ� 0���� �ٲ������
//2. s.nextLine���θ� ���� �Է¹ޱ�
//3. ������ �����ڷε� �� Ǯ���
//4. ������� ������ ���긻��
//���ڿ� �������� �غ���
//(���۸��� �ʿ��� ���� ����)
//charAt�� �ʿ��� ���� ����