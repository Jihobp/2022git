package javastudy15_1012_list_set_map;

public class Employee {
	private String name;
	private String sabeon;
	public Employee(String name, String sabeon) {
		super();
		this.name = name;
		this.sabeon = sabeon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSabeon() {
		return sabeon;
	}
	public void setSabeon(String sabeon) {
		this.sabeon = sabeon;
	}
	
	@Override
	public int hashCode() {
		//return super.hashCode();
		//���ڿ��� hashCode�� ����.
		//�׷��� ���ڿ��� ������ hashcode�� ���ٰ� ������.
		//�׷��� set������ �ߺ��� ���� ������ �߰� �ȵ�.
		return (name+sabeon).hashCode();
	}
	
	//equals ���� ������ �Ǿ� hashset���� ����� ������
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee)obj;
		return temp.getName().equals(name) &&
				temp.getSabeon().equals(sabeon);
	}
}
