package my.hello.javastudy03;

import java.util.*;

public class J1004_05_Lotto_Array {
	public static void main(String[] args) {

		ArrayList<Integer>lotto = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("얼마너치?");
		int price = s.nextInt();
		if(price%1000 != 0) {
			System.out.println("거스름돈 : " + price%1000);
			price -= (price%1000);
			System.out.println("사용금액 : " + price);
		}
		int count = price/1000;
		if(count>5 || count<1)
		{
			System.out.println("잘못된 금액");
			return;
		}
		for(int i = 0; i<count; i++) {
			while(lotto.size() != 6) {
				int num = (int)(Math.random()*45)+1;
				lotto.remove((Integer)num); //중복'값' 제거
				lotto.add(num);
			}
			Collections.sort(lotto);		//정렬
			System.out.print(lotto.toString());
			int bns = (int)(Math.random()*45)+1;
			while(lotto.contains(bns)) {	//포함 여부
				bns=(int)(Math.random()*45)+1;
			}
			System.out.println(" 보너스 " + bns);
			lotto.clear();
		}
		
		
	}
}
