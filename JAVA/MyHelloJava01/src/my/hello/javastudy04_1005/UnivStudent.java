package my.hello.javastudy04_1005;
//class ���鶧 superclass ���� student ã�Ƽ� browse �ϱ�.
public class UnivStudent extends Student { //Student�κ��� Ȯ���

	//Student �� �ִ� name�� age
	//�׸��� getter setter �� UnivStudent ���� �ִ°�. 
	private String hakbeon;

	   public String getHakbeon() {
	      return hakbeon;
	   }

	   public void setHakbeon(String hakbeon) {
	      this.hakbeon = hakbeon;
	   }
}

//�䷱������ �ϳ��� class ������ ���� ���ִ�.
class UniversitatStudnet extends Student {
	public Student hakbeon;
}