package my.hello.javastudy03;

import java.util.*;

public class J1004_04_Lotto_ArrayListWOW {

	public static void main(String[] args) {
		// ArrayList 이용한 로또 // 쓰긴 썼는데, 배열 방식과 코드방식이 거의 똑같다.
		// 대신 배열 스타일로 코드짜보기
		Scanner s = new Scanner(System.in);
		System.out.println("얼마나 살건가요?");
		int count = s.nextInt() / 1000; // 5000입력하면 count =5

		if (count > 5 || count < 1) {
			System.out.println("금액이 잘못되었습니다.");
			return;
		}
		for (int i = 0; i < count; i++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for (int j = 0; j < 6; j++) {	//길이가 6으로 지정.
				int num = (int) (Math.random() * 45) + 1;
				boolean isDuplicate = false;	//Q> 왜 처음에 false를 넣어줄꺄?? true가되면 다시 ++하면서 제자리 걸음?? 
				for(int k=0; k<j; k++) { //k번재에 num값으 ㄹ두고
					if(lotto.get(k)==num) {
						isDuplicate=true;	//true : 중복이되면ㅇㅇ
						j--;				//이미 넣을때마다 비교를 해서, 하나씩 넣을대마다 ㄷ\비교됨.그래서 그냥 하나씩 빼주면됨.  
						break;
					}
				}
				if(!isDuplicate) //false 가되면 true가되면서 실행. 
					lotto.add(num); //lotto에 num을 넣는다.
			}
			//System.out.print(lotto.toString());
			int bns= (int)(Math.random()*45)+1;
			for(int j=0; j<lotto.size();j++) {
				if(bns==lotto.get(j))	//// 보너스 번호가 같으면 겹치니까 다시뽑고, j를 -1로 바꾼다. for 문이 j++되면서 0부터 다시시작.
				{
					bns = (int)(Math.random()*45)+1;
					j=-1;	//아예 처음부터 다시 체크 해야해서 j에 -1값 넣어서 처음으로 돌아감. 0번재부터되게 ㅇㅅㅇ
				}
			}
			Collections.sort(lotto); 	//정렬 
			System.out.print(lotto.toString());
			System.out.println(" 보너스 " +bns);
			lotto.clear();				//로또 안에 있는 값을 전부 삭제(=remove)
			//참고로 lotto.clear(); 안해도됨. 
			//왜냐면 위쪽에 ArrayList를 새로 선언하기 때문.
			
			//lotto.remove(i), i번재를 아예 지워버림 ㅇㅅㅇ
			//lotto.get(i) > lotto[i]번재를 가져오는데 arraylist라서 get(i); 자바 배열과 표현이 다를뿐
		}


//	https://velog.io/@xyunkyung/JAVA-ArrayList%EB%A1%9C-lotto-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0
//		for(int i =1; i<=45; i++)
//		{ list.add(i);}
//		int [] lotto = new int[6];
//		
//		랜덤을 사용해서 바로빱는 선생님,
//		얘는 리스트 에 랜덤으로 써 더해주고, 거기서 n번째 get 하고 지워줌. >> 절대 중복이 되지않게. 
//		최솟값 0, 최댓값 44
	}
}
