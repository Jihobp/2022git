package com.lec.ex;
//*.do �� ���� ���鋚 url ���� ������ !!!!!!!!!!!
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
//��,���� do �������� �� �̸��� �´�~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//dao�� ���� FrontController �ȿ���  crud �� �� �� �ְ� �����մϴ�...............................................
//���� 3���� �ߴ���-join,modify,login ���� �ϳ��� �ϰ� �ϸ�, �ʹ� ����Ѵ�. ��û1,2,3>����>dao �ϸ�.. �ʹ� Ŀ���ϱ� �����ϰڴ�. 
//��>FrontController ABC �������̽��� �����Ұǵ� ABC.test() ,  �װ� �������̽��� ������ ��Ƽ������ ���� �޶���.
//frontcontroller ����
//frontcontroller�� crud�� �ϰ� ���.......... ��û Ŀ����. �׷� ���ָ� ���ֱ� �����ϴµ�, 

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
		String uri = request.getRequestURI(); 		//��û uri
		//localhost �� + ������Ʈ��
		String conPath = request.getContextPath();	//
		//������ �ڿ� ���� �͵�. insert.do ��
		String command = uri.substring(conPath.length());
		//substring : �ڸ��°�. �� conPath ��ŭ �ڸ�.
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(command);
		
		
		// �� �� �� �� �ä� 
		//������ �������̽� �������� �� �������̽��� ������. ��üȭ.
		Random r = new Random();
		
		//�ƹ��� dao�� dto�� �л���ѵ� Ŀ���� �ۿ� ���µ�, 
		//��û�� �ѱ����� ��Ƽ� �װ� �л��Ű�� ����. 
		ExecutePrintable ex;
		if(command.equals("insert.do")) {
			ex = new InsertPrint();
			response.getWriter().println("My Insert");
		} else if(command.equals("/test.do")) {
			ex = new TestPrint(); //textPrint��� Ŭ������ �ν��Ͻ� �����.
		} else {
			ex = new ExecutePrintable() {
				
				@Override
				public void execute() {
					// TODO Auto-generated method stub
					System.out.println(command);
				}
			};
		}
		ex.execute(); //ExecutePrintable() �� �ִ� execute. ������ ���� if �� ����, ExecutePrintable ���� ���� �Ǿ��ֱ�, 
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
