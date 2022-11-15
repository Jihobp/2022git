package my.hello.javastudy04_1005;

public class Rectangle {
	private int w;
	private int h;

	// alt shift r
	public int getW() {
		return w;
	}

	public void setW(int w) {	//0�����϶� ����ó��
		if (w <= 0) {
			System.out.println("����!(w)");
			this.w = 0;
			return; // setW�� �����Ŵ
		}
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {	//0�����϶� ����ó��
		if (h <= 0) {
			System.out.println("H����");
			this.h = 0;
			return;
		}
		this.h = h;
	}

	// alt shift o
	public Rectangle(int w, int h) {
		super();
		setW(w);//this.w = w;
		setH(h);//this.h = h;
	//�̸��̸� w,h���� �߸������� ����ó�� �ɾ��ְ� �ϸ� ���߿� ���� ���Ҵ� �������� ����. �ɷ��ִ°�,
	}


	// w�� h �ϳ��� �˾Ƽ� �ϳ��� �Է��ϴ� ��츦 ���簢������ �����غ���. ������
	public Rectangle(int wh) {
		super();
		this.w = wh;
		this.h = wh;
	}
	
	public Rectangle() {
		System.out.println("�׸�׸� Ŭ���� ������");
	}
	
	
	//������ �ߺ� ������
//	public Rectangle() {
//		//super();
//	}
//	
	//�ν��Ͻ� �޼ҵ� = �Լ�
	//��Ʈ�Ͻ� ���� �����ϴ¤� �� �ٸ��� .. ������
	//getArea�� r1,r2,r3�� ȣ���ϴ��Ŀ� ���� �ٸ���. 
	
	public int getArea() {
		if(w<=0||h<=0)
		{
			System.out.println("error!");
			return -1;
		}
		else if(w==h) {
			System.out.println("���簢��!");
		}
		return w*h;		
	}
}
