package my.hello.javastudy02;
import java.util.*;
public class JavaStudy_01_List {
	public static void main(String[] args) {
		//배열
		//선언과 동시에 크기가 정해짐
		int[] numbers = new int[5];
		//ArrayList(-List라고도 부름.) ; jsp, java에도 많이 쓰인다.
		//hashmap? 도 많이 쓰인다 ㅇㅅㅇ>;ㅣ;ㄹ;ㄷ;ㅅ;;; hashbrown 먹규 싶도ㅑ.
		//배열과는 다르게 선언 당시엔 크기가 0
		ArrayList<Integer> nums 
		= new ArrayList<Integer>();
		
		//값을 할당해 보는 것(배열) - >  하나 하나 값을 할당한다. 
		numbers[0] = 10;
		numbers[1] =30;
		
		//값을 읽어들이는 것(배열)
		System.out.println("첫번째값:" +numbers[0]);
		
		//값을 추가하는 것
		nums.add(10); //js의 push처럼 새로운 값이 추가됨.
		//js의 배열처럼 임의의 위치에 값을 추가하진 못함.
		nums.add(30);
		
		//특정번째의 값을 수정해보기.
		nums.set(0, 20); //첫번쨰 값을 20으로 수정
		System.out.println(nums.get(0));//첫번째 값을 읽음
		
		//foreach 적고 ctrl space 하면 생기는 코드
		//배열의 길이만큼 반복문을 수행하고 (반복문 돈다)
		//콜론(:) 앞에 있는건 배열안에 있는 구성요솓들
		for (Integer integer :numbers) {		//??
			System.out.println(integer);
		}
		
		//숫자를 저장하는 배열.
		// 10 30 0 0 0적힌 이유는 ?  - > 배열의 길이가 5이고, 2,3,4번쨰는 기본값인 0이 있음.ㅇㅅㅇ;;;;;
		//c의 동적배열이랑 비슷하게, 배열의 길이가 늘어났다 줄었다 하는거. 
		nums.remove(0); //첫번째 깞 삭제
		nums.add(100);
		nums.add(30);
		nums.add(30);
		nums.remove((Integer)30);  //값이 30인거 삭제
		System.out.println("----");
		for(Integer integer :nums) {
			System.out.println(integer);
		}
		
		
		for (Integer integer : nums) {	//20, 30 나옴. 이유는 10> 20으로 바뀌고, 30으로 바뀌어진다.
			System.out.println(integer);
		}
		
	}
}
