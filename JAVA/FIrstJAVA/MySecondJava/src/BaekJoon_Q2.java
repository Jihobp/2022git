import java.util.Scanner; //백준2번 #10818 //
public class BaekJoon_Q2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		int num=s.nextInt(); //입력값 개수 //f.자료형 변수이름=함수이름()???????     Mem! // 인트타입 num 변수는 nextInt();안에 들어가 있다??
		int input[]=new int[num]; //new int의 num이 들어가있는 int input[]배열
		for(int i=0;i<num;i++) {
			input[i]=s.nextInt(); //값 하나씩 입력받음
		}
			
		int max=input[0];	//최댓값 저장					
		int min=input[0]; 	//최솟값 저장
		for(int i=0; i<num; i++) {
			if(max<input[i]) {max=input[i];} //max가 지금 입력된 것보다 작으면, 당연히 max 바
			if(min>input[i]) {min=input[i];}	//min 만보고
		}
		
		System.out.println(min+" "+max); //공백 무조건 출력, 순서 외우기!!!
		
		
		
		
//		for(int i=0; i<6;i++) //6과목 아니겠지? 4과목을 체크한다. 
//			for(int j=0;j<4;j++)
//			{
//				if(num[i]>num[j]) 
//				{
//					temp=num[j];
//							num[j]=num[i];
//									num[i]=temp;
//									
//									continue;
//				}
//			}	
//		//sum +=num[i];//쓸거면 sum을 0으로 초기화
//			
//		for(int k=0;k<1;k++) {	
//			if(num[4]>num[5]){
//					sum+=num[4];}
//			else(num[5]>num[4]){
//					sum+=num[5];
//							}
//		}		
	//	
//		System.out.println(+sum); //f.
		
	}

}
