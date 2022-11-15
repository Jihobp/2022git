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
public class MemberDAO { // dao>>dto : db 연결

	private Connection conn = null; // 자바와 데이터베이스를 연결 //connection: 데이터베이스에 접근하게 해주는 하나의 객체.
	private Statement stmt = null;
	private ResultSet rs = null; // 결과값 받아오기 //어떠한 정보를 담을 수 있는 하나의 객체.
	private PreparedStatement pstmt = null; // 쿼리문 대기 및 설정
	private DataSource ds =  null;
	
	//싱글톤 패턴
	//하나의 인스턴스만 생성해서 그거만 쓰려고함.
	//인스턴스 메소드와 인스턴스 변수를 쓰면서 상속이 필요할 경우 유용함.
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	//dao를 직접이용하는게 아니라 인터페이스를 통해 간접적으로 이용할거. 다형성 ㅅㅇㅅㅇㅅㅇㅅ~~~!~!~!~!~!
	
	
	public MemberDAO() { // 하나의 객체로 만들었을때, 자동으로 db커넥션이 이뤄지게해줌.
		try {
			Context ctx = new InitialContext();
			ds = 
			(DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


	public int memberInsert(MemberDTO m) { //memberDTO를 받아서 처리함. 
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			//어떠한 정해진 SQL문장을 데이터베이스에 삽입하는형식으로 인스턴스를 가져옴.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			result=pstmt.executeUpdate();//쿼리수행성공여부
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
			e.printStackTrace(); //혹시 모를 에러 출력
		} finally { 
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos; //107번쨰줄 입력받은 ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();그대로 리턴 ㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇ
	}
	

	
	
	//컨트롤키 누르고 클릭혀ㅏ면 이동 memberUpdate
	public int memberUpdate(MemberDTO m) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"update memberdto set name=?, gender=?, pw=? where id=?";
			pstmt = conn.prepareStatement(query); //pstmt에 담아서 쿼리문 실행..
			//어떠한 정해진 SQL문장을 데이터베이스에 삽입하는형식으로 인스턴스를 가져옴.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			//비밀번호 ㅇㅅㅇ. 암호하ㅗ ㅇㅅㅇ
			PasswordEncoder p = new BCryptPasswordEncoder();
			m.setPw(p.encode(m.getPw()));
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getId());
			result=pstmt.executeUpdate();//쿼리수행성공여부
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
			pstmt = conn.prepareStatement(query); //pstmt에 담아서 쿼리문 실행..
			//어떠한 정해진 SQL문장을 데이터베이스에 삽입하는형식으로 인스턴스를 가져옴.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
			result=pstmt.executeUpdate();//쿼리수행성공여부
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
