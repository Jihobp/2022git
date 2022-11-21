import java.util.*;

public class BJ_10808 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

		int[] w = new int[26]; // 알파벳 배열선언 > 이미 몇개인지 들어가 있다,
		// by osr_ 자바는 배열 초기화를 따로 해주지 않으면 0으로 자동 초기화!!!!!!!!!
		String arr = s.nextLine(); // 문자열 받을 거 선언.

		for (int i = 0; i < arr.length(); i++) { // 문자열 배열 길이만큼 반복
			int idx = arr.charAt(i) - 97; // a=0, z=25가 되도록 해서 idx 값 구하기.
			// 몇개 구하는 인트타입 정수 선언
			w[idx]++; // W배열의 IDX번째의 수를 1증가
			// w[arr.charAt(i)-97]++;} //위 FOR문 안에 두줄이랑 같은 뜻 ㅇㅅㅇ
			// 대문자는 65
		}

		for (int i = 0; i < w.length; i++) { // 26해도 ok 배열의 길이(알파벳 개수만큼) 반복
			System.out.print(w[i] + " "); // 한 줄로 출력 ..//26개 다 출력하는 거니까.
		}
		// 함수는 개념만, 프로시져까지만 ㅇㅅㅇㅇㅅㅇㅅㅇㅅㅇㅇ

	}
}
