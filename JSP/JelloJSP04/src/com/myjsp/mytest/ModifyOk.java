package com.myjsp.mytest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyOk
 */
@WebServlet("/ModifyOk")
public class ModifyOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOk() {
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
		request.setCharacterEncoding("UTF-8"); // g한글깨짐 방지
		HttpSession httpSession; //세션에 담겨있는 상태임 ㅇㅅㅇ >
		HttpSession session = request.getSession(); //저장소개념., import해줘야함		//Session..1.`.1`.1`1`1.
		System.out.println(session.getAttribute("id")); //
		
		
		//회원가입 화면에서의 데이터를 불러옴
		//파라미터 값 가져욤,.이름 pw phone gender 값 가져옴 = (id는 이미  session으로 받음) 
		String strName = request.getParameter("name");
		String strId = (String)session.getAttribute("id"); //형변환 ㅇㅅㅇ
		String strPw = request.getParameter("pw");
		String strPhone = request.getParameter("phone")+"-"+
						  request.getParameter("phone2")+"-"+
						  request.getParameter("phone3");
		String strGender = request.getParameter("gender");
		
		String[] hobbys = request.getParameterValues("hobby");
		

		System.out.println("Insert에 삽입될 값들");
		System.out.println(strName);
		System.out.println(strId);
		System.out.println(strPw);
		System.out.println(strPhone);
		System.out.println(strGender);

		String strQuery = String.format("UPDATE member set name ='%s', pw='%s', hp='%s', gender='%s' where id='%s' ", strName,
				strPw, strPhone, strGender, strId); //httpsession.getAttribute("id"); 만약 id 변수선언 및 받지 않았다면!
		System.out.println(strQuery); //str 쿼리찍김.

		//DB 연결 START ! =3=3=3=3=3=3=3=3=3=3==3
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //jar에 있는 db연결 소스 참고,.
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection conn = null; //Db연결에 관련된 객체들. 
		Statement stmt = null;
		ResultSet rs = null;
		try {//db위치, 스키마이름, 인코딩 등
			String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
					+ "serverTimezone=UTC";
			String dbUser = "root";
			String dbPass = "1234";
			//연결을 만듬
			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
			stmt = conn.createStatement(); // 쿼리문 실행 관련 객체 생성
			int i = stmt.executeUpdate(strQuery); //db에 쿼리 보냄.  update>데이터보냄, executeQUERY(조회기능)
			if (i == 1) { // 성공(insert 성공시 영향받는 컬럼은 1개나옴)
				System.out.println("성공"); 
				//response.sendRedirect("modifyResult.jsp"); //=3=3=3=3=3=3 성공하면 joinResult.jsp로 이동!! 
				session.setAttribute("name", strName);
				response.sendRedirect("modifyResult.jsp");
			} else {
				System.out.println("실패");
				response.sendRedirect("modify.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {	//db 호출 쿼리문 날ㄹ렸으면 무조건 닫아줘야함.
			try {	//그래야 다른 사용자들도 쓰고 다시 쓸 수 있땅,.
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}