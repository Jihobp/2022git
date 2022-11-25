#include<stdio.h>
struct MyStruct
{
	int width;
	int height;
}typedef Rectangle; //원래 이름이 뭔진 상관없고
//정의된 이름으로 부르거나
//원래이름으로 부를 수 있다.


int main()
{//1. 사각형 5개 입력받고
//넓이가 가장 넓은 사각형의 width와 height를 출력하라.
if (0)
{/*
	struct Rectangle
	{
		int width;
		int height;
	}typedef Rectangle;

	int main()
	{
		struct Rectangle r1;
		scanf_s("%d %d", &r1.width, &r1.height);
		printf("넓이 : %d\n", r1.width * r1.height);
		Rectangle r2;
		scanf_s("%d %d", &r2.width, &r2.height);
		printf("넓이 : %d\n", r2.width * r2.height);
		Rectangle r3;
		scanf_s("%d %d", &r3.width, &r3.height);
		printf("넓이 : %d\n", r3.width * r3.height);
		Rectangle r4;
		scanf_s("%d %d", &r4.width, &r4.height);
		printf("넓이 : %d\n", r4.width * r4.height);
		Rectangle r5;
		scanf_s("%d %d", &r5.width, &r5.height);
		printf("넓이 : %d\n", r5.width * r5.height);


		int maxRec;

		result = max

			printf("넓이 : %d\n", ());

		return 0;
	}
	*/
} //망함

Rectangle recs[5];
for (int i = 0; i < 5; i++)
{
	printf("사각형의 width와 height 입력하기");
	scanf_s("%d %d", &recs[i].width, &recs[i].height);
}
Rectangle maxRec = recs[0];//ddgdg아무거나 ok 일반적으로 첫번쨰 0을 넣을뿐
for (int i = 1; i < 5; i++)
{
	//2번에 대한 예외처리1(음수 예외 처리)
	//예외처리 없을 경우엔 if문만 지우기
	if (recs[i].width < 0 || recs[i].height < 0)
		continue;

	int area = recs[i].width * recs[i].height;
	int maxRecArea = maxRec.width * recs[i].height;
	if (maxRecArea < area)//넓이가 가장 큰 걸로 교체
		maxRec = recs[i]; //area 넣음 안대낭? int에서 구조체로 가니까 ㄴㄴㄴㄴㄴ 변환할 수 없다.
}
//2번에 대한 예외처리2(예외처리 없을 경우엔 if문만 지우기)
if (maxRec.width >= 0 && maxRec.height >= 0)
{
	printf("가장 넓은 사각형의 width:%d, height:%d\n",
		maxRec.width, maxRec.height);
}

return 0;
}

//2. 1번을 하되, width나 height가 음수인 것은
//제외를 해줘야 한다.(에외처리 필요)
//
//------------------------------------ -
//
//3. 앞서 만든 Student 구조체를 typeddef를 통해
//Stu 라는 타입으로 만든다.
//
//4. 5명의 학생을 입력받는다.
//
//5. 평균 점수가 가장 높은 학생은 몇 번째 학생인지 출력







