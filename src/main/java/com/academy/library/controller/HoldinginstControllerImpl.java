package com.academy.library.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.library.dto.Holdinginst;
import com.academy.library.service.HoldinginstServiceIf;



@Controller(value = "holdinginstController")
public class HoldinginstControllerImpl implements HoldinginstControllerIf {

	@Resource(name = "holdinginstService")
	private HoldinginstServiceIf service;

	@Override
	@RequestMapping(value = "/holdinginst/list")
	public String list(Model model) {
		List<Holdinginst> holdinginsts = service.getAllHoldinginst();
		model.addAttribute("holdinginsts", holdinginsts);
		model.addAttribute("content", "/WEB-INF/views/holdinginst/list.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/holdinginst/insert", method = RequestMethod.GET)
	public String moveInsert(Model model) {
		model.addAttribute("content", "/WEB-INF/views/holdinginst/insert.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/holdinginst/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Holdinginst holdinginst, Model model) {
		int successCnt = service.insert(holdinginst);
		String message;
		if (successCnt > 0) {
			message = "고기";
		} else {
			message = "고기";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "고기");
		return "main/index";
	}

	@Override
	public String moveUpdate(@RequestParam("institutionId") int institutionId, Model model) {
		Holdinginst holdinginst = new Holdinginst();
		holdinginst.setInstitutionId(institutionId);
		holdinginst = service.get(holdinginst);
		if (holdinginst != null) {
			model.addAttribute("holdinginst", holdinginst);
			model.addAttribute("content", "/WEB-INF/views/holdinginst/update.jsp");
		} else {
			String message = "고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/holdinginst/update", method = RequestMethod.POST)
	public String update(Holdinginst holdinginst, Model model) {
		int successCnt = service.update(holdinginst);

		String message;
		if (successCnt > 0) {
			message = "고기";
		} else {
			message = "고기";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "고기");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/holdinginst/select")
	public String select(@RequestParam("institutionId") int institutionId, Model model) {
		Holdinginst holdinginst = new Holdinginst();
		holdinginst.setInstitutionId(institutionId);

		holdinginst = service.get(holdinginst);
		if (holdinginst != null) {
			model.addAttribute("holdinginst", holdinginst);
			model.addAttribute("content", "/WEB-INF/views/holdinginst/select.jsp");
		} else {
			String message = "고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/holdinginst/delete")
	public String delete(@RequestParam("institutionId") int institutionId, Model model) {
		Holdinginst holdinginst = new Holdinginst();
		holdinginst.setInstitutionId(institutionId);
		int successCnt = service.delete(holdinginst);

		String message;
		if (successCnt > 0) {
			message = "고기";
		} else {
			message = "고기";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "고기");

		return "main/index";
	}

}
