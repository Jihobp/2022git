package com.project.sns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface UserDao{
	//회원가입
	public void join(UserDto vo) throws Exception;

	//로그인
	public UserDto login(UserDto vo) throws Exception;

	

}


