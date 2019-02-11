package com.academy.library.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.academy.library.dto.Login;
import com.academy.library.service.LoginServiceIf;

@Controller(value="loginController")
public class LoginControllerImpl implements LoginControllerIf{
	
	@Resource(name="loginService")
	private LoginServiceIf service;
	
	@Override
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String moveLogin(Model model) {
		model.addAttribute("content", "/WEB-INF/views/main/login.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest req, Login login, Model model) {

		String pageContext = req.getContextPath();
		
		login = service.login(login);

		if (login != null) {
			HttpSession session = req.getSession();
			session.setAttribute("userId", login.getUserId());
			session.setAttribute("grade", login.getUserGrade());
			model.addAttribute("message", "로그인 성공");
			model.addAttribute("next", req.getContextPath() + "/");
		} else {
			model.addAttribute("message", "로그인 실패하였습니다.");
			model.addAttribute("next", pageContext + "/");
			
		}
		
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		
		return "main/index";
		
	}

	@Override
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logout(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(false);
		String userId = (String) session.getAttribute("userId");
		String message;
		if(session != null) {
			session.invalidate();
			message = userId + "님, 로그아웃 되었습니다.";
			model.addAttribute("message", message);
		}
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", req.getContextPath() + "/");
		
		return "main/index";
	}

}
