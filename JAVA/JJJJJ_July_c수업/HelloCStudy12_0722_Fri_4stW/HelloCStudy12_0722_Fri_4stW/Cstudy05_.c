#include<stdio.h>
struct Student
{
	int math;
	int eng;
	int kor;
};


//1. 
struct Rectangle
{
	int width;
	int height;
};

//2. �Լ�
int recfx(int rec, int wid, int hei)
{
	wid * hei = rec;
	return rec;
}

int main()
{
	struct Student s1;
	s1.math = 50;
	s1.kor = 60;
	s1.eng = 100;

	struct Student s2;
	s2.math = 100;
	s2.kor = 100;
	s2.eng = 0;

	//1���� ������ 3���� ���� ������.
	struct Student s3;
	scanf_s("%d", &s3.math);
	scanf_s("%d", &s3.eng);
	scanf_s("%d", &s3.kor);
	

	//3.
	int x, y;
	int myrec=recfx(x,y);
	scanf_s("%d %d ", &x, &y);
	printf("Rectangle�� ���̰�%d�� %d*%d�̴�.", myrec, x, y);







	return 0;
}