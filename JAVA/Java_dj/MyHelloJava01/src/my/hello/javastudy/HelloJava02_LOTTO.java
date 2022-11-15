package my.hello.javastudy;

import java.util.*;

public class HelloJava02_LOTTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζ� ���α׷� ¥����
		// 6�� ��ȣ�� ���ʽ� ��ȣ ������ֱ�
		// 1~ 5 ���̿� ���� �Է¹޾Ƽ� ��¥ �ζ�ó��
		// ��ȣ 1��~ 5�� �̾��ִ°� �غ���
		// for�� ���������� ���� �ʹ� ������ϱ� �ФФФФФ�like Clan, java source, library ����� ����ؤ���
		// ����~~!!!!!@!!!!!!@!~@@!~@~!@~

		// 1. ��÷��ȣ�� ��� �̾Ƴ��� �Է¹ޱ�
		Scanner s = new Scanner(System.in); // �ܼ�â���� Ű����� ���� �Է� �ްڴ� ��� ���̴�.
		int count = s.nextInt();
		// int[] lotto = new int[6];

		if (count < 1 || count > 5) // 1���� ���ų� 5���� ũ�� ���� �Լ��� ����������. 1ȸ,2ȸ.3ȸ,4ȸ,5ȸ �ԷµǴϱ�.
		{
			System.out.println(count + "Ƚ���� �߸��� ��!!");
			return; // main�Լ��� ���������� ��.
		}
		for (int i = 0; i < count; i++) {
			int[] lotto = new int[6];

			// 2. ��÷��ȣ�� �̾Ƴ��� �ȴ�.
			for (int j = 0; j < lotto.length; j++) {
				int num = (int) (Math.random() * 45) + 1; // int num �̶�� ������ �������� �ִ´�.
				// int Ÿ�� ����ȯ(int), �ֳĸ� ������ �Ҽ��ڸ��� ���ͼ� ���� 1.99�� �߸� +1 �ؼ� 2�� �ݿø�.
				// boolean isDuplicate = //�ߺ� ���� üũ�ϴ� Duplicate //
				// Arrays.asList(lotto).contains(num);
				// ????????????????????????????????
				// array�迭,�� .asList�� �ٲٰڴ�.(lotto�� �Ű������� �޴�.).�׸��� contains(num������ �����ߴ��� ���ߴ���
				// true/false Ȯ��) ???????????????????????????
				// arrays.asList()�޼ҵ带 ����ؼ� �迭�� List�� �����ϰ�,
				// contains()�޼��带 ����� ����Ʈ �� ��� �߿� key ���� �����ϴ��� ���� (true/false )�� Ȯ���Ѵ�.
				// contains : ��ü �迭, ��ü List ���� ����
				// ?
//				int idx = Arrays.asList(lotto).indexOf(num);
//				//if(isDuplicate) //���ø�����Ʈ�� Ʈ���,
//				if(idx != -1)    //index �� -1�� �ƴϸ�?!
//				{
//					j--;	//���� �迭�� �ٽ� ���ְ� ���ư��� �����.
//					continue;
//				}
//				lotto[j]=num;

				boolean isDuplicate = false;
				// contain, indexOf�� ��ü �����
				for (int k = 0; k < j; k++) {
					if (lotto[k] == num) {
						isDuplicate = true; // �ߺ��� �Ǹ� true�� �ְ� ,
						j--; // �̹� ���������� �񱳸� �߱� ������, �ϳ� ���������� �񱳤Ű� �ȴ�. �׷��� �׳� j--; �ϳ��� ���ָ��.
						break;
					}
				}

				// isDuplicate �� false �� �Ǹ� ���� ����ǥ�� ���ؼ� true�� ��.
				// ���� isDuplicate�� true �� �Ǹ�
				// ����ǥ�� ���ؼ� false�� ��.
				// ! : not ����

				if (!isDuplicate)	//duplicate�� �ƴϸ� �ζ� ���̹�°�� ���� �ִ���.
					lotto[j] = num;
			}
			
			int bns = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < lotto.length; j++) {
				if (bns == lotto[j]) { // ���ʽ� ��ȣ�� ������ ��ġ�ϱ� �ٽṵ̂�, j�� -1�� �ٲ۴�. for ���� j++�Ǹ鼭 0���� �ٽý���.
					bns = (int) (Math.random() * 45) + 1;
					j = -1; //// �ƿ��� ó������ �ٽ� üũ�� �ؾ��ؼ� -1 �� �ؼ� ó������ ���ư���. ;��; 0��°����!!�ǰ�
				}
			}
			Arrays.sort(lotto); // arrays : �迭�� ���õ� Ŭ����, sort. �� �迭�� �ִ� ������ �������� ���ķ� ����ϰ� ���ִ°�.
			System.out.print((i + 1) + "���� ��ȣ");
			System.out.print(Arrays.toString(lotto));	//�迭�ȿ� �ִ� ���ڸ� �������� ��ȯ���ִ°� ������.
			System.out.println("���ʽ� ��ȣ : " + bns);
		}
	}

}
