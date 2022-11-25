#include<stdio.h>

//배열을 함수의 매개변수로 넘길 수 있다.
//이럴 떈 배열의 크기도 같이 넘겨줘야 함.
//그리고 매개변수는 int numbers[]라고 해도 되고
//int* numbers라고 해도 됨.  //Int* ptr < 이걸 더 선호./Int* ptr/Int* ptr/다 똑같당.
//왜냐면 배열은 포인터니까!
void printArr(int numbers[], int size)
{	
	//printf("%d", numbers); //주소지 출력
	for (int i = 0; i < size; i++)
		printf("%d\n", numbers[i]);

	//이렇게 적어도 결과는 똑같당. 'ㅅ' ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇ
	//for (int i = 0; i < size; i++)
	//	printf("%d\n", *(numbers+i));

}


//main 에는 포인터 주소값 정보가 있지만 함수FX-void 안에는 얼마나 뻗어나갈지, 주소값 정보가 없다.
//시작위치만 알고 어디까지가 읽어야 할 부분일지 모른다.
//배열을 매개변수로 넘겨줄때는 size를 꼭 써야함!!!!


//2. 배열 안의 최댓값은 반환하고
//최솟값은 printf로 출력하는 함수를
//만들고 호출해보세요.
//= > 못 하겠다면 우선 메인에서라도 해보세요.

//int* numbers 대신 int numbers[]이거 써도 ok !!
int findMax(int* numbers, int size)
{
	int max = numbers[0];
	int min = numbers[0];
	for (int i = 1; i < size; i++)
	{
		if (max < numbers[i])
			max = numbers[i];
		if (min > numbers[i])
			min = numbers[i];
	}
	printf("최솟값 : %d\n", min);
	return max;
}


//3. 배열 값의 부호를 전부 뒤집는
//함수는 만들고 호출해서 테스트해보세요.
//(배열은 포인터라는 점을 생각해보면 됨)
	// ? ;ㅅ; ?
//void reverse_arr(int* numbers, int size)
void reverse_arr(int* numbers, int size)
{
	for (int i = 0; i < size; i++)
		numbers[i] *= -1;
}

int main()
{	
	//배열
	//1개의 변수가 여러 개의 값을 관리함.

	int numbers1[5] = { 5,4,10,-2,1 }; //4byte int*
	int numbers2[3]={3,2,1};
	//numbers2[0] = 100;
	//numbers2[1] = 200;
	//numbers2[2] = -300;

	for (int i = 0; i < sizeof(numbers1) / sizeof(int); i++)
		printf("%d\n", numbers1[i]);
	//1. printArr를 호출해보세요. 왜 size를 넘겨줘야 하는지도 생각해보세요.
	printArr(numbers1, 5); //numbers1에 있는 값을 실행하는 함수.
	
	//2.
	int max = findMax(numbers2,
		sizeof(numbers2) / sizeof(int));
	printf("numbers2의 최댓값 : %d\n", max);

	//3.
	printf("-----------------\n");
	printArr(numbers2, 3);
	printf("-----------------\n");
	reverse_arr(numbers2,3);
	printArr(numbers2, 3); //출력은 이렇게만 해도 ..
	return 0;
}