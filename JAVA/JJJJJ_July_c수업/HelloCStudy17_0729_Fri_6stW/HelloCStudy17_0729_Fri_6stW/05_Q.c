#include<stdio.h>
//1.
struct KBStudent
{
	int cScore;
	int javaScore;
	char name[100];
};
int main()
{
	//2.
	struct KBStudent s1 = { 10,20, "jinx"};
	scanf_s("%d %d %s", &s1.cScore, &s1.javaScore, &s1.name); //����üg4�� x��(g4.x)�� �ּ�(&)�� �ִ´�. 
	printf("%d %d %s", s1.cScore, s1.javaScore, s1.name);
	
	

	/*	1. KBStudent ��� ����ü�� �����.
		�ȿ� ���� ������ �Ʒ��� ����.
		int cScore, int javaScore, char name[100]

		2. �л� 1���� ����� ����.�ڵ�ε� �� �����غ��� scanf�ε� �� �����غ���.

		3. �л��� 5�� �����.

		4. c, java ������ ������ ���Ѵ�.

		5. c, java�� ����� ���Ѵ�.

		6. c, java���� ���� ���� 1������ ���Ѵ�. < ->������ ���Ѵ�.

		7. ��ü���� ������� ���� �� ���� 1������ ���Ѵ�. < ->������ ���Ѵ�.

		8. 4~7������ �迭�� �Ű������� �Ͽ��� ���� �����Ѵ�.

		9. �Լ� �ȿ��� StudentScore�� �迭 ����� �� �迭 �����ϴ� �Լ� ����� ����.

		10. StudentScore �迭�� �Ű������� �Ͽ� ����ϴ� �Լ� ����� ����.*/
}