package my.hello.javastudy03;
import java.util.*;
public class J1004_01_quest {
	public static void main(String[] args) {
//		2. 숫자로 된 ArrayList를 만든다.
//		Scanner로 숫자 5개 정도  추가한다.
////	4. 숫자 5개 입력받고 그 중에서 최댓값 최솟값 찾기

		
		int[] numbers = new int[5]; //숫자 5개 저장하는 배열 ㅇㅅㅇ
		
		//2. max min 이용
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//1. max min 값 넣어주는거. 
		//c랑 다르게 java는 값 안넣으면 자동으로 0 ㅡㄹ어감. 꺄릉ㄷ쇼댜ㅐ쇼ㅑㄷ쇼댜ㅐ꺄르댯
		//음수가 들어갈 수 있기때문에 놉. 
		
		//numbers 베열엔 [0,0,0,0,0]이 들어간다.
		//값이 0이 없을 경우도 있으므로 numbers에 값을 넣고
		//그 다음에 max, num 지정 후 비교. 
		Scanner s =  new Scanner(System.in);
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(i+1+"번째 값 입력");
			numbers[i]=s.nextInt();
		}
		
		//가장 첫번째 값으 max, min으로 가정.
		int max = numbers[0];
		int min = numbers[0];
		
		//foreach 이용하기 (자바스크립트의 for of 구문이랑 유사) : 배열의 길이만큼 반복하면서 값 가져오는거 ㅇㅅㅇ
		for(int i :numbers) {
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		
		//for문 이용하기
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>max)
				max = numbers[i];
			if(numbers[i]<min)
				min=numbers[i];
		}
		
		System.out.println("최댓밦은"+max);
		//String.format= c의 printf와 유사.
		System.out.println(String.format("최솟값은 %d\n", min));
	
	}
}
