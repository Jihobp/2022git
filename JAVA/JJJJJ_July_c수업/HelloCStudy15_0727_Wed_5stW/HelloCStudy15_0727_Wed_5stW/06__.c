#include<stdio.h> //�׸� ����. //�迭=������, ������=/�迭, �����ʹ� �迭�� �����Ҽ��ִٱ�??? ���ڿ�=���ڹ迭
//void printYourName(char n[])
void printYourName(char* n)
{
	printf("%d\n", n);
	printf("����� �̸��� %s�Դϴ�.\n", n);
}
char* printABC()
{
	int a = 10;
	return "abc\n";
}
//�Ű����� ���� ���ڿ��� �Է¹޾Ƽ� �����ϰ� ���� ��?
char* returnMyInfo()
{	
	//��� : ���ڿ��� �Է��� �� �����ϰ� �ʹٸ� �տ� static ���̱�
	static char mbti[10];//static char mbti[5];static�� ���̸� �� ��... ��...? //tmi. ���� �˳��ϰ� �൵ ������� �ʴ´�~
	printf("mbti?");
	gets(mbti);
	return mbti;
}
char* returnMyMBTI(char* mbti)
{
	//main�� �ִ� ���ڿ��� ������ �ͼ�, �ٸ� �� �ϰ� �ʹٸ�
	//�Ű������� �ش� ���ڿ��� �޾ƿ;� ��
	return mbti; //�Ű������� ���� �� �״�� �����غ���
}

char* change(char* mbti)
{
	gets(mbti);
	return mbti; //�Ű������� ���� �� �״�� �����غ���
}
int main()
{
	printf("�̸� �Է�");
	char name[100]; //���ڹ迭 = ���ڰ� ������ ��
	gets(name);	    //���ڰ� ������ �� = ���ڿ�
	printf("%d\n", name);
	printYourName(name); //���� ���ڹ迭 = ���ڿ�
	printf("%s\n", printABC());
	//�迭 = ������
	//name �迭�� name �����Ͷ�� ���� �ȴ�.
	printf("%s\n", returnMyInfo()); //?????????????
	printf("%s\n", returnMyMBTI("ENFP"));
	printf("%s\n", returnMyMBTI(name));
	printf("%s\n", change(name));
	return 0;
}