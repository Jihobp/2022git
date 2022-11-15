import java.util.*;
//1. 현재 시각 출력하는 클래스(clock)만들기 (멤버 변수는 private으로)

//2. 위 클래스에 대한 c1, c2 객체 생성
//생성자 통해서 현재 시각(시분초 모두)으로 초기화
//2개 값 동일하게 설정->scanner로 입력받기

//c2 객체의 시분초 값 점심시간으로 변경하기
//멤버 함수 통하여 c1, c2간 시간 차이 계산
//아래 양식처럼 출력

//양식
//현재 시각은 __시 __분 __초
//점심시간은 __시 __분 __초
//점심시간까지 남은 시간은 __시 __분 __초

class Zeit{
	//1. 현재 시각 출력하는 클래스 만들기
	private int Stunde;
	private int Minute;
	private int Sekunde;

	//2. 생성자 선언부 -만들어야 객체 받음.
		public Zeit(int h, int m, int s) {
		this.Stunde=h;
		this.Minute=m;
		this.Sekunde=s;
		}
	//2. 멤버 함수 만들기
		//해당 함수가 호출되면 얼마든지 값을 변경 가능/.
		public void setTime(int h, int m, int s){
			this.Stunde=h;
			this.Minute=m;
			this.Sekunde=s;
			}
	public int getStunde() {return this.Stunde;}
	public int getMinute() {return this.Minute;}
	public int getSekunde() {return this.Sekunde;}
	//public void setStunde(int h) {this.Stunde=h;}
	//public void setMinute(int m) {this.Minute=m;}
	//public void	setSekunde(int s) {this.Sekunde=s;}
	//void는 리턴 값 없다.
}


public class java0822_Q1 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("현재 시간은?");
	int Stunde=s.nextInt();
	int Minute=s.nextInt();
	int Sekunde=s.nextInt();
	
	Zeit z1=new Zeit(Stunde, Minute, Sekunde);
	Zeit z2=new Zeit(Stunde, Minute, Sekunde);
	
	z2.setTime(12,40,0);
	
	int sub_h=z2.getStunde()-z1.getStunde();
	int sub_m=z2.getMinute()-z1.getMinute();
	int sub_s=z2.getSekunde()-z1.getSekunde();

	System.out.println("현재 시각은 "+z1.getStunde()+"시 "+z1.getMinute()+"분 "+z1.getSekunde()+"초 ");
	System.out.println("현재 시각은 "+z2.getStunde()+"시 "+z2.getMinute()+"분 "+z2.getSekunde()+"초 ");
	System.out.println("점심시간까지 남은 시간은 "+sub_h+"시 "+sub_m+"분 "+sub_s+"초 ");
	//현재 시각은 __시 __분 __초
	//점심시간은 __시 __분 __초
	//점심시간까지 남은 시간은 __시 __분 __초

	/*
	//현재 시간
	LocalTime now=LocalTime.now();

	//현재시간 출력
	System.out.println(now);
	
	//시,분,초 구하기
	int hour=now.getHour();
	int minute=now.getMinute();
	int second=now.getSecond();
	
	//시,분,초 출력
	System.out.println(hour);
	System.out.println(minute);
	System.out.print(second);
	*/
	
	}
}
