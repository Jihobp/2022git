#include <stdio.h>
#include <windows.h>
//https://wenna.tistory.com/13  
// �츮�� �� ������ �ذ��ϱ� ���� windows.h ��������� ����� ���̴�.
//window.h ��������� �����쿡�� �����ϴ� ���(Ư�� cmd)�� ���� ������ �� �ֵ��� �����ִ� ��������̴�.
//�� ������Ͽ��� �Ʒ��� ���� ���� �������ִ� ��ɾ ���ԵǾ��ִ� :
//SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), n); // 0 �� n �� 15�� ����
//�������� n�� �츮�� cmd�� color 1[2, 3]�� ���� ��ɾ ����� ���� �����ε�,
//�ܼ�â�� help color �Ǵ� color ? ��ɾ �Է��ϸ� ������ �������ش�.

//3. ��ȯ���� �Ű������� ������ ȭ���� ������ �ٲ� �� �ִ� �Լ��� ���Ͻÿ�.
//system('color a0') �̿�
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

//4. ��ȯ���� ���� �Ű����� char 2���� ���Ͽ� ������ ���ڻ��� �ٲٴ� �Լ� ���Ͻÿ�.
//�Ʒ� �κ� ������ ��!
//COLOR[attr]
//attr        �ܼ�* ����� �� Ư���� �����մϴ�.
if(0)
{ //console ��Ʈ��ũ�� �ƴ� ��ǻ�Ϳ� ���� ����� ��� ��ȭ�� ��ġ�Դϴ�.
    //console : ������ġ, terminal : �ܸ���
    // �ܼ��� ���������δ� ����ǰ� �Է���ġ�� ������ ����� ���� �پ� �ִ�, ��ǻ�͸� �����ϱ� ���� ���ۺζ�� �����Ͻø� �˴ϴ�.
    //�͹̳��� Ű����� ����� ������ �̷���� �ܸ����� �����Ͻø� �ǰ��.
    //�ܼ��� ���� ����� �մϱ� ?
    //�ǽð����� �ڹٽ�ũ��Ʈ�� �����ϰ� ���� �޽������� ������ִ� ����� �մϴ�.
    ////�ܼ��̶�? �ܼ��̶� �밳 ���÷��� ����Ϳ� Ű����(�Ǵ� �Է��� ������ �ٸ� ��ġ)�� ���յ� ��ġ�� ���Ѵ�. 
    //�ܼ��� �ٸ� ���δ� �͹̳��̶�� �θ���. �ܼ��̶�� ���� ����ũ����ǻ�ͳ� ���������ӿ� �����Ǿ� �־�, �ý����� ��Ȳ�� ������ϴµ� ���Ǵ� �͹̳��� �ǹ��Ѵ�.
    //�ܼ��̶� ����� �Ǵ� ���÷��� ȭ���� �θ��� �ٸ� ���̴�.
    //�밳 ��ǻ���� ���¸� �����ϴ� ��ϰ質 ������ġ�� �� �ٷ� �þ �ְ�, ���۷����Ͱ� ��ǻ�͸� ������ �� �ֵ��� ����ġ�� �޸� ��ġ�� ���Ѵ�.
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

//enumerated type, �ٷ� ������(enum)�� ����ε���!!!!enum �����ϱ�!
//���ϴ� ������ ����� ������ ��α��� ���ڸ� ������ ã�� �ʰ�, ������̸� textcolor(YELLOW); �Ķ����̸� textcolor(BLUE);
//��� ���� ����ϱ� ���� ��
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


//�� Ư���� �� �ڸ��� 16������ �����˴ϴ�.
//ù° �ڸ��� ������ �ش��ϰ� ��° �ڸ��� ������� �ش��մϴ�.
//�� �ڸ��� ���� ���� �� �� �ֽ��ϴ�.

//0 = ������       8 = ȸ��
//1 = �Ķ���        9 = ���� �Ķ���
//2 = ���       A = ���� ���
//3 = û�ϻ�        B = ���� û�ϻ�
//4 = ������         C = ���� ������
//5 = ���ֻ�      D = ���� ���ֻ�
//6 = �����      E = ���� �����
//7 = ���       F = ���� ���

