package my.hello.javastudy03;

import java.util.*;

public class J1004_04_Lotto_ArrayListWOW {

	public static void main(String[] args) {
		// ArrayList �̿��� �ζ� // ���� ��µ�, �迭 ��İ� �ڵ����� ���� �Ȱ���.
		// ��� �迭 ��Ÿ�Ϸ� �ڵ�¥����
		Scanner s = new Scanner(System.in);
		System.out.println("�󸶳� ��ǰ���?");
		int count = s.nextInt() / 1000; // 5000�Է��ϸ� count =5

		if (count > 5 || count < 1) {
			System.out.println("�ݾ��� �߸��Ǿ����ϴ�.");
			return;
		}
		for (int i = 0; i < count; i++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for (int j = 0; j < 6; j++) {	//���̰� 6���� ����.
				int num = (int) (Math.random() * 45) + 1;
				boolean isDuplicate = false;	//Q> �� ó���� false�� �־��ٲ�?? true���Ǹ� �ٽ� ++�ϸ鼭 ���ڸ� ����?? 
				for(int k=0; k<j; k++) { //k���翡 num���� ���ΰ�
					if(lotto.get(k)==num) {
						isDuplicate=true;	//true : �ߺ��̵Ǹ餷��
						j--;				//�̹� ���������� �񱳸� �ؼ�, �ϳ��� �����븶�� ��\�񱳵�.�׷��� �׳� �ϳ��� ���ָ��.  
						break;
					}
				}
				if(!isDuplicate) //false ���Ǹ� true���Ǹ鼭 ����. 
					lotto.add(num); //lotto�� num�� �ִ´�.
			}
			//System.out.print(lotto.toString());
			int bns= (int)(Math.random()*45)+1;
			for(int j=0; j<lotto.size();j++) {
				if(bns==lotto.get(j))	//// ���ʽ� ��ȣ�� ������ ��ġ�ϱ� �ٽṵ̂�, j�� -1�� �ٲ۴�. for ���� j++�Ǹ鼭 0���� �ٽý���.
				{
					bns = (int)(Math.random()*45)+1;
					j=-1;	//�ƿ� ó������ �ٽ� üũ �ؾ��ؼ� j�� -1�� �־ ó������ ���ư�. 0������͵ǰ� ������
				}
			}
			Collections.sort(lotto); 	//���� 
			System.out.print(lotto.toString());
			System.out.println(" ���ʽ� " +bns);
			lotto.clear();				//�ζ� �ȿ� �ִ� ���� ���� ����(=remove)
			//����� lotto.clear(); ���ص���. 
			//�ֳĸ� ���ʿ� ArrayList�� ���� �����ϱ� ����.
			
			//lotto.remove(i), i���縦 �ƿ� �������� ������
			//lotto.get(i) > lotto[i]���縦 �������µ� arraylist�� get(i); �ڹ� �迭�� ǥ���� �ٸ���
		}


//	https://velog.io/@xyunkyung/JAVA-ArrayList%EB%A1%9C-lotto-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0
//		for(int i =1; i<=45; i++)
//		{ list.add(i);}
//		int [] lotto = new int[6];
//		
//		������ ����ؼ� �ٷλ��� ������,
//		��� ����Ʈ �� �������� �� �����ְ�, �ű⼭ n��° get �ϰ� ������. >> ���� �ߺ��� �����ʰ�. 
//		�ּڰ� 0, �ִ� 44
	}
}
