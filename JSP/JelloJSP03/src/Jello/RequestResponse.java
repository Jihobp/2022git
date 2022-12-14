package Jello;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestResponse
 */
@WebServlet("/RequestResponse")
public class RequestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestResponse() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//한글깨짐 방지
				
				
		
		//RequestResponse 서블릿 이용하기.
		//1. 한국나이로 20살 이상이면 pass.jsp로 이동. 단, 아까처럼 age에 값 넘기기.
		String str= request.getParameter("birth");
		try {
			int year= Integer.parseInt(str);
			Date now= new Date(); //지금 시간가져옴 구글링
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy");
			//올해를 스트링으로 바꾼 것 2022라는 문자열이 나온다.
			String NowYear = formatter.format(now);
			int age = Integer.parseInt(NowYear)-year+1;
			
			if(age>=20)
				response.sendRedirect("pass.jsp?age="+age); //+age 파라미터
			else
				response.sendRedirect("ng.jsp?age="+age);
		} catch (Exception e) {
			request.setCharacterEncoding("UTF-8"); //post 방식일때 한글 꺠짐.
			response.setContentType("text/html;charset=UTF-8");
			
			response.sendRedirect("fail.jsp?birth="+str); //str값을 넘겨받느다./
		}
			
					
//		int age;
//		String str= request.getParameter("age");
//		
//		try{
//			age = Integer.parseInt(str);
//			if(age>=20)
//				response.sendRedirect("pass.jsp?age="+age);
//			else
//				response.sendRedirect("ng.jsp?age="+age);
//		}
//		catch(Exception e){
//			response.sendRedirect("fail.jsp");
//		}
//			
		
				
	}

}
