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

import com.academy.library.dto.Code;
import com.academy.library.dto.Users;
import com.academy.library.service.CodeServiceIf;
import com.academy.library.service.UsersServiceIf;

@Controller(value = "usersController")
public class UsersControllerImpl implements UsersControllerIf {

	@Resource(name = "usersService")
	private UsersServiceIf service;

	@Resource(name = "codeService")
	private CodeServiceIf codeService;

	@Override
	@RequestMapping(value = "/admin/users/list")
	public String list(Model model) {
		List<Users> users = service.getAllUsers();
		model.addAttribute("users", users);
		model.addAttribute("content", "/WEB-INF/views/users/list.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/users/insert", method = RequestMethod.GET)
	public String moveInsert(Model model) {
		String text = "POSI";
		List<Code> positionCodes = codeService.likeCode(text);
		for (Code code : positionCodes) {
			System.out.println(code.getCodeName());
		}
		model.addAttribute("positionCodes", positionCodes);
		text = "FACI";
		List<Code> facilityCodes = codeService.likeCode(text);
		for (Code code : facilityCodes) {
			System.out.println(code.getCodeName());
		}
		model.addAttribute("facilityCodes", facilityCodes);
		model.addAttribute("content", "/WEB-INF/views/main/register.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/users/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Users users, Model model) {

		int successCnt = service.insert(users);
		String message;
		if (successCnt > 0) {
			message = "회원가입이 완료되었습니다.";
		} else {
			message = "회원가입에 실패했습니다.";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/login");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/users/update", method = RequestMethod.GET)
	public String moveUpdate(HttpServletRequest req, Model model) {
		Users users = new Users();
		HttpSession session = req.getSession();
		users.setUserId((String) session.getAttribute("userId"));
		System.out.println(users.getUserId());
		users = service.get(users);
		if (users != null) {
			model.addAttribute("users", users);
			model.addAttribute("content", "/WEB-INF/views/users/update.jsp");
		} else {
			String message = "회원정보 탐색 실패";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/users/update", method = RequestMethod.POST)
	public String update(HttpServletRequest req, @ModelAttribute Users users, Model model) {
		int successCnt = service.update(users);
		HttpSession session = req.getSession(false);
		String message;
		if (successCnt > 0) {
			message = "회원정보 수정 완료";
			if (session != null) {
				session.invalidate();
			}
		} else {
			message = "회원정보 수정 실패";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/login");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/users/select")
	public String select(@RequestParam("userId") String userId, Model model) {
		List<Code> codes = codeService.getAllCode();

		Users users = new Users();
		users.setUserId(userId);

		users = service.get(users);
		if (users != null) {
			for (Code code : codes) {
				if (code.getCode().equals(users.getUserPosition())) {
					model.addAttribute("requestStatusName", code.getCodeName());
				}

				if (code.getCode().equals(users.getUserAssigned())) {
					model.addAttribute("requestTypeName", code.getCodeName());
				}
			}
			model.addAttribute("users", users);
			model.addAttribute("content", "/WEB-INF/views/users/detailList.jsp");
		} else {
			String message = "고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/WEB-INF/views/main/index.jsp");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/users/delete")
	public String delete(@RequestParam("userId") String userId, Model model) {
		Users users = new Users();
		users.setUserId(userId);
		int successCnt = service.delete(users);

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
