package my.hello.javastudy02;

public class Student {
	//name, age, score
	
	private String name;
	private int age;
	private double score;
	
	//student Ŭ������ �̿��ؼ� ������ �����Ѵ� >  ���� ������ �޸� ���� ��� ������ �����ϰڴٴ°�. = �޸� �����ȿ��� ������ �����Ѵ�.
	//������ �����ҋ� �ƹ��͵� ���������Ŷ�� �����ص� �ǰ� ���ص� �ȴ�.
	//������ ������ �����԰� ���ÿ� ,  ���� ������ ���ھ� ���� ������ �ְ� ������, ������ �ȿ� �Ű����� this.name = name;  ���� �־���Ѵ�. 
	//
	
	//get set �̿�. set �̿��ؼ� �Լ� �ȿ� ���� ���� �ٲ� ���� �ִ� . ������>
	//�����ڸ� �̟G���� .
	//���� �Ӽ����̶�, getter, setter �� �����ٸ�
	//�Ϲ������� �Ʒ��� ���� �ƹ� �͵� ���� �����ڰ�
	//�ڵ����� ������� ���̴�. ��
	public Student() {
		
	}
	
	
	
	//������
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
//	1. �̸��� �ƴ� ��츦 ����Ͽ� ������ �����
//	(������ ��� ������ �� �˰ų�  �ϳ��� �� ��쿡 ���� �����ڸ� ����)
	//�Ű������� �Ӽ����̶� ������ ... this.name= name;
	
	
		//1�� ����
		public Student(String name) {
			this.name = name;
		}	

		
		//�����ε�
				//�Լ��� �����ڿ��� �Ű������� ������ Ÿ���� �ٸ���
				//�̸��� �Ȱ��Ƶ� �ȴ�. �̸��� �Ȱ��Ƶ�
				//�ٸ� �ɷ� ������ش�.
//�������̵� vs �����ε�. 
	//�����ε�(Overloading) : ���� �̸��� �޼��� �������� �����鼭 �Ű������� ������ ������ �ٸ����� �ϴ� ���
//�������̵�(Overriding) : ���� Ŭ������ ������ �ִ� �޼��带 ���� Ŭ������ �������ؼ� ���
//��ó: https://private.tistory.com/25 [���亿���丮:Ƽ���丮]
	
	
	
	//alt shift s ������ �� ���� r Ű ������
		//���콺 ������ Ŭ�� - >  source - > Generate Getter and Setter 
		//select all -> generate. 

	

	
	//Getter Setter
	//2������

	//alt shift s ������ �� ���� r Ű ������
	//���콺 ������ Ŭ�� -> Source-> Generate Getter and Setter
	
	//select All ������ Generator ��������.
	
	public String getName() {
		return name;
	}
	//�����ε�!!!
	public String getName(String title) {
		return name+title;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}

	
}

