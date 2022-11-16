package javastudy11_1011;

public class Pikachu implements Animalable, Cloneable {
	
	// �������̽� Cloneable ����, �� ������ clone �������̵��ϱ�
	//clone ġ�� ctrl space
	
	//�ٸ� ��Ű�������� ��� Ȱ���Ϸ��� protected �� ��� public���� �ٱž���.
	//Cloneable�� clone�޼ҵ�� �̹� default�� �����Ǿ� ������
	//�������̵��� �ؾ� �� �� �ִ�.
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone(); //�״�� ����ͼ� ���δٰ�????? /1?!?!?!?!?!
	}
	
	
	//Ŀ����ǻ�ʹ� ���Ѵ� ��� ���� ���Ҥ����..
	
	private String Name; //��ü���� Ʈ���̳ʰ� �θ��� �̸�
	//BBQ
	
	//������ o
	public Pikachu(String name) {
		super();
		Name = name;
	}

	//�������̽��� ���� �޼ҵ� ����
	@Override
	public void charming() {
		// TODO Auto-generated method stub
		System.out.println("��ī��ī");
	}

	//getter setter
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
