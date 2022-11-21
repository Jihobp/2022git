import java.util.Scanner;

public class BeakJoon10987 {
	public static void main(String args[]) {
		// 백준 10987번 코드 : 모음의 개수
		Scanner s=new Scanner(System.in);
		String st=s.next();
		char ch[]=st.toCharArray();
		// ch와 st의 값을 공유가 되지 않는다.
		// 단지, st의 값을 ch가 복사해서 가져왔을 뿐임
		
		int cnt=0;	// 모음 개수 저장할 변수
		for(int i=0;i<st.length();i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				// 이 조건문을 만족하면 현재 값을 모음이라는 뜻
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
