package com.javalec.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serviceupdate implements Service {

	@Override
	public ArrayList<MemberDTO> execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//memberInsert�����ؼ� ��.memberUpdate������� ����
		MemberDAO m = MemberDAO.getInstance();
		
		MemberDTO dto = new MemberDTO(); //�Ķ���ͷ� �� �������� dto�� �Ű������� ����������
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setPw(request.getParameter("pw"));
		dto.setId(request.getParameter("id"));
		
		m.memberUpdate(dto);
		return null;
	}

}
