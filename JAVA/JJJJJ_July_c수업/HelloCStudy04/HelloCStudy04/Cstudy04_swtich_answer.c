#include<stdio.h>
#define ���� 0 // ��ũ�� ���
#define ���� 1

//������ (�����򰡿��� ���°�
//���ڵ鿡�� �̸��� ���̴� ��.
enum ��������
{
	//������, ��, ��, ����, ��, ��, ȣ����, �䳢, ��, ��, ��, �� // �ؿ��� �� 5, ȣ����6 //�����̿� 1������ ������ �㵵 4~~!
	��=4, ��, ȣ����, �䳢, ��, ��, ��, ��, ������=0, ��, ��, ����
};

int main() //solution �ȿ� �������� ������Ʈ. �����ؼ� ������ ��� ������ ~~'��' vcxproj������ �������Ѵ� ������Ʈ ����.
{
	if (0) {
#pragma region  �Ϲ� �¾ ����
		//1. �¾ ����
		int month;
		printf("�� ���� �¾��?");
		scanf_s("%d", &month);

		//	1-1. if��
		if (month == 12 || month == 1 || month == 2) // if (month == 12 || 1 || 2) 1�� 2�� true�� ���� error�� ���.
			printf("�ܿ�\n");
		else if (month >= 3 && month <= 5)
			printf("��\n");
		else if (month >= 6 && month <= 8)
			printf("����\n");
		else if (month >= 9 && month <= 11)
			printf("����\n");
		else
			printf("��������� �Դ�?\n");

		// 1-2. switch��
		switch (month)
		{
		case 12:
		case 1:
		case 2:
			printf("�ܿ�\n");
			break;
		case 3: case 4: case 5: //�̷��� ��� �Ǳ���Ѵ�. but �������� �������� ���� ������!
			printf("��\n");
			break;
		case 6:
		case 7:
		case 8:
			printf("����\n");
			break;
		case 9:
		case 10:
		case 11:
			printf("����\n");
			break;
		default:
			printf("������̵�ɽ� - mystyle\n");
			break;
		}

#pragma endregion
	}
	//alt ����Ű : �̵�
	//ctrl + d : ����
	//ctrl a      +      ctrl k+f : ����
	// tab�ϸ� �鿩���� shift tab �ϸ� �ٽ� �鿩����.
	//ctrl + k, u : �ּ� ����
	//c�Ϸ��� 4~6�ð� ���б⵿�� ���� ������ �Ϻθ� �����ž�

	const int �� = 2; //���
	//��� : �ѹ� ������ �Ǹ� �� �ٲ�� ~~~~~~~ ;��; ~~~~~~~~~~~ ������, �빮�ڷ� �ַ� ����. ������ �빮�ڷ� �����ֵ�? �������~~ (���� ����!)
	//�����Ϸ��� ���� �����ڵ带 ó���ϱ� ���� �̸� ���� �ϴ� ��. #define. = ��ũ�� ���.


	//��>>>> ����ϰ� if �ٲٷ���, #define ���� 0, #define ���� 1, const int �� = 2;  <<<< �Է�.

	//������ �ʿ��ϴٴ� ����? �߰�ȣ ����.

	if (0) {
#pragma region �����̹� ����������
		// 2-1. ���� ����������
		printf("���� ���� ��? (�÷��̾�1)");
		int p1, p2;
		scanf_s("%d", &p1);
		scanf_s("���� ���� ��? (�÷��̾�2");
		scanf_s("%d", &p2);
		p1 %= 3; //3���� ���� ������������ ����������
		p2 %= 3;
		switch (p1)
		{
		case 0: //����
			printf("����\n");
			switch (p2)
			{
			case 0:
				printf("p2: ����\n");
				printf("���\n");
				break;
			case 1:
				printf("p2: ����\n");
				printf("��\n");
				break;
			case 2:
				printf("p2: ��\n");
				printf("�̱�\n");
				break;
			default:
				break;
			}
			break;
		case 1: // ����
			printf("����\n");

			switch (p2)
			{
			case 0:
				printf("p2: ����\n");
				printf("�̱�\n");
				break;
			case 1:
				printf("p2: ����\n");
				printf("���\n");
				break;
			case 2:
				printf("p2: ��\n");
				printf("��\n");
				break;
			default:
				break;
			}
			break;
		case 2: // ��
			printf("��\n");

			switch (p2)
			{
			case 0:
				printf("p2: ����\n");
				printf("��\n");
				break;
			case 1:
				printf("p2: ����\n");
				printf("�̱�\n");
				break;
			case 2:
				printf("p2: ��\n");
				printf("���\n");
				break;
			default:
				break;
			}
			break;

		default: //���ܻ�Ȳ�� ��� ���� �ڵ尡 �ʹ� �����
			break;
		}


		// 2-2. ���� ���������� if
		if (p1 == ����)
		{
			printf("����!\n");
			if (p2 == ����)
			{
				printf("p2 ����!\n");
				printf("���\n");
			}
			else if (p2 == ����)
			{
				printf("p2 ����\n");
				printf("��\n");
			}
			else if (p2 == ��)
			{
				printf("p2 ��\n");
				printf("�̱�\n");
			}

		}
		else if (p1 == ����)
		{
			printf("����!\n");
			if (p2 == ����)
			{
				printf("p2 ����!\n");
				printf("�̱�\n");
			}
			else if (p2 == ����)
			{
				printf("p2 ����\n");
				printf("���\n");
			}
			else if (p2 == ��)
			{
				printf("p2 ��\n");
				printf("��\n");
			}
		}
		else if (p1 == ��)
		{
			printf("��!\n");
			if (p2 == ����)
			{
				printf("p2 ����!\n");
				printf("��\n");
			}
			else if (p2 == ����)
			{
				printf("p2 ����\n");
				printf("�̱�\n");
			}
			else if (p2 == ��)
			{
				printf("p2 ��\n");
				printf("���\n");
			}
		}
#pragma endregion 
	}


	if (0) {
#pragma region �������-��������
		


#pragma endregion
	}

	//3. �� - ����� ���� 12��
	printf("����?");
	int year;
	scanf_s("%d", &year);
	switch (year % 12)
	{
	case 0:
		printf("������\n");
		break;
	case 1:
		printf("��\n");
		break;
	case 2:
		printf("��\n");
		break;
	case 3:
		printf("����\n");
		break;
	case 4:
		printf("��\n");
		break;
	case 5:
		printf("��\n");
		break;
	case 6:
		printf("ȣ����\n");
		break;
	case 7:
		printf("�䳢\n");
		break;
	case 8:
		printf("��\n");
		break;
	case 9:
		printf("��\n");
		break;
	case 10:
		printf("��\n");
		break;
	case 11:
		printf("��\n");
		break;
	default:
		break;
	}

	//3-2. if
	int myThee = year % 12;

	enum �������� temp = ������;
	printf("%d\n", temp);

	if (myThee == ������)
		printf("������\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ����)
		printf("����\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ȣ����)
		printf("ȣ����\n");
	else if (myThee == �䳢)
		printf("�䳢\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ��)
		printf("��\n");
	else if (myThee == ��)
		printf("��\n");
return 0;
	}