#include<stdio.h>

//1. printArr를 호출해보세요.
//왜 size를 넘겨줘야 하는지도 생각해보세요.

	void printArr(int numbers[], int size)
	{
		for (int i = 0; i < size; i++)
			printf("%d\n", numbers[i]);
	}


//2. 배열 안의 최댓값은 반환하고
//최솟값은 printf로 출력하는 함수를
//만들고 호출해보세요.
//= > 못 하겠다면 우선 메인에서라도 해보세요.


	void maxmin(int max, int min)
	{
		if (max > min)
		{
			printf("최댓값은 %d이다.", max);
		}
		else
		{
			return min;
		}
	}

	int main()
	{	
		int numbers1[5] = { 5,4,10,-2,1 }; //4byte int*

		int numbers2[3];
		numbers2[0] = 100;
		numbers2[1] = 200;
		numbers2[2] = -300;

		for (int i = 0; i < sizeof(numbers1) / sizeof(int); i++)
			printf("%d\n", numbers1[i]);

		//1.
		int a=5;
		printArr(numbers1, a);
		
		
		//2.
		int b, c;
		maxmin(b, c);
		int result = maxmin(b,c);


		return 0;
	}


//3. 배열 값의 부호를 전부 뒤집는
//함수는 만들고 호출해서 테스트해보세요.
//(배열은 포인터라는 점을 생각해보면 됨)
	// ? ;ㅅ; ?






