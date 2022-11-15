import java.util.*;

public class java0822_BaekJoon2153 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String Arr1 = s.next(); // 문자열을 받았습니다.
		char arr[] = Arr1.toCharArray(); // 배열 나눠준당.
		int sosucheck = 1;// 기본적으로 일단 소수로 간주
		int sum = 0; //

		for (int i = 0; i < Arr1.length(); i++) // 문자의 길이만큼 이 포문을 돌립니다.
		{
			char sosu = arr[i]; // a = 97 Y. 문자의 값. i번째에 잇는 값.
			if (sosu >= 65 && sosu <= 90) // 대문자 65=A, 90=Z
			{
				sosu -= 38; // 27~52,합쳐지게. (대문자A65-조건에서 대문자A27)
				// 65를 27로 만들어랭.. 그래서 38을 뺌. the end.
			} else if (sosu >= 97 && sosu <= 122) // 소문자
			{
				sosu -= 96; // 1~26, -96을 해서 1~26까지 값을 나오게 한것.
				// a=97, z=122 // 97-96=1;
			}
			sum += sosu;
		}
		// 소수는 1과 자기자신을 제외한 모든 수로 나눠지지 않는 수를 소수

		for (int i = 2; i < sum; i++) { // 소수니까 2보타 커서 sum 더한 값보다 작을때까지, 나누기가 0이면 소수가 아니니까.
			if (sum % i == 0) // {sosucheck =0; break;}} //0이면소수가 아니니까 sosucheck =00거짓
			{
				System.out.println("It is not a prime word.");
				return;		//return은 함수안에서 돌아가는데, 메인이 함수다 ㅇㅅㅇ
				//break 를 하면 for문 밖에 나가서 it is a prime word도 출력하기 때문에,
				//이 if 문 안에서 return 종료하고 다시 출력!
				//break 쓰고 싶으면 boolean(c-bull) 선언 만들어서, false 냐 true 냐 체크해서 빠져 나가게.
			} // else 필요x for문 밖 // 소수아님!
			// if(sosucheck ==1) sum=4, i=2, i=3, i=4,
			//return; // 한번만 말하게 끝낸다!!! break 는 for문 바깥으로 나가는거니까 무조건 밑에 프린트 출력함
			// else 쓰면 계속 출력될것 ㅇㅅㅇ
		}
			System.out.println("It is a prime word.");	
			
			/*for (int i = 2; i < sum; i++) { 
				if (sum % i == 0) {sosucheck=0; break;}}
	        if(sosucheck==1)
	        {System.out.println("It is a prime word.");}  
	        else
	        {System.out.println("It is not a prime word.");}*/
	
	}
}
