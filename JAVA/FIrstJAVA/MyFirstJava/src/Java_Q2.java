import java.util.Scanner;
public class Java_Q2 {public static void main(String[] args) {

	int[]count =new int[26]; 
	Scanner sc = new Scanner(System.in);
	String str; 	//String str ="javajavajajabibiqyumhumyumyummy";
	System.out.println("당신이 원하는 문자열은?");
	String str=sc.nextLine(); //입력을 nextLine() 쓰기 전에 엔터키 입력받고 버리도록 하기
	for(int i=0; i<str.length();i++)
	{
		char ch=str.charcharbaby().charAt(i);//
		if(Character.isLetter(ch))
			cnt[ch-'a']++;
	}
	System.out.println("--각 문자의 수--");
	for(int i=0; i<26; i++) {
		System.out.println((char)(65+i)+":"+cnt[i]);
	}

}


	/*쉬는 시간~~~
	 *1. 입력된 알파벳 문자열의 각 글자들이 해당 문다열에서 몇 번씩 나왔는지 출력하시오.
	 *(소문자만 입력받음, 출력하는 순서는 사전순으로)
	 *e.f) leedongjoon
	 *'d'는 1글자입니다.
	 *'e'는 2글자입니다...
	 *
	 *need) a~z까지 몇글잔지 출력해야한다. 
	 *
	 *
	 *2. 입력된 알파벳에서 각 알파벳이 최초로 등장하는 위치 출력하시오. (소문자만 입력받음, 출력하는 순서는 사전순으로)
	 *e.f) aabbcc
	 *a는 1번째에서 처음 등장합니다.
	 *b는 3번째에서 처음 등장합니다.
	 *c는 5번째에서 처음 등장합니다.
	 *
	 *3. 사용자에게 현재 월을 입력받아 계절을 출력하는 프로그램을 작성하시오.
	 *오후 3:48 2022-08-02
	 *
	 *4. 특정년도를 입력받아 해당 년도가 윤년인지 아닌지를 출력하시오.
	 *- 윤년 : 4의 배수이면서 100의 배수가 아닐때 / 400의 배수일때
	 *ex) 2014년 ->4의 배수이며 100의 배수 아니라 "윤년"
	 *ex) 1900년 -> 100의 배수이며 400ㅇ,; 베승;ㄱ; 떼ㅔ믄ㅇ[ "윤년이 아님"
	 *
	 */
	
}
