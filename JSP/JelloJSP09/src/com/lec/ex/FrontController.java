package com.lec.ex;
//*.do 로 서블릿 만들떄 url 지정 ㅇㅅㅇ !!!!!!!!!!!
import java.io.IOException;
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
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
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
		if(command.equals("insert.do")) {
			response.getWriter().println("My Insert");
		} else if (command.equals("/test.do")) {
			response.getWriter().println("T E S T");
		} else {
			response.getWriter().println("cmd : "	+	command);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
