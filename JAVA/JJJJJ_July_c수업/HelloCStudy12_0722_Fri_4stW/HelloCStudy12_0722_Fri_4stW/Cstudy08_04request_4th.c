#include<stdio.h>
#include"Student.h"
int main()
{
	//우선...학생 1명의 평균을 구해보자.
	//선언하자마자 값 부여하는 것 가능.
	Stu s1 = { .math = 40, .kor = 50, .eng = 55 };//속성 지정
	Stu s2 = { 50,60,55 };//math eng kor 순서대로 값 들어감.

	int avg = (s1.math + s1.kor + s1.eng) / 3;
	int avg2 = (s2.math + s2.kor + s2.eng) / 3;

	if (avg >= avg2)
		printf("첫 번째 학생의 평균이 더 크다. \n");
	else
		printf("두 번째 학생의 평균이 더 크다. \n");



	//본격 3번째 문제 ㅠㅠ

	Stu students[5];
	for (int i = 0; i < 5; i++)
	{
		printf("학생의 국영수 점수 입력하세요.");
		scanf_s("%d %d %d",
			&students[i].kor, &students[i].eng, &students[i].math);
	}
	Stu Elite = students[0]; //아무거나 넣어도 ok. 어짜피 비교 전부다해줘서 상관x
	int num;
	for (int i = 0; i < 5; i++)
	{
		int average = students[i].kor + students[i].eng + students[i].math;
		int max = Elite.kor + Elite.eng + Elite.math;
		max /= 3;
		
		if (max < average) //맥스가 평균보다 작으면??????????? 에버리지가 맥스보다 크면 엘리트 가 바꾸ㅕ서...
		{
			Elite = students[i];
			num = i;
		}
	}
	printf("%d번째 학생이 1등이다. \n", num);

	return 0;
}