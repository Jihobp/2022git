import java.util.*;

public class BaekJoon_Q3_SR {
	public static void main(String args[]) {
		int[] arr1 = new int[4];
		int[] arr2 = new int[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int sum = 0;					//r 배열이니까, 거꾸로 뒤에서 부터 3,2,1번째로 큰 수 출력!!! 그러니까, i--!!!! 			
		for(int i = 3; i > 0; i--)  {  //(int i=0; i<3; i++) vs(int i = 3; i > 0; i--) 
			sum += arr1[i];			   //i--... arr1[i] 정렬한 배열들 다 더해쥰다..
		}
		for(int i = 1; i > 0; i--) {  //i--.... arr2[i] 정렬한 배열들 다 더해준댱.
			sum += arr2[i];
		}
		
		System.out.println(sum);
	}
}
