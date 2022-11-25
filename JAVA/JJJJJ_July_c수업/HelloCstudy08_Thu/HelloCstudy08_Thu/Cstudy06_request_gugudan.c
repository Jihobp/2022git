#include<stdio.h>
int main()
{													//debug f9 찍고 f5 디버그모드 확인. https://studyc.tistory.com/11 
		//1. 구구단 2단부터 9단까지의 값을 2차원 배열에 저장
		// 2~9 : 8행, 
		// 1~9 : 9열
		if(0)
		{
			int numbers[8] = { 2,3,4,5,6,7,8,9 };
			int gugudan[8][9];
			for (int i = 0; i < 8; i++)
			{
				for (int j = 0; j < 10; j++)
					gugudan[i][j] = i * j;
			}
			for (int i = 0; i < 8; i++)
			{
				for (int j = 0; j < 10; j++)
					printf("% d x % d = % d\n", i, j, gugudan[i][j]);  //printf(" % d x % d = % d\n", i, j, (i* j));
			}
			//구구단 특성에 맞게 집어넣기?????????????????????????????????????????????????????????????????????????????????????????
			//https://popbox.tistory.com/82
		}
		int gugu1[8][9];
		//gugu1[0][0] ~gugu1[7][8]
		int row = sizeof(gugu1) / sizeof(gugu1[0]); //8
		int col = sizeof(gugu1[0]) / sizeof(gugu1[0][0]); //siefof(int); //9      
		printf("%d행 %d열\n", row, col); //8행 9열
		//gugu1은 8칸짜리 배열 가리킴
		//gugu1[0]~gugu[7]까지는 9칸짜리 배열 가리킴

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				gugu1[i][j] = (i + 2) * (j + 1);
			}
		}
		
		//2. 구구단 10단부터 19단까지의 값을 2차원 배열에 저장
		if(0)
		{
			int numbers2[10] = { 10,11,12,13,14,15,16,17,18,19 };
			int gugudan2[10][9];
			for (int i = 0; i < 19; i++)
			{
				for (int j = 0; j < 9; j++)
					gugudan2[i][j] = numbers2[i] * numbers2[j];
			}
			//printf("...\n");//여기까지 작동하는지
			for (int i = 0; i < 19; i++)
			{
				for (int j = 0; j < 9; j++)
					printf("% d x % d = % d\n", i, j, gugudan2[numbers2[i], numbers2[j]]);  //printf(" % d x % d = % d\n", i, j, (i* j));
			}

		}
		int gugu2[10][9];
		//10~19단이니까 10개
		// 10 11 12 13 14 15 16 17 18 19
		int gugu2_row = sizeof(gugu2) / sizeof(gugu2[0]);
		//row랑 col 값 똑같으니까 그대로 써도 됨
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
				gugu2[i][j] = (i + 10) * (j + 1);
		}

		//3. 1번에서 만든 배열의 총 합 구해보세요.
		int sum1 = 0;
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				sum1 += gugu1[i][j]; //sum=gugu1[i[[j]+sum;
		}



		//4. 2번에서 만든 배열의 총 합 구해보세요.
		int sum2 = 0;
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
				sum2 += gugu2[i][j];
		}

		//5. 4, 5번 결과를 더해서 출력해보세요.
		int sum3 = sum1 + sum2;
		printf("2~9 합 : %d\n", sum1);
		printf("10~19 합 : %d\n", sum2);
		printf("총합 : %d\n", sum3);


		//6. 1번에 있는 내용을 아래의 모양으로 출력
			//2 4 6 8 10 12 14 16 18
			//3 6 9 12 15 18 21 24 27
	


		//6
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				printf("%3d ", gugu1[i][j]);//%3d -> 3칸
			printf("\n");
		}
		//7
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
				printf("%3d ", gugu2[i][j]);
			printf("\n");
		}



		// \t(tab)없이 다 균일하게 출력되게 하기.
		// 2 -> '  2' (앞에 공백 2개)
		// 10자리는 공백 4개.


		//동준 썜이 푼 방식
		//if문 줘서 띄어쓰기를 했다.
		//10미만은 2번띄어쓰고, 100미만은 1번띄어쓰기
		//6
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (gugu1[i][j] < 10) //10미만은 1의 자리
					printf("  ");
				else if (gugu1[i][j] < 100) //10~99, 2의 자리 숫자
					printf(" ");

				printf("%d ", gugu1[i][j]); //"%3d " ->3칸
			}
			printf("\n");
		}
		//7
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (gugu2[i][j] < 10)//1의자리, 1자리 숫자
					printf("  ");
				else if (gugu2[i][j] < 100)//10~99, 2자리 숫자
					printf(" ");
				printf("%d ", gugu2[i][j]);
			}
			printf("\n");
		}

	return 0;
}