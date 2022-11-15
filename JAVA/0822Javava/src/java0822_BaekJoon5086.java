import java.util.*;
public class java0822_BaekJoon5086 { //나머지 연산자 이용
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//factor약수, multiple배수, neither둘다아님
		//int는 while 문 안에서 돌려야 됨!!!!!!!
		while(true) {
			int a=s.nextInt(); //첫번째 숫자
			int b=s.nextInt(); //두번째 숫자
		if(a==0 && b==0) 
			{
				break;
			}
		
			// 나머지 연산자 사용
			// "첫번째 숫자가 두번째 숫자의 약수이다."
			// "두번째 숫자가 첫번째 숫자의 배수이다."
			else if(a%b==0)
			{
				System.out.println("multiple");
			}
			else if(b%a==0)
			{
				System.out.println("fzctor");
			}
			else
			{
				System.out.println("neither");
			}
		}
	}
}

