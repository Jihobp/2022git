#include<stdio.h>
int main() {
	char a = { 0 }, b = { 0 }, c;
	a = getchar();
	printf("%c\n", a);

	rewind(stdin);
	b = getchar();
	printf("%c\n", b);

	//rewind(stdin); 
	//�ʱ�ȭ�� �����༭ enter�� �� �־ �Է���ü�� �ȵȴ�!
	c = getchar();
	printf("%c\n", c);

	//scanf_s("%c", &b);
	//gets();
	//a = getchar();



	//1�� ����. �����ؼ� �۵��ϰ� �����. > ����ؼ� ��Ű�� �������϶�.
	char a[7]; //a�� 7��° ���� �迭 
	a = "monkey"; //��Ű��� ���ڰ� �Էµ� a
	printf("%s", &a); //��Ű�� �� a��� ���ڿ� ���


	//2�� ����. 1�� ���� �� ���� �����ؼ� �۵��ϰ� �����.
	int b;
	b = "monkey";
	printf("%c", b);
}