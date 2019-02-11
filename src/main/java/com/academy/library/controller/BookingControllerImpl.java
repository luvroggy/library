package com.academy.library.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.library.dto.Booking;
import com.academy.library.dto.Code;
import com.academy.library.service.BookingServiceIf;
import com.academy.library.service.CodeServiceIf;

@Controller(value = "bookingController")
public class BookingControllerImpl implements BookingControllerIf {

	@Resource(name = "bookingService")
	private BookingServiceIf service;

	@Resource(name = "codeService")
	private CodeServiceIf codeService;

	@Override
	@RequestMapping(value = "/booking/list")
	public String list(Model model) {
		List<Booking> bookings = service.getAllBooking();
		List<Code> codes = codeService.getAllCode();
		for (Booking booking : bookings) {

			for (Code code : codes) {
				if (code.getCode().equals(booking.getBookingStatus())) {
					model.addAttribute("code", code.getCodeName());
					model.addAttribute("booking", bookings);
				}
			}
		}
		model.addAttribute("content", "/WEB-INF/views/booking/list.jsp");

		return "main/index";
	}

	@Override
	public String moveInsert(Model model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "/booking/insert", method = RequestMethod.GET)
	public String insert(@ModelAttribute Booking booking, Model model) {

		int successCnt = service.insert(booking);

		String message;
		if (successCnt > 0) { // 성공
			message = "고기";
		} else { // 실패
			message = "유사고기";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "고기");

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/booking/update", method = RequestMethod.GET)
	public String moveUpdate(@RequestParam("bookingId") String bookingId, Model model) {
		Booking booking = new Booking();
		booking.setBookingId(bookingId);

		booking = service.get(booking);

		if (booking != null) {
			model.addAttribute("booking", booking);
			model.addAttribute("content", "숯불고기");
		} else {
			String message = "유사고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/booking/update", method = RequestMethod.POST)
	public String update(@ModelAttribute Booking booking, Model model) {
		int successCnt = service.update(booking);

		String message;
		if (successCnt > 0) { // 성공
			message = "고기";
		} else { // 실패
			message = "유사고기";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "고기");

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/booking/select")
	public String select(@RequestParam("bookingId") String bookingId, Model model) {
		List<Code> codes = codeService.getAllCode();
		Booking booking = new Booking();
		booking.setBookingId(bookingId);

		booking = service.get(booking);

		if (booking != null) {
			for (Code code : codes) {
				if (code.getCode().equals(booking.getBookingStatus())) {
					model.addAttribute("bookingStatusName", code.getCodeName());
				}
			}
			model.addAttribute("booking", booking);
			model.addAttribute("content", "/WEB-INF/views/booking/detailList.jsp");
		} else {
			String message = "요청실패";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/WEB-INF/views/main/index.jsp");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/booking/delete")
	public String delete(@RequestParam("bookingId") String bookingId, Model model) {
		Booking booking = new Booking();
		booking.setBookingId(bookingId);

		int successCnt = service.delete(booking);

		String message;
		if (successCnt > 0) { // 성공
			message = "예약이 취소되었습니다.";
		} else { // 실패
			message = "예약취소에 실패하였습니다";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/");

		return "main/index";
	}

}
