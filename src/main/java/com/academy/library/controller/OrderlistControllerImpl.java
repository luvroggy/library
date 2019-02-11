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

import com.academy.library.dto.Orderlist;
import com.academy.library.service.OrderlistServiceIf;
import com.fasterxml.jackson.databind.ObjectMapper;



@Controller(value = "orderlistController")
public class OrderlistControllerImpl implements OrderlistControllerIf {
	
	private static final String clientId = "Qfk0jYAumhKz_zbmJejb";
	private static final String clientSecret = "pPl3op_lnM";
	
	@Resource(name = "orderlistService")
	private OrderlistServiceIf service;
	
	@Override
	@RequestMapping(value = "/admin/orderlist/list")
	public String list(Model model) {
		
		List<Orderlist> orderlists = service.getJoin();
		model.addAttribute("orderlists", orderlists);
		model.addAttribute("content", "/WEB-INF/views/orderlist/list.jsp");
		return "main/index";
	}
	
	@Override
	@RequestMapping(value = "/admin/orderlist/insert", method = RequestMethod.GET)
	public String moveInsert(Model model) {
		model.addAttribute("content", "/WEB-INF/views/orderlist/insert.jsp");
		return "main/index";
	}


	@Override
	@RequestMapping(value = "/admin/orderlist/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Orderlist orderlist, Model model) {
		int successCnt = service.insert(orderlist);
		String message;
		if (successCnt > 0) {
			message = "등록에 성공하였습니다.";
		} else {
			message = "등록에 실패하였습니다.";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/orderlist/list");
		return "main/index";
	}

	@Override
	public String moveUpdate(@RequestParam("orderId") String orderId, Model model) {
		Orderlist orderlist = new Orderlist();
		orderlist.setOrderId(orderId);
		orderlist = service.get(orderlist);
		if (orderlist != null) {
			model.addAttribute("orderlist", orderlist);
			model.addAttribute("content", "/WEB-INF/views/orderlist/update.jsp");
		} else {
			String message = "고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}
		
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/orderlist/update", method = RequestMethod.POST)
	public String update(Orderlist orderlist, Model model) {
		int successCnt = service.update(orderlist);

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
	@RequestMapping(value = "/admin/orderlist/select")
	public String select(@RequestParam("orderId") String orderId, Model model) {
		
		
		Orderlist orderlist = new Orderlist();
		orderlist.setOrderId(orderId);

		orderlist = service.get(orderlist);
		if (orderlist != null) {
			
			model.addAttribute("orderlist", orderlist);
			model.addAttribute("content", "/WEB-INF/views/orderlist/detailList.jsp");
		} else {
			String message = "고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}
		
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/orderlist/delete")
	public String delete(@RequestParam("orderId") String orderId, Model model) {
		Orderlist orderlist = new Orderlist();
		orderlist.setOrderId(orderId);
		int successCnt = service.delete(orderlist);

		String message;
		if (successCnt > 0) {
			message = "삭제되었습니다";
		} else {
			message = "실패하였습니다";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/orderlist/list");
		return "main/index";
	}
	
	@Override
	@RequestMapping(value = "/orderlist/search", method = RequestMethod.GET)
	public String moveSearch(Model model) {
		model.addAttribute("content", "/WEB-INF/views/orderlist/search.jsp");
		return "main/index";
	}
	
	@Override
	@RequestMapping(value = "/orderlist/searchResult", method = RequestMethod.GET)
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
				model.addAttribute("content", "/WEB-INF/views/orderlist/insert.jsp");

			} else {
				// System.out.println("here??");
				String message = "검색 결과가 존재하지 않습니다.";
				model.addAttribute("message", message);
				model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
				model.addAttribute("next", "/orderlist/search");
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
	@RequestMapping(value = "/orderlist/list")
	public String userWish(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		List<Orderlist> orderlists = service.getUser((String) session.getAttribute("userId"));
		
		model.addAttribute("orderlist", orderlists);
		
		model.addAttribute("content", "/WEB-INF/views/orderlist/list.jsp");

		return "main/index";
	}

}
