package com.myjsp.mytest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentWorld
 */
@WebServlet("/StudentWorld")
public class StudentWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentWorld() {
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

	//1. do get에서 가져온 doAction 온다, 
	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//2.
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8"); //post 방식일 때 한글 깨짐 방지.
		
		//3. jsp 파일에서 name 값이 name, age, number인 태그의 값을 받아올 것.  //아직 실행안되는게 정상.. 
		String name =request.getParameter("name");
		String age = request.getParameter("age");
		String number = request.getParameter("number");
		
		
		//500> try 안쪽 냅두고 catch 지우면, 에러처리해주느게 사라져서 500에러가 뜬다/.
		//
		try { //Student 두개라서 어느 패키지인지 위치정의 ㅇㅅㅇ
			com.myjsp.myStudent.Student s = new com.myjsp.myStudent.Student(name,
					Integer.parseInt(age),
					Integer.parseInt(number)); //String 받아서 int로
			response.getWriter().append("<h1>"+s.toString()+"</h1>");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된 값!");
			//response.getWriter().append("학생값 잘못됨");
			//지정한 jsp 페이지로 이동하는게 가능하다.
			response.sendRedirect("Quest_Student.jsp");
		
		}
		
	}
}
