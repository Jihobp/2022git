#include<stdio.h>
int main()
{
	//1. 변수 a와 b와 c의 값을 입력받고, 
	//a부터 b까지의 합을 구하되, 
	//c의 배수 부분은 제외하고 합을 구할 것.
	if (1)
	{
		int a, b, c;
		int sum = 0; // int sum=0??????????????????????????????? sum=0로 초기화 해서 정의 해야 됨.c에선. 안그럼 오류 뜬다. 
		printf("a부터 b까지의 합을 구하시오. ");
		scanf_s("%d %d %d", &a, &b, &c);
		//if (a > 0) //if 조건문이....  아니라 for... 반복문..?
		//if : 참이면 실행.
		//for: 반복문 중괄호 부분을 여러 번 반복해서 실행하겠다. 몇 번을 실행하고 어떻게 반복할 건지 정해야함.


		for (int i = a; i <= b; i++) //for (int i = a; i <= b; i++)
		{
			if (i % c != 0)
				sum += i;
		}

		printf("%d", sum);
		//else (i% c = 0) //if (i % c == 0) //c의 배수 ?????????????????
		//		printf("c의 배수 부분은 제외한다.");
	}

	int a, b, c;
	printf("a b c 입력");
	scanf_s("%d %d %d", &a, &b, &c);

	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c == 0) //c의 배수
			continue; //c의 배수면 다시 i++로 가서, sum+=i로 가서 다시 적용. 
		//{}실행안하고 넘어간다.




		sum += i;
	}


	//2. 설탕공장 문제
	if (0)
	{//사탕공장에 설탕을 배달함(동준이)
		//사탕공장에서 요구하는 설탕을 딱 떨어지게 잘 갖다 줘야 합니다.
		//동준이가 가지고 있는 설탕 묶음은 3kg, 5kg….
		//근데 동준이는 최대한 묶음의 수를 줄여서 갖다 주고 싶어합니다.
		//Ex) 18kg -> 3 * 6…. = > 6묶음, 5 * 3 + 3 = > 4묶음
		//5 -> 1
		//3 -> 1
		//6 -> 2
		//11 -> 5kg 1묶음에 3kg 2묶음 -> 3
		//9 -> 3
		//4 -> - 1
		//16 -> 4
		//21 -> 5
		//딱 안 떨어지면 - 1 반환
		//입력 값으로는 사탕공장에서 요구하는 설탕 수
		//출력 값은 최소 묶음 수를 출력. 

		//5kg 주머니로 나눠지는 지 먼저 체크.
		//그걸로 나눠지면 그 주머니 개수대로 출력하고 끝
		//ex)15kg - >  3출력.
		//만약에 나눠지지 않으면 3kg 주머니 1개에 담는다.
		//그 다음에 다시 5kg로 나눠지는 지 체크함
		//ex)18kg -> 3kg 1개, 5kg 3개
		//7kg면.. 3kg으로 3번나누면 -2가 나온다.
		//그러면 -1 출력하고 끝내면 됨.
	}

	int inputSugar;
	printf("설탕 몇 kg?");
	scanf_s("%d", &inputSugar);
	int pack = 0; //주머니 수
	while (1)
	{
		if (inputSugar % 5 == 0)
		{
			pack += inputSugar / 5;
			printf("%d묶음\n", pack);
			break;
		}
		inputSugar -= -3;
		pack++; //3kg 주머니 하나 증가
		if (inputSugar < 0)
		{
			printf("-1\n");
			break;
		}
	}



	return 0;
}