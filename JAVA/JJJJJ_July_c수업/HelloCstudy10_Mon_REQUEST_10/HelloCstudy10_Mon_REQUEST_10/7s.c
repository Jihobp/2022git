//7. 5���� 6�� �Լ� �̿��Ͽ�
//�Ű������� �̿��ؼ� a���� b���� ���ϰų� ���ؼ�
//�� ����� ��¸� ���ִ� �Լ� �����
//(�Ű������� + �� * Ȥ�� x, X�̷��� 4���� �����)
//ex) calc(1, 10, '+')  -> 1���� 10���� ����
//ex) calc(1, 10, '*')  -> 1���� 10���� ����
//ex) calc(1, 10, 'x')  -> 1���� 10���� ����
//ex) calc(1, 10, '-')->���ܸ޽���

#include<stdio.h>
int mulmul(int a, int b)
{
	int mul = 1;
	for (int i = a; i <= b; i++)
	{
		mul *= i;

	}
	return mul;
}
int sumsum(int a, int b)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{	

		sum += i;

	}
	return sum;
}



int calcul(char asd, int a, int b)
{	
	if (asd == 'x' || asd == 'X' || asd == '*')
		return mulmul(a, b);

	else if (asd == '+')
		return sumsum(a, b);
	
}


int main()
{
	char qwe;
	int c, d;
	scanf_s("%c", &qwe, 1); //�ּҰ�, ���ڴ� 1���� SIZEOF �ʿ���� 1byte�� �Ҵ����ָ� �Ǽ� 1.
	scanf_s("%d %d", &c, &d); //��𼭺��� ������ ���ϰų� ������ �޴´�.
	printf("%d", calcul(qwe,c,d)); //����


	return 0;
}



//
void calcul(char asd, int a, int b)
{
	if (asd == 'x' || asd == 'X' || asd == '*')
		printf("%d", mulmul(a, b)); //mul

	else if (asd == '+')
		printf("%d", sumsum(a, b)); //sum

}


int main()
{
	char qwe;
	int c, d;
	scanf_s("%c", &qwe, 1);
	scanf_s("%d %d", &c, &d);
	calcul(qwe, c, d);


	return 0;
}
