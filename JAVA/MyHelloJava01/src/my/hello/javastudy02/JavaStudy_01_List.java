package my.hello.javastudy02;
import java.util.*;
public class JavaStudy_01_List {
	public static void main(String[] args) {
		//�迭
		//����� ���ÿ� ũ�Ⱑ ������
		int[] numbers = new int[5];
		//ArrayList(-List��� �θ�.) ; jsp, java���� ���� ���δ�.
		//hashmap? �� ���� ���δ� ������>;��;��;��;��;;; hashbrown �Ա� �͵���.
		//�迭���� �ٸ��� ���� ��ÿ� ũ�Ⱑ 0
		ArrayList<Integer> nums 
		= new ArrayList<Integer>();
		
		//���� �Ҵ��� ���� ��(�迭) - >  �ϳ� �ϳ� ���� �Ҵ��Ѵ�. 
		numbers[0] = 10;
		numbers[1] =30;
		
		//���� �о���̴� ��(�迭)
		System.out.println("ù��°��:" +numbers[0]);
		
		//���� �߰��ϴ� ��
		nums.add(10); //js�� pushó�� ���ο� ���� �߰���.
		//js�� �迭ó�� ������ ��ġ�� ���� �߰����� ����.
		nums.add(30);
		
		//Ư����°�� ���� �����غ���.
		nums.set(0, 20); //ù���� ���� 20���� ����
		System.out.println(nums.get(0));//ù��° ���� ����
		
		//foreach ���� ctrl space �ϸ� ����� �ڵ�
		//�迭�� ���̸�ŭ �ݺ����� �����ϰ� (�ݺ��� ����)
		//�ݷ�(:) �տ� �ִ°� �迭�ȿ� �ִ� �����䙓��
		for (Integer integer :numbers) {		//??
			System.out.println(integer);
		}
		
		//���ڸ� �����ϴ� �迭.
		// 10 30 0 0 0���� ������ ?  - > �迭�� ���̰� 5�̰�, 2,3,4������ �⺻���� 0�� ����.������;;;;;
		//c�� �����迭�̶� ����ϰ�, �迭�� ���̰� �þ�� �پ��� �ϴ°�. 
		nums.remove(0); //ù��° �� ����
		nums.add(100);
		nums.add(30);
		nums.add(30);
		nums.remove((Integer)30);  //���� 30�ΰ� ����
		System.out.println("----");
		for(Integer integer :nums) {
			System.out.println(integer);
		}
		
		
		for (Integer integer : nums) {	//20, 30 ����. ������ 10> 20���� �ٲ��, 30���� �ٲ������.
			System.out.println(integer);
		}
		
	}
}
