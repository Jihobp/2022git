#include<stdio.h>

//1.
void printnumber(int a, int b)
{
	if (a < b)
	{
		printf("%d�� %d���� ũ��.", b,a);
	}
	else
	{
		printf("%d�� %d���� ũ��.", a,b);
	}
}



//2.
void returnnumber(int a, int b)
{
	if (a < b)
	{
		return b;
	}
	else
	{
		return a;
	}
}

//3. swap �Լ�? https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=doksg&logNo=221567106026 
void changenumber(int a, int b)
{
	int temp = a;
	a = b;
	b = temp;
}

//�Լ��ȿ��� a,b ���� �ٲ��� �ʴ´�. ���� ��ġ�� �ٲ��� ��.
//���� "��:"�� �ٲٰ� �ʹٸ� ������*�迭�� �ٲ��༭ 
//���� ���� a�� b�� ���� �Լ� �ȿ����� ���� ��ü �ȴ�. ��ǻ� ��ü�� ���� �ʴ� ���̴�.
//���� ���� �����ϰ� �ʹٸ� �Լ����� �ٲٰ��� �ϴ� ������ �ּ� ���� �������ָ� �ȴ�.
//�� �ּҿ� �ִ� ���� ���� �ٲ�޶� ��� �ϸ� �׶��� �ּҿ� �����Ͽ� �� ���� ���� �ٲ� �ְ� �ȴ�.
//void swap(int* a, int* b)
//{
//	int temp = *a; //a ��ġ�� ��.
//	*a = *b;
//	*b = temp;
//}