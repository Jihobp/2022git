import java.util.*;
/*"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
 * 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 	* 1) 배열로 풀기 
 	* 2) 재밌게 풀기?????????????????????????????????????? 세룡짱이 뭐라했더라..
*/


public class java0826_BaekJoon_8958 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		//매개 변수
		// 출력할 o의 개수 -->>> 문자니까 문자열로 받아야함 문자열 배열.
		// 더할 값 sum
		
		
		//String index=new String(); //String을 가진 index를 만드는데, 새로운 스트링 배열을 만든다 
		//String index1[]=new String[5]; //배열 하나는 괄호, 여러개는 대괄호
		//int[] index2=new int[5];
		//int o=s.nextInt(); 
		
		//o가 나오면 카운트를 하나 증가,
		//sum에 더해주고,조건문
		//x가 나오면 카운트를 0으로 초기화,
		
		
		int xoxo=s.nextInt(); //ox입력받음,
		int cnt=0;
		int sum=0;		//ox 개수세기, 더하기	
				
		for(int i=0; i<xoxo; i++) {			//입력 받은 만큼 반복
			String ox=s.next();				// ox 문자를 받을 문자열 배열 선언.  
			char [] arr=ox.toCharArray(); 		//배열 한글자씩 짤라서 배열로 바꾼 것. 
			for(int j=0; j<arr.length; j++) {	//배열 길이만큼 반복	
				if(arr[j]=='O') { //arr[i]번째에 o가 들어가 있다.		//==ox.CharAt(j)
					cnt++;			//카운트 ++
					sum +=cnt;		//카운트를 더한값이 sum
				}
				else if (arr[j]=='X'){	//arr[i]번째에 x 가 들어가 있다.  //(arr[i]=='X'
					cnt=0;						//카운트 0;
				}
				//System.out.println();
			}
			System.out.println(sum);
			cnt=0;		//한번 돌때마다 새로운 값 초기화			
			sum=0;	
		}

		//Code sql = query = select 문 =질의문
		//structed query language 구조 질의 어.
		//배운걸로 프로젝트 진행가능, 모르면 갓 구 글. 
		//sql문제 > sql 고득점문제, 연습 사이트 ㅇㅅㅇ??????????????? 하기싫..args..>>공유폴더 깃허브. 
	/*1. 기초 crud (create table)
	 *(select-read update delete insert)
	  (update, delete 는 where 절 간단히 쓸 줄 알기)
	  
	  2. pk, fk 개념 이해
	  
	  3. gropu by, having 이해
	  4. join, view, 중첩질의
	  -------------------------
	  5. 프로시저 함수 트리거 (PL SQL  이런거까진 자세히 알건 없다)
	 **/
		
		
		
		
		//https://hellodoor.tistory.com/68
	/*
	 String ox=s.next();						//ox 입력받음
	 char [] arr=ox.toCharArray();			//배열 입력받음
	 int cnt=0, sum=0;						//ox 개수세기, 더하기	
	 
	 for(int i=0; arr.length()<i;i++){		//배열 길이만큼 반복
	 	cnt++;
	 	sum +=cnt;}
	 	else if(arr[i]=='x'){
	 	cnt=0;
	 
	 } 			
	 */
	}
}
