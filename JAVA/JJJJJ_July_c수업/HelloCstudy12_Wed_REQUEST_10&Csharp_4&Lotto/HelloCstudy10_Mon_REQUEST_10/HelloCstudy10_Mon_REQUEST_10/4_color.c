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
    
//0 = 검은색       8 = 회색
//1 = 파란색        9 = 연한 파란색
//2 = 녹색       A = 연한 녹색
//3 = 청록색        B = 연한 청록색
//4 = 빨간색         C = 연한 빨간색
//5 = 자주색      D = 연한 자주색
//6 = 노란색      E = 연한 노란색
//7 = 흰색       F = 밝은 흰색

