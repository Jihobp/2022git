package my.hello.javastudy04_1005;
//4. javastudy02�� �ִ� Circle Ŭ������ ��ӹ޾Ƽ� sphere Ŭ���� �����
//5. sphere Ŭ�������� getvolume �޼ҵ� �߰�(���Ǳ��ϱ�)
//(4/3)*pi*r^3
//6. Main���� �׽�Ʈ�غ��� 
public class Sphere extends Circle {	
	//sr. Sphere���� ���������µ�, ���⼭ sphere�� ���콺 �ø��� Ŭ���ϸ�, ������ ������ �������ش�. 
	//private int r; // circle �� ��ӹ޾Ƽ� �̹� sphere���� �ִ�. 
	//�Ļ���
	public Sphere(int r) {
		super(r);	// sr. Sphere��  �Է¹���  r���� �����ͼ� circle=super�� (r)���� �־��ش�.
					//==Circle(r){
					//this.r=r}
	}

	public double getVolume() {
		return (4.0/3.0)*Sphere.getPI()*this.getR()*this.getR()*this.getR();
		//pi,r�� circle �ȿ� �ִ� �����̴ϱ�, sphere �ȿ� �̹� ���� ������, 
		//������ �Ұ���. ���������� ����. ! �׷��� get, set�� ���°Ŵ�. 
		//r�� 3���� : r= �� ��ӹ޾Ƽ� this.getR(); ���������� ������ �ȵǴϱ�. 
		//double������ ����� �Ϸ��� 4.0���� �Է¹޾ƾ���! 
		
		//Math.pow(this.getR(), 3); =>  �տ� �ִ� ���� �ڿ� �ִ� ����ŭ �����Ѵ�. 
	//��>PI
	}
}
