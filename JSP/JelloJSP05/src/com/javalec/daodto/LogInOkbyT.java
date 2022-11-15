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
		MemberDAO memberDAO = new MemberDAO(); //인스턴스 생성
		request.setCharacterEncoding("utf-8");
		MemberDTO m = new MemberDTO();	//인스턴스 생성.
		m.setId(request.getParameter("id")); //id 가져옴
		m.setPw(request.getParameter("pw")); //pw 가져옴
		//m의 id를 이용해서 compareM에 값을 추가함.
		//m의 pw와 compareM의 pw를 매칭시킴.
		MemberDTO compareM = new MemberDAO().checkMember(m);
		
		//암 호 화 ㅇㅅㅇㅅㅇㅅㅇㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅㅇㅅ
		//PasswordEncoder 타입 p 인스턴스에 new+객체(); 넣어줌. 
		PasswordEncoder p =new BCryptPasswordEncoder(); //Encoder : 암호화하는 부분이 들어가 있는 클래스 선언.
		HttpSession hs = request.getSession();
		//matches로 두개 비교,  앞에껀 해시, 뒤에건 그대로 비교해주는거/
		if(p.matches(m.getPw(), compareM.getPw())) {
			System.out.println("성공");
			hs.setAttribute("name", compareM.getName());
			hs.setAttribute("gender", compareM.getGender());
			hs.setAttribute("id", compareM.getId());
			response.sendRedirect("loginResult.jsp");
		}else {
			System.out.println("실패");
			hs.setAttribute("id", compareM.getId()); //db에 저장된거
			hs.setAttribute("tryid", m.getId()); 	//login창에서 로그인 시도한 결과 ㅇㅅㅇ
			response.sendRedirect("loginFail.jsp");
		}
		
		
	}
}	
