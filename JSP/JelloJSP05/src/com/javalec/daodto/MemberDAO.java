package com.javalec.daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO { // dao>>dto : db 尻衣

	private String url = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
			+ "serverTimezone=UTC";
	private String uid = "root";
	private String upw = "1234";

	private Connection conn = null; // 切郊人 汽戚斗今戚什研 尻衣 //connection: 汽戚斗今戚什拭 羨悦馬惟 背爽澗 馬蟹税 梓端.
	private Statement stmt = null;
	private ResultSet rs = null; // 衣引葵 閤焼神奄 //嬢彊廃 舛左研 眼聖 呪 赤澗 馬蟹税 梓端.
	private PreparedStatement pstmt = null; // 汀軒庚 企奄 貢 竺舛

	public MemberDAO() { // 馬蟹税 梓端稽 幻級醸聖凶, 切疑生稽 db朕学芝戚 戚件走惟背捜.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // jar拭 赤澗 db 尻衣 社什研 凧繕馬澗 依
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public int memberInsert(MemberDTO m) { //memberDTO研 閤焼辞 坦軒敗. 
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			String query = 
					"insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			//嬢彊廃 舛背遭 SQL庚舌聖 汽戚斗今戚什拭 諮脊馬澗莫縦生稽 昔什渡什研 亜閃身.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			result=pstmt.executeUpdate(); //汀軒 呪楳 失因 食採
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
	
	
	//by_sr jh しさしさしさしさしさしさしさしさしさしさし
	public List<MemberDTO> printMember() {
		List<MemberDTO> mList = new ArrayList<MemberDTO>();
		conn = null;
		pstmt = null;
		rs = null;
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			String SQL = "select * from memberDTO"; //叔薦稽 脊径拝 SQL庚舌 脊径. USER砺戚鷺拭辞 背雁紫遂切税 搾腰聖 亜閃神惟敗.
			pstmt = conn.prepareStatement(SQL); //sql汀軒庚聖 企奄 獣轍陥//prepared statement=connection.prepareStatement敗呪拭(sql)昔什渡什隔製 
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
				
			//湛腰属 '?'拭 古鯵痕呪稽 閤焼紳 'userID'研 企脊 
			//setString拭 1, userID研 隔嬢層陥.  馬蟹税 庚舌聖 耕軒 隔醸陥亜, 
			 //唖唖 是 弘製妊拭 背雁馬澗 鎧遂戚 更亜 級嬢哀走 隔嬢爽亀系 廃陥. 湛腰??稽 古鯵痕呪稽 角嬢紳 政煽 昔什渡什拭,getUserID();

			//return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //伸醸揮暗 蝕授生稽 丸焼岐桔貝ぇ
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mList; //db神嫌 ?
		}

	
		//by_Teacher
	public ArrayList<MemberDTO> memberSelect(){
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		conn = null;
		stmt = null;
		try {
			conn = DriverManager.getConnection(url, uid,upw);
			stmt = conn.createStatement();
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
			e.printStackTrace();//箸獣乞研 拭君窒径
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos; //107腰??匝 脊径閤精 ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();益企稽 軒渡 しさしさしさしさしさしさし
	}
	
	//Teacher2 request.
	//memberdto  砺戚鷺税 葵聖 馬蟹 握壱 身. '馬蟹'亜走壱 紳陥. しさし
	//識持還 java 竺誤 しさし 神獄稽漁 -神獄虞戚漁, 匂昔斗鯵割坦軍 是帖幻 亜軒徹走 益 葵聖 蟹展鎧澗惟 焼艦陥. int a=b;  b=1,a=2,戚檎 a=2
	public MemberDTO checkMember(MemberDTO m ) {
		MemberDTO dto = new MemberDTO();
		conn = null;
		pstmt = null; //prepareStatement しさしさしさし
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			String query ="select * from memberdto where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId()); //m精 古鯵痕呪 by MemberDTO 
			rs = pstmt.executeQuery();
			rs.next(); //1匝 石嬢球顕.
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
	
	public MemberDTO memberSelect2(String id) {
		MemberDTO dto = new MemberDTO();
		try {
			conn = DriverManager.getConnection(url, uid,upw);
			String query = "select * from memberdto where id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id); // ->
			rs = pstmt.executeQuery();
			rs.next(); //t\ -- 戚惟赤嬢醤 湛腰?? 葵 亜閃臣呪赤陥. 
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setGender(rs.getString("gender"));
		} catch (Exception e) {
			e.printStackTrace();//箸獣乞研 拭君窒径
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
}
