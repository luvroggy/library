package com.academy.library.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.academy.library.dto.Request;

public interface RequestControllerIf {

	public String list(Model model);

	public String moveSearch(Model model);
	public String moveNaver(Model model);
	public String moveWrite(Model model);
	
	public String search(String title, Model model);

	public String insert(Request request, Model model);
	
	public String writeInsert(Request request, Model model);

	public String moveUpdate(String requestId, Model model);

	public String update(Request request, Model model);

	public String select(String requestId, Model model);

	public String delete(HttpServletRequest req, String requestId, Model model);
	
	public String userWish(HttpServletRequest req, Model model);

}
