#include<stdio.h>
// �Լ� : �ڵ并ġ
// �̸� ����� �� �ڵ� ���
// ���� �ȿ��ٰ� �� ��� �Ǵ� �����������
// ���� ������ �ִ��� �����ϰ� �ϱ� ���ؼ� 
// �Լ���� ���� �������.

//�Լ� 4���� ����
//��ȯ��(return)�� �Ű�����(parameter, argument)
//  X                 X
//  O                 X
//  X                 O
//  O                 O
void enterKey() //�� �� ��� �͸� �Ѵ�.
{
	printf("\n");
}
void printPowerNumber(int n) //�Ű������� ����
{							//���ڸ� �����ؼ� ���
	printf("%d", n * n);
}
int inputNum() //���ڸ� �Է¹���
{
	int n;
	printf("���� �Է��ؿ�\n");
	scanf_s("%d", &n);
	return n; //�Է°��� ���ϰ�
}
//�Ű������� ��ȯ�� �� �� �ִ� ��
int PowerNum(int n, int p) //n: ����, p:���� ��
{
	if (p <= 0) //���� ������ ���� ����. 0�� =1
		return 1;
	else if (p == 1)
		return n;
	else {
		int num = n;
		for (int i = 0; i < p - 1; i++) //���۰� -1 -> int i=1;, i<p; i++ �̷��� �ص� ����
			n = n * num; // n *=num
	}
	return n;
}

/*1. ���� ���� �Լ��� ��� �� Ȱ���غ��� (ȣ���غ���)



*/

void printnumber(int x) //2��. ���ϰ�x==���̵� 
{	
	printf("%d", x);
}

int main()
{
	//3�� 2������ ���� �Լ��� �̿��� PowerNum�� return�� ���
	int n, p; //���� ������ �Լ�������������
	scanf_s("%d %d", &n, &p);
	printnumber(PowerNum(n,p)); //->>> int PowerNum(int n, int p) �� ����� �����Ϥ�����
	

	//4�� 2������ ���� �Լ��� �̿���
	//PowerNum�� return�� ����ϴ� ��
	//���� �Է½� �츮�� ���� ���� �Լ��� �̿��ϱ�
	int num = inputNum();
	int power = inputNum();
	printnumber(PowerNum(num, power));

	/*int=n;
	scanf_s("%d", &n);
	printPowerNumber(n);
	return 0;*/
	if (0)
	{
# pragma region �����ð��� ���� �� ��

		int num = inputNum();
		printPowerNumber(num);
		enterKey(); //�� �� ���
		printPowerNumber(inputNum());
		enterKey();
		printf("���� 2���� ���ؼ� �Է¹ް� ����غ�\n");
		printf("%d", PowerNum(inputNum(), inputNum())); //�̰� �� ��. ???????????????????????????????????????????????/

		//ȣ���غ���(1��)
		enterKey(); //�� �� ��� ȣ��
		printPowerNumber(3); //���� ���
		enterKey();
		int mynum = inputNum();
		int result = PowerNum(mynum, 3); //������ ���

		//2�� - ���ο� �Լ� ���� �׽�Ʈ�� �غ�
		enterKey();
		printnumber(result); // ȣ��
		enterKey();

		//3��
		//�Է��� ���� ��ȯ - inputNum()
		//PowerNum - �Է��� ������ p���� ���
		//�� ����� ȭ�鿡 �Ѹ�
		printnumber(PowerNum(inputNum(), 2));

#pragma endregion
	}
}

//ȣ�� : ���ο� �Լ� �ҷ��ͼ� ���� 

