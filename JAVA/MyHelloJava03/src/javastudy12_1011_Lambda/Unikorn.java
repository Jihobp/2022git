package javastudy12_1011_Lambda;

//super class animal+ browse, add implements Flibale, Runable. 

//FantasticBeast �� ��ӹ���
//ȯ����(=FantasticBeast)�̶�� ������ Ŭ������ ��ӹ���!!!!!!!!!!!!!!!!!!!!!!
public class Unikorn extends FantasticBeast implements Fliable, Runsable {
	//animal�� �Ѱ�, fliable runsable �� �ΰ��� �� �ټ����� �޼ҵ� �ʼ��� �����Ǿ�� �մϴ�. 
	//�������̹Ƿ� ���� �߰�
	
	//������ �ȸ���� �ʿ����. ������> �ʱⰪ?!!!!!!
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
			System.out.println(Color+"�� ���� �𳯸���.");
			System.out.println("����������~(������ ��Ҹ���)");
		}

		@Override
		public void Run() {
			// TODO Auto-generated method stub
			System.out.println("������ �޸��ϴ�.");
		}

		@Override
		public void Jog() {
			// TODO Auto-generated method stub
			System.out.println("������~");

		}

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("����ϰ� ���ϴ�~");

		}

		@Override
		public void FlapWing() {
			// TODO Auto-generated method stub
			System.out.println("����ϰ� �۴��ŷ���~");

		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			System.out.println("������ ���� �� ��ϴ�.");

		}

//	1. Animal�̶�� �߻� Ŭ������ �����.
//	private String Name;
//	private int Age;
//	public void sleep();
//	2. Fliable�̶�� �������̽��� �����.
//	public void Fly();
//	public void FlapWing();
//	3. Runsable �̶�� �������̽��� �����.
//(Runnable�� �̹� �־ �Ϻη� �̸� �ٸ��� ��)
//	public void Run(); //�ٴ�
//	public void jog(); //����
//4. 1,2,3�� �̿��� �������� ����� ����.
//5. Ȥ�� ���� �� �ִ� ������ �ִٸ� �� ������.(Dragon ��)
//6. Animal List���� � ������ �� �� ������ �����غ���.
//7. 4,5���� �����ϴ� ������ �ִ��� �����غ���.  >>�߻�Ŭ������ �ϳ������ش�
		
//	
}
