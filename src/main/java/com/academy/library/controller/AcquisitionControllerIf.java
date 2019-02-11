package com.academy.library.controller;



import org.springframework.ui.Model;

import com.academy.library.dto.Acquisition;
import com.academy.library.dto.Request;

public interface AcquisitionControllerIf {

	public String list(Model model);

	public String moveInsert(Request request, Model model);

	public String insert(Acquisition acquisition, Model model);

	public String moveUpdate(String acquisitionId, Model model);

	public String update(Acquisition acquisition, Model model);

	public String select(String acquisitionId, Model model);

	public String delete(String acquisitionId, Model mod);


}