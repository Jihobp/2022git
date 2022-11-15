import java.util.Arrays;
import java.util.Scanner; //2750번 //Q3무ㅜㄴ제 참고! //버블정렬 참고!!!

public class BaekJoon_Q10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		// 끝으로 갈수록 수가 커지게
		int n = s.nextInt();
		int num[] = new int[n]; // f. !!!! n개짜리 배열 변수를 선언한다.
		// 선택정렬
		for (int i = 0; i < n; i++) { // 변수 n개까지 반복문으로 입력받는다.
			num[i] = s.nextInt(); // scanner.nextInt 입력받는다.
		}
		Arrays.sort(num); //오름차순 함수!!! 
		for (int i = 0; i < n; i++) { //n번까지 
			System.out.println(num[i]); //프린트
		}
	}
}

//자바 버블 https://bigstupid.tistory.com/49?category=716968
//java.util.Arrays 유틸리티 클래스를 사용하면 배열(Array)을 정렬, 복제하거나, List로 변환 하는 등의 작업을 쉽게 처리 할 수 있습니다.  
//해당 클래스의 sort() 메서드를 사용하면 쉽게 오름차순 정렬이 가능합니다. 
//sort() 메서드는 클래스 메서드(Class method / Static method)로써 Arrays 클래스의 인스턴스 생성없이 바로 사용하시면 됩니다.

/*/배열의 오름차순 정렬	
	static void sortAcendingArr(int[] arr){
		for(int i=0; i<arr.length-1; i++) //배열 길이에선 -1해줘야됨!! 숫자가 0포함해서 적으니까 ㅎㅎ
			for(int j=0; j<arr.length-1-i; j++)
				if(arr[j] > arr[j+1]){
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
		}
	}
						
//배열의 내림차순 정렬	
	static void sortDecendingArr(int[] arr){
		for(int i=0; i<arr.length-1; i++)		// 배열의 총 길이 수 만큼 반복문 수행
			for(int j=0; j<arr.length-1-i; j++)	// 가장 작은 수를 맨 뒤로 밀면서 반복문 수행, 수행 횟수는 1씩 줄어듦
				if(arr[j] < arr[j+1]){			// 앞수와 뒷수 비교
					int tmp = arr[j];			// 낮은 수를 tmp로 넣고
					arr[j] = arr[j+1];			// 높은 수는 앞수로 교체
					arr[j+1] = tmp;				// 낮은 수는 뒷수로 교체하여, 반복문 수행될 때마다 낮은 수가 뒤로 밀리게끔 swap 
		}
	}
출처: https://peterdrinker.tistory.com/133 [고찰을 고찰하는 고찰족:티스토리] */


/*
int N = in.nextInt();
int[] arr = new int[N];

for(int i = 0; i < N; i++) {
	arr[i] = in.nextInt();
}

// Selection sort
for(int i = 0; i < N - 1; i++) {
	for(int j = i + 1; j < N; j++) {
		if(arr[i] > arr[j]) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
}

for(int val : arr) {
	System.out.println(val);
}
*/