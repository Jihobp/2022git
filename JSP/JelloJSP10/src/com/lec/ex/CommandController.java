package com.lec.ex;
//*.do 로 서블릿 만들떄 url 지정 ㅇㅅㅇ !!!!!!!!!!!
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
//끄,ㅌ에 do 만있으면 다 이리로 온당~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//dao를 만들어서 FrontController 안에서  crud 다 할 수 있게 가능합니당...............................................
//서블릿 3개가 했던거-join,modify,login 등을 하나로 하게 하면, 너무 비대한다. 요청1,2,3>서블릿>dao 하면.. 너무 커지니까 분할하겠다. 
//ㄴ>FrontController ABC 인터페이스를 구현할건데 ABC.test() ,  그게 인터페이스의 어느어느 파티인지에 따라 달라짐.
//frontcontroller 복붙
//frontcontroller로 crud를 하게 대면.......... 엄청 커진당. 그럼 외주를 ㅈ주기 시작하는뎅, 

@WebServlet("*.do")
public class CommandController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommandController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uri = request.getRequestURI(); 		//요청 uri
		//localhost 명 + 프로젝트명
		String conPath = request.getContextPath();	//
		//슬래시 뒤에 오는 것들. insert.do 등
		String command = uri.substring(conPath.length());
		//substring : 자르는것. 즉 conPath 만큼 자름.
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(command);
		
		
		// ㄷ ㅏ 형 ㅅ ㅓㅇ 
		//왼쪽은 인터페이스 오른쪽은 그 인터페이스를 구현함. 구체화.
		Random r = new Random();
		
		//아무리 dao랑 dto로 분산시켜도 커질수 밖엥 없는데, 
		//요청을 한군데로 모아서 그걸 분산시키는 거임. 
		ExecutePrintable ex;
		if(command.equals("insert.do")) {
			ex = new InsertPrint();
			response.getWriter().println("My Insert");
		} else if(command.equals("/test.do")) {
			ex = new TestPrint(); //textPrint라는 클래스로 인스턴스 만듐댜.
		} else {
			ex = new ExecutePrintable() {
				
				@Override
				public void execute() {
					// TODO Auto-generated method stub
					System.out.println(command);
				}
			};
		}
		ex.execute(); //ExecutePrintable() 에 있는 execute. 가능을 몰라서 if 문 보면, ExecutePrintable 변수 선언 되어있구, 
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
