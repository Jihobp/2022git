package my.hello.javastudy02;

import java.util.ArrayList;

public class Passenger {

//	2. (Ŭ���� �ȿ�)�̸� ���� ��ȣ�� ��� �а� ���� �Լ��� ����� :: get,. set
//
//	3. ���ఴ Ŭ������ �����.(�̸�,����,����,�ֹι�ȣ)
//	�� �����ڴ� 3���� �̻��̴�.
//	(�ϳ��� ���� ��, �ϳ��� �ִ� ��, ���� �ִ� ��)
		
		//name, age, score
		
		private String name;
		private int age;
		private int num;
		private int snum;	//�ֹ�
		
		
		//get set �̿�. set �̿��ؼ� �Լ� �ȿ� ���� ���� �ٲ� ���� �ִ� . ������>
		//�����ڸ� �̟G���� .
		//���� �Ӽ����̶�, getter, setter �� �����ٸ�
		//�Ϲ������� �Ʒ��� ���� �ƹ� �͵� ���� �����ڰ�
		//�ڵ����� ������� ���̴�. ��
		
		public Passenger() {
			
		}
		
		public Passenger(String name) {	
			this.name=name;
		}
		

		//�⺻ ������ >>this.name= name ���� �� �ʵ庯�� �ʱ�ȭ? 
		//Passenger Ŭ������ �̿��ؼ� ������ �����Ѵ� >  ���� ������ �޸� ���� ��� ������ �����ϰڴٴ°�. = �޸� �����ȿ��� ������ �����Ѵ�.
				//������ �����ҋ� �ƹ��͵� ���������Ŷ�� �����ص� �ǰ� ���ص� �ȴ�.
				//������ ������ �����԰� ���ÿ� ,  ���� ������ ���ھ� ���� ������ �ְ� ������, ������ �ȿ� �Ű����� this.name = name;  ���� �־���Ѵ�. 
				//integer�� ��ü
		public Passenger(String name, int age, int num, int snum) {
			this.name = name;
			this.age = age;
			this.num = num;
			this.snum = snum;
		}
}
