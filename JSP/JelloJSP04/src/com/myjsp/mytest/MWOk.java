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
		
		
		
		
		//DB ���� START ! =3=3=3=3=3=3=3=3=3=3==3
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); //jar�� �ִ� db���� �ҽ� ����,.
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Connection conn = null; //Db���ῡ ���õ� ��ü��. 
				Statement stmt = null;
				ResultSet rs = null;
				try {//db��ġ, ��Ű���̸�, ���ڵ� ��
					String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
							+ "serverTimezone=UTC";
					String dbUser = "root";
					String dbPass = "1234";
					//������ ����
					conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
					stmt = conn.createStatement(); // ������ ���� ���� ��ü ����
					int i = stmt.executeUpdate(strQuery); //db�� ���� ����.  update>�����ͺ���, executeQUERY(��ȸ���)
					if (i == 1) { // ����(insert ������ ����޴� �÷��� 1������)
						System.out.println("����"); 
						httpSession.invalidate();
						//response.sendRedirect("modifyResult.jsp"); //=3=3=3=3=3=3 �����ϸ� joinResult.jsp�� �̵�!! 
						//httpSession.setAttribute("name", strName);
						response.sendRedirect("login.html");
					} else {
						System.out.println("����");
						response.sendRedirect("login.html");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {	//db ȣ�� ������ ���������� ������ �ݾ������.
					try {	//�׷��� �ٸ� ����ڵ鵵 ���� �ٽ� �� �� �ֶ�,.
						stmt.close();
						conn.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}

	}

}
