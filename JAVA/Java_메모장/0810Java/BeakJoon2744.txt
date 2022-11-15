import java.util.Scanner;

public class BeakJoon2744 {
	public static void main(String args[]) {
		// 백준 2744번 코드 : 대소문자 바꾸기
		Scanner s=new Scanner(System.in);
		String st=s.next();	// 입력받기
		// char ch[]=st.toCharArray();
		
		// 'A' 아스키코드: 65
		// 'a' 아스키코드: 97
		for(int i=0;i<st.length();i++) {
			// charAt(): 값 참조는 가능하지만 값 변경은 불가능
			if(st.charAt(i)>='A'&&st.charAt(i)<='Z') {	// 대문자인 경우
				System.out.print((char)(st.charAt(i)+32));
			}
			else if(st.charAt(i)>='a'&&st.charAt(i)<='z') {	//소문자인 경우
				System.out.print((char)(st.charAt(i)-32));
			}
		}
	}
}
