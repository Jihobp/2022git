import java.util.Scanner; //백준 4번 #10869
public class BaekJoon_Q4 { //Main으로 바꿔 !!!!!!!!!!!!!pl;z!!!!!!!!!!!!!!!!11111
	public static void main(String args[]){ //이건 소문자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!plz!!!!!!!!!!!!!!!!!!!!!!!!!!
		Scanner s = new Scanner(System.in); 
			//	백준 4번 알파벳 바꾸기 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 
			// 	대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
			//'A' 아스키코드 : 65
			//'a' 아스키코드 : 97
			String text=s.nextLine(); 		//fix.★ 
			char[]str = text.toCharArray(); //fix.★str 배열은 별개!
	
			for(int i=0;i<text.length(); i++) //fix.★ 
				{
					if(65<=str[i] && str[i]<=90) 
					{
						str[i]=(char)(str[i]+32); //소문자로 바꾼다
						continue; //있어도 업어도 ok
					}
				
					if(97<=str[i]&&str[i]<=122)
					{
						str[i]=(char)(str[i]-32); //대문자로 바꾼다
						continue;
					}
			
				}
			System.out.println(str); //fix.★변형시킨건 스트링
	
			
			//별 5개 출력
			int in=s.nextInt();
			for(int i=0;i<in;i++) { //행출력
				for(int j=0;j<=i;j++) { //열출력 >> 계속 출력
			System.out.print("*");
				}
			System.out.println();
			}
	
	
	
	}
	
}
