package com.javalec.daodto;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Servlet implementation class joinOk
 */
@WebServlet("/joinOk")
public class joinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public joinOk() {
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
		MemberDTO m = new MemberDTO();
		m.setName(request.getParameter("name"));
		m.setId(request.getParameter("id"));
		
		
		//m.setPw(request.getParameter("pw"));
		//章 硲 鉢 しさしさしさししさしさしさしさしさしさしさしさしさ
		String password = request.getParameter("pw"); //pw 亜閃身. 
		PasswordEncoder p = new BCryptPasswordEncoder(); //Encoder : 章硲鉢馬澗 採歳戚 級嬢亜 赤澗 適掘什 識情.
														 //PasswordEncoder 展脊 p 昔什渡什拭 new+梓端(); 隔嬢捜. 
		String cPassWord = p.encode(password); //Encoder虞澗 敗呪拭陥亜 酔軒亜 脊径廃 鳶什趨球 増嬢隔生檎 章硲鉢吉 鳶什趨球稽 鋼発背捜.
											//String 展脊 cPassword拭 p==new BCryptPasswordEncoder();照拭 encode password 古鯵痕呪 隔嬢捜. しさし
		System.out.println(p.matches(password, cPassWord)); //matches稽 砧鯵 搾嘘,  蒋拭黄 背獣, 及拭闇 益企稽 搾嘘背爽澗暗/
		m.setPw(cPassWord); //password:章硲鉢獣迭鳶什趨球, cPassword:章硲鉢吉 鳶什趨球 しさし
		
		m.setGender(request.getParameter("gender"));
		memberDAO.memberInsert(m);
		response.sendRedirect("memberInsert.jsp");
		
		
		
		//PasswordEncoder 昔斗凪戚什虞辞 斥誤適掘什鉢 亜管
//		PasswordEncoder c = new PasswordEncoder() {
//			
//			@Override
//			public boolean matches(CharSequence rawPassword, String encodedPassword) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//			
//			@Override
//			public String encode(CharSequence rawPassword) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
	}

}
