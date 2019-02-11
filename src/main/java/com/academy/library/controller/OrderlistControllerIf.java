package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.academy.library.dto.Orderlist;

public interface OrderlistControllerIf {
	
	public String list(Model model);
	
	public String moveInsert(Model model);
	
	public String insert(Orderlist orderlist, Model model);
	
	public String moveUpdate(String orderId, Model model);
	
	public String update(Orderlist orderlist, Model model);
	
	public String select(String orderId, Model model);
	
	public String delete(String orderId, Model model);
	
	public String moveSearch(Model model);
	
	public String search(String title, Model model);
	
	public String userWish(HttpServletRequest req, Model model);
}
