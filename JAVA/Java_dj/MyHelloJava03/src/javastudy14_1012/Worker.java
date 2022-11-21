package javastudy14_1012;

public class Worker {
	private String Name;	 //�̸�
	private String cNum;	//���
	
	//�����ڴ� alt shift s = o > generate.
	public Worker(String name, String cNum) {
		super();
		Name = name;
		this.cNum = cNum;
	}

	@Override	//alt shift s //toString()
	public String toString() {
		return "�̸�: "+Name+", ���: "+cNum;
	}


	//equals �� ������ �س��� ����� �̸��� ���� ����� ���� ������� ������.  
	@Override  //alt shift s //hashcode and equals
	public boolean equals(Object obj) {
		Worker w =(Worker)obj; //w�� obj�� ���� ���� ����Ŵ //�̰� ������ ������
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
