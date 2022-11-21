package my.hello.javastudy04_1005;
//내가 클래스를 어떻게 짜느냐에 따라 코드의 맛이 달라진다??? 
//코더는 많은데 프로그래머는 없댱. 
//못만들더라도 만드샴~~~~ 그래야 고치고 수정함 ~~~
public class GameCharacter {
	private String id;
	private String job;
	private int lv; // 캐릭터 레벨
	private static int Count; // 게임 총 인원수 //ㅇint 변수는 선언당시 0. 쓰레기값 개념이 딱히 없어서 들어가 있다.

	// alt shift s키 누르고 o 키누름.
	// 빈생성자 만든거
	public GameCharacter() {
		Count++;
	}

	// 아이디랑 직업받는생성자
	public GameCharacter(String id, String job) {
		// super();
		Count++; // 캐릭터 생성되면서 총 인원이 늘어남.
		id = id;
		this.job = job;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public static int getCount() {
		return Count;
	}

	public static void sayHello() {
		System.out.println("안뇽~~");
	}

	
	//3번
	public void attack() {
		if (job.contains("전사")) {
			System.out.println("물리어택");
		} else if (job.contains("마법")) {
			System.out.println("마법공격");
		} else {
			System.out.println(lv + "lv " + job + "의 때리기");
		}
	}
	
	
	//캐릭터 정보 일괄 출력가능.
	public void printInfo()
	{
		System.out.println(this.id+"의 직업은"+this.job);
		System.out.println("LV : "+this.lv);
	}
}

//	1. GameCharacter 라는 클래스를 만든다.
//	ID, 캐릭터직업, 레벨 속성을 갖는다.
//	- 생성 당시에 아무 것도 없거나
//	- ID와 캐릭터 직업만 입력할 수 있다.
//
//	2. GameCharacter가 추가될 때 마다 캐릭터수를 하나씩 증가하게 하고 싶다. >>>static
//	(단, 클래스 변수 활용할 것, 배열이나 ArrayList 안 씀)
//
//	3. 공격기술 하나, 인사하기 하나 추가
//	공격기술은 캐릭터 직업이 전사 계통이면 "물리어택"
//	마법사 계통이면 "마법 공격"
//	그 외에는 아무거나 쓰기
//
//	인사하기는 모두 공통으로 "안녕~~"
//
//	4. 총 3개의 캐릭터를 만든다.
//	(전사계열, 마법사계열, 자유롭게 아무거나 하나)
//
//	5. 3개의 캐릭터들 모두 공격을 호출한다. 인사하기는 공통이므로 그에 맞게 호출한다.




//.....
//실습3에서 만든 GameCharacter 클래스 이용하여
//3칸짜리 배열, 3칸짜리 ArrayList에 캐릭터 채우기
//단, Scanner 이용하여 모두 입력받기
//level 입력시 음수면 예외처리 하되
//이번엔 main에서 해보기
//(음수 입력하면 다시 입력하게 하기)

