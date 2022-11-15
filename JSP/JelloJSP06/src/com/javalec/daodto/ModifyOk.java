package com.javalec.daodto;

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
		String id = (String)session.getAttribute("id"); //형변환 ㅇㅅㅇ
		System.out.println("id="+id);
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		//String Pw = request.getParameter("pw");
		MemberDAO dao = new MemberDAO();
		MemberDTO m = new MemberDTO();
		m.setId(id);
		m.setName(name);
		m.setGender(gender);
		dao.memberUpdate(m); //db 쿼리 호출하여 수정 예정
		request.getSession().setAttribute("name", m.getName());
		response.sendRedirect("modifyResult.jsp");
	}
}