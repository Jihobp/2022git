package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO { //data acess object : ������ ���� ��ü : ������ db�� �����ؼ� � �����͸� ���� �� �ְ� �ϴ� Ŭ����.
	//10������ ���� �۾���db�� ������ �� �ְ� ������ش�. >> ����κ�!!! 
		//JSP �Խ��ǿ��� �α��� ����� �����Ϸ��� JSP���� ȸ�� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� Data Access Object(DAO)�� �������մϴ�. DAO�� �����ͺ��̽� ���� ��ü�� �����Դϴ�. �ϳ��� ȸ�������� �ҷ����ų� �Է��� �� ����մϴ�.
		//DAO : �����ͺ��̽� ���� ��ü�� ����. ���������� ������ ���̽����� ȸ�� ������ �ҷ����ų�, �����ͺ��̽��� ȸ�������� �ְ����ҋ� ����Ѵ�.
		private Connection conn; //�ڹٿ� �����ͺ��̽��� ���� //connection: �����ͺ��̽��� �����ϰ� ���ִ� �ϳ��� ��ü.
		//private PreparedStatement pstmt; //������ ��� �� ����
		private ResultSet rs; //����� �޾ƿ��� //��� ������ ���� �� �ִ� �ϳ��� ��ü.
		
		//�⺻ ������
		//UserDAO�� ����Ǹ� �ڵ����� �����Ǵ� �κ�
		//�޼ҵ帶�� �ݺ��Ǵ� �ڵ带 �̰��� ������ �ڵ尡 ����ȭ�ȴ�
		//������ mySQL�� ������ �� �ְ� ���ִ� �Լ�,
		public BbsDAO() {//�ϳ��� ��ü�� ���������, �ڵ����� dbĿ�ؼ��� �̷����� ����.
			try {//Ʈ����ĳġ�� ���� ó�����ش�.
				String jdbcURL = "jdbc:mysql://localhost:3306/BBS?serverTimezone=Asia/Seoul"; //localhost:3306;�츮 ��ǻ���� �ּҸ� �ǹ��ϴ� ������, 3306��Ʈ�� bbs�� �����ϵ��� �մϴ�.
				String jdbcID = "root"; //��Ʈ������ ����,
				String jdbcPassword = "1234"; //��Ʈ������ ��� �Է�.
				Class.forName("com.mysql.jdbc.Driver");//����̹��� ã�� ����. driver; mysql�� ������ �� �ֵ���, �Ű�ü ������ ���ִ� �ϳ��� ���̺귯��.//"com.mysql.jdbc.Driver"��������(�����ڵ忡�� cj)�߰��Ȱ�.
				conn = DriverManager.getConnection(jdbcURL, jdbcID, jdbcPassword);
				//conn = DriverManager.getConnection(jdbcURL, jdbcID, jdbcPassword);//�� �̿��ؼ� conn��ü�ȿ� ���� �� ���ְ�. 
			} catch (Exception e) {
				e.printStackTrace();//->������ ���� ��µǰ� ����.
			}
			
		}

		//�۾��⿣ �� 3�� �Լ� �ʿ� ������
		//1. ���� �ð� �־��ִ� �Լ�. ������ �Լ����� ���� �Լ����� db���ٿ� �־ ������ �Ͼ�� ������  pstmt �ȿ� �־���.
		public String getDate() {
			String SQL = "SELECT NOW()"; //���� �ð� �������� my sql ����.
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL); //������ ��� �� ���� //���� ����Ǵ� ��ü�� �̿��ؼ�, �� SQL������  �����غ�ܰ�� ���� ���� �� �ְ���.
				rs = pstmt.executeQuery(); //���� ������ ���ҿ�.
				if (rs.next()) { //if ����� �ִ°��, ������ ���� ����.
					return rs.getString(1); //getString 1���� ��¥ ��ȯ ������
				}
			} catch (Exception e) {
				e.printStackTrace(); //������ �߻��� ���.
			}
			return ""; //������ ���ڸ� ��ȯ������ �� �����ͺ��̽� ������ �˷��ش�. �����ؼ� �߻����� ������;
		}	
		
		//
		public int getNext() {
			String SQL = "SELECT bbsID FROM BBS ORDER BY bbsID DESC ()"; //���������� �����°� ���� ������. //��������!! �� �������� ���� �۹�ȣ ����������.
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL); //������ ��� �� ���� //���� ����Ǵ� ��ü�� �̿��ؼ�, �� SQL������  �����غ�ܰ�� ���� ���� �� �ְ���.
				rs = pstmt.executeQuery(); //���� ������ ���ҿ�.
				if (rs.next()) { //if ����� �ִ°��, ������ ���� ����.
					return rs.getInt(1) + 1; //���� ����� +1���ؼ� �Խñ� ��ȣ ����.
				}
				return 1; //ù���� �Խñ��� ������ϳ��� ���� ���� �ܷΰ� x
			} catch (Exception e) { 
				e.printStackTrace(); //������ �߻��� ���.
			}
			return -1; //�Խñ� ���ڷ� �������� ���� -1�� ��ȯ�����ν� ���α׷� ������ �˷��ش�,
		}	
		
		//3. db �� �����ϴ� write �Լ�. 
		//�۾��� �޼ҵ�
		public int write(String bbsTitle, String userID, String bbsContent) {
			String SQL = "INSERT INTO BBS VALUES (?,?,?,?,?,?)"; //BBS ���̺�ȿ�, �������� ���� �� ������. 
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL); 
				pstmt.setInt(1,  getNext()); //1. �������� �������� �Խñ۹�ȣ!! . prepareStatement���� �ϳ��� ���� �־��ְ� ��.
				pstmt.setString(2,  bbsTitle);
				pstmt.setString(3,  userID);
				pstmt.setString(4,  getDate());
				pstmt.setString(5,  bbsContent);
				pstmt.setInt(6,  1); //available > �����ȵ� ����, 1 �־���. ���� �ǰԲ�?
				
				//rs = pstmt.executeQuery(); //���� ������ ���ҿ�. 
				//��>>> but!!!! >> insert�������� update�� �۵��ϱ� ������ �ʿ� ����. 
				return pstmt.executeUpdate(); //�����ҽ� 0�̻� �� ��ȯ, 
			} catch (Exception e) { 
				e.printStackTrace(); //������ �߻��� ���.
			}
			return -1; //�Խñ� ���ڷ� �������� ���� -1�� ��ȯ�����ν� ���α׷� ������ �˷��ش�,
		}
		
		//ctrl shift5 ??????????
		//4. 11�� �Խñ� ����Ʈ �޼ҵ�
		public ArrayList<Bbs> getList(int pageNumber) { //�� ������ �Խñ��� �� 
			String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1 order by bbsID desc limit 10 ";
			//											��> ������ �������� ��Ϸ��� 1, 
			ArrayList<Bbs> list = new ArrayList<Bbs>();
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, getNext() - (pageNumber -1) *10);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Bbs bbs = new Bbs(); //�ν��Ͻ�
					bbs.setBbsID(rs.getInt(1));
					bbs.setBbsTitle(rs.getNString(2));
					bbs.setUserID(rs.getString(3));
					bbs.setBbsDate(rs.getString(4));
					bbs.setBbsContent(rs.getString(5));
					bbs.setBbsAvailable(rs.getInt(6));
					list.add(bbs);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
			
		}
		
		//4-2. 11�� ����¡ ó�� �޼ҵ�
		public boolean nextPage(int pageNumber) {
			String sql = "select * from bbs where bbsID < ? and bbsAvailable = 1";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, getNext() - (pageNumber - 1) * 10);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					return true;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}	
		
		
		
}

