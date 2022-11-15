package javastudy14_1012;

import java.util.*;

public class J1012_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		try {
			a = 10;
			b = 0;
			System.out.println("c 값을 구해보자. ");
			c = a / b;	//에러남. try catch 안하면 여기서 프로그램이 ㅌ종료댐.......
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("이 부분에 문제 있음.");
		}
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
