package my.hello.javastudy05_1006;
import my.hello.javastudy04_1005.GameCharacter;
public class Magician extends GameCharacter {
	private int mp;
	//디폴트 생성자는 있다.
	//하지만 부모클래스에 있었던 매개변수가 있는 생성자는 없다.
	//부모클래스에 디폴트 생성자(클래스명() { } ) 가 엇ㅂ든지,
	//자식 클래스에는 디폴트 생성자가 있다.
	//단, Circle 처럼 부모클래스에 디폴트생성자가 '명시적으로 없는'
	//경우, 즉 매개변수 있는 생성자만 명시적으로 있는 경우.
	//Sphere나 Globe 처럼 매개변수가 있는 생성자가 반드시 있어야함 !!!!!
	
	//결론!!!
	//혹은 생성자가 아예없는 경우엔
	//자식 클래스에 기본적으로 디폴트 생성자가 있다.
	//근데 부모 클래스의 매개변수 있는 생성자는 자동으로 생기지 않음.
	
	
	//왜 집어넣엇을까?  
	//야미~~~~~
	public Magician() {
		
	}
	public Magician(String id, String _Class, int mp) {
		super(id, _Class);
		this.mp = mp;
	}
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void magicArrow() {
		
		System.out.println(mp+"를 담은 혼신의 매직 애로우 쿠와아");
		System.out.println(getId()+"님의 " + getJob()+"계의 최고 기술 발동");
		System.out.println(getLv()+"레벨 치곤 괜찮은 공격!");
			
	}
}
