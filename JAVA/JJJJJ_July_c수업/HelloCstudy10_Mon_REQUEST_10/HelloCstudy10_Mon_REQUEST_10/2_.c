#include<stdio.h>
//2. Sec(��) ���� �Է¹޾Ƽ� �ð��� h�� m�ʶ�� �� ����ϵ�, 
// 3600�̻��� ���� ������ //���� �޽����� ����Ѵ�.
//�׸��� m ���� ��ȯ�Ѵ�.
int main(void)
{
	int h, m, s;
	printf("�� �Է��ϼ���.");
	scanf_s("\n%d�ʸ� �Է��ϼ���.\n", &s);

	/*if (m > 60)
	{
		s= m/60; //���Կ����� ���� !
		m -= 60;
		h++;
		printf("%d", h);
	}
	if (s > 60)
	{
		s = s%60;
		s -= 60;
		m++;
		printf("%d", s);
	}
	if (m < 60)
	{
		printf("%d", m);
	}
	else if (s > 3600)
	{
		printf("�����Դϴ�.");
		return m;
	}*/
	return 0;


	//1000/60=m,���� ��
	//1000%60=s,�������� ��
	if (0)
	{
		int h, m, s;
		scanf_s("%d %d %d", &h, &m, &s);

		if (m > 60)
		{
			m -= 60;
			h++;
		}
		if (s > 60)
		{
			s -= 60;
			m++;
		}
		if (m < 60)
		{
			printf("%d", m);
		}
		else if (m >= 60)
		{
			m -= 60;
			printf("%d", m);
		}
	}
}





