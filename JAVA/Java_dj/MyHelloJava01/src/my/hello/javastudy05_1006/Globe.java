package my.hello.javastudy05_1006;

import my.hello.javastudy05_1006.Sphere;

public class Globe extends Sphere {
	public Globe(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	//지구본 굴리기
	public void rollTheGlobe(String color) {
		this.Color = color;
		System.out.println("지구본 색깔 "+ this.Color);
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
