package javastudy13_1011_TryCatch_Throw_exception;
import java.util.*;
public class BJ_2588_arr_String {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//Scanner를 써서 int 타입 n, String 타입 num을 입력받는다.
		//1. toCharArray 배열을 쓴다. 
		//2. charAt을 써서 그냥 num에 대한 자리수를 참조도 가능.=문자열의 인덱스 위치에 있는 문자(character) 값 반환,
		//0-1-2-번째에 있는 숫자 3-8-5 반환.
		//String num=385; 면 int result=num.charAt(0); 값이 result='3'이란 말. 3 XX!!!! 즉, reuslt 51 저장!
		//문자열 인덱스를 참조하고 -'0'을 해줘야, 숫자 그대로의 값을 쓸 수 있다.
		
		int n=s.nextInt();	//	472
		String num=s.next(); //	3	8	5 num 숫자 입력받고,(데이터 입력) 
		char [] arr=num.toCharArray();
		//메모리 할당해야하므로 
				//문자열로 받아서, char형 배열에 String 형태로 넣어서 입력받는다.
				//ax.	toCharArray() ; 문자열을 char 배열 형태로 반환해주는 메소드-함수.
				//메소드로 character 배열로 만들고 하나씩 배열에서 꺼내서 쓰는 방법.
		//여기서 문자
		// (n*(num.charAt(2)-'0'));  num이란 문자열의 charAt(2)번째 값에서 0을 빼준다.
		
		System.out.println(n*(arr[2]-'0'));	// || (n*(num.charAt(2)-'0'));
		System.out.println(n*(arr[1]-'0'));
		System.out.println(n*(arr[0]-'0'));
		
		//결과는 문자형. 
		//문자열을 int 로 바꿔서 곱하기...? 
		System.out.println(n*Integer.parseInt(num));//문자를 정수로 바꾸는 함수
	}
}
