#pragma once
//��������
//������ �̸�, ������ ����, ���� ���� �ڵ�
//�ǻ߶�� ���� 2���� �̻��� �� ������
//���� ���� �ڵ� = �ֹι�ȣ �����ŷ� ������ ��.

struct Mystructs
{
	char name[100]; //ȣȣ, ����, �����佺
	char species[100]; //�� ����� ��
	char code[100];
	//�����ڵ�
	//�й� ���� ��
	//���ڷ� �ص� ���ݾ�
	//

	//09�й��� int�� ������ �տ� 0�� ������� ���ڿ��� �й� ���

}typedef Animal;

//���� ����� ���� ��
struct Food
{
	int price;
	char name[100];
}typedef taco;

struct StudentScore
{
	int kor;
	int eng;
	int math;
}typedef StudentScore;

struct KBStudnet
{
	int cScore;
	int javaScore;
	char name[100];
}typedef KBStudent;