package com.project.sns;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userdao; //객체 자동 생성 및관리
	
	
	@Override
	public void join(UserDao userdao){
		
		userdao.insertUser(userdao);
	}
}
