import java.util.*;
//복습02 // 남은 시간 계산
class Clock { //클래스 선언
    private int h;	//멤버변수 선언
    private int m;
    private int s;

    public Clock(int hh, int mm, int ss) { //생성자 선언 //초기값.//새로운 공간에 값을 집어넣어주는 것. 
    	//공간 영역전개!!!!! 만해!!!!만카이!!!!!!!! //아님. 무월!!!! 한번 밖에 못쓰는 초초궁극기 !!!!!!!! 
        h = hh;
        m = mm;
        s = ss;}

    public void changeTime(int h1, int m1, int s1) {this.h=h1; m=m1; s=s1;} //함수 선언
    //함수는 소문자로 시작한당. 띄어쓰기는 구분할려고 대문자로 해줌 _언더바 쓰거나 ㅇㅅㅇ //언더바는 손구락 불편 놉.
    //만해!!! 만카이!!!!!!!!!!!!!!!!!!!!!!!!!!! 
    //이미 들어가 잇는 메모리 값을 함수를 써서 바꿔주는 것. 포인터 안의 내용물을 바꿔주는것.

    //잘적어놔랑 ㅇㅅㅇ ~~~~~ 이해하기 쉽게 구분하게 쉽게!!! 
    public int getH() {return this.h;}	//공용 정수타입 함수명 {반환 이것.h를.}
    public int getM() {return this.m;}	
    public int getS() {return this.s;}

    //함수
    public void ccc(int h3, int m3, int s3) { //남은 시간 계산
        h -= h3;
        m -= m3;
        s -= s3;
        if (s < 0) {m--; s += 60;}
        if (m < 0) {h--; m += 60;}
        if (h < 0) {h += 24;}}
}

//getSvm >>......sad....intelli에선 된댜.....;ㅅ;
public class java0822_Clock_YT{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
    Clock c[] = new Clock[2]; //클락이란 타입의 배열을 두칸 만든다. //배열타입이 클락인것. clock=int, 
    // 내.일. 해. 내.일. 해 //시계 두개 만든다.
    
    c[0] = new Clock(s.nextInt(), s.nextInt(), s.nextInt()); //무월!!! >>> 만해 !! 생성자 쓰고있다,
    //c 0번째 클ㄹ락 //현재시각만듬.
    //시분초를 입력해서 새로운 시계를 만든다.
   // LocalTime now = LocalTime.now(); // 자동화
   // int hour = now.getHour(), minute = now.getMinute(), second = now.getSecond();
   //c[0] = new clock(hour, minute, second);

    c[1] = new Clock(c[0].getH(), c[0].getM(), c[0].getS()); //수업종료시각//
    //c의 1번째 배열에, c의 0번째 즉 생성자 값에 함수로 get한 값을 넣는다. 
    //c의 0번째 시계의 시분초를, 첫번째 시계에 넣어서 만든다.
    
    //41번째 줄에서 nextInt 값을 가져와서 h,m,s 에 넣어준다. //생성자 값
    //같은 시간으로 설정해 주는 것.
    //c 0번쨰 값 복사
    //0번째의 시분초를 가져와서 새로운 시분초를 만든다.
    //Q. c[0].getM() 의 값은? 
    
    //.은 안에 있는 기능을 쓰겠다 =함수, 변수 등. 
    //c의 첫번째 배열에, changeTime 이라는 함수를 불러와서X Clock 안에 있는 changeTime 함수를 불러와서 사용한다.O
    //Scanner 안에 있는 nextInt라는 함수를 불러와서 숫자를 입력받겠다.
    c[1].changeTime(s.nextInt(), s.nextInt(), s.nextInt()); 
    //첫번째 시계의 시분초를 입력한 값으로 바꿔준다.
    //. = 안의
    //c[1] = new clock(16, 40, 30); // 종료시각 세팅

    System.out.printf("현재 시각은 %02d시 %02d분 %02d초\n", c[0].getH(), c[0].getM(), c[0].getS());
    System.out.printf("수업 종료시각은 %02d시 %02d분 %02d초\n", c[1].getH(), c[1].getM(), c[1].getS());

    c[1].ccc(c[0].getH(), c[0].getM(), c[0].getS()); //남은 시간의 차이를 계산한다. c[0]과 c[1]의 차이를 계산한다.
    System.out.printf("수업 종료까지 남은 시간은 %02d시 %02d분 %02d초\n", c[1].getH(), c[1].getM(), c[1].getS());
	//%02d 는 10진수 두자리의 정수로 표시한다. 한자리일 경우 앞에 0을 붙여서 출력.
    //https://blog.jiniworld.me/68 3번까지 ㅇㅅㅇ 보기!
    //단백질프로틴바+오트밀크+커피 점심
	}
}