import java.util.*;

public class BJ_11721 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 입력받기 위한 스캐너
		// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		// 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.

		String N = s.nextLine(); // 문자열 입력 :: N단어 문자의 문자열 받을거 선언
		int cnt = 0; // 출력한 횟수를 세기 위한 변수 cnt
		for (int i = 0; i < N.length(); i++) { // N단어의 길이=문자열길이만큼 반복 = 문자열 길이 반환
			System.out.println(N.charAt(i)); // 문자열의 i번째에 있는 문자 출력 (개행 없음)
												// charAt(i) 배열의 i 번째 위치의 문자를 char형 한글자로 반환
			cnt++; // 문자 하나를 출력했기 때문에 cnt를 1증가
			if (cnt == 10) { // 출력된 문자의 수가 10개라면
				System.out.println(); // 새로운 수로 개행해주기 //10의 배수가 될떄마다 끊어서 출력
				// (i/10==0)x (i%10==9)??? (i 이 아니라, i값을 10으로 나눈 값이 9가 되면 띄우기?
				cnt = 0; // 새로운 잘에서 출력한 문자를 세기 위해 cnt를 0으로 초기화.
			}
		}
	}
}
//String[] arr={"abc", "erer"};sys (Arrays.toString(arr)); //배열 순서대로 출력
// ctrl+alt+밑으로 화살표
//	ctrl+shift+f  정렬

/*
 * for (int i = 0; i < N.length(); ++i) { System.out.print(N.charAt(i)); if (i %
 * 10 == 9) { System.out.println();
 */