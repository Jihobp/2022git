#include<stdio.h>
#include"Mystructs.h"//����ü ����
void printAnimal(Animal ani)
{
	printf("������ : %s\n", ani.name);
	printf("������ : %s\n", ani.species);
	printf("�����ڵ� : %s\n", ani.code);
}
void FoodTruck()
{
	taco f;
	printf("������ ������?");
	scanf_s("%d", &f.price);
	printf("���ĸ�?");
	rewind(stdin); //���� > ���ڿ��̶� rewind
	gets(f.name); //  ?????????????????????????????????????????????????????????????????????????????????????????
	return f;
}
int main()
{
	Animal a1 = { "�����佺", "����","�׶�" };
	Animal a2 = { .name = "�����",.species = "�Ǹ���","0002" };
	Animal a3;
	strcpy(a3.name, "��ī��");
	strcpy(a3.species, "��");
	strcpy(a3.code, "025");
	Animal a4;
	gets(a4.name);
	gets(a4.species);
	gets(a4.code);
	//���ڿ� ���µ� rewind�� �ʿ����>? gets ������ �� ���� �� �ʿ� ���٤�����
	printf("%s %s %s\n", a1.name, a1.species, a1.code);
	printf("%s %s %s\n", a2.name, a2.species, a2.code);
	printf("%s %s %s\n", a3.name, a3.species, a3.code);
	printf("%s %s %s\n", a4.name, a4.species, a4.code);

	struct Food f1 = { 5500,"�н�" };
	taco f2 = { .price=70000,.name="�Ͻ�" };
	taco f3;
	f3.price = 50000;
	strcpy(f3.name, "�߽��ڽ�");
	taco f4; //???? -> ����ü f4��; ����
	scanf_s("%d", &f4.price);
	rewind(stdin);
	gets(f4.name);
	printf("%s %d\n", f1.name, f1.price);
	printf("%s %d\n", f2.name, f2.price);
	printf("%s %d\n", f3.name, f3.price);
	printf("%s %d\n", f4.name, f4.price);


	printAnimal(a1);
	printAnimal(a2);
	printAnimal(a3);


	printf("���� �� ���ϴ� ~~~\n");
	taco myfood = FoodTruck();
	printf("%s %d\n", myfood.name, myfood.price);

	//gets �� �ƴ϶� scanf ���� ���ڿ� �޺κ� ��©���ٱ�????????????????????????????????????????????????????????????

	return 0;
}