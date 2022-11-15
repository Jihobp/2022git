package mytest.myjava;

//1. Ŭ���� �����
public class Customer {
	private String name;
	private int age;
	private String id;
	
	//alt shift s + o ������
	public Customer(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "�̸�: " + name + ", ����: " + age + ", id=" + id + "]";
	}
	//���ͼ��� ���� �ʿ� ����.
	
	//getAge ���� ���̰��� �����ص� �ǰ�, �갡 �������� �ƴ��� üũ�ص� �ȴ�.
	//���̰� limit �̸��̸� false, limit �̻��̸� true
	//������ 20���� ������ ���������� ���Ŀ� �ٲ� ���� ��� ����
	public boolean isAdult(int limit) {
		if(limit>age)
			return false;
		else
			return true;
	}
	public boolean isAdmin(String admin) {
		if(this.id.contentEquals(admin))
			return true;
		else 
			return false;
	}
	
}
