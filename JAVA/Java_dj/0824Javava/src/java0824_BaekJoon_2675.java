import java.util.*;
public class java0824_BaekJoon_2675 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//문자열 S를 입력받은 후에, 
		//각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		//즉, 첫 번째 문자를 R번 반복하고, 
		//두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
		//S에는 QR Code "alphanumeric" 문자만 들어있다.
		//QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

		//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
		//각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 
		//문자열 S가 공백으로 구분되어 주어진다. 
		//S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		
		int T=s.nextInt();	//문자 개수
		
		for(int i=0; i<T; i++) { 	//문자 개수만큼
			int R=s.nextInt();	//문자를 R번 반복		//Q. int랑 String 을 어디다 선언해줘야하나?
			String S=s.next();	//문자열을 입력받고,
			for(int j=0; j<S.length(); j++){ 	//배열의 길이만큼 반복
				for(int k=0; k<R;k++) {	// 자른 문자를 R번만큼 반복해서 출력
					//for문 두줄 바꿔서 출력하면, 문자열이 반복되서 출력. 
					System.out.print(S.charAt(j)); //문자열을 자른 공식
					//S.length();는 길이를 구하는 함수. 갯수.
					//j번째의 문자를 받아서 반복해야하니까!!!! 
				}
			}
			System.out.println();//괄호 잘보기 ㅇㅅㅇ 두번째 포문부터 띄워서 출력해야 하니까.
			///n으로 출력되게 해주려고. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		}
	}
}