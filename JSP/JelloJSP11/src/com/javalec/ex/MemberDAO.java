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
public class MemberDAO { // dao>>dto : db 尻衣

	private Connection conn = null; // 切郊人 汽戚斗今戚什研 尻衣 //connection: 汽戚斗今戚什拭 羨悦馬惟 背爽澗 馬蟹税 梓端.
	private Statement stmt = null;
	private ResultSet rs = null; // 衣引葵 閤焼神奄 //嬢彊廃 舛左研 眼聖 呪 赤澗 馬蟹税 梓端.
	private PreparedStatement pstmt = null; // 汀軒庚 企奄 貢 竺舛
	private DataSource ds =  null;
	
	//縮越宕 鳶渡
	//馬蟹税 昔什渡什幻 持失背辞 益暗幻 床形壱敗.
	//昔什渡什 五社球人 昔什渡什 痕呪研 床檎辞 雌紗戚 琶推拝 井酔 政遂敗.
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	//dao研 送羨戚遂馬澗惟 焼艦虞 昔斗凪戚什研 搭背 娃羨旋生稽 戚遂拝暗. 陥莫失 さしさしさしさ~~~!~!~!~!~!
	
	
	public MemberDAO() { // 馬蟹税 梓端稽 幻級醸聖凶, 切疑生稽 db朕学芝戚 戚件走惟背捜.
		try {
			Context ctx = new InitialContext();
			ds = 
			(DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


	public int memberInsert(MemberDTO m) { //memberDTO研 閤焼辞 坦軒敗. 
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			//嬢彊廃 舛背遭 SQL庚舌聖 汽戚斗今戚什拭 諮脊馬澗莫縦生稽 昔什渡什研 亜閃身.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			result=pstmt.executeUpdate();//汀軒呪楳失因食採
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
			e.printStackTrace(); //箸獣 乞研 拭君 窒径
		} finally { 
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos; //107腰??匝 脊径閤精 ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();益企稽 軒渡 しさしさしさしさしさしさし
	}
	

	
	
	//珍闘継徹 刊牽壱 適遣粕た檎 戚疑 memberUpdate
	public int memberUpdate(MemberDTO m) {
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			//conn = DriverManager.getConnection(url,uid,upw);
			conn= ds.getConnection();
			String query = 
					"update memberdto set name=?, gender=?, pw=? where id=?";
			pstmt = conn.prepareStatement(query); //pstmt拭 眼焼辞 汀軒庚 叔楳..
			//嬢彊廃 舛背遭 SQL庚舌聖 汽戚斗今戚什拭 諮脊馬澗莫縦生稽 昔什渡什研 亜閃身.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			//搾腔腰硲 しさし. 章硲馬で しさし
			PasswordEncoder p = new BCryptPasswordEncoder();
			m.setPw(p.encode(m.getPw()));
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getId());
			result=pstmt.executeUpdate();//汀軒呪楳失因食採
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
			pstmt = conn.prepareStatement(query); //pstmt拭 眼焼辞 汀軒庚 叔楳..
			//嬢彊廃 舛背遭 SQL庚舌聖 汽戚斗今戚什拭 諮脊馬澗莫縦生稽 昔什渡什研 亜閃身.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getGender());
			pstmt.setString(3, m.getId());
			result=pstmt.executeUpdate();//汀軒呪楳失因食採
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
