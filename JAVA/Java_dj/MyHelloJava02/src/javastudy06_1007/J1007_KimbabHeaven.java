package javastudy06_1007;

public class J1007_KimbabHeaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food f1=new Food("�̸�",5000);
		Food f2 = new PorkCutlet("�����",8000);
		PorkCutlet f3 = new PorkCutlet("���",9000);
		
		f1.eat();
		f2.eat();	//f2�� f3�� PorkCutlet�� eat()�� ȣ����.
		f3.eat();
		//��>�������̵� �Ѱ� ȣ��
		//��������Ʈ�� ����°ŷ� Food������ eat�� �ƴ϶� ���� �ٸ� eat�� ����� �� �� �ִ�.
		//�޼ҵ��, �Ű������� ������ �ȿ� ������ �ٸ���. 
		
		//Override�� �������̵��� ��, �޼����� �̸��� �߸����� �Ǽ��� �������ش�.
		/*
		class Parent{
			void parentMethod(){}
		}

		class Child extends Parent{
			@Override
		    void pparentmethod(){} // ������ ����! �߸��� �������̵� ���縵 Ʋ��*/
		
		
		//��>�����ε� �Ѱ� ȣ��
		//�������̴ϱ� ����ȯ�ؼ� �θ� Ŭ������ �ڽ�Ŭ�������ؼ� f2 �ν��Ͻ�������.
		//�����ε��� �޼ҵ�� ���� �Ű����� �ٸ���(������ Ÿ��)����Ÿ���� �߿����� �ʰ� �Ű������� �߿���. ������
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat(5);
		}
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat("�ʰ�����");
		}
		f3.eat(10);
		f3.eat("���ݸ�");
		
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat("��������");
		}
		f3.eat(9);
		f3.eat("��Ʈ���ݸ�");
		
	
	}

}
