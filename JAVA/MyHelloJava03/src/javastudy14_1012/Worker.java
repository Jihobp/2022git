package javastudy14_1012;

public class Worker {
	private String Name;	 //이름
	private String cNum;	//사번
	
	//생성자는 alt shift s = o > generate.
	public Worker(String name, String cNum) {
		super();
		Name = name;
		this.cNum = cNum;
	}

	@Override	//alt shift s //toString()
	public String toString() {
		return "이름: "+Name+", 사번: "+cNum;
	}


	//equals 를 재정의 해놔서 사번과 이름이 같은 사원은 같은 사원으로 간주함.  
	@Override  //alt shift s //hashcode and equals
	public boolean equals(Object obj) {
		Worker w =(Worker)obj; //w랑 obj는 같은 곳을 가리킴 //이거 값없음 오류뜸
		return w.getcNum().equals(cNum)
				&& w.getName().equals(Name);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getcNum() {
		return cNum;
	}

	public void setcNum(String cNum) {
		this.cNum = cNum;
	}

	
		
	
}
