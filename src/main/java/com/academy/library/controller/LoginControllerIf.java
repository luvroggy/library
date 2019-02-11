package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.academy.library.dto.Login;


public interface LoginControllerIf {

	/** 로그인 화면으로 이동 */
	public String moveLogin(Model model);
	
	/** 로그인 처리 */
	public String login(HttpServletRequest req
			          , Login login, Model model);
	
	/** 로그아웃 처리 */
	public String logout(HttpServletRequest req, Model model);
	
}
