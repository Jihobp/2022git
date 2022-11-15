package my.hello.javastudy03;

public class KBCustomer {
	
	//alt shift s 키 누르기  >>> r 키 누르기 >>> select All 누르고  >>> generate 누르기
	
	
	//private이 붙으면 다른 클래스에서( 다른파일에서) 읽거 나 쓰지 못함 XXXXXXXXXXX
	private int age;
	private String name;
	private String cNum;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcNum() {
		return cNum;
	}
	public void setcNum(String cNum) {
		this.cNum = cNum;
	}
	
	//public, private : 정보으 은닉
	//private, public으로 나누는 이유? 	1. 그냥ㅋㅋㅋㄷㅋㄷㅋㄷㅋㄷㅋㄷ, 2. 예외처리해서 private을 public 함수를 통해 우회적으로 불러온다. 
	//C#책에선 캡슐화라고 돠이었는데, 캡슐은 아님. 캡슐에 대한 정의는 java책 찾아보기.
	
	
//	public void setAge(int n)
//	{
//		if(n<0)
//			age = 0;
//		else
//			age = n;
//	}
//	
//	public String getName()
//	{
//		return name;
//	}
	

	


}
