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
		//�ѱ۱��� ����
				
				
		
		//RequestResponse ���� �̿��ϱ�.
		//1. �ѱ����̷� 20�� �̻��̸� pass.jsp�� �̵�. ��, �Ʊ�ó�� age�� �� �ѱ��.
		String str= request.getParameter("birth");
		try {
			int year= Integer.parseInt(str);
			Date now= new Date(); //���� �ð������� ���۸�
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy");
			//���ظ� ��Ʈ������ �ٲ� �� 2022��� ���ڿ��� ���´�.
			String NowYear = formatter.format(now);
			int age = Integer.parseInt(NowYear)-year+1;
			
			if(age>=20)
				response.sendRedirect("pass.jsp?age="+age); //+age �Ķ����
			else
				response.sendRedirect("ng.jsp?age="+age);
		} catch (Exception e) {
			request.setCharacterEncoding("UTF-8"); //post ����϶� �ѱ� ����.
			response.setContentType("text/html;charset=UTF-8");
			
			response.sendRedirect("fail.jsp?birth="+str); //str���� �Ѱܹ޴���./
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
