package com.javalec.daodto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Servlet implementation class LogInOkbyT
 */
@WebServlet("/LogInOkbyT")
public class LogInOkbyT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInOkbyT() {
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
		m.setId(request.getParameter("id")); //id 亜閃身
		m.setPw(request.getParameter("pw")); //pw 亜閃身
		//m税 id研 戚遂背辞 compareM拭 葵聖 蓄亜敗.
		//m税 pw人 compareM税 pw研 古暢獣鉄.
		MemberDTO compareM = new MemberDAO().checkMember(m);
		
		//章 硲 鉢 しさしさしさししさしさしさしさしさしさしさしさしさ
		//PasswordEncoder 展脊 p 昔什渡什拭 new+梓端(); 隔嬢捜. 
		PasswordEncoder p =new BCryptPasswordEncoder(); //Encoder : 章硲鉢馬澗 採歳戚 級嬢亜 赤澗 適掘什 識情.
		HttpSession hs = request.getSession();
		//matches稽 砧鯵 搾嘘,  蒋拭黄 背獣, 及拭闇 益企稽 搾嘘背爽澗暗/
		if(p.matches(m.getPw(), compareM.getPw())) {
			System.out.println("失因");
			hs.setAttribute("name", compareM.getName());
			hs.setAttribute("gender", compareM.getGender());
			hs.setAttribute("id", compareM.getId());
			response.sendRedirect("loginResult.jsp");
		}else {
			System.out.println("叔鳶");
			hs.setAttribute("id", compareM.getId()); //db拭 煽舌吉暗
			hs.setAttribute("tryid", m.getId()); 	//login但拭辞 稽益昔 獣亀廃 衣引 しさし
			response.sendRedirect("loginFail.jsp");
		}
		
		
	}
}	
