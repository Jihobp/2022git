package javastudy13_1011_TryCatch_Throw_exception;

import java.util.*;

public class J1011_Throw {

		// TODO Auto-generated method stub
		
		//함수를 만들어서 에러 던질수 있다.
		//두개의 숫자를 입력받아서 총 합을 리턴하는 함수,
		//throw 예외를 던지다
		public static int sum(int start, int end) throws Exception {
			if(end<start)
				throw new Exception("start와 end 순서 잘못됨");
			else
			{
				int sum = 0;
				for(int i =start; i<=end; i++) {
					sum+=i;
				}
				return sum;
			}
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				System.out.println("안녕하세요.");
				throw new Exception("에러!!!"); //에러를 일부러 던짐
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				int num = sum(10,1);	//sum이라는 메소뜨가 경우에 따라서는 값을 반환하지 못한다. 
				System.out.println(num);
			} catch (Exception e) {
				e.printStackTrace(); //start와 end 순서 잘못됨
			}

	}

}
