package com.project.sns;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	//회원가입 
	@Inject  //데이터입력
	SqlSession sql;
	
	@Override
	public void join(UserDto vo) throws Exception{
		sql.insert("sns_SQL.insert");
	}
	
	@Override
	public UserDto login(UserDto vo) throws Exception{
		return sql.selectOne("sns_SQL.login", vo);
	}
	
	
}
