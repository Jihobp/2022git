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

/**db������
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
		MemberDAO memberDAO = new MemberDAO(); //�ν��Ͻ� ����
		request.setCharacterEncoding("utf-8");
		MemberDTO m = new MemberDTO();	//�ν��Ͻ� ����.
		String strID = request.getParameter("id");
		
		//�� ȣ ȭ ��������������������������������������������������
		String strPW = request.getParameter("pw");//pw ������. 
		PasswordEncoder p = new BCryptPasswordEncoder(); //Encoder : ��ȣȭ�ϴ� �κ��� �� �ִ� Ŭ���� ����.
		 //PasswordEncoder Ÿ�� p �ν��Ͻ��� new+��ü(); �־���. 
		System.out.println(p.matches(strPW, m.getPw())); //matches�� �ΰ� ��,  �տ��� �ؽ�, �ڿ��� �״�� �����ִ°�/
		
		m = memberDAO.memberSelect2(strID);
		
		System.out.println(strID+strPW);
		
		HttpSession httpsession = request.getSession();
		if(p.matches(strPW, m.getPw())) {
			httpsession.setAttribute("id", m.getId());
			httpsession.setAttribute("name", m.getName());
			httpsession.setAttribute("gender", m.getGender());
			response.sendRedirect("loginOK.jsp");
		} else {
			System.out.println("����");
			httpsession.setAttribute("id", m.getId());//db�� ����Ȱ�
			httpsession.setAttribute("tryid", m.getId()); 	//loginâ���� �α��� �õ��� ��� ������
			response.sendRedirect("loginFail.jsp");
		}
		
//		String strQuery = String.format("select * from memberDTO where id='%s' and pw='%s'", 
//										strID, strPW);
//		System.out.println(strQuery);
		//DB ���� START ! =3=3=3=3=3=3=3=3=3=3==3
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); //jar�� �ִ� db���� �ҽ� ����,.
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		Connection conn = null; //Db���ῡ ���õ� ��ü��. 
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {//db��ġ, ��Ű���̸�, ���ڵ� ��
//			String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
//					+ "serverTimezone=UTC";
//			String dbUser = "root";
//			String dbPass = "1234";
//			//������ ����
//			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
//			stmt = conn.createStatement(); // ������ ���� ���� ��ü ����
//			rs = stmt.executeQuery(strQuery);
//			//----------------------��⼭����
//			rs.next(); //ó�� ��ġ�� �̵�  ??????? >>>>
//			//���̺��� ���� �о��.
//			String strId = rs.getString("id"); 
//			String strName = rs.getString("name"); //getNString �ƴ� ����
//			String strGender = rs.getString("gender"); 
			
//			if(strName !=null) //����� �ִٸ�
//			{
//				HttpSession httpsession = request.getSession();
//				httpsession.setAttribute("id", strId);
//				httpsession.setAttribute("name", strName);
//				httpsession.setAttribute("gender", strGender);
//							
//				response.sendRedirect("loginOK.jsp");
//			} //--------------------������ �ٸ�. 
//			else {
//				response.sendRedirect("loginFail.jsp");
//			}
				
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {	//db ȣ�� ������ ���������� ������ �ݾ������.
//			try {	//�׷��� �ٸ� ����ڵ鵵 ���� �ٽ� �� �� �ֶ�,.
//				rs.close();
//				stmt.close();
//				conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
	}
}
