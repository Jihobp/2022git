package javastudy13_1011_TryCatch_Throw_exception;
import java.util.*;
public class BJ_2588_operator {
	//������operator ver
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		//(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
		//(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
		//(3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//472, 385
		
		
		int n=s.nextInt();	//	472
		int m=s.nextInt();	//	3	8	5
		
		System.out.println(n*(m%10)); 	//10�� ���� �������� �ڸ���
		System.out.println(n*(m%100/10));	// 8!! -> m%100=> 85 -> 10������ 8 ���! 
		System.out.println(n*(m/100)); //100�� ������ �������� ������, ����3 �� ����Ѱ� ���Ѵ�.
		System.out.println(n*m);
		//int�� ���� �Ѽ��� ������ �Ǽ���� ©�� ������
		
		//But!! ���ڿ��� Ǫ�°͵� Ǯ� ��!!!!!!!!!!!!!!!!!
		
		//char ch[]=new char[3];
		//�ϳ��ϳ� ���ϰ�, 
		//�������� ���ϰ�.
	}

}
