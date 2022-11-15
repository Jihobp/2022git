
#include<stdio.h>
/*
3. �Ű������� �¾ ���� �ް�, 
�׿� ���� ������
���ڿ��� �����ϼ���.
12 -> �ܿ�
-1 -> �����ƴ�
*/
char* season(int month)
{
	switch (month)
	{
		case 12: 	case 1: 	case 2: //���� �̷��� ������ �� ��
			return "�ܿ�";     //���̽� �� 1�پ� ���� �� ����
		case 3:	case 4:	case 5:	
			return "��";
		case 6:	case 7:	case 8:	
			return "����";
		case 9:	case 10: case 11: 
			return "����";
		default: 
			return "����";
	}
}
//������ ����. ���ڿ� ���� ���ϱ�
int length(char* str)
{
	//���ڿ��� ���̸� ���Ϸ���, �� ���ڿ��� ���������� �ݺ����� ����
	//����, ����, Ư������, ������ ��� 1byte
	//�ٵ� �ѱ��̳� ���� ���� 1���ڴ� 2byte
	//���ǹ� üũ�ϱ⵵ ����� ����ó���� ���� �ʴ�.
	//�ϰ� ���� ����� �ѱۿ� ���ؼ��� ����ó�� �غ�����~
	int len = 0;
	while (str[len] != '\0')
		len++;
	return len;
}

int main()
{
	char test[10] = "monkey";
	char test2[100];
	//test2 = "dancing monkey";
	//��������� ���ڿ��� �ְ� �ʹٸ�... �̷� ����� ����
	test2[0] = -80;
	test2[1] = -95;
	test2[2] = -70;
	test2[3] = -15;
	test2[4] = -63;
	test2[5] = -10;
	test2[6] = 0;//NULL
	printf("%s\n", test2);

	printf("%s\n", season(4));
	printf("%s\n", season(-1));
	printf("%s\n", season(13));
	printf("%s\n", season(12));
	printf("%s\n", season(6));
	printf("%s\n", season(3));
	printf("%s\n", season(11));
	printf("%d\n", length("abcd1234")); //8  
	printf("%d\n", length("abcd 1234!")); //10
	return 0;
} 