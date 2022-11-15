package javastudy12_1011_Lambda;

public class Dragon extends FantasticBeast implements Fliable, Runsable {
// 클래스 만들고 저장 무조건 > extends animal 빨간줄 add unimplemented met> f2
	
	//생성자 안만들면 필요없다. 생성자> 초기값?!!!!!!
	//public Dragon(String name, int age) {
	//	super(name, age);}

		//종
		private String species;
		
		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		@Override
		public void Run() {
			System.out.println("드래곤은 뛰지 않는다...");
			
		}

		@Override
		public void Jog() {
			System.out.println("귀찮군...");
			
		}

		@Override
		public void fly() {
			System.out.println("훗 한 번 날아볼까?");
			
		}

		@Override
		public void FlapWing() {
			System.out.println("변신해서 날개 없다.");
		}

		@Override
		public void sleep() {
			System.out.println("자는 데 깨우면 혼난다.");
			
		}
		
		public void polymorph() {
			System.out.println(species+"드래곤의 변신~");
		}

	
	
}
