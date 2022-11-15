package mytest.myjava;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//2. 서블릿

/**
 * Servlet implementation class CheckInfo
 */
@WebServlet("/CheckInfo")
public class CheckInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckInfo() {
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
		doAction(request, response);	//보통 두액션에서 다 처리한다.
	}
	
	public void doAction(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//한글깨짐 방지
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		//값을 입력받기
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		
		//인스턴스 생성
		Customer c = new Customer(name, Integer.parseInt(age), id);
	
		//다양한 예외 처리들을 할것  --> parseInt 에러,
		if(c.isAdmin("admin"))
			response.sendRedirect("admin.jsp");
		else {
			RequestDispatcher dispatcher = 
					getServletContext().getRequestDispatcher("/kid.jsp");
			if(c.isAdult(20))
				dispatcher = getServletContext().getRequestDispatcher("/adult.jsp");
			request.setAttribute("result", c.toString());
			dispatcher.forward(request, response);
		}
			//response.getWriter().append(c.toString());
	}
}
