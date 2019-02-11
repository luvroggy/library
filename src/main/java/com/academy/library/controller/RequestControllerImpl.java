package com.academy.library.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

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
import com.academy.library.dto.Request;
import com.academy.library.service.CodeServiceIf;
import com.academy.library.service.RequestServiceIf;
import com.academy.library.service.StackbooksServiceIf;
import com.academy.library.service.UsersServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller(value = "requestController")
public class RequestControllerImpl implements RequestControllerIf {

	private static final String clientId = "Qfk0jYAumhKz_zbmJejb";
	private static final String clientSecret = "pPl3op_lnM";
	
	@Resource(name = "stackbooksService")
	private StackbooksServiceIf bookService;

	@Resource(name = "requestService")
	private RequestServiceIf service;

	@Resource(name = "codeService")
	private CodeServiceIf codeService;

	@Resource(name = "usersService")
	private UsersServiceImpl usersService;
	
	@Override
	@RequestMapping(value = "admin/request/list")
	public String list(Model model) {
		// List<Users> users = usersService.getAllUsers();
		List<Request> requests = service.getJoinRequest();
//		List<Integer> bookCnts = new ArrayList<>();
		
		for(Request request : requests) {
			int stackbooks = 0;
			stackbooks = bookService.stackbooksSearchIsbn("%"+request.getIsbn()+"%");
			request.setCopy(stackbooks);
//			bookCnts.add(stackbooks);
		}
		
//		model.addAttribute("bookCounts", bookCnts);
		
		// HttpSession session = req.getSession();
		//
		// System.out.println(session.getAttribute("userId"));
		//
		// for (Users user : users) {
		// System.out.println(user.getUserId());
		// if(user.getUserId().equals(session.getAttribute("userId"))){
		model.addAttribute("requests", requests);
		// }
		// }
		model.addAttribute("content", "/WEB-INF/views/request/adminlist.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/auto/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Request request, Model model) {
		
		int successCnt = service.insert(request);
		
		String message;
		if (successCnt > 0) {
			message = "요청이 완료되었습니다.";
		} else {
			message = "요청에 실패하였습니다.";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/request/list");
		return "main/index";
	}
	@Override
	@RequestMapping(value = "/write/insert", method = RequestMethod.POST)
	public String writeInsert(@ModelAttribute Request request, Model model) {
		int successCnt = service.insert(request);
		String message;
		if (successCnt > 0) {
			message = "요청이 완료되었습니다.";
		} else {
			message = "요청에 실패하였습니다.";
		}
		
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/request/update", method = RequestMethod.GET)
	public String moveUpdate(@RequestParam("requestId") String requestId, Model model) {

		Request request = new Request();
		request.setRequestId(requestId);
		request = service.get(request);
		if (request != null) {
			model.addAttribute("request", request);
			model.addAttribute("content", "/WEB-INF/views/request/update.jsp");
		} else {
			String message = "잘못된 요청입니다.";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/request/update", method = RequestMethod.POST)
	public String update(@ModelAttribute Request request, Model model) {
		int successCnt = service.update(request);

		String message;
		if (successCnt > 0) {
			message = "요청정보 수정에 성공했습니다.";
		} else {
			message = "요청정보 수정에 실패했습니다.";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/request/list");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/request/select")
	public String select(@RequestParam("requestId") String requestId, Model model) {
		List<Code> codes = codeService.getAllCode();

		Request request = new Request();
		request.setRequestId(requestId);

		request = service.get(request);
		if (request != null) {
			for (Code code : codes) {
				if (code.getCode().equals(request.getRequestStatus())) {
					model.addAttribute("requestStatusName", code.getCodeName());
				}
			}
			model.addAttribute("request", request);
			model.addAttribute("content", "/WEB-INF/views/request/detailList.jsp");
		} else {
			String message = "요청실패";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/request/delete")
	public String delete(HttpServletRequest req, @RequestParam("requestId") String requestId, Model model) {
		HttpSession session = req.getSession();
		
		Request request = new Request();
		int successCnt = 0;
		request.setRequestId(requestId);
		successCnt = service.delete(request);
		String message;
		if (successCnt > 0) {
			message = "요청정보가 삭제되었습니다.";
		} else {
			message = "잘못된 접근입니다.";
		}
		if(session.getAttribute("grade").equals("admin")) {
			
			model.addAttribute("next", "/admin/request/list");
		} else if (session.getAttribute("grade").equals("normal")) {
			
			model.addAttribute("next", "/request/list");
		}
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("message", message);
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/request/search", method = RequestMethod.GET)
	public String moveSearch(Model model) {
		model.addAttribute("content", "/WEB-INF/views/request/search.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/request/searchResult", method = RequestMethod.GET)
	public String search(String title, Model model) {

		try {
			String text = URLEncoder.encode(title, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_titl=" + text;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

			// System.out.println("response Data=" + response);

			ObjectMapper mapper = new ObjectMapper();

			Map<String, Object> searchResultMap = mapper.readValue(response.toString(), Map.class);
			Integer total = (Integer) searchResultMap.get("total");
			List<Map<String, String>> bookItems = (List) searchResultMap.get("items");

			// if(bookItems.size() > 0) {
			if (total > 0) {
				model.addAttribute("bookItems", bookItems);
				model.addAttribute("content", "/WEB-INF/views/request/insert.jsp");

			} else {
				// System.out.println("here??");
				String message = "검색 결과가 존재하지 않습니다.";
				model.addAttribute("message", message);
				model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
				model.addAttribute("next", "/request/search");
			}

		} catch (UnsupportedEncodingException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/request/list")
	public String userWish(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		List<Request> requests = service.getUser((String) session.getAttribute("userId"));
		List<Code> codes = codeService.getAllCode();
		model.addAttribute("requests", requests);
		for (Request request : requests) {
			for (Code code : codes) {
				if (code.getCode().equals(request.getRequestStatus())) {
					model.addAttribute("requestStatusName", code.getCodeName());
				}
			}
		}
		model.addAttribute("content", "/WEB-INF/views/request/list.jsp");

		return "main/index";
	}

	@Override
	@RequestMapping(value="/search/naver")
	public String moveNaver(Model model) {
		model.addAttribute("content", "/WEB-INF/views/request/naverSearch.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/write")
	public String moveWrite(Model model) {
		model.addAttribute("content", "/WEB-INF/views/request/writeReq.jsp");
		return "main/index";
	}

}
