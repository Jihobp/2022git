
class Students{
	
	//멤버 변수 선언부 (FIELD)
	private String name;
	private int num;
	private String major;
	
	//멤버 함수 선언부
	public String getName() {return name;}
	public int getNum() {return num;}
	public String getMajor() {return major;}
	
	//생성자 선언부 = 함수, 연결다리. 
	// 생성자랑 멤버 함수 선언????????????????????????????차이????????????????
	//생성자는 기본으로 class Students에 들어가 있는데, 해주는게 빠르니까 좋다.
	//public Students(){} 공식 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//메인에서 객체생성할때는 
	public Students(String na, int n, String m) {
		this.name=na;
		this.num=n;
		this.major=m;
	}
}

public class teachers_ans22 {
	public static void main(String[] args) {
		//객체 선언부
		//클래스명 객체이름=new 클래스명();
		Students stu=new Students("LeeYuna", 18130956,"컴공");
		//객체 생성시 생성자가 즉시 실행됨.
		//생성자는 일부러 호출할 수 없음.
		
		//멤버 함수 호출 및 출력문 수행;.
		System.out.println("내이름은"+stu.getName());
		System.out.println("내학번은"+stu.getNum());
		System.out.println("내전공은"+stu.getMajor());
		Students s2; //Students 
		Students a; //Students 라는 구조체를 만드는거기 때문에 이름은 내맘대로다.
		//setname, getname 등 값을 바꿀 수 있다. 

	}

}
