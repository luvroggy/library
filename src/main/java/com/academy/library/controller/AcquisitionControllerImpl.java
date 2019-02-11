package com.academy.library.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.library.dto.Acquisition;
import com.academy.library.dto.Request;
import com.academy.library.service.AcquisitionServiceIf;
import com.academy.library.service.RequestServiceIf;

@Controller(value="acquisitionController")
public class AcquisitionControllerImpl implements AcquisitionControllerIf {

	@Resource(name="acquisitionService")
	private AcquisitionServiceIf service;
	
	@Resource(name="requestService")
	private RequestServiceIf rqService;
	
	@Override	
	@RequestMapping(value="/admin/acquisition/list")
	public String list(Model model) {
		
		List<Acquisition> acquisitions = service.getJoinAcquisition();
		
		model.addAttribute("acquisitions", acquisitions);
		model.addAttribute("content", "/WEB-INF/views/acquisition/list.jsp");
		
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/acquisition/insert", method=RequestMethod.GET)
	public String moveInsert(@ModelAttribute Request request, Model model) {
		
		request = rqService.get(request);
		
		model.addAttribute("request", request);
		model.addAttribute("content", "/WEB-INF/views/acquisition/insert.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/acquisition/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute Acquisition acquisition, Model model) {

		int successCnt = 0;
		successCnt = service.insert(acquisition);
		
		String message;
		if (successCnt > 0) { // 성공
			message = "등록에 성공하였습니다.";
		} else { // 실패
			message = "등록에 실패하였습니다.";
		}
		
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/acquisition/list");
			
		return "main/index";
	}

	@Override
	@RequestMapping(value= "/admin/acquisition/update", method = RequestMethod.GET)
	public String moveUpdate(@RequestParam("acquisitionId") String acquisitionId, Model model) {

		Acquisition acquisition = new Acquisition();
		acquisition.setAcquisitionId(acquisitionId);

		acquisition = service.get(acquisition);

		if (acquisition != null) {
			model.addAttribute("acquisition", acquisition);
			model.addAttribute("content", "/WEB-INF/views/acquisition/update.jsp");
		} else {
			String message = "잘못된 접근입니다.";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/");
		}
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/acquisition/update", method = RequestMethod.POST)
	public String update(@ModelAttribute Acquisition acquisition, Model model) {

		int successCnt = service.update(acquisition);

		String message;
		if (successCnt > 0) { // 성공
			message = "수서정보가 수정되었습니다.";
		} else { // 실패
			message = "잘못된 접근입니다.";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/acquisition/list");

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/acquisition/select")
	public String select(@RequestParam("acquisitionId") String acquisitionId, Model model) {
		Acquisition acquisition = new Acquisition();
		acquisition.setAcquisitionId(acquisitionId);

		acquisition = service.get(acquisition);

		if (acquisition != null) {
			model.addAttribute("acquisition", acquisition);
			model.addAttribute("content", "/WEB-INF/views/acquisition/detailList.jsp");
		} else {
			String message = "유사고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/acquisition/delete")
	public String delete(@RequestParam("acquisitionId") String acquisitionId, Model model) {

		Acquisition acquisition = new Acquisition();
		acquisition.setAcquisitionId(acquisitionId);

		int successCnt = service.delete(acquisition);

		String message;
		if (successCnt > 0) { // 성공
			message = "삭제되었습니다.";
		} else { // 실패
			message = "실패하였습니다.";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/acquisition/list");

		return "main/index";
	}

}
