#include <stdio.h>
#include <windows.h>
//https://wenna.tistory.com/13  
// 우리는 이 문제를 해결하기 위해 windows.h 헤더파일을 사용할 것이다.
//window.h 헤더파일은 윈도우에서 제공하는 기능(특히 cmd)을 쉽게 제어할 수 있도록 도와주는 헤더파일이다.
//이 헤더파일에는 아래와 같이 색을 변경해주는 명령어가 포함되어있다 :
//SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), n); // 0 ≤ n ≤ 15의 정수
//위에서의 n은 우리가 cmd에 color 1[2, 3]과 같이 명령어를 사용할 때의 숫자인데,
//콘솔창에 help color 또는 color ? 명령어를 입력하면 정보를 제공해준다.

//3. 반환값과 매개변수는 없으나 화면의 색깔을 바꿀 수 있는 함수를 구하시오.
//system('color a0') 이용
//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=sharonichoya&logNo=220874370397 
//system("cls");  //clears the screen
//system("color F0"); //Creates Bright White Background with black text
//system("type struct3.c  struct2.c");  /*prints the file struct3 and struct2 in the console*/
 // 0 for background Color(Black)
 // A for text color(Green)

if (0)#pragma region rrrrrrrr
{
    int main()
    {
        SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), FOREGROUND_GREEN | BACKGROUND_BLUE);
        printf("Hello\n");
        return 0;
    }

}
#pragma endregion


 
// Driver Code
int main()
{
    system("Color a0")
    // Print any message
    printf("HI!!!!!!!!!!!!!!!!!!!!!!!");
    return 0;
}

//4. 반환값은 없고 매개변수 char 2개에 의하여 배경색과 글자색을 바꾸는 함수 구하시오.
//아래 부분 참고할 것!
//COLOR[attr]
//attr        콘솔* 출력의 색 특성을 지정합니다.
if(0)
{ //console 네트워크가 아닌 컴퓨터에 직접 연결된 모든 대화형 장치입니다.
    //console : 제어장치, terminal : 단말기
    // 콘솔은 전통적으로는 계기판과 입력장치의 모음과 비슷한 것이 붙어 있는, 컴퓨터를 조작하기 위한 조작부라고 생각하시면 됩니다.
    //터미널은 키보드와 모니터 등으로 이루어진 단말기라고 생각하시면 되고요.
    //콘솔은 무슨 기능을 합니까 ?
    //실시간으로 자바스크립트를 실행하고 에러 메시지등을 출력해주는 기능을 합니다.
    ////콘솔이란? 콘솔이란 대개 디스플레이 모니터와 키보드(또는 입력이 가능한 다른 장치)가 조합된 장치를 말한다. 
    //콘솔을 다른 말로는 터미널이라고 부른다. 콘솔이라는 용어는 마이크로컴퓨터나 메인프레임에 부착되어 있어, 시스템의 상황을 모니터하는데 사용되는 터미널을 의미한다.
    //콘솔이란 모니터 또는 디스플레이 화면을 부르는 다른 말이다.
    //대개 컴퓨터의 상태를 지시하는 기록계나 점등장치가 한 줄로 늘어서 있고, 오퍼레이터가 컴퓨터를 조작할 수 있도록 스위치가 달린 장치를 말한다.
}

//driver code


void textcolor(char text)
{
    char attr[9];
    printf("%s", attr);
}

void backgroundcolor(char back)


int main()
{
    char backgroundcolor[100];
    char textcolor[100];
}

//enumerated type, 바로 열거형(enum)의 사용인데요!!!!enum 선언하기!
//원하는 색깔을 사용할 때마다 블로그의 글자를 일일이 찾지 않고, 노란색이면 textcolor(YELLOW); 파란색이면 textcolor(BLUE);
//몇몇 개만 사용하길 원할 때
//enum ColorType { WHITE = 15, GRAY = 8, BLUE = 9, GREEN = 10 }COLOR;
enum ColorType {
    BLACK,  	//0
    darkBLUE,	//1
    Dark Green,	//2
    darkSkyBlue,    //3
    DarkRed,  	//4
    DarkPurple,	//5
    DarkYellow,	//6
    GRAY,		//7
    DarkGray,	//8
    BLUE,		//9
    GREEN,		//10
    SkyBlue,	//11
    RED,		//12
    PURPLE,		//13
    YELLOW,		//14
    WHITE		//15
} COLOR;


//색 특성은 두 자리의 16진수로 지정됩니다.
//첫째 자리는 배경색에 해당하고 둘째 자리는 전경색에 해당합니다.
//각 자리는 다음 값이 될 수 있습니다.

//0 = 검은색       8 = 회색
//1 = 파란색        9 = 연한 파란색
//2 = 녹색       A = 연한 녹색
//3 = 청록색        B = 연한 청록색
//4 = 빨간색         C = 연한 빨간색
//5 = 자주색      D = 연한 자주색
//6 = 노란색      E = 연한 노란색
//7 = 흰색       F = 밝은 흰색

