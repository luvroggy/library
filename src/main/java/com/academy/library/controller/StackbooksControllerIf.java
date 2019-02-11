package com.academy.library.controller;

import org.springframework.ui.Model;

import com.academy.library.dto.Inspection;
import com.academy.library.dto.Stackbooks;

public interface StackbooksControllerIf {

	public String list(Model model);
	
	public String moveInsert(Model model);
	
	public String searchBooksTitle(String title, Model model);
	
	public String searchBooksIsbn(String isbn, Model model);
	
	public String insert(Inspection inspection, Stackbooks stackbooks, String isbn, Model model);
	
	public String moveUpdate(int bookId, Model model);
	
	public String update(Stackbooks stackbooks, Model model);
	
	public String select(int bookId, Model model);
	
	public String delete(int bookId, Model model);
}
