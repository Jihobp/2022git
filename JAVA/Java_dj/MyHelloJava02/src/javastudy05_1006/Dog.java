package javastudy05_1006;
//°°Àº package ¾È¿¡ÀÕ¾î¼­ import ÇÊ¿ä ´²´²,. 
public class Dog extends Animal{
	private String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void bark() {
		System.out.println(hairColor+"¸¦ Èð³¯¸®¸ç ¸Û¸Û¸Û");
	}
}
