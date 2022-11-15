package com.javalec.daodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO { // dao>>dto : db 연결

	private String url = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
			+ "serverTimezone=UTC";
	private String uid = "root";
	private String upw = "1234";

	private Connection conn = null; // 자바와 데이터베이스를 연결 //connection: 데이터베이스에 접근하게 해주는 하나의 객체.
	private Statement stmt = null;
	private ResultSet rs = null; // 결과값 받아오기 //어떠한 정보를 담을 수 있는 하나의 객체.
	private PreparedStatement pstmt = null; // 쿼리문 대기 및 설정

	public MemberDAO() { // 하나의 객체로 만들었을때, 자동으로 db커넥션이 이뤄지게해줌.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // jar에 있는 db 연결 소스를 참조하는 것
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public int memberInsert(MemberDTO m) { //memberDTO를 받아서 처리함. 
		int result = -1;
		conn = null;
		pstmt = null;
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			String query = 
					"insert into memberDTO values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			//어떠한 정해진 SQL문장을 데이터베이스에 삽입하는형식으로 인스턴스를 가져옴.
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getGender());
			result=pstmt.executeUpdate(); //쿼리 수행 성공 여부
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
	
	
	//by_sr jh ㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇ
	public List<MemberDTO> printMember() {
		List<MemberDTO> mList = new ArrayList<MemberDTO>();
		conn = null;
		pstmt = null;
		rs = null;
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			String SQL = "select * from memberDTO"; //실제로 입력할 SQL문장 입력. USER테이블에서 해당사용자의 비번을 가져오게함.
			pstmt = conn.prepareStatement(SQL); //sql쿼리문을 대기 시킨다//prepared statement=connection.prepareStatement함수에(sql)인스턴스넣음 
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
				
			//첫번째 '?'에 매개변수로 받아온 'userID'를 대입 
			//setString에 1, userID를 넣어준다.  하나의 문장을 미리 넣었다가, 
			 //각각 위 물음표에 해당하는 내용이 뭐가 들어갈지 넣어주도록 한다. 첫번쨰로 매개변수로 넘어온 유저 인스턴스에,getUserID();

			//return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //열었던거 역순으로 닫아댜됩난ㄷ
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mList; //db오류 ?
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
			e.printStackTrace();//혹시모를 에러출력
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos; //107번쨰줄 입력받은 ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();그대로 리턴 ㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇ
	}
	
	//Teacher2 request.
	//memberdto  테이블의 값을 하나 갖고 옴. '하나'가지고 온다. ㅇㅅㅇ
	//선생님 java 설명 ㅇㅅㅇ 오버로딩 -오버라이딩, 포인터개념처럼 위치만 가리키지 그 값을 나타내는게 아니다. int a=b;  b=1,a=2,이면 a=2
	public MemberDTO checkMember(MemberDTO m ) {
		MemberDTO dto = new MemberDTO();
		conn = null;
		pstmt = null; //prepareStatement ㅇㅅㅇㅅㅇㅅㅇ
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			String query ="select * from memberdto where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId()); //m은 매개변수 by MemberDTO 
			rs = pstmt.executeQuery();
			rs.next(); //1줄 읽어드림.
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
			rs.next(); //t\ -- 이게있어야 첫번쨰 값 가져올수있다. 
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setGender(rs.getString("gender"));
		} catch (Exception e) {
			e.printStackTrace();//혹시모를 에러출력
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
