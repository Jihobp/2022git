package my.hello.javastudy03;
import java.util.*;
public class J1004_01_quest {
	public static void main(String[] args) {
//		2. ���ڷ� �� ArrayList�� �����.
//		Scanner�� ���� 5�� ����  �߰��Ѵ�.
////	4. ���� 5�� �Է¹ް� �� �߿��� �ִ� �ּڰ� ã��

		
		int[] numbers = new int[5]; //���� 5�� �����ϴ� �迭 ������
		
		//2. max min �̿�
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//1. max min �� �־��ִ°�. 
		//c�� �ٸ��� java�� �� �ȳ����� �ڵ����� 0 �Ѥ��. ���������������������������
		//������ �� �� �ֱ⶧���� ��. 
		
		//numbers ������ [0,0,0,0,0]�� ����.
		//���� 0�� ���� ��쵵 �����Ƿ� numbers�� ���� �ְ�
		//�� ������ max, num ���� �� ��. 
		Scanner s =  new Scanner(System.in);
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(i+1+"��° �� �Է�");
			numbers[i]=s.nextInt();
		}
		
		//���� ù��° ���� max, min���� ����.
		int max = numbers[0];
		int min = numbers[0];
		
		//foreach �̿��ϱ� (�ڹٽ�ũ��Ʈ�� for of �����̶� ����) : �迭�� ���̸�ŭ �ݺ��ϸ鼭 �� �������°� ������
		for(int i :numbers) {
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		
		//for�� �̿��ϱ�
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>max)
				max = numbers[i];
			if(numbers[i]<min)
				min=numbers[i];
		}
		
		System.out.println("�ִ�Q��"+max);
		//String.format= c�� printf�� ����.
		System.out.println(String.format("�ּڰ��� %d\n", min));
	
	}
}
