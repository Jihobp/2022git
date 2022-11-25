#include<stdio.h>
int main()
{		//문제 풀기 전...
		//다중포인터를 이용해서 배열에 있는 값 가리키는거..... ~~~~~~~~~~~~~~~(포인터 심화)ver.

	//4칸짜리 1차원 배열 3개 관리하는 
	//2차원 배열이 있다고 해보자.

	int numbers[3][4] = {  //주소를 가리킨다.
		{10,20,30,40},
		{50,60,70,80},
		{90,100,110,120}
	};

	
	int** ptr = numbers;  //주소의 주소를 저장한다. int** ptr // 2중포인터가 넘버즈를 가리킨다고 했는데 이거 안된다.
		////심각도	코드	설명	프로젝트	파일	줄	비표시 오류(Suppression) 상태
		////경고	C4047	'초기화 중': 'int **'의 간접 참조 수준이 'int (*)[4]'과(와) 다릅니다.HelloCStudy08	D : \shareFolder\C 수업\HelloCStudy08\HelloCStudy08\CStudy05.c	16

	printf("%d", numbers[0][0]); 
	//printf("%d", ptr[0][0]); //xxxxxxxx 이렇게 하면 안 됨....

	//4칸짜리 배열을 가리키는 포인터
	//즉 배열포인터를 만들어야 함.

	int(*nptr)[4] = numbers;
	//4z칸짜리 배열을 가리키는 포인터.
	// 즉 배열 포인터를 만들어야함.
	// []칸수
	// * 포인터
	//https://dojang.io/mod/page/view.php?id=312

	printf("\n%d\n", numbers[1][1]); //60
	printf("\n%d\n", numbers[1][1]); //60

	//배열은 포인터이고
	//포인터 앞에 별을 붙이면 그 안에 들어간 값을 출력가능.

	printf("\%d\n", **numbers);//10
	printf("\%d\n", **(numbers+1));//50  
	printf("\%d\n", *(*numbers+1));//20

	//*이 하나면 주소값, **은 값을 가리킨다.
	//**number는 첫번째를 가리키고, 첫번째가 가리키는 그곳의 값 10을 출력.
	//**numbers+1이면 다음위치의 첫번째니까 50,
	//*numbers+1은 내가 가리키는 첫번째 위치 다음칸
	//*을 붙이니까 값이 나온다...?
	
	//장태연님이 발견한 거....
	printf("장태연 : %d\n", *(*nptr + 10));
	
	//nptr 앞에 *이 업으면 위치값, *이 있으면 110


	return 0;
}
