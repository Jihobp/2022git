package com.javalec.ex;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service { //Service를 구현하는 클래스를 구현할건데, .do에서 가져옴?
	public ArrayList<MemberDTO> execute
	(HttpServletRequest request, HttpServletResponse response);
}
