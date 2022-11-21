package javastudy14_1012;
//interface�� �ҹ���, Comparable�� Ŭ������ �빮�� 
public class KBStudent implements Comparable<KBStudent> {
	//Ŭ���� �̸��� �ݵ�� ù���� �빮��, �ձ��� m_name�̷��� ��������� �����ص� ����
	private String Name;
	private String Gender;
	private int Age;
	private int Number;
	//������
	public KBStudent(String name, String gender, int age, int number) {
		//super();
		Name = name;
		Gender = gender;
		Age = age;
		Number = number;
	}
	
	//������
	public KBStudent() {
		// TODO Auto-generated constructor stub
	}


	//alt shift s  + generate ToString. 
	//Object Ŭ������ toString �޼ҵ带 �������̵���
	@Override
	public String toString() {
		return String.format("�̸�:%s,  ����:%s, ����:%d, ��ȣ:%d",
				Name,Gender,Age,Number);
		//return "KbStudent [�̸�=" + Name + ", ����=" + Gender + ", ����=" + Age + ", ��ȣ=" + Number + "]";
	}

	
	//int Ÿ���� ==, string Ÿ���� equals �� ��,.
	//���ϴ� ������ ���� number ���̴�.
	@Override
	public boolean equals(Object obj) {
		/*
		kBStudent k =(KBStudent)obj; //kb�� obj�� ���� ���� ����Ŵ/�̰� ���� ������.
		return k.getNumber() ==number;
		*/
		
		return ((KBStudent)obj).getNumber()==Number;

	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}

	
	
	@Override
	public int compareTo(KBStudent o) {
		// TODO Auto-generated method stub
		return Age - o.getAge();
	}
	
//	@Override
//	public int compareTo(KBStudent o) {
//		// TODO Auto-generated method stub
//		//return 0;
//		return Age - o.getAge();
//	}
	
	//Shift + Alt + S ������ Override/Implement Methods(V) ������ Object ��ü ����Ҽ� �ֽ��ϴ�. 
	//toString(), equals(), hashCode() ��.. �ƴϸ� �������̵� �� �޼ҵ�� ���� @over ġ�� Ctrl + Space ������ �ڵ� �ϼ�
	
	//
	
	
	
}
