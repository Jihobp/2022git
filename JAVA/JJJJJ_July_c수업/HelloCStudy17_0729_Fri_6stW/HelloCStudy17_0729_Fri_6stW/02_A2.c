#include<stdio.h>
struct Game3DPos
{
	int x;
	int y;
	int z;
}typedef Game3DPos;
//struct Game3DPos �� Game3DPos �� ������ ��.
//�� �տ� struct �� ��� ��,.



int main()
{
	Game3DPos g1 = { 10,20,30 }; // ����ü g1�� ������ ������� ���� �ִ´�.
	//�̷��� ������ ������ �ٲ� ��
	//zxy �̷��� ��� ��
	Game3DPos g2 = { .x = 10, .y = 20, .z = 30 };
	Game3DPos g3;
	g3.x = 10; //����ü ��ȯ�� x ��
	g3.y = 20;
	g3.z = 15;
	Game3DPos g4; //����ü g4 ����
	scanf_s("%d %d %d", &g4.x, &g4.y, &g4.z); //����üg4�� x��(g4.x)�� �ּ�(&)�� �ִ´�. 
	printf("%d %d %d", g4.x, g4.y, g4.z);

	return 0;
}