#include <stdio.h>
#include <windows.h>
//4. ��ȯ���� ���� �Ű����� char 2���� ���Ͽ� ������ ���ڻ��� �ٲٴ� �Լ� ���Ͻÿ�.
//�Ʒ� �κ� ������ ��!
//COLOR[attr]
//attr        �ܼ�* ����� �� Ư���� �����մϴ�.

//driver code
void textcolor(char text)
{
    printf("%c", text);
}

void backgroundcolor(char back)
{

}


void change_color(char a, char b)
{
    char color[9] = "color "; 
    color[6] = a; 
    color[7] = b; 
    color[8] = NULL; 
    system(color);
}
int main()
{
    textcolor('I');
    change_color('d', '7');
    
//0 = ������       8 = ȸ��
//1 = �Ķ���        9 = ���� �Ķ���
//2 = ���       A = ���� ���
//3 = û�ϻ�        B = ���� û�ϻ�
//4 = ������         C = ���� ������
//5 = ���ֻ�      D = ���� ���ֻ�
//6 = �����      E = ���� �����
//7 = ���       F = ���� ���

