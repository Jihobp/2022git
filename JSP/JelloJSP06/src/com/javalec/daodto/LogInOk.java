package com.javalec.daodto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**db연결코
 * Servlet implementation class LogInOk
 */
@WebServlet("/LogInOk")
public class LogInOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInOk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		MemberDAO memberDAO = new MemberDAO(); //인스턴스 생성
		request.setCharacterEncoding("utf-8");
		MemberDTO m = new MemberDTO();	//인스턴스 생성.
		String strID = request.getParameter("id");
		
		//암 호 화 ㅇㅅㅇㅅㅇㅅㅇㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅ
		String strPW = request.getParameter("pw");//pw 가져옴. 
		PasswordEncoder p = new BCryptPasswordEncoder(); //Encoder : 암호화하는 부분이 들어가 있는 클래스 선언.
		 //PasswordEncoder 타입 p 인스턴스에 new+객체(); 넣어줌. 
		System.out.println(p.matches(strPW, m.getPw())); //matches로 두개 비교,  앞에껀 해시, 뒤에건 그대로 비교해주는거/
		
		m = memberDAO.memberSelect2(strID);
		
		System.out.println(strID+strPW);
		
		HttpSession httpsession = request.getSession();
		if(p.matches(strPW, m.getPw())) {
			httpsession.setAttribute("id", m.getId());
			httpsession.setAttribute("name", m.getName());
			httpsession.setAttribute("gender", m.getGender());
			response.sendRedirect("loginOK.jsp");
		} else {
			System.out.println("실패");
			httpsession.setAttribute("id", m.getId());//db에 저장된거
			httpsession.setAttribute("tryid", m.getId()); 	//login창에서 로그인 시도한 결과 ㅇㅅㅇ
			response.sendRedirect("loginFail.jsp");
		}
		
//		String strQuery = String.format("select * from memberDTO where id='%s' and pw='%s'", 
//										strID, strPW);
//		System.out.println(strQuery);
		//DB 연결 START ! =3=3=3=3=3=3=3=3=3=3==3
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); //jar에 있는 db연결 소스 참고,.
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		Connection conn = null; //Db연결에 관련된 객체들. 
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {//db위치, 스키마이름, 인코딩 등
//			String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
//					+ "serverTimezone=UTC";
//			String dbUser = "root";
//			String dbPass = "1234";
//			//연결을 만듬
//			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
//			stmt = conn.createStatement(); // 쿼리문 실행 관련 객체 생성
//			rs = stmt.executeQuery(strQuery);
//			//----------------------요기서부터
//			rs.next(); //처음 위치로 이동  ??????? >>>>
//			//테이블에서 값을 읽어옴.
//			String strId = rs.getString("id"); 
//			String strName = rs.getString("name"); //getNString 아님 ㅇㅇ
//			String strGender = rs.getString("gender"); 
			
//			if(strName !=null) //결과가 있다면
//			{
//				HttpSession httpsession = request.getSession();
//				httpsession.setAttribute("id", strId);
//				httpsession.setAttribute("name", strName);
//				httpsession.setAttribute("gender", strGender);
//							
//				response.sendRedirect("loginOK.jsp");
//			} //--------------------요기까지 다름. 
//			else {
//				response.sendRedirect("loginFail.jsp");
//			}
				
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {	//db 호출 쿼리문 날ㄹ렸으면 무조건 닫아줘야함.
//			try {	//그래야 다른 사용자들도 쓰고 다시 쓸 수 있땅,.
//				rs.close();
//				stmt.close();
//				conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
	}
}
