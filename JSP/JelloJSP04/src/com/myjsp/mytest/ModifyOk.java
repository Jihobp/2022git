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
		request.setCharacterEncoding("UTF-8"); // g�ѱ۱��� ����
		HttpSession httpSession; //���ǿ� ����ִ� ������ ������ >
		HttpSession session = request.getSession(); //����Ұ���., import�������		//Session..1.`.1`.1`1`1.
		System.out.println(session.getAttribute("id")); //
		
		
		//ȸ������ ȭ�鿡���� �����͸� �ҷ���
		//�Ķ���� �� ������,.�̸� pw phone gender �� ������ = (id�� �̹�  session���� ����) 
		String strName = request.getParameter("name");
		String strId = (String)session.getAttribute("id"); //����ȯ ������
		String strPw = request.getParameter("pw");
		String strPhone = request.getParameter("phone")+"-"+
						  request.getParameter("phone2")+"-"+
						  request.getParameter("phone3");
		String strGender = request.getParameter("gender");
		
		String[] hobbys = request.getParameterValues("hobby");
		

		System.out.println("Insert�� ���Ե� ����");
		System.out.println(strName);
		System.out.println(strId);
		System.out.println(strPw);
		System.out.println(strPhone);
		System.out.println(strGender);

		String strQuery = String.format("UPDATE member set name ='%s', pw='%s', hp='%s', gender='%s' where id='%s' ", strName,
				strPw, strPhone, strGender, strId); //httpsession.getAttribute("id"); ���� id �������� �� ���� �ʾҴٸ�!
		System.out.println(strQuery); //str �������.

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
				//response.sendRedirect("modifyResult.jsp"); //=3=3=3=3=3=3 �����ϸ� joinResult.jsp�� �̵�!! 
				session.setAttribute("name", strName);
				response.sendRedirect("modifyResult.jsp");
			} else {
				System.out.println("����");
				response.sendRedirect("modify.jsp");
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