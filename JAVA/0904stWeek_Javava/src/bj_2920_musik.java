import java.util.*;
public class bj_2920_musik {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.
		// c는 1로, d는 2로, ..., C를 8로 바꾼다.
		// 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed
		// 이다.
		// 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

		// int [] arr= {1,2,3,4,5,6,7,8};

        
        int[] index = new int[8]; //8개가 들어있다.
        String musik = ""; //순서
        //자바는 배열 초기화를 따로 해주지 않으면 0으로 자동 초기화.
        //문자열은 아니라 정수만 받으므로 String x
        
        for (int i=0; i<8; i++) { // 배열의 크기만큼 반복
            index[i] = s.nextInt();
        }
	    
        	for (int i = 0; i < index.length - 2; i++) { // i<8 배열-1 -> 밑에서 i+1번쨰까지 비교를 하기 때문에 i=7일경우, i+1해서 범위를 벗어나게 된다. 그래서 index.length -2.
			if (index[i] == index[i + 1] - 1) {// 오름차순 > i+1(하나씩 증가), -1?
				musik = "ascending";
			} else if (index[i] == index[i + 1] + 1) {// 내림차순 > i+1(하나씩증가), +1 
				musik = "descending";
			} else {
				musik = "mixed";
				break;
			}
			// for(int i=0; i<index.length -1; i++) { //배열 만큼 빼준다.
			// if 1~8
			// else if 8~1
			// else - > mixed?

		}
		System.out.println(musik);
        
        
	}
}

//그리고 오름차순은 i부터 i+1, i+2, i+3, ... 이렇게 값이 증가하고
//내림차순은 7-i부터 i+1, i+2, i+3, ...  이렇게 증가하기
//if문에서 두 가지 조건을 검사하여 오름차순인지 내림차순인지 판별하도록 하였고 둘 다 아닐 경우 mixed로 출력되게 하였습니다.

