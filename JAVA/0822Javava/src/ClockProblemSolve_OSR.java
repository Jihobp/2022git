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
		
		// ?????? ??????
		LocalTime now = LocalTime.now();
		int h = now.getHour();
		int m = now.getMinute();
		int s = now.getSecond();
		
		Clock2 c1 = new Clock2(h, m, s);
		Clock2 c2 = new Clock2(h, m, s);
		
		c2.changeTime();
		
		System.out.println("?????? ????????? : " + c1.getHour() + "??? " + c1.getMin() + "??? " + c1.getSec() + "???");
		System.out.println("?????? ????????? : " + c2.getHour() + "??? " + c2.getMin() + "??? " + c2.getSec() + "???");
		
		int[] res = c2.returnTime(c1.getHour(), c1.getMin(), c1.getSec());
		System.out.println("?????????????????? ?????? ????????? " + res[0] + "?????? " + res[1] + "??? " + res[2] + "???");
		
		System.out.printf("?????????????????? ?????? ????????? %02d?????? %02d??? %02d???", res[0], res[1], res[2]);
	
	}
}
