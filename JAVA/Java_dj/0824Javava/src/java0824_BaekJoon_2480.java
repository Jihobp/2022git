import java.util.*;
public class java0824_BaekJoon_2480 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		/*1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
		1. 3번 주사위를 돌린다. +6개의 눈을가진.!!!
		2. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. //if문
		3. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. //if문
		4. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  //if문
		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.*/
	
		//1>4>5 번 순으로 풀기
		
		//주사위 3개
		//최댓값
		//if문 다 써도 상관없는데, 길어지면 for문 쓰는게 낫다.
		
		int dice1=s.nextInt();
		int dice2=s.nextInt();
		int dice3=s.nextInt();
		int max=dice1; 			//최댓값을 임의의 숫자로 갱신하면 된당 ㅇㅅㅇ
		
		if(dice1 == dice2 && dice1 == dice3)	 //1,2비교 1,3비교 같은눈이 3개!
		{
			System.out.println(10000+dice1*1000);
		}
		else if(dice1 == dice2 || dice1==dice3) //같은눈이 2개!
		{
			System.out.println(1000+dice1*100);
		}
		else if(dice2 ==dice3) 					//같은 눈이2개! 2번
		{
			System.out.println(1000+dice2*100);	//dice 2나 3 넣어주면 ok
		}
		else { //마지막조건, else는 ()조건 없이 바로.
			if(max<dice2)
				max=dice2;
			if(max<dice3)
				max=dice3;
			System.out.println(max*100);
		}
	}
}
