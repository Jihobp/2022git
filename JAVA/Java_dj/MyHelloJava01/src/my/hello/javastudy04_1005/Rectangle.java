package my.hello.javastudy04_1005;

public class Rectangle {
	private int w;
	private int h;

	// alt shift r
	public int getW() {
		return w;
	}

	public void setW(int w) {	//0戚馬析凶 森須坦軒
		if (w <= 0) {
			System.out.println("神嫌!(w)");
			this.w = 0;
			return; // setW研 曽戟獣鉄
		}
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {	//0戚馬析凶 森須坦軒
		if (h <= 0) {
			System.out.println("H神嫌");
			this.h = 0;
			return;
		}
		this.h = h;
	}

	// alt shift o
	public Rectangle(int w, int h) {
		super();
		setW(w);//this.w = w;
		setH(h);//this.h = h;
	//耕軒耕軒 w,h葵戚 設公菊聖凶 森須坦軒 杏嬢爽壱 馬檎 蟹掻拭 覚戚 姥拝企 照舛失戚 持沿. 杏君爽澗暗,
	}


	// w蟹 h 馬蟹幻 硝焼辞 馬蟹幻 脊径馬澗 井酔研 舛紫唖莫生稽 娃爽背左切. しさし
	public Rectangle(int wh) {
		super();
		this.w = wh;
		this.h = wh;
	}
	
	public Rectangle() {
		System.out.println("革乞革乞 適掘什 持失【");
	}
	
	
	//持失切 掻差 いいい
//	public Rectangle() {
//		//super();
//	}
//	
	//昔什渡什 五社球 = 敗呪
	//昔闘渡什 紺稽 疑拙馬澗ぁ つ 陥牽陥 .. しさし
	//getArea研 r1,r2,r3亜 硲窒馬汗劃拭 魚虞 陥牽陥. 
	
	public int getArea() {
		if(w<=0||h<=0)
		{
			System.out.println("error!");
			return -1;
		}
		else if(w==h) {
			System.out.println("舛紫唖莫!");
		}
		return w*h;		
	}
}
