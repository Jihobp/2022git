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
	printf("          กแกแกแกแกแกแ\n");
	printf("        กแกแกเกเกเกเกแกแ\n");
	printf("      กแกแกเกเกเกเกเกเกแกแ\n");
	printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
	printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
	printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
	printf("      กแกแกเกเกเกเกเกเกแกแ\n");
	printf("        กแกแกเกเกเกเกแกแ\n");
	printf("         กแกแกแกแกแกแกแ\n");
	printf("        กแกแกแกแกแกแกแกแ\n");
	printf("       กแกแกแกแกแกแกแกแกแ\n");
	printf("      กแ กแกแกแกแกแกแกแ กแ  \n");
	printf("     กแ  กแกแกแกแกแกแกแ  กแ\n");

	if (legFlag)
	{
		printf("         กแกแ      กแกแ\n");
		printf("         กแกแ      กแกแกแ\n");
		printf("         กแกแกแ          \n");
		legFlag = 0;
	}
	else
	{
		printf("         กแกแ      กแกแ\n");
		printf("         กแกแกแ    กแกแ\n");
		printf("                   กแกแกแ\n");
		legFlag = 1;
	}


}

void JumpDraw()
{
	
	//gotoXY(0, dinoY);
	static int Frame1 = 1;

	if (Frame1==1)
	{
		printf("          กแกแกแกแกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("        กแกแกแกแกแกแกแกแ\n");
		printf("       กแกแกแกแกแกแกแกแกแ\n");
		printf("      กแ กแกแกแกแกแกแกแ กแ  \n");
		printf("     กแ  กแกแกแกแกแกแกแ  กแ\n");
		printf("         กแกแ      กแกแ\n");
		printf("         กแกแกแ    กแกแกแ \n");
		if(a==1)
			Frame1++;
		a = 1;
	}
	else if(Frame1==2)
	{
		printf("          กแกแกแกแกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("        กแกแกแกแกแกแกแกแ\n");
		printf("      กแ กแกแกแกแกแกแกแ กแ\n");
		printf("    กแ   กแกแกแกแกแกแกแ   กแ  \n");
		printf("  กแ     กแกแกแกแกแกแกแ     กแ\n");
		printf("         กแกแ      กแกแ\n");
		printf("         กแกแกแ    กแกแกแ \n");
		if (a == 1)
			Frame1++;
		else
			Frame1--;
	}
	else if (Frame1 == 3)
	{
		printf("          กแกแกแกแกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("  กแกแกแกแกแกแกแกแกแกแกแกแกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("         กแกแ      กแกแ\n");
		printf("         กแกแกแ    กแกแกแ \n");
		if (a == 1)
			Frame1++;
		else
			Frame1--;
	}
	else if (Frame1 == 4)
	{
		printf("          กแกแกแกแกแกแ\n");
		printf("        กแกแกเกเกเกเกแกแ\n");
		printf("      กแกแกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf("    กแกแกเกเกเกเกเกเกเกเกแกแ\n");
		printf(" กแ   กแกแกเกเกเกเกเกเกแกแ   กแ\n");
		printf("   กแ   กแกแกเกเกเกเกแกแ   กแ\n");
		printf("      กแ กแกแกแกแกแกแกแ กแ\n");
		printf("        กแกแกแกแกแกแกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("         กแกแกแกแกแกแกแ\n");
		printf("         กแกแ      กแกแ\n");
		printf("         กแกแกแ    กแกแกแ \n");
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