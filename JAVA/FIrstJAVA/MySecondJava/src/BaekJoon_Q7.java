import java.util.Scanner; //
public class BaekJoon_Q7 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
		//첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
		//별은 가운데를 기준으로 대칭이어야 한다.
		int star = s.nextInt();
		for (int i = 0; i < star; ++i) { // 행출력 //Y????????? 정확한 이해가 필요하다. 연산후 출력이기 때문에????????
			for (int j = 1; j <= star-i; ++j) { // 열출력 , *, ()
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


//별 5개 출력
//int in = s.nextInt();for(
//int i = 0;i<in;i++)
//{ //행출력
//	for(int j=0;j<=i;j++) { //열출력 >> 계속 출력
//System.out.print("*");
//	}
//System.out.println();
//}