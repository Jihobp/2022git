#include<stdio.h>
//배열은 포인터이기 때문에 함수의 매개변수로 쓰이게 되면 
//함수에서 값으 변화가 있을 때 배열에서도 값의 변화가 있다.
//void increaseNum(int* numbers[])
//사이즈를 같이 넘기든지 , || 아니면 쓰레기 값이 들어가 있는걸 이용하든지....
//그냥 사이즈 같이 넘겨주면 됨.
//a. 내가 지정한 칸 이외에 다른칸(쓰레기값들이얌 ㅇㅇ)에 접근하려면 오류가 날 가능성이 높당. 
//q. 그래서 size를 넣어주는것,

//1.
void increaseNum(int* numbers, int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] += n;
}
//2. 매개변수 있고 반환형 없이 배열 값 모두 출력하는 함수 만들기
void printArr(int arr[], int size)
{
	printf("\n");
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}
//3. decreaseNum을 만든다.(매개변수, 반환을 increaseNum이랑 똑같게)
void decreaseNum(int numbers[], int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] -= n;
}
//4. 2번 함수랑 똑같은 형태의 함수를 만들되 아래 조건이 있음
	//1. 감소시킬 값이 음수면 안 됨
	//2. 값을 감소시켰는 데 음수가 나오면 그 즉시
	//함수 종료(break 말고 return 써보기)
void decreaseNum_q4(int numbers[], int size, int n)
{
	//매개변수로 음수가 들어와도 안 되고
	//값을 뺏을 때 음수가 되면 즉시 종료
	if (n < 0)
		return; // 이렇게 안 쓰고 if else로 묶어서 해도 된다.
	//void는 return을 안쓰는게 아니라 생략가능하다. 쓴다면 return;으로 적어야함.

	for (int i = 0; i < size; i++)
	{
		int num = numbers[i];
		num -= n;
		if (num < 0) //n을 뺐는데 음수라면? 즉시 종료
			return; //함수 자체를 끝내버린다. 위에 return도 {} 끝으로 가서 끝낸다.
					// =break 써도 된다. 브레이크는 반복문만 끝내고 리턴은 함수자체를 끝낸다.
		numbers[i] = num;

	} 
}

int main()
{
	//하나의 변수를 통해서 여러 개의 숫자를 관리할 수 있는게 배열.
	//처음에 선언하자마자 값 넣기.
	int ages[5] = { 23,25,30,29,50 };
	int ages2[3]={ 10,20,30 };
	
	//선언하고나서 값 넣기
	int ages3[3];
	ages3[0] = 20;
	ages3[1] = 30;
	ages3[2] = 40;
	
	for (int i = 0; i < 5; i++)
	{
		printf("%d\n", ages[i]);
		ages[i] = i * i + ages[i];//아무값이나 넣어봄
	}


	printf("----------------1번----------------\n");
	//1. 지금 만든 increaseNum을 호출해보고 결과 확인해보기
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);
	increaseNum(ages2, 3, 100);
	printf("-----변화 후-----\n");
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);


	printf("----------------2번----------------\n");
		printArr(ages, sizeof(ages) / sizeof(int)); //5


	printf("----------------3번----------------\n");
	decreaseNum(ages, sizeof(ages) / sizeof(int), 15);
	printArr(ages, sizeof(ages) / sizeof(int));

	
	ages3[0] = 150;
	ages3[1] = 50;
	ages3[2] = 500;
	printf("----------------4번----------------\n");
		decreaseNum_q4(ages3, 3, 100);
	printArr(ages3, 3);

	return 0;
}