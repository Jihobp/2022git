#include<stdio.h>
int main()
{													//debug f9 ��� f5 ����׸�� Ȯ��. https://studyc.tistory.com/11 
		//1. ������ 2�ܺ��� 9�ܱ����� ���� 2���� �迭�� ����
		// 2~9 : 8��, 
		// 1~9 : 9��
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
			//������ Ư���� �°� ����ֱ�?????????????????????????????????????????????????????????????????????????????????????????
			//https://popbox.tistory.com/82
		}
		int gugu1[8][9];
		//gugu1[0][0] ~gugu1[7][8]
		int row = sizeof(gugu1) / sizeof(gugu1[0]); //8
		int col = sizeof(gugu1[0]) / sizeof(gugu1[0][0]); //siefof(int); //9      
		printf("%d�� %d��\n", row, col); //8�� 9��
		//gugu1�� 8ĭ¥�� �迭 ����Ŵ
		//gugu1[0]~gugu[7]������ 9ĭ¥�� �迭 ����Ŵ

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				gugu1[i][j] = (i + 2) * (j + 1);
			}
		}
		
		//2. ������ 10�ܺ��� 19�ܱ����� ���� 2���� �迭�� ����
		if(0)
		{
			int numbers2[10] = { 10,11,12,13,14,15,16,17,18,19 };
			int gugudan2[10][9];
			for (int i = 0; i < 19; i++)
			{
				for (int j = 0; j < 9; j++)
					gugudan2[i][j] = numbers2[i] * numbers2[j];
			}
			//printf("...\n");//������� �۵��ϴ���
			for (int i = 0; i < 19; i++)
			{
				for (int j = 0; j < 9; j++)
					printf("% d x % d = % d\n", i, j, gugudan2[numbers2[i], numbers2[j]]);  //printf(" % d x % d = % d\n", i, j, (i* j));
			}

		}
		int gugu2[10][9];
		//10~19���̴ϱ� 10��
		// 10 11 12 13 14 15 16 17 18 19
		int gugu2_row = sizeof(gugu2) / sizeof(gugu2[0]);
		//row�� col �� �Ȱ����ϱ� �״�� �ᵵ ��
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
				gugu2[i][j] = (i + 10) * (j + 1);
		}

		//3. 1������ ���� �迭�� �� �� ���غ�����.
		int sum1 = 0;
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				sum1 += gugu1[i][j]; //sum=gugu1[i[[j]+sum;
		}



		//4. 2������ ���� �迭�� �� �� ���غ�����.
		int sum2 = 0;
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
				sum2 += gugu2[i][j];
		}

		//5. 4, 5�� ����� ���ؼ� ����غ�����.
		int sum3 = sum1 + sum2;
		printf("2~9 �� : %d\n", sum1);
		printf("10~19 �� : %d\n", sum2);
		printf("���� : %d\n", sum3);


		//6. 1���� �ִ� ������ �Ʒ��� ������� ���
			//2 4 6 8 10 12 14 16 18
			//3 6 9 12 15 18 21 24 27
	


		//6
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				printf("%3d ", gugu1[i][j]);//%3d -> 3ĭ
			printf("\n");
		}
		//7
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
				printf("%3d ", gugu2[i][j]);
			printf("\n");
		}



		// \t(tab)���� �� �����ϰ� ��µǰ� �ϱ�.
		// 2 -> '  2' (�տ� ���� 2��)
		// 10�ڸ��� ���� 4��.


		//���� ���� Ǭ ���
		//if�� �༭ ���⸦ �ߴ�.
		//10�̸��� 2������, 100�̸��� 1������
		//6
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (gugu1[i][j] < 10) //10�̸��� 1�� �ڸ�
					printf("  ");
				else if (gugu1[i][j] < 100) //10~99, 2�� �ڸ� ����
					printf(" ");

				printf("%d ", gugu1[i][j]); //"%3d " ->3ĭ
			}
			printf("\n");
		}
		//7
		for (int i = 0; i < gugu2_row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if (gugu2[i][j] < 10)//1���ڸ�, 1�ڸ� ����
					printf("  ");
				else if (gugu2[i][j] < 100)//10~99, 2�ڸ� ����
					printf(" ");
				printf("%d ", gugu2[i][j]);
			}
			printf("\n");
		}

	return 0;
}