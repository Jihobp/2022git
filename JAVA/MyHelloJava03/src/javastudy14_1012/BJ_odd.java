package javastudy14_1012;

import java.util.Scanner;

public class BJ_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		
		//2. 문자열 입력 후 역출력하기
		System.out.println("문자를 입력하세요");
		String txt = s.next();
		String rvs = "";
		
		for(int i=txt.length()-1;i>=0;i--)
		{
			rvs = rvs+txt.charAt(i);
		}
		System.out.println(rvs);
		
		
		//2.2 버퍼 쓰기
		System.out.println("문자를 입력하세요");
		String str = "eokppd";         // 문자열 reverse        
		StringBuffer sb = new StringBuffer(str);        
		String reverse = sb.reverse().toString();         // 결과 출력        
		System.out.println(sb); // "EDCBA"        
		System.out.println(reverse); // "EDCBA" 

		
		//3. 바이트 값 입력 시 비트값 출력. 
	}

}
