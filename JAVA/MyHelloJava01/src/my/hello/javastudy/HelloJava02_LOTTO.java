package my.hello.javastudy;

import java.util.*;

public class HelloJava02_LOTTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 프로그램 짜보기
		// 6개 번호랑 보너스 번호 출력해주기
		// 1~ 5 사이에 값을 입력받아서 진짜 로또처럼
		// 번호 1개~ 5개 뽑아주는거 해보기
		// for문 원시적으로 쓰면 너무 길어지니까 ㅠㅠㅠㅠㅠㅠlike Clan, java source, library 기능을 사용해ㅑ서
		// 쓰자~~!!!!!@!!!!!!@!~@@!~@~!@~

		// 1. 당첨번호를 몇번 뽑아낼지 입력받기
		Scanner s = new Scanner(System.in); // 콘솔창에서 키보드로 값을 입력 받겠다 라는 것이당.
		int count = s.nextInt();
		// int[] lotto = new int[6];

		if (count < 1 || count > 5) // 1보다 적거나 5보다 크면 메인 함수를 끝내버린당. 1회,2회.3회,4회,5회 입력되니까.
		{
			System.out.println(count + "횟수는 잘못된 값!!");
			return; // main함수를 끝내버리는 것.
		}
		for (int i = 0; i < count; i++) {
			int[] lotto = new int[6];

			// 2. 당첨번호를 뽑아내면 된다.
			for (int j = 0; j < lotto.length; j++) {
				int num = (int) (Math.random() * 45) + 1; // int num 이라는 변수에 랜덤값을 넣는다.
				// int 타입 형변환(int), 왜냐면 랜덤은 소수자리가 나와서 ㅇㅇ 1.99가 뜨면 +1 해서 2로 반올림.
				// boolean isDuplicate = //중복 여부 체크하는 Duplicate //
				// Arrays.asList(lotto).contains(num);
				// ????????????????????????????????
				// array배열,을 .asList로 바꾸겠다.(lotto를 매개변수로 받는.).그리고 contains(num변수를 포함했는지 안했는지
				// true/false 확인) ???????????????????????????
				// arrays.asList()메소드를 사용해서 배열을 List로 변경하고,
				// contains()메서드를 사용해 리스트 내 요소 중에 key 값이 존재하는지 여부 (true/false )를 확읺한다.
				// contains : 객체 배열, 객체 List 에서 쓰임
				// ?
//				int idx = Arrays.asList(lotto).indexOf(num);
//				//if(isDuplicate) //듀플리케이트가 트루면,
//				if(idx != -1)    //index 가 -1이 아니면?!
//				{
//					j--;	//제이 배열을 다시 빼주고 돌아가서 재시작.
//					continue;
//				}
//				lotto[j]=num;

				boolean isDuplicate = false;
				// contain, indexOf는 객체 대상임
				for (int k = 0; k < j; k++) {
					if (lotto[k] == num) {
						isDuplicate = true; // 중복이 되면 true를 넣고 ,
						j--; // 이미 넣을때마다 비교를 했기 떄문에, 하나 넣을때마다 비교ㅕ가 된다. 그래서 그냥 j--; 하나씩 빼주면댐.
						break;
					}
				}

				// isDuplicate 가 false 가 되면 앞의 느낌표에 의해서 true가 됨.
				// 만약 isDuplicate가 true 가 되면
				// 느낌표에 의해서 false가 됨.
				// ! : not 연산

				if (!isDuplicate)	//duplicate가 아니면 로또 제이번째에 숫자 넣눈댜.
					lotto[j] = num;
			}
			
			int bns = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < lotto.length; j++) {
				if (bns == lotto[j]) { // 보너스 번호가 같으면 겹치니까 다시뽑고, j를 -1로 바꾼다. for 문이 j++되면서 0부터 다시시작.
					bns = (int) (Math.random() * 45) + 1;
					j = -1; //// 아예ㅒ 처음부터 다시 체크를 해야해서 -1 로 해서 처음으로 돌아간다. ;ㅅ; 0번째부터!!되게
				}
			}
			Arrays.sort(lotto); // arrays : 배열에 관련된 클래스, sort. 는 배열에 있는 값들을 오름차순 정렬로 출력하게 해주는것.
			System.out.print((i + 1) + "번쨰 번호");
			System.out.print(Arrays.toString(lotto));	//배열안에 있는 숫자를 보기좋게 변환해주는것 ㅇㅅㅇ.
			System.out.println("보너스 번호 : " + bns);
		}
	}

}
