package my.hello.javastudy03;

import java.util.*;

public class J1004_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://coding-factory.tistory.com/551 �Ϻ�
		
//		3. Scanner�� �Է��� ���ں��� ���� ���ڸ�
//		�����Ѵ�.
//		ex) 10 20 30 40 50 �̷��� ArrayList�� ���
//		25 ������ 25�̸��� ���ڵ� Remove�Ѵ�.
//

		
		// �迭 : ũ�Ⱑ �����ǰ� Ư�� �ε����� �� ������
		// ArrayList : ũ�Ⱑ �����Ǿ� ���� ����
		// ��� ���� �̹� �� �κп� ���ؼ��� �� ��������
		// �׸��� Ư�� �κ� ���� ���� - > �����ϸ� ���̰� ���� ������

		// ǥ��� �ΰ����� �ִ�.
		// �ϴ� ù��° ������� ǥ���Ұ�.

		// Integer // int Ÿ�� , �� ������ Ŭ����Ÿ�� ��ü�� �����.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// �� ����� �����Ϸ��� �˾ƾ� �ϴ� ����
		// �������̶� �������̽��� �˾ƾ� ���� ����
		List<Integer> numbs = new ArrayList<Integer>();

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "��° ���� �Է��ϱ�");
			// ���� �Է��ؼ� �ٷ� ����ִ´�.
			numbs.add(s.nextInt());
		}
		// foreach ���� ctrl space !!!!
		// ctrl shift f �� �ڵ� ����!!!!
		for (Integer integer : numbs) {
			System.out.println(integer);
		}

		// ���������� ������ ����� ���, ���� ���ﶩ ��for���� ����.
		// ���̰� 5��� 4 3 2 1 0 �̷��� for���� ���ư�
		System.out.println("�� �̸��� ���ڸ� ������?");
		int cutline = s.nextInt();
		for (int i = numbs.size() - 1; i >= 0; i--) {
			if (cutline > numbs.get(i)) // get(i), i���� �� ����
				numbs.remove(i); // remove(i), i���縦 �ƿ� �������� ������
			////??!!! get > num[i]���縦 �������µ� arraylist�� get(i) ; �ڹٹ迭�� ǥ���� �ٸ��� 
		}
		for (Integer integer : numbs) {
			System.out.println(integer);
		}

		// arrayList�� ���� set �ϴ� �͵� �ȴ�,

	}

}
