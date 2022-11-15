package javastudy13_1011_TryCatch_Throw_exception;
import java.util.*;
public class tbj_InputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("첫번쨰?");
		String num1=s.nextLine();
		System.out.println("두번째?");
		String num2=s.nextLine();
		int n1 = 0;
		int n2 = 0;
		try {//입력된 값들을 숫자로 변환할 것....
			n1 = Integer.parseInt(num1);	//둘중에 하나라도 이상한 값이 들어감? ex문자열, 
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {		//catch 부분으로 빠지고, n1=0 초기값 띄우고 빠짐.
			System.out.println("잘못된 값 들어감");
			n1=0;
		}
		if(n1!=0) {
			System.out.println(n1*(n2%10));
			System.out.println(n1*((n2/10)%10));
			System.out.println(n1*(n2/100));
			System.out.println(n1*n2);
		}
		System.out.println("프로그램을 종료합니다. 감사합니다.");
	}

}

//두 개의 숫자를 입력한다.(단 둘 다 문자열로써 받아오는 것이다.)
//1) 첫번째 숫자 곱하기 두번째 숫자의 1의 자리 수(472*5)
//2) 첫번째 숫자 곱하기 두번째 숫자의 10의 자리 수(472*8)
//3) 첫번째 숫자 곱하기 두번째 숫자의 100의 자리 수(472*3)
//4) 첫번째 숫자 곱하기 두번째 숫자(472*385)
//ex) 첫번째 숫자 : 472
//    두번째 숫자 : 385
//    출력 결과 : 2360, 3776, 1416, 181720
//
//위 문제를 풀어보시오.
//1. try catch 이용
//=> 엉뚱한 숫자 입력할 경우
//숫자를 0으로 바꿔버리기
//2. s.nextLine으로만 숫자 입력받기
//3. 나머지 연산자로도 함 풀어보기
//4. 나누기와 나머지 연산말고
//문자열 연산으로 해보기
//(구글링이 필요할 수도 있음)
//charAt이 필요할 수도 있음