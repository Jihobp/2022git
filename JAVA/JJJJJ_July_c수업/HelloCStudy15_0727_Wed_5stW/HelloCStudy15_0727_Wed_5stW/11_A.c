//2-1. ���� �¾ ������ �Ű������� �Ͽ�
//������ �����ϼ���

#include<stdio.h>
//#include<string.h> //�� ������� ���Խ�Ű��
// strcpy�� strcat�� _s�� �ٿ��� ��
//stdio.h�� ������ strcpy, strcat(��������)�� �״�� �� �� �ִ�.
////strcpy�� strcat�� _s�� ���� �� �� �ֽ� �����̱� ��
char* myGanJi(int year)
{
	int ganji = year % 10; //���������������Ӱ�
	//���� 0��
	int thee = year % 12;//�����ι�������̽�������
	//���� 0���� �����̶�
	//�������� �����ι� �������
	//����Ӱ谩����������

	//3���� �� ����
	//�ѱ��� 1���� 2byte�̰�, ���� �� �� �� ����
	//�����
	char ganjiResult[3]; //���� ����
	char theeResult[3]; //�� ����
	static char result[5]; //�� �迭(ganjiResult,theeResult)
	//�� ������ ���⿡ ��ĥ ��
	//static���� ������ �� ���� ����� ����
	//ũ�⸦ �˳��ϰ� ��ų�(result[1024)
	//�����迭�� ���� �ȴ�.


	switch (ganji)	//ganji��� ������ ����ġ ���� ������.
	{
	case 0:	strcpy(ganjiResult, "��");	break; //���� �̷��� ������ �� �� //�ڿ� �ִ°�"" ������ �ִ´�.=strcpy
												//������ 0=switch(ganji)�̸� �����Ѵ�.
	case 1:	strcpy(ganjiResult, "��");	break; //������ ������
	case 2:	strcpy(ganjiResult, "��");	break; //ganji ��� ������ 2�϶�, "��"�̶�� ���� ganjiresult�� �ִ´�. = strcpy�� �ִ´�. �׸��� ��������.
	case 3:	strcpy(ganjiResult, "��");	break; //ganji ��� ������ 3�ϋ�, "��"��� ���� ganjiresult�� �ִ´�. = strcpy�� �ִ´�. �׸��� �������´�.
	case 4:	strcpy(ganjiResult, "��");	break;
	case 5:	strcpy(ganjiResult, "��");	break;
	case 6:	strcpy(ganjiResult, "��");	break;
	case 7:	strcpy(ganjiResult, "��");	break;
	case 8:	strcpy(ganjiResult, "��");	break;
	case 9:	strcpy(ganjiResult, "��");	break;
	default:
		strcpy(ganjiResult, "-");
		break;
	}
	switch (thee) //thee ������ ����ġ ���� ������.
	{
	case 0:	strcpy(theeResult, "��");	break; //thee��� ������ 0�϶�, "��"�̶�� ���� theeResult�� �ִ´�.=�� strcpy. �׸��� �������´�.
	case 1:	strcpy(theeResult, "��");	break; 
	case 2:	strcpy(theeResult, "��");	break;
	case 3:	strcpy(theeResult, "��");	break;
	case 4:	strcpy(theeResult, "��");	break;
	case 5:	strcpy(theeResult, "��");	break;
	case 6:	strcpy(theeResult, "��");	break;
	case 7:	strcpy(theeResult, "��");	break;
	case 8:	strcpy(theeResult, "��");	break;
	case 9:	strcpy(theeResult, "��");	break;
	case 10: strcpy(theeResult, "��");  break;
	case 11: strcpy(theeResult, "��");  break;
	default:									//thee��� ������ 0~11 ����͵� �ƴҽ� ���� ������ �����Ѵ�.
		strcpy(theeResult, "-");				// -��� ���� theeResult�� �ִ´�.
		break;									//�׸��� �������´�.
	}
	//strcat, concat���� �ᵵ ������...
	//for�� �밡���غ��ڴ�.
	for (int i = 0; i < 2; i++) //i=0���� �ʱ�ȭ �ϰ�, i�� 2���� ������ ���������� ���� ���ϰ� i++�� �ݺ��Ѵ�.
		result[i] = ganjiResult[i]; //ganjiresult�� i���� ���� result�� i��° ���� �־��ش�.
	for (int i = 0; i < 2; i++) //
		result[i + 2] = theeResult[i]; //
	result[4] = NULL; // ������ ���� �˸�
	return result;
}

//OSR kun's code  ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
char* ganzi(int year) {
	char zi[12][10] = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
	char gan[10][10] = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };

	static char res[10] = "";
	//strcat_s : �̾���̱�
	strcat(res, gan[year % 10]);
	strcat(res, zi[year % 12]);
	// 2-1
	printf("%s%s��\n", gan[year % 10], zi[year % 12]);

	return res;
}
int main()
{
	printf("��⵵�� �¾����?");
	int year;
	scanf_s("%d", &year);
	printf("%s\n", myGanJi(year)); //(��ȣ �� ���� �ؼ�) ���� year ���� myganji��� �Լ��� �ְ� �����ϰ� // ��ȯ���� ���ڿ� ����(%s), \n�� �Բ� ����Ѵ�.  
	printf("%s\n", ganzi(year));
	return 0;
}