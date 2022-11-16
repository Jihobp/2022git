package javastudy13_1011_TryCatch_Throw_exception;

import java.util.Scanner;

public class J1011_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력한 문자열을 숫자로 바꾸는 두가지 바식이 있다.
		Scanner s = new Scanner(System.in);
		//1. nextInt를 활용
		System.out.println("숫자 입력해");
		int num = s.nextInt();
		//그러나 ! 이렇게 입력할 경우 다음에 nextLine 입력이 안됨
		
		String name = s.nextLine();
		System.out.println("num="+num+", name"+name);
		
		//2. Integer.parseInt 활용
//		System.out.println("다시 숫자 입력");
//		int age = Integer.parseInt(s.nextLine());
//		System.out.println("문자열 입력");
//		String alias = s.nextLine();
//		System.out.println("age="+age+", alias="+alias);
//		
//		System.out.println("문자열을 숫자로 변환");
//		age = Integer.parseInt("이동준"); //이 부분에서 에러가 남!!!!
		
		//중간에 nextLine을 적을 필요가 없음.
		try {
			System.out.println("다시 숫자 입력");
			int age = Integer.parseInt(s.nextLine());
			System.out.println("문자열 입력");
			String alias = s.nextLine();
			System.out.println("age="+age+", alias="+alias);
			
			System.out.println("문자열을 숫자로 변환");
			age = Integer.parseInt("이동준"); //이 부분에서 에러가 남!!!!
		} catch (Exception e) {
			System.out.println("age값이 잘못되었습니다.");
			e.printStackTrace(); //오류출력.
			//오류는 출력하되, 밑에 있는 코드는 실행한다.
			//왜냐면 종료된 게 아니고, 오류만 보여준다. 코드는 계속 실행함.
			
		}
		System.out.println("끝");	//이 부분을 싱행하지 않음.
		
		/*
		 * 생성자 : 함수와 형태가 비슷함. 똑같다. 
		 * 함수 : 원할때마다 불러오기 가능
		 * 객체 object 생성할떄 한번만 가능, 이미 생성된거 다시 못썸.xxxx 태어날대 한번만. 재뢓ㄹ용x.
		 * 객체 생성과 동시에 함수 실행.이게 더 효율적. Circle c2 = new Circle(2)
		 * private 은 get은 무조건 !! 많이 씀.
		 * 생성자 초기화하면 안씀.
		 * get이 반강제로 많이쓰고, set은 new Circle 형태로.*/
	}

}
