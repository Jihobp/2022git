#include<stdio.h>
#include"Mystructs.h"
int main()
{

	//학생 1명 만들기(대입) 첫번째 방식
	KBStudent k1 = { 100,90,"이동준" };

	//학생 1명 만들기(대입) 두번쨰 방식
	KBStudent k2 = { .cScore = 100, .javaScore = 100, .name = "이유나" };

	//학생 1명 만들어보기(대입) - 세번째 방식,
	KBStudent k3;
	k3.cScore = 100;
	k3.javaScore = 0;
	strcpy(k3.name, "김동준");

	//학생 1명 만들기(입력)
	KBStudent k4;
	scanf_s("%d %d", &k4.cScore, &k4.javaScore);
	rewind(stdin);
	gets(k4.name); //.......???????????????????????????????? 
	//gets 가 아니라 scanf 쓰면 문자열 뒷부부 ㄴ짤린다궁???????????????????????????????????????????????????????????????
	printf("%d %d %s", k4.cScore, k4.javaScore, k4.name);

	//최대 최소 구하는 것도 있어서
	//배열로 해야 한다.
	KBStudent students[5];
	//참고
	/*KBStudent students[5] //일일히 설정하는 것.
		= {{.cScore=10,.javaScore=10,"피카츄1"},
			{.cScore=10,.javaScore=10,"피카츄2"},
			{.cScore=10,.javaScore=10,"피카츄3"},
			{.cScore=10,.javaScore=10,"피카츄4"},
			{.cScore=10,.javaScore=10,"피카츄5"},
	};*/
	//3.
	for (int i = 0; i < 5; i++)
	{
		rewind(stdin); /// ? ? ? 
		printf("이름이 뭔가요?");
		gets(students[i].name);
		printf("C, Java 점수는?");
		scanf_s("%d %d",
			&students[i].cScore, &students[i].javaScore);
	}
	int cSum = 0;
	int javaSum = 0;
	for (int i = 0; i < 5; i++)
	{
		cSum += students[i].cScore;
		javaSum += students[i].javaScore;
	}
	printf("c, java 각각의 총 합 %d %d\n", cSum, javaSum);
	double cAvg = cSum / 5.0; ////q. 실수로 하는 이유는 ?????????????????????
	double javaAvg = javaSum / 5.0;
	printf("c, java 각각의 평균 %f %f\n", cAvg, javaAvg);

	//4.
	int maxC = 0;
	int maxJava = 0;
	double avg_max = 0;
	int index_max = 0; //1등 인덱스(평균)
	int index_max_C = 0; //1등 인덱스(C)
	int index_max_Java = 0; //1등 인덱스(Java)
	maxC = students[0].cScore; //// 구조체 cScore의 students[0]번째를 maxC에 넣는다 ?????
	maxJava = students[0].javaScore;
	avg_max = (students[0].cScore + students[0].javaScore) / 2.0;
	for (int i = 0; i < 5; i++)
	{
		if (maxC < students[i].cScore)
		{
			maxC = students[i].cScore;
			index_max_C = i;
		}
		if (maxJava < students[i].javaScore)
		{
			maxJava = students[i].javaScore;
			index_max_Java = i;
		}
		if (avg_max < (students[i].cScore + students[i].javaScore) / 2.0)
		{
			avg_max = (students[i].cScore + students[i].javaScore) / 2.0;
			index_max = i;
		}
	}

	printf("C 1등 : %s\n", students[index_max_C].name);
	printf("Java 1등 : %s\n", students[index_max_Java].name);
	printf("평균 1등 : %s\n", students[index_max].name);

	
	return 0;
}