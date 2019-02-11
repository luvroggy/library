package com.academy.library.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.library.dto.Rental;
import com.academy.library.dto.Stackbooks;
import com.academy.library.service.RentalServiceIf;
import com.academy.library.service.StackbooksServiceIf;

@Controller(value="rentalController")
public class RentalControllerImpl implements RentalControllerIf {

	@Resource(name="rentalService")
	private RentalServiceIf service;

	@Resource(name="stackbooksService")
	private StackbooksServiceIf stackService;
	
	@Override
	@RequestMapping(value="/admin/rental/list")
	public String list(Model model) {
		Stackbooks stackbook = new Stackbooks();
		List<Rental> rentals = service.getAllRental();
		for(Rental rental : rentals) {
			stackbook.setBookId(rental.getBookId());
			stackbook = stackService.get(stackbook);
			rental.setTitle(stackbook.getTitle());
		}
		model.addAttribute("rentals", rentals);
		model.addAttribute("content", "/WEB-INF/views/rental/adminList.jsp");
		
		return "main/index";
	}
	@Override
	@RequestMapping(value="/rental/insert", method=RequestMethod.GET)
	public String moveInsert(Model model) {
		model.addAttribute("content", "/WEB-INF/views/rental/insert.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/rental/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute Rental rental, Model model) {
		
		int successCnt = service.insert(rental);
		
		String message;
		if (successCnt > 0) { // 성공
			message = "책을 대여하셨습니다.";
		} else { // 실패
			message = "책 대여에 실패했습니다.";
		}
		
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/stackbooks/list");
		
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/rental/update", method=RequestMethod.GET)
	public String moveUpdate(@RequestParam("rentalId") String rentalId, Model model) {
		
		Rental rental = new Rental();
		rental.setRentalId(rentalId);
		
		rental = service.get(rental);
		
		if (rental != null) {
			model.addAttribute("rental", rental);
			model.addAttribute("content", "/");
		} else {
			String message = "/";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/");
		}
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/rental/update", method=RequestMethod.POST)
	public String update(@ModelAttribute Rental rental, Model model) {

		int successCnt = service.update(rental);
		
		String message;
		if (successCnt > 0) { // 성공
			message = "업데이트에 성공하셨습니다.";
		} else { // 실패
			message = "업데이트에 실패하셨습니다.";
		}
		
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/rental/select")
	public String select(@RequestParam("rentalId") String rentalId, Model model) {
	
		
		Rental rental = new Rental();
		rental.setRentalId(rentalId);
		
		rental = service.get(rental);
		
		if (rental != null) {
			model.addAttribute("rental", rental);
			model.addAttribute("content",  "/WEB-INF/views/rental/detailList.jsp");
		} else {
			String message = "요청실패";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/WEB-INF/views/main/index.jsp");
		}
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/rental/delete")
	public String delete(@RequestParam("rentalId") String rentalId, Model model) {

		Rental rental = new Rental();
		rental.setRentalId(rentalId);
		
		int successCnt = service.delete(rental);
		
		String message;
		if (successCnt > 0) { // 성공
			message = "성공";
		} else { // 실패
			message = "실패";
		}
		
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/");
		
		return "main/index";
	}
	@Override
	@RequestMapping(value="/rental/list")
	public String rentalUserList(HttpServletRequest req, String userId, Model model) {
		HttpSession session = req.getSession();
		userId = (String)session.getAttribute("userId");
		Stackbooks stackbook = new Stackbooks();
		List<Rental> rentals = service.getRentalByUser(userId);
		for(Rental rental : rentals) {
			stackbook.setBookId(rental.getBookId());
			stackbook = stackService.get(stackbook);
			rental.setTitle(stackbook.getTitle());
		}
		model.addAttribute("rentals", rentals);
		model.addAttribute("content", "/WEB-INF/views/rental/list.jsp");
		
		return "main/index";
	}
	@Override
	@RequestMapping(value="/rental/twice")
	public String twice(Rental rental, Model model) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	@RequestMapping(value="/rental/return", method=RequestMethod.POST)
	public String returnBook(@ModelAttribute Rental rental, Model model) {
		int successCnt = service.reatalReturn(rental);
		String message;
		if (successCnt > 0) { // 성공
			message = "반납에 성공했습니다.";
		} else { // 실패
			message = "반납에 실패했습니다.";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/stackbooks/list");
		return "main/index";
		
	}

}
