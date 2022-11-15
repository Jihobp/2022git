package mytest.myjava;

//1. 클래스 만들기
public class Customer {
	private String name;
	private int age;
	private String id;
	
	//alt shift s + o 생성자
	public Customer(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", id=" + id + "]";
	}
	//게터세터 만들 필요 없다.
	
	//getAge 에서 나이값을 리턴해도 되고, 얘가 성인인지 아닌지 체크해도 된당.
	//나이가 limit 미만이면 false, limit 이상이면 true
	//지금은 20세가 성인의 기준이지만 추후에 바뀔 것을 고려 ㅇㅇ
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
