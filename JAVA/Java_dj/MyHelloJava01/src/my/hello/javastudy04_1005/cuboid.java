package my.hello.javastudy04_1005;
//7 javastudy01�� �ִ� Rectangle Ŭ������ ��� �޾Ƽ� cuboid(������ü) Ŭ���� �����
//- z �Ӽ� �߰�
//- getCuvoidVolumn �߰�(w*h*z)
//8. Main���� �׽�Ʈ�غ���
public class cuboid extends Rectangle {
	private int z;
	
	public int getCuvioVolumn() {
		return this.getW()*this.getH()*this.z;
	}
}
