package my.hello.javastudy04_1005;
//���� Ŭ������ ��� ¥���Ŀ� ���� �ڵ��� ���� �޶�����??? 
//�ڴ��� ������ ���α׷��Ӵ� ����. 
//��������� ���弤~~~~ �׷��� ��ġ�� ������ ~~~
public class GameCharacter {
	private String id;
	private String job;
	private int lv; // ĳ���� ����
	private static int Count; // ���� �� �ο��� //��int ������ ������ 0. �����Ⱚ ������ ���� ��� �� �ִ�.

	// alt shift sŰ ������ o Ű����.
	// ������� �����
	public GameCharacter() {
		Count++;
	}

	// ���̵�� �����޴»�����
	public GameCharacter(String id, String job) {
		// super();
		Count++; // ĳ���� �����Ǹ鼭 �� �ο��� �þ.
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
		System.out.println("�ȴ�~~");
	}

	
	//3��
	public void attack() {
		if (job.contains("����")) {
			System.out.println("��������");
		} else if (job.contains("����")) {
			System.out.println("��������");
		} else {
			System.out.println(lv + "lv " + job + "�� ������");
		}
	}
	
	
	//ĳ���� ���� �ϰ� ��°���.
	public void printInfo()
	{
		System.out.println(this.id+"�� ������"+this.job);
		System.out.println("LV : "+this.lv);
	}
}

//	1. GameCharacter ��� Ŭ������ �����.
//	ID, ĳ��������, ���� �Ӽ��� ���´�.
//	- ���� ��ÿ� �ƹ� �͵� ���ų�
//	- ID�� ĳ���� ������ �Է��� �� �ִ�.
//
//	2. GameCharacter�� �߰��� �� ���� ĳ���ͼ��� �ϳ��� �����ϰ� �ϰ� �ʹ�. >>>static
//	(��, Ŭ���� ���� Ȱ���� ��, �迭�̳� ArrayList �� ��)
//
//	3. ���ݱ�� �ϳ�, �λ��ϱ� �ϳ� �߰�
//	���ݱ���� ĳ���� ������ ���� �����̸� "��������"
//	������ �����̸� "���� ����"
//	�� �ܿ��� �ƹ��ų� ����
//
//	�λ��ϱ�� ��� �������� "�ȳ�~~"
//
//	4. �� 3���� ĳ���͸� �����.
//	(����迭, ������迭, �����Ӱ� �ƹ��ų� �ϳ�)
//
//	5. 3���� ĳ���͵� ��� ������ ȣ���Ѵ�. �λ��ϱ�� �����̹Ƿ� �׿� �°� ȣ���Ѵ�.




//.....
//�ǽ�3���� ���� GameCharacter Ŭ���� �̿��Ͽ�
//3ĭ¥�� �迭, 3ĭ¥�� ArrayList�� ĳ���� ä���
//��, Scanner �̿��Ͽ� ��� �Է¹ޱ�
//level �Է½� ������ ����ó�� �ϵ�
//�̹��� main���� �غ���
//(���� �Է��ϸ� �ٽ� �Է��ϰ� �ϱ�)

