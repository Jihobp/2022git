package javastudy13_1011_TryCatch_Throw_exception;

import java.util.*;

public class J1011_Throw {

		// TODO Auto-generated method stub
		
		//�Լ��� ���� ���� ������ �ִ�.
		//�ΰ��� ���ڸ� �Է¹޾Ƽ� �� ���� �����ϴ� �Լ�,
		//throw ���ܸ� ������
		public static int sum(int start, int end) throws Exception {
			if(end<start)
				throw new Exception("start�� end ���� �߸���");
			else
			{
				int sum = 0;
				for(int i =start; i<=end; i++) {
					sum+=i;
				}
				return sum;
			}
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				System.out.println("�ȳ��ϼ���.");
				throw new Exception("����!!!"); //������ �Ϻη� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				int num = sum(10,1);	//sum�̶�� �޼Ҷ߰� ��쿡 ���󼭴� ���� ��ȯ���� ���Ѵ�. 
				System.out.println(num);
			} catch (Exception e) {
				e.printStackTrace(); //start�� end ���� �߸���
			}

	}

}
