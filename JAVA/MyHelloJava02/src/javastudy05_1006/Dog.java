package javastudy05_1006;
//���� package �ȿ��վ import �ʿ� ����,. 
public class Dog extends Animal{
	private String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void bark() {
		System.out.println(hairColor+"�� �𳯸��� �۸۸�");
	}
}
