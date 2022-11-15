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

	//1. do get���� ������ doAction �´�, 
	public void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//2.
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8"); //post ����� �� �ѱ� ���� ����.
		
		//3. jsp ���Ͽ��� name ���� name, age, number�� �±��� ���� �޾ƿ� ��.  //���� ����ȵǴ°� ����.. 
		String name =request.getParameter("name");
		String age = request.getParameter("age");
		String number = request.getParameter("number");
		
		
		//500> try ���� ���ΰ� catch �����, ����ó�����ִ��� ������� 500������ ���/.
		//
		try { //Student �ΰ��� ��� ��Ű������ ��ġ���� ������
			com.myjsp.myStudent.Student s = new com.myjsp.myStudent.Student(name,
					Integer.parseInt(age),
					Integer.parseInt(number)); //String �޾Ƽ� int��
			response.getWriter().append("<h1>"+s.toString()+"</h1>");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�߸��� ��!");
			//response.getWriter().append("�л��� �߸���");
			//������ jsp �������� �̵��ϴ°� �����ϴ�.
			response.sendRedirect("Quest_Student.jsp");
		
		}
		
	}
}
