package com.javalec.ex;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//컨트롤러가 Service select, update, insert, delete 중 하나를 선택해서 구현할거. 
/**
 * Servlet implementation class CommandController
 */
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
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI(); 		//요청 uri
		//localhost 명 + 프로젝트명
		String conPath = request.getContextPath();	//
		//슬래시 뒤에 오는 것들. insert.do 등
		String command = uri.substring(conPath.length());
		
		Service service ;	//service가 밑에 crud 중 무엇이랑 만드느냐에 따라 달름
		
		if (command.equals("/insert.do")) {
			service = new ServiceInsert();
		} else if (command.equals("/update.do")) {
			service = new Serviceupdate();
		} else if (command.equals("/delete.do")) {
			service = new ServiceDelete();
		} else {
			service = new ServiceSelect();
		}
		
		ArrayList<MemberDTO> dtos = service.execute(request, response);
		if(dtos!=null) {
			for(MemberDTO memberDTO : dtos) {
				System.out.println(memberDTO.getId());
				System.out.println(memberDTO.getPw());
				System.out.println(memberDTO.getGender());
				System.out.println(memberDTO.getName());
			}
		}
		
		
//		//request가 가지고 있는 파라미터ex name, id 등이 그대로 넘어가ㅏ서 new ServiceSelect();에 호출됨. 
//		Service service;
//		service = new ServiceSelect(); 
//		service.execute(request, response);
	
	}
}
