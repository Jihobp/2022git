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

/**db尻衣坪
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
		MemberDAO memberDAO = new MemberDAO(); //昔什渡什 持失
		request.setCharacterEncoding("utf-8");
		MemberDTO m = new MemberDTO();	//昔什渡什 持失.
		String strID = request.getParameter("id");
		
		//章 硲 鉢 しさしさしさししさしさしさしさしさしさしさしさしさ
		String strPW = request.getParameter("pw");//pw 亜閃身. 
		PasswordEncoder p = new BCryptPasswordEncoder(); //Encoder : 章硲鉢馬澗 採歳戚 級嬢亜 赤澗 適掘什 識情.
		 //PasswordEncoder 展脊 p 昔什渡什拭 new+梓端(); 隔嬢捜. 
		System.out.println(p.matches(strPW, m.getPw())); //matches稽 砧鯵 搾嘘,  蒋拭黄 背獣, 及拭闇 益企稽 搾嘘背爽澗暗/
		
		m = memberDAO.memberSelect2(strID);
		
		System.out.println(strID+strPW);
		
		HttpSession httpsession = request.getSession();
		if(p.matches(strPW, m.getPw())) {
			httpsession.setAttribute("id", m.getId());
			httpsession.setAttribute("name", m.getName());
			httpsession.setAttribute("gender", m.getGender());
			response.sendRedirect("loginOK.jsp");
		} else {
			System.out.println("叔鳶");
			httpsession.setAttribute("id", m.getId());//db拭 煽舌吉暗
			httpsession.setAttribute("tryid", m.getId()); 	//login但拭辞 稽益昔 獣亀廃 衣引 しさし
			response.sendRedirect("loginFail.jsp");
		}
		
//		String strQuery = String.format("select * from memberDTO where id='%s' and pw='%s'", 
//										strID, strPW);
//		System.out.println(strQuery);
		//DB 尻衣 START ! =3=3=3=3=3=3=3=3=3=3==3
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); //jar拭 赤澗 db尻衣 社什 凧壱,.
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		Connection conn = null; //Db尻衣拭 淫恵吉 梓端級. 
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {//db是帖, 什徹原戚硯, 昔坪漁 去
//			String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?" + "useUnicode=true&characterEncoding=utf8&"
//					+ "serverTimezone=UTC";
//			String dbUser = "root";
//			String dbPass = "1234";
//			//尻衣聖 幻給
//			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
//			stmt = conn.createStatement(); // 汀軒庚 叔楳 淫恵 梓端 持失
//			rs = stmt.executeQuery(strQuery);
//			//----------------------推奄辞採斗
//			rs.next(); //坦製 是帖稽 戚疑  ??????? >>>>
//			//砺戚鷺拭辞 葵聖 石嬢身.
//			String strId = rs.getString("id"); 
//			String strName = rs.getString("name"); //getNString 焼還 しし
//			String strGender = rs.getString("gender"); 
			
//			if(strName !=null) //衣引亜 赤陥檎
//			{
//				HttpSession httpsession = request.getSession();
//				httpsession.setAttribute("id", strId);
//				httpsession.setAttribute("name", strName);
//				httpsession.setAttribute("gender", strGender);
//							
//				response.sendRedirect("loginOK.jsp");
//			} //--------------------推奄猿走 陥硯. 
//			else {
//				response.sendRedirect("loginFail.jsp");
//			}
				
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {	//db 硲窒 汀軒庚 劾ぉ携生檎 巷繕闇 丸焼操醤敗.
//			try {	//益掘醤 陥献 紫遂切級亀 床壱 陥獣 承 呪 赤競,.
//				rs.close();
//				stmt.close();
//				conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
	}
}
