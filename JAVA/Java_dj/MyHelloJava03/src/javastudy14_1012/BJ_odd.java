package javastudy14_1012;

import java.util.Scanner;

public class BJ_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		
		//2. ���ڿ� �Է� �� ������ϱ�
		System.out.println("���ڸ� �Է��ϼ���");
		String txt = s.next();
		String rvs = "";
		
		for(int i=txt.length()-1;i>=0;i--)
		{
			rvs = rvs+txt.charAt(i);
		}
		System.out.println(rvs);
		
		
		//2.2 ���� ����
		System.out.println("���ڸ� �Է��ϼ���");
		String str = "eokppd";         // ���ڿ� reverse        
		StringBuffer sb = new StringBuffer(str);        
		String reverse = sb.reverse().toString();         // ��� ���        
		System.out.println(sb); // "EDCBA"        
		System.out.println(reverse); // "EDCBA" 

		
		//3. ����Ʈ �� �Է� �� ��Ʈ�� ���. 
	}

}
