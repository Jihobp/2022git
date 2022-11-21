import java.util.*;
public class java0823_BaekJoon_2884 { //상근이의 시계야...
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
	
		int h=s.nextInt();
		int m=s.nextInt();
		
		//45분,=0 그냥 시간 출력.
		//45분보다 빠른경우 >> 미만일때, 1시간 빼주자.
		//45분보다 늦는경우 >> 초과일때, -45 (ex 55분? -45)
		
		if(m==45) { //45분일경우
			m -=45; //m==0 도 ok, 45분 빨라야하니까.
			System.out.print(h+ " "  + m);
		}
		
		else if(m<45) { //45분보다 빠를때, 1시간 빼주자.
			if(h==0) {
				m+=15;	//+15 도 ok, 어짜피 45분 빼야해서.
				h +=23; //정시면 0이 되니까,
				System.out.print(h+ " "  + m);
			}
			else{
				m+=15;
				h-=1;
				System.out.print(h+ " "  + m);
			}
		}
		else if(m>45) {	//45분보다 늦을때, -45
			//m = 60; zzzzㅋㅋㅋ 무조건 60 넣으면 15가 나옵니다...ㅜㅜ
			m -=45;
			System.out.print(h+ " "  + m);
		}
	}
}
