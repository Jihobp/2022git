package my.hello.javastudy05_1006;

//Worrior �� GameCharacter�� �ڼ��� �ڼ� Ŭ����
public class Worrior extends Novice {
	
	//alt shift r +s : ���ͼ���
	private int power;
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void punch() {
		System.out.println(power+"��ŭ�� ����!");
	}
}