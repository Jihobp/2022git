package my.hello.javastudy04_1005;

public class J1005_04_testGame_Apex {

	public static void sayHello() {
		System.out.println("�ȳ�ȳ�~~~");
	}
	public static void sayHi(String name) {
		System.out.println("�ȳ�ȳ� ���� "+name+"�̾�~");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//4.
	System.out.println("�� �ο�"+GameCharacter.getCount());
	GameCharacter c1 = new GameCharacter();	//0
	System.out.println("�� �ο�"+GameCharacter.getCount());
	c1.setJob("�н����δ�");
	c1.setId("��ȣ");
	
	GameCharacter c2 = new GameCharacter("����","�����Ͽ��");
	System.out.println("�� �ο�"+GameCharacter.getCount());
	
	GameCharacter c3 = new GameCharacter();
	c3.setJob("���̽�");
	c3.setId("����");
	c3.setLv(33);
	System.out.println("�� �ο� "+ GameCharacter.getCount());

	GameCharacter.sayHello(); //����
	c1.attack();
	c2.attack();
	c3.attack();
	
	//GameCharacter.cc(); //������ ����ƽ�� ����� ������. �� ������ ������ ����ƽ�� ������ ������
	//�̰Ŵ� ����ƽ�� �ƴϰ� �ν��Ͻ� (new)�� �ƴ϶� �����°��̴�. 
	}
}
