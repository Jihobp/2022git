package my.hello.javastudy03;

import java.util.*;

public class J1004_03_Lotto_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�� �ƴ϶� arraylist�� �ζ� �ڵ� ¥��.
		Scanner s = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> num = new ArrayList<Integer>();

		// �ζ� ��ȣ 6�� ���
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < num.size(); j++) {
				int nums = (int) (Math.random() * 45) + 1;
				// ������ �Է��ؼ� �������. ������
				if (num.isEmpty()) { // ��������� true ��ȯ, �ϳ��� ������ false
					num.add(nums);
				}

				else {
					for (int k = 0; k < num.size(); k++) {
						if (num.get(k) == nums) {
							j--;
							break;
						}
						num.add(nums); // num���� nums�� �־��ش�.
					}
				}
				for (Integer integer : num) {
					System.out.println(integer); // integer ���
				}

			}
		}

		
		
	}
}
