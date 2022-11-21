import java.util.*;
public class java0824_BaekJoon_2480_if_dice {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		//주사위 세개
		//최댓값
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int max=0;
		
		//다른눈 크기비교
		//if(a != b && b!=c && a!=c ){
			//여기서 max 값을 받는 이유는 여기서만 max값 출력되서? 
			//a가 클때, c가 a보다 클때
		
		//조건은 한번에 하나씩 밖에 비교 못한다!!!
			if(a>=b && a>=c) {max=a;}
			else if(b>=a && b>=c) {max=b;}
			//b가 클때, c가 b보다 클때
			else if(c>=a && c>=b) {max=c;}									//if(b>a) {
												//if(c<a) {b=max;}
												//else{c=max;}			//(c>b)


			//같은 눈 3개 
		if(a == b && a == c)
		{
		System.out.println(10000+max*1000);
		}
		//같은 눈 2개 - a가 b랑 같거나, c랑 같을 때
		else if(a==b || a==c )
		{
			System.out.println(1000+a*100);
		}
		//b랑 c랑 같을 때
		else if(b==c)
		{
			System.out.println(1000+b*100);
		}
		else System.out.println(max*100);
			
	}	
}
