#include<stdio.h>
#include<stdlib.h>//동적 배열용
int main()
{
	//10칸짜리 배열 완성
	int* dynamic_arr = (int*)malloc(10 * sizeof(int));
	dynamic_arr[0] = 1;
	dynamic_arr[1] = 3;
	dynamic_arr[2] = 5;
	
	for (int i = 0; i < 3; i++)
		printf("%d\n", dynamic_arr[i]);
	int size;
	printf("배열 사이즈 적기");
	scanf_s("%d", &size);
	int* dynamic_arr2 = (int*)malloc(size * sizeof(int));
	for (int i = 0; i < size; i++)
		dynamic_arr2[i] = i + 10;//의미x
	for (int i = 0; i < size; i++)
		printf("%d\n", dynamic_arr2[i]);

	//sizeof 배열의 크기 재주는거.
	//배열안에 변수의 크기를 배열로 못정한다??????  ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
	// ㄴ 변수먼저 배열은 그다음 메모리에 올라가는데 동시에 stack에 올라가면 순서가 맛탱이 간다. //
	// int a[5]={1,2,3,4,5} poooooooooooooooooooooooo
	// int a[n]={1,2,3,4,5} xxxxxxxxxxxxxxxxxxxxxxxxxxxx 그렇기때문에 malloc이랑 calloc 써주면 ok
	
	//포인터는 c에만 있단ㅇ.동적할당 영역안에 있는 heap 영역때문에 c#, java에서도 쓰이기 때문에 배우는것.
	// 
	//int main() //b라는 배열으 ㅣ크기 
	//{
	//	int a;
	//	scanf_s("%d", &a);
	//	int* b = (int*)malloc(sizeof(int) * a);
	//	b[a]; //오류가 안나게 된다. 
	//}
		
	// 쓰고 싶은 함수는 c언어 ~하고시퍼요 치면 함수 찾아서 복붙/. 사람이 만들어논거면 헤더파일, 구현되어잇음 복붙./
	// 
	//malloc - > 메모리 초기화가 안됨 //trash 값.
	//calloc - > 0으로 초기화 해줌. //0으로 채움
	//10칸짜리 숫자 배열을 만들었는데, 
	//안에 값이 0으로 초기화 되어 있다.
	int* mynumbers = (int*)calloc(10, sizeof(4));
	for (int i = 0; i < 10; i++)
		printf("%d\n", mynumbers[i]);

	//동적 메모리는 프로그래머가 수동으로 할당한 것이라 다 썼다면 free로 없애줘야 함. 
	//이거 안없애면 메모리 누수(memory leak) 문제 생김.
	//즉 메모리가 낭비가 됨.
	//만약 프로그램이 이대로 끝난다면 굳이 free를 적을 필욘 없다.
	//근데 이 뒤에도 프로그램이 계속 되고, 이걸 더이상 안쓴다면
	//free를 해야 한다.
	free(mynumbers);
	free(dynamic_arr);
	free(dynamic_arr2);


	//	1. 배열을 만드는 데, 배열의 크기를 사용자가 정한다.
	//	2. 배열의 크기만큼 숫자를 입력한다.
	int n;
	scanf_s("%d", &n);
	int* jpnum = (int*)malloc(sizeof(int)*n);
	for (int i = 0; i < n; i++) //0부터 n-1까지 반복  i=1; i<=n
	{
		scanf_s("%d", &jpnum[i]); //jpnum의 i번째값을 입력받는다.
	}
	for (int i = 0; i < n; i++) 
	{
		printf("%d", jpnum[i]); //jpnum의 i번째값을 출력받는다.
	}

	//	3. 그 중에서 가장 큰 숫자의
	//	인덱스를 찾아낸다.
	int max = jpnum[0];
	int min = jpnum[0];
	int maxindex = 0;
	int minindex = 0;

	for (int i=1; i < n; i++)
	{
		if (max < jpnum[i])
		{
			max = jpnum[i];
			maxindex = i; //몇번쨰인지 찾고싶으면 +1
		}
		if (min > jpnum[i])
		{ 
			min = jpnum[i];
			minindex = i;
		}
	}

	printf("\nmax=%d min=%d", max, min);
	printf("\nmaxindex=%d minindex=%d", maxindex, minindex);
	

	//	4. 1~2번을 통해 만든 배열을
	//	매개변수로 하여 가장 작은 숫자의
	//	인덱스를 리턴해준다. (함수의 정의 및 호출)
	
	
	return 0;
}