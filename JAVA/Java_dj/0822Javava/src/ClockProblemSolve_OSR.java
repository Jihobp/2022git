import java.time.LocalTime;
import java.util.Scanner;

class Clock2 {
	 private int hour;
	 private int min;
	 private int sec;
	 
	 public Clock2() {
	 }
	 
	 public Clock2(int h, int m, int s) {
		 this.hour = h;
		 this.min = m;
		 this.sec = s;
	 }
	 
	 public void setHour(int hour) {
		 this.hour = hour;
	 }
	 
	 public void setMinute(int min) {
		 this.min = min;
	 }
	 
	 public void setSecond(int sec) {
		 this.sec = sec;
	 }
	 
	 public int getHour() {
		 return this.hour;
	 }
	 
	 public int getMin() {
		 return this.min;
	 }

	 public int getSec() {
		 return this.sec;
	 }
	 
	 public void changeTime() {
		 this.hour = 16;
		 this.min = 40;
		 this.sec = 0;
	 }
	 
	 public int[] returnTime(int h, int m, int s) {
		if(this.hour > h) {
			h = this.hour - h;
			if(this.min > m) {
				m = this.min - m;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					m--;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			} else if(this.min < m) {
				h--;
				m = this.min - m + 60;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					m--;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			} else if(this.min == m) {
				m = 0;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					h--;
					m += 59;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			}
		} else if(this.hour < h) {
			h = this.hour - h + 24;
			if(this.min > m) {
				m = this.min - m;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					m--;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			} else if(this.min < m) {
				h--;
				m = this.min - m + 60;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					m--;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			} else if(this.min == m) {
				m = 0;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					h--;
					m += 59;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			}
		} else if(this.hour == h) {
			h = 0;
			if(this.min > m) {
				m = this.min - m;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					m--;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			} else if(this.min < m) {
				h += 23;
				m = this.min - m + 60;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					m--;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			} else if(this.min == m) {
				m = 0;
				if(this.sec > s) {
					s = this.sec - s;
				} else if(this.sec < s) {
					h--;
					m += 59;
					s = this.sec - s + 60;
				} else if(this.sec == s) {
					s = 0;
				}
			}
		}
		
		int res[] = new int[3];
		res[0] = h;
		res[1] = m;
		res[2] = s;
		
		return res;
	 }
}
public class ClockProblemSolve_OSR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int h = sc.nextInt();
//		int m = sc.nextInt();
//		int s = sc.nextInt();		
		
		// 현재 시간
		LocalTime now = LocalTime.now();
		int h = now.getHour();
		int m = now.getMinute();
		int s = now.getSecond();
		
		Clock2 c1 = new Clock2(h, m, s);
		Clock2 c2 = new Clock2(h, m, s);
		
		c2.changeTime();
		
		System.out.println("현재 시각은 : " + c1.getHour() + "시 " + c1.getMin() + "분 " + c1.getSec() + "초");
		System.out.println("종료 시간은 : " + c2.getHour() + "시 " + c2.getMin() + "분 " + c2.getSec() + "초");
		
		int[] res = c2.returnTime(c1.getHour(), c1.getMin(), c1.getSec());
		System.out.println("종료시간까지 남은 시간은 " + res[0] + "시간 " + res[1] + "분 " + res[2] + "초");
		
		System.out.printf("종료시간까지 남은 시간은 %02d시간 %02d분 %02d초", res[0], res[1], res[2]);
	
	}
}
