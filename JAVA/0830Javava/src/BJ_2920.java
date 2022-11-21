import java.util.*;

public class BJ_2920 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.
		// c는 1로, d는 2로, ..., C를 8로 바꾼다.
		// 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed
		// 이다.
		// 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

		// int [] arr= {1,2,3,4,5,6,7,8};

		int[] index = new int[8]; // 음계 알파벳 배열선언 > 이미 몇개인지 들어가 있다,
		String musik = ""; // 순서
		// 자바는 배열 초기화를 따로 해주지 않으면 0으로 자동 초기화
		// 문자열은 아니라 정수만 받으므로 string xxx
		// String musik = s.next();""; //n개의 숫자 입력받고,(데이터 입력)
		// char [] arr=musik.toCharArray();//메모리 할당해야하므로

		for (int i = 0; i < 8; i++) {
			index[i] = s.nextInt();
		} // 배열의 크기만큼 반복,

		for (int i = 0; i < index.length - 1; i++) { // i<8 배열-1
			if (index[i] == index[i + 1] - 1) {// 오름차순
				musik = "ascending";
			} else if (index[i - 1] == index[i + 1] + 1) {// 내림차순
				musik = "descending";
			} else {
				musik = "mixed";
				break;
			}
			// for(int i=0; i<index.length -1; i++) { //배열 만큼 빼준다.
			// if 1~8
			// else if 8~1
			// else - > mixed?

		}
		System.out.println(musik);
	}
}
