package com.javalec.ex;

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
public class MemberDAO { // dao>>dto : db ����

	private Connection conn = null; // �ڹٿ� �����ͺ��̽��� ���� //connection: �����ͺ��̽��� �����ϰ� ���ִ� �ϳ��� ��ü.
	private Statement stmt = null;
	private ResultSet rs = null; // ����� �޾ƿ��� //��� ������ ���� �� �ִ� �ϳ��� ��ü.
	private PreparedStatement pstmt = null; // ������ ��� �� ����
	private DataSource ds =  null;
	
	//�̱��� ����
	//�ϳ��� �ν��Ͻ��� �����ؼ� �װŸ� ��������.
	//�ν��Ͻ� �޼ҵ�� �ν��Ͻ� ������ ���鼭 ����� �ʿ��� ��� ������.
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	//dao�� �����̿��ϴ°� �ƴ϶� �������̽��� ���� ���������� �̿��Ұ�. ������ ��������������~~~!~!~!~!~!
	
	
	public MemberDAO() { // �ϳ��� ��ü�� ���������, �ڵ����� dbĿ�ؼ��� �̷���������.
		try {
			Context ctx = new InitialContext();
			ds = 
			(DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
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
			conn= ds.getConnection();
			String query = 
					"insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			//��� ������ SQL������ �����ͺ��̽��� �����ϴ��������� �ν��Ͻ��� ������.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
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
	
	

	
		//by_Teacher
	public ArrayList<MemberDTO> memberSelect(){
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		conn = null;
		stmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from memberdto");
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setGender(rs.getString("gender"));
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace(); //Ȥ�� �� ���� ���
		} finally { 
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos; //107������ �Է¹��� ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();�״�� ���� ��������������������������
	}
	

	
	
	//��Ʈ��Ű ������ Ŭ�������� �̵� memberUpdate
	public int memberUpdate(MemberDTO m) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"update memberdto set name=?, gender=?, pw=? where id=?";
			pstmt = conn.prepareStatement(query); //pstmt�� ��Ƽ� ������ ����..
			//��� ������ SQL������ �����ͺ��̽��� �����ϴ��������� �ν��Ͻ��� ������.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			//��й�ȣ ������. ��ȣ�Ϥ� ������
			PasswordEncoder p = new BCryptPasswordEncoder();
			m.setPw(p.encode(m.getPw()));
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getId());
			result=pstmt.executeUpdate();//�������༺������
		} catch (Exception e) {
			e.printStackTrace();
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
		
	
	public int memberDelete(MemberDTO m) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"delete from memberdto where id=?";
			pstmt = conn.prepareStatement(query); //pstmt�� ��Ƽ� ������ ����..
			//��� ������ SQL������ �����ͺ��̽��� �����ϴ��������� �ν��Ͻ��� ������.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
			result=pstmt.executeUpdate();//�������༺������
		} catch (Exception e) {
			e.printStackTrace();
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
