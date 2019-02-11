package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value="errorContorller")
@RequestMapping(value="/error")
public class ErrorControllerImpl implements ErrorControllerIf {

	@Override
	@RequestMapping(value="/404")
	public String error404(HttpServletRequest req, Model model) {
		model.addAttribute("errorCode", "404");
		model.addAttribute("errorMsg", "요청된 페이지가 존재하지 않습니다.");
		
//		model.addAttribute("content", "/WEB-INF/views/error/404.jsp");
		model.addAttribute("content", "/WEB-INF/views/error/error.jsp");
		model.addAttribute("next", req.getContextPath()+"/");
		
		return "main/index";
	}

	@Override
	@RequestMapping(value="/500")
	public String error500(HttpServletRequest req, Model model) {
		model.addAttribute("errorCode", "500");
		model.addAttribute("errorMsg", "서버 오류가 발생하였습니다.");

//		model.addAttribute("content", "/WEB-INF/views/error/500.jsp");
		model.addAttribute("content", "/WEB-INF/views/error/error.jsp");
		model.addAttribute("next", req.getContextPath()+"/");
		
		return "main/index";
	}

}
