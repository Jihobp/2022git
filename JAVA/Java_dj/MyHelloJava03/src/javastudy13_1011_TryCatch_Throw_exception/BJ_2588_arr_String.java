package javastudy13_1011_TryCatch_Throw_exception;
import java.util.*;
public class BJ_2588_arr_String {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//Scanner�� �Ἥ int Ÿ�� n, String Ÿ�� num�� �Է¹޴´�.
		//1. toCharArray �迭�� ����. 
		//2. charAt�� �Ἥ �׳� num�� ���� �ڸ����� ������ ����.=���ڿ��� �ε��� ��ġ�� �ִ� ����(character) �� ��ȯ,
		//0-1-2-��°�� �ִ� ���� 3-8-5 ��ȯ.
		//String num=385; �� int result=num.charAt(0); ���� result='3'�̶� ��. 3 XX!!!! ��, reuslt 51 ����!
		//���ڿ� �ε����� �����ϰ� -'0'�� �����, ���� �״���� ���� �� �� �ִ�.
		
		int n=s.nextInt();	//	472
		String num=s.next(); //	3	8	5 num ���� �Է¹ް�,(������ �Է�) 
		char [] arr=num.toCharArray();
		//�޸� �Ҵ��ؾ��ϹǷ� 
				//���ڿ��� �޾Ƽ�, char�� �迭�� String ���·� �־ �Է¹޴´�.
				//ax.	toCharArray() ; ���ڿ��� char �迭 ���·� ��ȯ���ִ� �޼ҵ�-�Լ�.
				//�޼ҵ�� character �迭�� ����� �ϳ��� �迭���� ������ ���� ���.
		//���⼭ ����
		// (n*(num.charAt(2)-'0'));  num�̶� ���ڿ��� charAt(2)��° ������ 0�� ���ش�.
		
		System.out.println(n*(arr[2]-'0'));	// || (n*(num.charAt(2)-'0'));
		System.out.println(n*(arr[1]-'0'));
		System.out.println(n*(arr[0]-'0'));
		
		//����� ������. 
		//���ڿ��� int �� �ٲ㼭 ���ϱ�...? 
		System.out.println(n*Integer.parseInt(num));//���ڸ� ������ �ٲٴ� �Լ�
	}
}
