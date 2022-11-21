package javastudy13_1011_TryCatch_Throw_exception;

import java.util.Scanner;

public class tbj_StringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하고 밑에꺼 임포트
		Scanner s= new Scanner(System.in);
		
		System.out.println("첫번째 숫자?");
		String num1 = s.nextLine()	;
		System.out.println("두번째 숫자?");
		String num2 = s.nextLine()	;
		
		//1.	toCharArray 랑 배열 연산자 쓰는 경우
		//2.	CharAt을 쓰는 경우가 있다.
		//3.	그리고 아스키코드 이기 때문에 글자 '0을 빼서 숫자를 구하거나
		//4. Character.getNumericValue('1') 이걸 쓰기도함. 
		
		
		//★문자열 인덱스를 참조하고 -'0'을 해줘야, 숫자 그대로의 값을 쓸 수 있다. >> 문자열 - '0' 공식!!!!
		// (n*(num.charAt(2)-'0'));  num이란 문자열의 charAt(2)번째 값에서 0을 빼준다. >>숫자나옴.
		int n1=0;
		int n2=0;
		try {
			n1=Integer.parseInt(num1);
			System.out.println(n1*num2.charAt(2)-'0');
			System.out.println(n1*num2.charAt(1)-'0');
			System.out.println(n1*num2.charAt(0)-'0');
			System.out.println(n1*n2);
		} catch (Exception e) {	//코드가 정상이면 실행하지 않는다. =예외처리 = catch, exception 예외를 잡다..
			n1 =0;
			System.out.println("숫자 오류!");
			e.printStackTrace();//오류 메세지 찍고 싶을 떄.
		}
		System.out.println("프로그램 끝!!!");
	}

}
