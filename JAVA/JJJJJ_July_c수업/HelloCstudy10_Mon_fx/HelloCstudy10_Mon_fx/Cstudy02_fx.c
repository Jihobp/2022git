#include<stdio.h>
//1. ��ȯ���̶� �Ű������� ���� �Լ�,
void printfMySelf() // �Լ� ����
{
	printf("�ȳ��ϼ���.\n");
	printf("�̵����Դϴ�.\n");
	printf("�ݰ����ϴ�.\n");
	printf("���� ���α׷��� �����Դϴ�.\n");
}

//������ �����ε�, 0�̳� ������ �׳� 0��ȯ��.
//2. ��ȯ���̶� �Ű������� �� �� �ִ� ��.
int MathPower(int num) // ����
{
	if (num <= 0)
		return 0;

	return num * num;
}

//3. ��ȯ���� �ִµ� �Ű������� ���� ��,.
char calcul()//�� ���� ���ڸ� �Լ� �ȿ��� �Է¹���
{			//�� �Ϳ� ���� ���� ����� ���� - 0 + ���� ��ȯ��
	printf("ù ��° ���� �Է��غ�����.");
	int num1;
	scanf_s("%d", &num1);
	printf("�� ��° ���� �Է��غ�����.");
	int num2;
	scanf_s("%d", &num2);
	int result = num2 - num1;
	if (result < 0)
		return'-';
	else if (result == 0)
		return '0';
	else
		return '+';
}

void calcul_sign(int num1, int num2)
{
	int result = num2 - num1;
	if (result < 0)
		printf("��ȣ�� -�Դϴ�.\n");
	else if (result == 0)
		printf("��ȣ�� 0�Դϴ�.\n");
	else
		printf("��ȣ�� +�Դϴ�.\n");
}

// 4. ��ȯ���� ���µ� �Ű������� �ִ°�.
int main()
{
	printfMySelf(); // ȣ��
	int result = MathPower(5);
	printf("5�� ������ %d�Դϴ�.\n", result);
	printf("3�� ������ %d�Դϴ�.\n", MathPower(3));
	result = MathPower(-7);
	printf("result =%d\n", result);

	char sign = calcul(); // calcul�̶� �Լ��� ȣ���ϸ� ���� �ΰ� ȣ���ϰ� 
	printf("��ȣ�� %c�Դϴ�.\n", sign); //�װſ� ���� ����� ����Ʈ.
	
	int n1, n2; //�Է��� main���� �ϰ� �ִ�...
	printf("ù��°��?");
	scanf_s("%d", &n1);
	printf("�ι�°��?");
	scanf_s("%d", &n2);
	calcul_sign(n1, n2); //n1, n2 �޾Ƽ� ����ؼ� �������.
	//�Է��ϴ°� scnaf�� �ȴ�? >>> calcul_sign(30,30); 30-30�ؼ� 0�� ����ϴ� ��.

	calcul_sign(30, 30);
	return 0;
}
