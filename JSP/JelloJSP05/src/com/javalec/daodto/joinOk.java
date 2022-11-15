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
		
		MemberDAO memberDAO = new MemberDAO(); //인스턴스 생성
		request.setCharacterEncoding("utf-8");
		MemberDTO m = new MemberDTO();
		m.setName(request.getParameter("name"));
		m.setId(request.getParameter("id"));
		
		
		//m.setPw(request.getParameter("pw"));
		//암 호 화 ㅇㅅㅇㅅㅇㅅㅇㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅ
		String password = request.getParameter("pw"); //pw 가져옴. 
		PasswordEncoder p = new BCryptPasswordEncoder(); //Encoder : 암호화하는 부분이 들어가 있는 클래스 선언.
														 //PasswordEncoder 타입 p 인스턴스에 new+객체(); 넣어줌. 
		String cPassWord = p.encode(password); //Encoder라는 함수에다가 우리가 입력한 패스워드 집어넣으면 암호화된 패스워드로 반환해줌.
											//String 타입 cPassword에 p==new BCryptPasswordEncoder();안에 encode password 매개변수 넣어줌. ㅇㅅㅇ
		System.out.println(p.matches(password, cPassWord)); //matches로 두개 비교,  앞에껀 해시, 뒤에건 그대로 비교해주는거/
		m.setPw(cPassWord); //password:암호화시킬패스워드, cPassword:암호화된 패스워드 ㅇㅅㅇ
		
		m.setGender(request.getParameter("gender"));
		memberDAO.memberInsert(m);
		response.sendRedirect("memberInsert.jsp");
		
		
		
		//PasswordEncoder 인터페이스라서 익명클래스화 가능
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
