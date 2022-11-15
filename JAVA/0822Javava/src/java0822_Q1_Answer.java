import java.util.*;

//// 1. ////현재 시각 저장하는 클래스(ClockCC)만들기
class ClockC{
	private int hour;   //시간
	private int minute; //분
	private int second;	//초
	
	//생성자 만들기
	//객체 생성할 때에만 딱 한번 사용
	public ClockC(int h, int m, int s) {
		this.hour=h;
		this.minute=m;
		this.second=s;
	}
	//멤버 함수 만들기
	public void setTime(int h, int m, int s) {
		//해당함수가 호출되면 얼마든지 값을 변경 가능
		this.hour=h;
		this.minute=m;
		this.second=s;
	}
	public int getHour() {return this.hour;}
	public int getMin() {return this.minute;}
	public int getSec() {return this.second;}
}
public class java0822_Q1_Answer {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		////  2. //// ClockCC 클래스에 대한 c1, c2 객체 생성
		// 생성자 통해서 현재시각(시분초 모두) 초기화
		// c1,c2의 멤버 변수 값 동일하게 설정 - > scanner
		System.out.println("현재 시각을 입력하세요");
		// 현재 시각 입력받기
		int hour=s.nextInt();
		int minute=s.nextInt();
		int second=s.nextInt();
		// 입력값으로 멤버 변수 초기화하면서 객체 생성
		ClockC c1=new ClockC(hour, minute, second);
		ClockC c2=new ClockC(hour, minute, second);
		
		// c2 객체의 시분초 값을 점심시간으로 변경. -> 함수 만들기
		c2.setTime(12, 40, 0);
		
		// 멤버 함수 통해서 c1, c2 간 시간 차이 계산 --> 
		//1) 여기서 결과가 마이너스 아니게끔 연산을 추가
		int sub_h=c2.getHour()-c1.getHour();
		int sub_m=c2.getMin()-c1.getMin();
		int sub_s=c2.getSec()-c1.getSec();
		if(sub_s<0) { //계산한 초의 결과가 마이너스일때(초부터 먼저 계산)
			sub_s=60-sub_s;
			sub_m--;
		}
		if(sub_m<0) { //계산한 분의 결과가 마이너스일때(나중에 계산)
			sub_m=60-sub_m;
			sub_h--;
		}
		
		//아래 양식처럼 출력(문제 메모장 참고)
		System.out.println("현재 시각은 "+c1.getHour()+"시 "+c1.getMin()+"분 "+c1.getSec()+"초 ");
		System.out.println("점심 시각은 "+c2.getHour()+"시 "+c2.getMin()+"분 "+c2.getSec()+"초 ");
		//System.out.println("점심시간까지 남은 시간은 "+sub_h+"시 "+sub_m+"분 "+sub_s+"초 ");
		System.out.print("종료까지 남은 시간은 "+sub_h+"시 ");
		if(sub_m<10) {	//분의 자릿수 맞추기
			System.out.print(0);
		}
		System.out.print(sub_m+"분 ");
		if(sub_s<10) {	//분의 자릿수 맞추기
			System.out.print(0);
		}
		System.out.println(sub_s+"초 ");
			
		//1) 시간 계산: 마이너스가 안 뜨게끔(오류가 안 생기게끔) 계산
		//2) 한자리수만 출력할 때 앞에 0도 함께 출력하게 하기
		//(ex. 0초 -> 00초로 출력 / 9분 -> 09분으로 출력)


	}
}
