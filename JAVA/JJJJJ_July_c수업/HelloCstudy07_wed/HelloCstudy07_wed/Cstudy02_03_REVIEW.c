#include<stdio.h>
int main()
{
	//���
	int number;
	//�Է�
	printf("���� �Է��ϼ���.");
	scanf_s("%d", &number);
	//number ������ �ּ�(��ġ)�� ����
	//�׸��� �� �ȿ� �� ���� ���� ����.
	printf("number=%d\n", number);

	//���ǹ�
	if (number > 0)
	{
		printf("number�� �������.\n");
	}
	else if (number == 0) // else if �� else ���� if �� �ִ� ��쵵 �ִ�. //==����, =����
	{
		printf("number�� 0�̿���.");
	}

	//�ݺ���
	//for while do while�� �ִµ�
	//���� ��ǥ���� �� for

	//�̵��� �������̶�� ������ 10�� ��½�Ű�� �ʹٸ�..?

	//�����ݷ�;�� �������� ��� �ִ°� �ٽ�.

	for (int i = 0; i < 10; i++) //i��� ������ 0�� ����ְ� i�� 10���� ������ üũ�ϰ� +1���������ش�.
		printf("�̵��� ������\n");

	int count = 0;
	//count ���� 10�� ����
	while (count < 10)
	{
		printf("count=%d\n", count);
		count++;
	}

	//while �ȿ� �ִ� ������ �����̴��� 
	// ������ 1���� ������. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! just do it
	//����� ���� count�� 10�̶� �� ��ȣ������
	//����
	do
	{
		printf("count=%d", count);
	} while (count < 10);


	return 0;
}