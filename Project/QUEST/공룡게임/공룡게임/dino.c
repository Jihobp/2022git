#include<stdio.h>
#include<windows.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
#define DINO_BOTTOM_Y 12
#define TREE_BOTTOM_Y 20
#define TREE_BOTTOM_X 45
int a = 1;
void Drawdino()
{


	//gotoXY(0, dinoY);
	static boolean legFlag = 1;
	printf("          �������\n");
	printf("        ���������\n");
	printf("      �����������\n");
	printf("    �������������\n");
	printf("    �������������\n");
	printf("    �������������\n");
	printf("      �����������\n");
	printf("        ���������\n");
	printf("         ��������\n");
	printf("        ���������\n");
	printf("       ����������\n");
	printf("      �� �������� ��  \n");
	printf("     ��  ��������  ��\n");

	if (legFlag)
	{
		printf("         ���      ���\n");
		printf("         ���      ����\n");
		printf("         ����          \n");
		legFlag = 0;
	}
	else
	{
		printf("         ���      ���\n");
		printf("         ����    ���\n");
		printf("                   ����\n");
		legFlag = 1;
	}


}

void JumpDraw()
{
	
	//gotoXY(0, dinoY);
	static int Frame1 = 1;

	if (Frame1==1)
	{
		printf("          �������\n");
		printf("        ���������\n");
		printf("      �����������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("      �����������\n");
		printf("        ���������\n");
		printf("         ��������\n");
		printf("        ���������\n");
		printf("       ����������\n");
		printf("      �� �������� ��  \n");
		printf("     ��  ��������  ��\n");
		printf("         ���      ���\n");
		printf("         ����    ���� \n");
		if(a==1)
			Frame1++;
		a = 1;
	}
	else if(Frame1==2)
	{
		printf("          �������\n");
		printf("        ���������\n");
		printf("      �����������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("      �����������\n");
		printf("        ���������\n");
		printf("         ��������\n");
		printf("        ���������\n");
		printf("      �� �������� ��\n");
		printf("    ��   ��������   ��  \n");
		printf("  ��     ��������     ��\n");
		printf("         ���      ���\n");
		printf("         ����    ���� \n");
		if (a == 1)
			Frame1++;
		else
			Frame1--;
	}
	else if (Frame1 == 3)
	{
		printf("          �������\n");
		printf("        ���������\n");
		printf("      �����������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("      �����������\n");
		printf("        ���������\n");
		printf("         ��������\n");
		printf("  ���������������\n");
		printf("         ��������\n");
		printf("         ��������\n");
		printf("         ��������\n");
		printf("         ���      ���\n");
		printf("         ����    ���� \n");
		if (a == 1)
			Frame1++;
		else
			Frame1--;
	}
	else if (Frame1 == 4)
	{
		printf("          �������\n");
		printf("        ���������\n");
		printf("      �����������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf("    �������������\n");
		printf(" ��   �����������   ��\n");
		printf("   ��   ���������   ��\n");
		printf("      �� �������� ��\n");
		printf("        ���������\n");
		printf("         ��������\n");
		printf("         ��������\n");
		printf("         ��������\n");
		printf("         ���      ���\n");
		printf("         ����    ���� \n");
		Frame1--;
		a = 0;
	}
}


int main()
{
	while (1)
	{
		JumpDraw();
		Sleep(60);
		system("cls");
	}
	return 0;
}