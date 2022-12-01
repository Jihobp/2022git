package com.project.sns;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	public void join(UserDao vo) throws Exception;

	@Override
	public UserDao login(UserDao vo) throws Exception{
		return Userdao.login(vo);
	}
	
}

