package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface ErrorControllerIf {
	public String error404(HttpServletRequest req, Model model);
	
	public String error500(HttpServletRequest req, Model model);

}
