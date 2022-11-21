package b;
import java.util.Scanner;
import a.*;
public class B {
	public static void main(String args[]) {
		//import 통해서 외부 패키지를 포함하면
		//외부 클래스에 대한 객체 생성 가능
		A a=new A();		
		
		a.pub=1;
		// public 정상 접근
		//a.pri=2;
		// private 비정상 접근
		a.pro=3;
		// protected 비정상 접근
		
		//클래스 접근 제어자????????????????????ㅇㅅㅇ?????????????
	}
}
