package com.javalec.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceSelect implements Service {

	@Override
	public ArrayList<MemberDTO> execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//MemberDTO에 있는걸 읽어오는게 전부. 
		MemberDAO m = MemberDAO.getInstance();
		return m.memberSelect();
	}

}
