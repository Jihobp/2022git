#include <stdio.h>
#include <windows.h>
//4. 반환값은 없고 매개변수 char 2개에 의하여 배경색과 글자색을 바꾸는 함수 구하시오.
//아래 부분 참고할 것!
//COLOR[attr]
//attr        콘솔* 출력의 색 특성을 지정합니다.

//driver code
void textcolor(char text)
{
    printf("%c", text);
}

void change_color(char a, char b)
{
    char color[9] = "color "; //color a0\0 //10칸 20칸도 ㅇㅋ
    color[6] = a; // c.o.l.o.r. .6번째=7에 문자
    color[7] = b; //a0  0a
    color[8] = NULL; //c.o.l.o.r. . 8번째=9에 null
    system(color);
}
int main()
{
    textcolor('I');
    change_color('d', '7');

}

