package com.javalec.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serviceupdate implements Service {

	@Override
	public ArrayList<MemberDTO> execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//memberInsert복사해서 붙.memberUpdate출력으로 수정
		MemberDAO m = MemberDAO.getInstance();
		
		MemberDTO dto = new MemberDTO(); //파라미터로 값 가져오고 dto를 매개변수로 넣음ㅇㅅㅇ
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setPw(request.getParameter("pw"));
		dto.setId(request.getParameter("id"));
		
		m.memberUpdate(dto);
		return null;
	}

}
