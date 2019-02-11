package com.academy.library.controller;

import org.springframework.ui.Model;

import com.academy.library.dto.Holdinginst;

public interface HoldinginstControllerIf {
	
	public String list(Model model);
	
	public String moveInsert(Model model);
	
	public String insert(Holdinginst holdinginst, Model model);
	
	public String moveUpdate(int institutionId, Model model );
	
	public String update(Holdinginst holdinginst, Model model);
	
	public String select(int institutionId, Model model);
	
	public String delete(int institutionId, Model model);

}
