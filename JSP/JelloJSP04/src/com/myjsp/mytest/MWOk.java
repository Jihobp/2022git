package com.myjsp.mytest;

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

/**
 * Servlet implementation class MWOk
 */
@WebServlet("/MWOk")
public class MWOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MWOk() {
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
		request.setCharacterEncoding("utf-8");
		HttpSession httpSession;
		httpSession = request.getSession();
		String strID = 
				(String)httpSession.getAttribute("id");
		String strQuery = String.format("delete from member where id='%s'", strID);
		System.out.println(strID+strQuery);
		
		
		
		
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
						httpSession.invalidate();
						//response.sendRedirect("modifyResult.jsp"); //=3=3=3=3=3=3 성공하면 joinResult.jsp로 이동!! 
						//httpSession.setAttribute("name", strName);
						response.sendRedirect("login.html");
					} else {
						System.out.println("실패");
						response.sendRedirect("login.html");
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
