package com.academy.library.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.LoginDaoIf;
import com.academy.library.dto.Login;

@Service(value="loginService")
public class LoginServiceImpl implements LoginServiceIf {

	@Resource(name="loginDao")
	private LoginDaoIf dao;
	

	public LoginServiceImpl(LoginDaoIf dao) {
		super();
	}


	@Override
	public Login login(Login login) {
		return dao.login(login);
	}

}
