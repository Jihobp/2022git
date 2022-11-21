import java.util.*;
public class java0824_BaekJoon_2562 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		//1. 9개의 서로 다른 자연수가 주어질 때, 
		//2. 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		//예를 들어, 서로 다른 9개의 자연수
		//3, 29, 38, 12, 57, 74, 40, 85, 61
		//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.	
		
		//int num=s.nextInt();		//입력받을 숫자 9개 for문 안에서 출력해줘야
		//다른 숫자가 9번 출력된다
		
		int []numbers=new int[10]; 	//배열은 10개로 설정.
		int max=0;	//최대값 ==0으로 초기화해줘도 ok
		int index=0; 	//몇번째 ==0으로 초기화해줘도 ok
		
		//9개받으려고 배열 할당해주고 싶은데 문법을 모르겠어요..
		//int arr[i]=s.nextInt(); 
		//배열 만들고, 숫자 넣어주는 작업 해줘야 한다!!!!!!!!!
		
		for(int i=0; i<9; i++) { //0부터 9까지면 +1 해줘야함. 
			numbers[i]=s.nextInt();	//입력받을 숫자 9개
			//numbers[i]=s.nextInt();
			for(int j=0; j<9; j++) {
			if(numbers[j]>max) {
				max=numbers[j];
				index=j+1;
			}
		}
	}
		System.out.print(max+ " "  + index);
	}
}






/*
//배열생성
		String[] names = new String[3]; // 배열의 길이 설정
		int[] numbers = new int[3];

		// 배열의 길이
		int size = names.length;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < size; i++) {
			// 문자열 입력
			System.out.println("이름을 입력하세요");
			names[i] = sc.next();

			// 숫자형 입력
			System.out.println("숫자를 입력하세요");
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.println(i + "번째 이름:" + names[i] + ", 숫자:" + numbers[i]);
*/