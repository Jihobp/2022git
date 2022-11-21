import java.util.*;
public class java0825_BaekJoon_11720 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		
		
		
		int N=s.nextInt(); 			//N 변수 선언
		String n=s.next();	//n개의 숫자 입력받고,(데이터 입력) 
		//nextLine은 오류 잘난다.
		char arr[]=n.toCharArray(); //메모리 할당해야하므로 
		//문자열로 받아서, char형 배열에 String 형태로 넣어서 입력받는다.
		//ax.	toCharArray() ; 문자열을 char 배열 형태로 반환해주는 메소드-함수.
		//메소드로 character 배열로 만들고 하나씩 배열에서 꺼내서 쓰는 방법.
		int sum=0; 					//합 변수 선언
		
		//문자열로 받아서,
		//문자로 만들고,
		//그 문자를 숫자로 바꿔서, >> 문자를 아스키코드로 바꿔서 해라.
		//하나씩 합쳐라.
		
		//Q. char를 int로 바꾸는 법은 ??? 
		//0을 의미하는 48을 빼면 자신의 수를 가질 수 있당!!!! 
		
		for(int i=0; i<n.length(); i++) {
			sum +=n.charAt(i)-48; //'0'을 집어넣어도 ok!!!!! 
			//문자열 n을 받아서, char로 쪼갠 배열.
			//arr[i]는 안됨.//sum +=n.charAt(i);안됨 //문자를 더할 순 없으니까. 
			//n.toCharArray(); 안됨. 
			//나는 문자열n이 들어간, char 쪼갠 배열에 i를 넣어서!!!!!!! 더하고 싶단말이야!!
			//아스키코드 형태로!!!
			
		}
		System.out.println(+sum);
	}
}
