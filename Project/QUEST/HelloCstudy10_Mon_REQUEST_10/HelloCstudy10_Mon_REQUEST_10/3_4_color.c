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

void change_color(char a, char b)
{
    char color[9] = "color "; //color a0\0 //10ĭ 20ĭ�� ����
    color[6] = a; // c.o.l.o.r. .6��°=7�� ����
    color[7] = b; //a0  0a
    color[8] = NULL; //c.o.l.o.r. . 8��°=9�� null
    system(color);
}
int main()
{
    textcolor('I');
    change_color('d', '7');

}

