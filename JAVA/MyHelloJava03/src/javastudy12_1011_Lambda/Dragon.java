package javastudy12_1011_Lambda;

public class Dragon extends FantasticBeast implements Fliable, Runsable {
// Ŭ���� ����� ���� ������ > extends animal ������ add unimplemented met> f2
	
	//������ �ȸ���� �ʿ����. ������> �ʱⰪ?!!!!!!
	//public Dragon(String name, int age) {
	//	super(name, age);}

		//��
		private String species;
		
		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		@Override
		public void Run() {
			System.out.println("�巡���� ���� �ʴ´�...");
			
		}

		@Override
		public void Jog() {
			System.out.println("������...");
			
		}

		@Override
		public void fly() {
			System.out.println("�� �� �� ���ƺ���?");
			
		}

		@Override
		public void FlapWing() {
			System.out.println("�����ؼ� ���� ����.");
		}

		@Override
		public void sleep() {
			System.out.println("�ڴ� �� ����� ȥ����.");
			
		}
		
		public void polymorph() {
			System.out.println(species+"�巡���� ����~");
		}

	
	
}
