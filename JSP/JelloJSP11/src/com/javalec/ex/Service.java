package com.javalec.ex;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service { //Service�� �����ϴ� Ŭ������ �����Ұǵ�, .do���� ������?
	public ArrayList<MemberDTO> execute
	(HttpServletRequest request, HttpServletResponse response);
}
