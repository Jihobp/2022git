package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.GameCharacter;
public class Magician extends GameCharacter {
	private int mp;
	//����Ʈ �����ڴ� �ִ�.
	//������ �θ�Ŭ������ �־��� �Ű������� �ִ� �����ڴ� ����.
	//�θ�Ŭ������ ����Ʈ ������(Ŭ������() { } ) �� ��������,
	//�ڽ� Ŭ�������� ����Ʈ �����ڰ� �ִ�.
	//��, Circle ó�� �θ�Ŭ������ ����Ʈ�����ڰ� '��������� ����'
	//���, �� �Ű����� �ִ� �����ڸ� ��������� �ִ� ���.
	//Sphere�� Globe ó�� �Ű������� �ִ� �����ڰ� �ݵ�� �־���� !!!!!
	
	//���!!!
	//Ȥ�� �����ڰ� �ƿ����� ��쿣
	//�ڽ� Ŭ������ �⺻������ ����Ʈ �����ڰ� �ִ�.
	//�ٵ� �θ� Ŭ������ �Ű����� �ִ� �����ڴ� �ڵ����� ������ ����.
	
	
	//�� ����־�����?  
	//�߹�~~~~~
	public Magician() {
		
	}
	public Magician(String id, String _Class, int mp) {
		super(id, _Class);
		this.mp = mp;
	}
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void magicArrow() {
		
		System.out.println(mp+"�� ���� ȥ���� ���� �ַο� ��;�");
		System.out.println(getId()+"���� " + getJob()+"���� �ְ� ��� �ߵ�");
		System.out.println(getLv()+"���� ġ�� ������ ����!");
			
	}
}
