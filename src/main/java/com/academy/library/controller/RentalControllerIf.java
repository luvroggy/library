package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.academy.library.dto.Rental;

public interface RentalControllerIf {

	public String list(Model model);
	
	public String moveInsert(Model model);
	
	public String insert(Rental rental, Model model);
	
	public String moveUpdate(String rentalId, Model model);
	
	public String update(Rental rental, Model model);
	
	public String select(String rentalId, Model model);
	
	public String delete(String rentalId, Model model);
	
	public String rentalUserList(HttpServletRequest req, String userId, Model model);
	
	public String twice(Rental rental, Model model);
	
	public String returnBook(Rental rental, Model model);
}
