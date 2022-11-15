package com.javalec.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceInsert implements Service {

	@Override //alt shift s => overriding method. 
	public ArrayList<MemberDTO> execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberDAO m = MemberDAO.getInstance();
		
		MemberDTO dto = new MemberDTO();//�Ķ���ͷ� �� �������� dto�� �Űܺ����� ����.
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setPw(request.getParameter("pw"));
		dto.setId(request.getParameter("id"));
		
		m.memberInsert(dto);
		return null;
	}
}
