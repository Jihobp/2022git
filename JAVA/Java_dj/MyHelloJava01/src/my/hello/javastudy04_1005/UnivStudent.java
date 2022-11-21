package my.hello.javastudy04_1005;
//class 만들때 superclass 에서 student 찾아서 browse 하기.
public class UnivStudent extends Student { //Student로부터 확장댄

	//Student 에 있는 name과 age
	//그리고 getter setter 가 UnivStudent 에도 있는것. 
	private String hakbeon;

	   public String getHakbeon() {
	      return hakbeon;
	   }

	   public void setHakbeon(String hakbeon) {
	      this.hakbeon = hakbeon;
	   }
}

//요런식으로 하나에 class 여러개 적을 수있당.
class UniversitatStudnet extends Student {
	public Student hakbeon;
}