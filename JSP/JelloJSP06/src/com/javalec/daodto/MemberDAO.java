package com.javalec.daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO { // dao>>dto : db ����

	private Connection conn = null; // �ڹٿ� �����ͺ��̽��� ���� //connection: �����ͺ��̽��� �����ϰ� ���ִ� �ϳ��� ��ü.
	private Statement stmt = null;
	private ResultSet rs = null; // ����� �޾ƿ��� //��� ������ ���� �� �ִ� �ϳ��� ��ü.
	private PreparedStatement pstmt = null; // ������ ��� �� ����
	private DataSource ds =  null;
	public MemberDAO() { // �ϳ��� ��ü�� ���������, �ڵ����� dbĿ�ؼ��� �̷���������.
		try {
			Context ctx =new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


	public int memberInsert(MemberDTO m) { //memberDTO�� �޾Ƽ� ó����. 
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn = ds.getConnection();
			String query = 
					"insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			//��� ������ SQL������ �����ͺ��̽��� �����ϴ��������� �ν��Ͻ��� ������.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			result=pstmt.executeUpdate(); //���� ���� ���� ����
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return result;
	}
	
	
	//by_sr jh ������������������������������������������
	public List<MemberDTO> printMember() {
		List<MemberDTO> mList = new ArrayList<MemberDTO>();
		conn = null;
		pstmt = null;
		rs = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn = ds.getConnection();
			String SQL = "select * from memberDTO"; //������ �Է��� SQL���� �Է�. USER���̺��� �ش������� ����� ����������.
			pstmt = conn.prepareStatement(SQL); //sql�������� ��� ��Ų��//prepared statement=connection.prepareStatement�Լ���(sql)�ν��Ͻ����� 
			rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
					MemberDTO member = new MemberDTO();
					member.setName(rs.getString("name"));
					member.setId(rs.getString("id"));
					member.setPw(rs.getString("pw"));
					member.setGender(rs.getString("gender"));
					mList.add(member);
				}while(rs.next());
			}
				
			//ù��° '?'�� �Ű������� �޾ƿ� 'userID'�� ���� 
			//setString�� 1, userID�� �־��ش�.  �ϳ��� ������ �̸� �־��ٰ�, 
			 //���� �� ����ǥ�� �ش��ϴ� ������ ���� ���� �־��ֵ��� �Ѵ�. ù������ �Ű������� �Ѿ�� ���� �ν��Ͻ���,getUserID();

			//return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //�������� �������� �ݾƴ��˳���
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mList; //db���� ?
		}

	
		//by_Teacher
	public ArrayList<MemberDTO> memberSelect(){
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		conn = null;
		stmt = null; 
		try {
			//conn = DriverManager.getConnection(url, uid,upw);
			conn = ds.getConnection();
			rs = stmt.executeQuery("select * from memberdto");
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setId(rs.getString("pw"));
				dto.setId(rs.getString("gender"));
				dtos.add(dto);			
			}
		} catch (Exception e) {
			e.printStackTrace();//Ȥ�ø� �������
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos; //107������ �Է¹��� ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();�״�� ���� ��������������������������
	}
	
	//Teacher2 request.
	//memberdto  ���̺��� ���� �ϳ� ���� ��. '�ϳ�'������ �´�. ������
	//������ java ���� ������ �����ε� -�������̵�, �����Ͱ���ó�� ��ġ�� ����Ű�� �� ���� ��Ÿ���°� �ƴϴ�. int a=b;  b=1,a=2,�̸� a=2
	public MemberDTO checkMember(MemberDTO m ) {
		MemberDTO dto = new MemberDTO();
		conn = null;
		pstmt = null; //prepareStatement ��������������
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn = ds.getConnection();
			String query ="select * from memberdto where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId()); //m�� �Ű����� by MemberDTO 
			rs = pstmt.executeQuery();
			rs.next(); //1�� �о�帲.
			dto.setName(rs.getString("name"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setGender(rs.getString("gender"));
			} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
	}
	
	
	//by sr
	public MemberDTO memberSelect2(String id) {
		MemberDTO dto = new MemberDTO();
		try {
			//conn = DriverManager.getConnection(url, uid,upw);
			conn = ds.getConnection();
			String query = "select * from memberdto where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id); // ->
			rs = pstmt.executeQuery();
			rs.next(); //t\ -- �̰��־�� ù���� �� �����ü��ִ�. 
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setGender(rs.getString("gender"));
		} catch (Exception e) {
			e.printStackTrace();//Ȥ�ø� �������
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}


	public int memberUpdate(MemberDTO m) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"update memberdto set name=?, gender=? where id=?";
			pstmt = conn.prepareStatement(query); //pstmt�� ��Ƽ� ������ ����..
			//��� ������ SQL������ �����ͺ��̽��� �����ϴ��������� �ν��Ͻ��� ������.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
			result=pstmt.executeUpdate();//�������༺������
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return result;
	}
		
	public int changePw(String id, String pw) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			conn= ds.getConnection();
			String query = 
					"update memberdto set pw=? where id=?";

			PasswordEncoder p = new BCryptPasswordEncoder();
			pw = p.encode(pw);//��ȣȭ ���Ѽ� �������

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pw);
			pstmt.setString(2, id);
			result=pstmt.executeUpdate();//�������༺������
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return result;
		
		
		
		
	}
}
