#include<stdio.h>
void season() //2
{
	int month;
	printf("몇 월달 입니까?");
	scanf_s("%d월달 입니다.", &month);
	switch (month)
	{
	case 12:
	case 1:
	case 2:
		printf("winter is coming......유노낫띵");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring 봄바람 휘날리며~~~~~~~~~~~");
		break;
	case 6:
	case 7:
	case 8:
		printf("hot summer 핫핫 너무더워");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall 천고마비의 계절");
		break;
	default:
		printf("잘못됐습니당.");
		break;
	}
} //2

void seasonp(int seaseap) //3
{
	//int month;
	//printf("몇 월달 입니까?\n");
	//scanf_s("\n%d월달 입니다.", &month);
	switch (seaseap)
	{
	case 12:
	case 1:
	case 2:
		printf("winter is coming......유노낫띵");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring 봄바람 휘날리며~~~~~~~~~~~");
		break;
	case 6:
	case 7:
	case 8:
		printf("hot summer 핫핫 너무더워");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall 천고마비의 계절");
		break;
	default:
		printf("잘못됐습니당.");
		break;
	}
}

void Year()
{
	int age, year;
	printf("\n몇 년도에 태어났습니까?\n");
	scanf_s("\n%d년에 태어났습니다.", &year);
	age = 2023 - year;
	printf("\n저는 %d살입니다.", age);
	return age;
}

int yearp(int year_parameter)
{
	int age, year;
	printf("\n몇 년도에 태어났습니까?\n");
	scanf_s("\n%d년에 태어났습니다.", &year);
	age = 2023 - year;
	printf("\n저는 %d살입니다.", age);
	return age;
}
int yearsp(int year)
{
	return 2023 - year;
}

int main()
{	//1. 계절을 출력하는 코드 main에 작성
	int month;
	printf("\n몇 월달 입니까?\n");
	scanf_s("\n%d월달 입니다.", &month);
	switch (month)
	{
	case 12:
	case 1:
	case 2:
		printf("winter is coming......유노낫띵");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring 봄바람 휘날리며~~~~~~~~~~~");
		break;
	case 6:
	case 7:
	case 8:
		printf("hot summer 핫핫 너무더워");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall 천고마비의 계절");
		break;
	default:
		printf("잘못됐습니당.");
		break;
	}
	
	//2. 1번을 함수화해서 main에서 호출하기 (매개변수 반환형 없음)
	printf("\n");
	season();

	//3. 매개변수를 통해서 계절 출력하는 함수
	int S;
	printf("\n몇 월달 입니까?\n");
	scanf_s("%d", &S);
	//printf("\n%d월달 입니다.\n", seasonp(S));
	seasonp(S);


	//for (i = 0; i < 3 || i = 12; i++)
	
	//4. 태어난 연도를 입력하고 나이를 리턴하는 함수 (매개변수x)
	printf("\n"); 
	Year();
	printf("\n");
	//5. 태어난 연도를 매개변수로 받고 나이 리턴하는 함수 (매개변수 o)
	int Y;
	printf("\n몇 년도에 태어났습니까?");
	scanf_s("%d", &Y);
	printf("%d살입니다.", yearsp(Y));


	return 0;
}