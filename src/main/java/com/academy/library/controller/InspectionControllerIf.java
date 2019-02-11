package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.academy.library.dto.Inspection;

public interface InspectionControllerIf {

	public String list(Model model);

	public String moveInsert(Model model);

	public String insert(Inspection inspection, Model model);

	public String moveUpdate(String inspectionId, Model model);

	public String update(Inspection inspection, Model model);

	public String select(String inspectionId, Model model);

	public String delete(String inspectionId, Model model);

	public String moveSearch(Model model);

	public String search(String title, Model model);
	
	public String userWish(HttpServletRequest req, Model model);
}
