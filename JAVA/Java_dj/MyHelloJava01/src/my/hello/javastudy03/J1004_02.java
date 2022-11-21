package my.hello.javastudy03;

import java.util.*;

public class J1004_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://coding-factory.tistory.com/551 겅부
		
//		3. Scanner로 입력한 숫자보다 작은 숫자를
//		삭제한다.
//		ex) 10 20 30 40 50 이렇게 ArrayList에 담고
//		25 적으면 25미만의 숫자들 Remove한다.
//

		
		// 배열 : 크기가 고정되고 특정 인덱스에 값 수정함
		// ArrayList : 크기가 고정되어 있지 않음
		// 대신 값이 이미 들어간 부분에 대해서는 값 수정가능
		// 그리고 특정 부분 삭제 가능 - > 삭제하면 길이가 변함 ㅇㅅㅇ

		// 표기법 두가지가 있다.
		// 일단 첫번째 방식으로 표기할것.

		// Integer // int 타입 , 즉 정수를 클래스타입 객체로 만든것.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// 이 방식을 이해하려면 알아야 하는 지식
		// 다형성이랑 인터페이스를 알아야 이해 가능
		List<Integer> numbs = new ArrayList<Integer>();

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 숫자 입력하기");
			// 숫자 입력해서 바로 집어넣는다.
			numbs.add(s.nextInt());
		}
		// foreach 적고 ctrl space !!!!
		// ctrl shift f 는 코드 정렬!!!!
		for (Integer integer : numbs) {
			System.out.println(integer);
		}

		// 끝에서부터 앞으로 지우는 방식, 값을 지울땐 역for문을 슨다.
		// 길이가 5라면 4 3 2 1 0 이렇게 for문이 돌아감
		System.out.println("몇 미만의 숫자를 지울까요?");
		int cutline = s.nextInt();
		for (int i = numbs.size() - 1; i >= 0; i--) {
			if (cutline > numbs.get(i)) // get(i), i번쨰 값 읽음
				numbs.remove(i); // remove(i), i번재를 아예 지워버림 ㅇㅅㅇ
			////??!!! get > num[i]번재를 가져오는데 arraylist라서 get(i) ; 자바배열과 표현이 다를뿐 
		}
		for (Integer integer : numbs) {
			System.out.println(integer);
		}

		// arrayList는 값을 set 하는 것도 된다,

	}

}
