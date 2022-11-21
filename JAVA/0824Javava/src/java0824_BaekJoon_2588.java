import java.util.*;
public class java0824_BaekJoon_2588 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		//(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		//472, 385
		
		
		int n=s.nextInt();	//	472
		int m=s.nextInt();	//	3	8	5
		
		System.out.println(n*(m%10)); 	//10을 나눈 나머지가 자릿수
		System.out.println(n*(m%100/10));	// 8!! -> m%100=> 85 -> 10나누면 8 출력! 
		System.out.println(n*(m/100)); //100을 나누고 나머지는 날리고, 정수3 만 출력한걸 곱한다.
		System.out.println(n*m);
		//int가 신의 한수다 ㅇㅅㅇ 실수출력 짤림 ㅇㅅㅇ
		
		//But!! 문자열로 푸는것도 풀어볼 것!!!!!!!!!!!!!!!!!
		
		//char ch[]=new char[3];
		//하나하나 곱하고, 
		//나머지는 더하고.
	}
}
