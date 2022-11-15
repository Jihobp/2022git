import java.util.*;
public class java825_BaekJoon_10818 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		/*N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		입력
		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

		출력
		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/
	
		//정수 n개
		//배열 필요하다.
		
		int n=s.nextInt();
		int min=1000000;		//min은 작은 수 나올때마다 갱신. 이미 넣어놓으면 갱신안됨. -최댓값
		int max=-1000000;		//max 값을 찾을땐 작은 수를 넣어서 갱신되게 해야함.-최솟값
							//배열에서 찾을땐 제일 처음에 나오는 값을 min max에 넣고 갱신되게.
		int []numarr=new int[n];
		for(int i=0; i<numarr.length; i++) {
			numarr[i]=s.nextInt();
			if(numarr[i]<min) {
				min=numarr[i];
			}
			if(numarr[i]>max) {
				max=numarr[i];
			}
		}
		System.out.println(min+" "+max);
	}
}

/*
 * 		
		int num=s.nextInt(); 
		int input[]=new int[num]; 
		for(int i=0;i<num;i++) {
			input[i]=s.nextInt(); 
		}
			
		int max=input[0];						
		int min=input[0]; 	
		for(int i=0;i<num;i++) {
			if(max<input[i]) {max=input[i];} 
			if(min>input[i]) {min=input[i];}	
		}
		
		System.out.println(min+" "+max); 
	}

 */ 
