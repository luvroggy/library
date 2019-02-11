package com.academy.library.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Login;
import com.academy.library.mapper.LoginMapper;

@Repository(value="loginDao")
public class LoginDaoImpl implements LoginDaoIf {

	@Autowired
	private SqlSessionFactory factory;
	
	public LoginDaoImpl() {}
	
	@Override
	public Login login(Login login) {
		SqlSession session = factory.openSession();
		
		LoginMapper mapper = session.getMapper(LoginMapper.class);
		try {
			
			login = mapper.login(login);
			
		}  finally {
				session.close();
		}
		
		return login;
	}

}
