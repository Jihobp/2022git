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
		//문자열의 hashCode로 비교함.
		//그래서 문자열이 같으면 hashcode가 같다고 간조함.
		//그래서 set에서도 중복된 값이 나오면 추가 안됨.
		return (name+sabeon).hashCode();
	}
	
	//equals 까지 재정의 되야 hashset에서 제대로 동작함
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee)obj;
		return temp.getName().equals(name) &&
				temp.getSabeon().equals(sabeon);
	}
}
