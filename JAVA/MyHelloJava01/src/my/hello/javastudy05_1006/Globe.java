package my.hello.javastudy05_1006;

import my.hello.javastudy05_1006.Sphere;

public class Globe extends Sphere {
	public Globe(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	//������ ������
	public void rollTheGlobe(String color) {
		this.Color = color;
		System.out.println("������ ���� "+ this.Color);
		spin();
	}
	public void setColor(String Color)
	{
		this.Color = Color;
	}
	public String getColor() {
		return this.Color;
	}
}
