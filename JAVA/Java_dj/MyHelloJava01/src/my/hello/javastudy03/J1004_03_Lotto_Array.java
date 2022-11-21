package my.hello.javastudy03;

import java.util.*;

public class J1004_03_Lotto_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열이 아니라 arraylist로 로또 코드 짜기.
		Scanner s = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> num = new ArrayList<Integer>();

		// 로또 번호 6개 출력
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < num.size(); j++) {
				int nums = (int) (Math.random() * 45) + 1;
				// 랜덤값 입력해서 집어넣음. ㅇㅅㅇ
				if (num.isEmpty()) { // 비어있으면 true 반환, 하나라도 잇으면 false
					num.add(nums);
				}

				else {
					for (int k = 0; k < num.size(); k++) {
						if (num.get(k) == nums) {
							j--;
							break;
						}
						num.add(nums); // num에다 nums를 넣어준다.
					}
				}
				for (Integer integer : num) {
					System.out.println(integer); // integer 출력
				}

			}
		}

		
		
	}
}
