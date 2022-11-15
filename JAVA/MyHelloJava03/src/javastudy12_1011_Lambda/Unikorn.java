package javastudy12_1011_Lambda;

//super class animal+ browse, add implements Flibale, Runable. 

//FantasticBeast 를 상속받음
//환상종(=FantasticBeast)이라는 별도의 클래스애 상속받음!!!!!!!!!!!!!!!!!!!!!!
public class Unikorn extends FantasticBeast implements Fliable, Runsable {
	//animal에 한개, fliable runsable 에 두개씩 총 다섯개의 메소드 필수로 구현되어야 합니다. 
	//유니콘이므로 색깔 추가
	
	//생성자 안만들면 필요없다. 생성자> 초기값?!!!!!!
		//public Unikorn(String name, int age) {
		//	super(name, age);}
		private String Color;
		
		public String getColor() {
			return Color;
		}

		public void setColor(String color) {
			Color = color;
		}
		
		public void cry() {
			System.out.println(Color+"빛 털을 흩날린다.");
			System.out.println("히히히히힝~(영롱한 목소리로)");
		}

		@Override
		public void Run() {
			// TODO Auto-generated method stub
			System.out.println("멋지게 달립니다.");
		}

		@Override
		public void Jog() {
			// TODO Auto-generated method stub
			System.out.println("총총총~");

		}

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("우아하게 납니다~");

		}

		@Override
		public void FlapWing() {
			// TODO Auto-generated method stub
			System.out.println("우아하게 퍼덕거려요~");

		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			System.out.println("영물은 잠을 안 잡니다.");

		}

//	1. Animal이라는 추상 클래스를 만든다.
//	private String Name;
//	private int Age;
//	public void sleep();
//	2. Fliable이라는 인터페이스를 만든다.
//	public void Fly();
//	public void FlapWing();
//	3. Runsable 이라는 인터페이스를 만든다.
//(Runnable은 이미 있어서 일부러 이름 다르게 함)
//	public void Run(); //뛰다
//	public void jog(); //조깅
//4. 1,2,3을 이용해 유니콘을 만들어 본다.
//5. 혹시 만들 수 있는 생물이 있다면 또 만들어본다.(Dragon 등)
//6. Animal List에는 어떤 동물이 들어갈 수 있을지 생각해본다.
//7. 4,5에만 충족하는 동물이 있는지 생각해본다.  >>추상클래스를 하나더해준다
		
//	
}
