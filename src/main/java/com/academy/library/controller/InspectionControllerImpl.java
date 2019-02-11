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


import com.academy.library.dto.Inspection;
import com.academy.library.service.InspectionServiceIf;
import com.fasterxml.jackson.databind.ObjectMapper;



@Controller(value = "inspectionController")
public class InspectionControllerImpl implements InspectionControllerIf {
	
	private static final String clientId = "Qfk0jYAumhKz_zbmJejb";
	private static final String clientSecret = "pPl3op_lnM";
	
	@Resource(name = "inspectionService")
	private InspectionServiceIf service;

	@Override
	@RequestMapping(value = "/admin/inspection/list")
	public String list(Model model) {
		List<Inspection> inspections = service.getJoin();
		model.addAttribute("inspections", inspections);
		model.addAttribute("content", "/WEB-INF/views/inspection/list.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/inspection/insert", method = RequestMethod.GET)
	public String moveInsert(Model model) {
		model.addAttribute("content", "/WEB-INF/views/inspection/insert.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/inspection/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Inspection inspection, Model model) {
		int successCnt = service.insert(inspection);
		String message;
		if (successCnt > 0) {
			message = "등록에 성공하였습니다";
		} else {
			message = "등록에 실패하였습니다";
		}

		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/inspection/list");
		return "main/index";
	}

	@Override
	@RequestMapping(value="/admin/inspection/update", method=RequestMethod.GET)
	public String moveUpdate(@RequestParam("inspectionId") String inspectionId, Model model) {
		Inspection inspection = new Inspection();
		inspection.setInspectionId(inspectionId);
		inspection = service.get(inspection);
		if (inspection != null) {
			model.addAttribute("inspection", inspection);
			model.addAttribute("content", "고기");
		} else {
			String message = "실패";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/inspection/update", method = RequestMethod.POST)
	public String update(Inspection inspection, Model model) {
		int successCnt = service.update(inspection);

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
	@RequestMapping(value = "/admin/inspection/select")
	public String select(@RequestParam("inspectionId") String inspectionId, Model model) {

		Inspection inspection = new Inspection();
		inspection.setInspectionId(inspectionId);

		inspection = service.get(inspection);
		if (inspection != null) {
		
			model.addAttribute("inspection", inspection);
			model.addAttribute("content", "/WEB-INF/views/inspection/detailList.jsp");
		} else {
			String message = "고기";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "고기");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/inspection/delete")
	public String delete(@RequestParam("inspectionId") String inspectionId, Model model) {
		Inspection inspection = new Inspection();
		inspection.setInspectionId(inspectionId);
		int successCnt = service.delete(inspection);

		String message;
		if (successCnt > 0) {
			message = "삭제되었습니다";
		} else {
			message = "실패하였습니다.";
		}
		model.addAttribute("message", message);
		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		model.addAttribute("next", "/admin/inspection/list");
		return "main/index";
	}
	
	@Override
	@RequestMapping(value = "/inspection/search", method = RequestMethod.GET)
	public String moveSearch(Model model) {
		model.addAttribute("content", "/WEB-INF/views/inspection/search.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/inspection/searchResult", method = RequestMethod.GET)
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
				model.addAttribute("content", "/WEB-INF/views/inspection/insert.jsp");

			} else {
				// System.out.println("here??");
				String message = "검색 결과가 존재하지 않습니다.";
				model.addAttribute("message", message);
				model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
				model.addAttribute("next", "/inspection/search");
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
	@RequestMapping(value = "/inspection/list")
	public String userWish(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		List<Inspection> inspections = service.getUser((String) session.getAttribute("userId"));
	
		model.addAttribute("inspections", inspections);
		model.addAttribute("content", "/WEB-INF/views/inspection/list.jsp");

		return "main/index";
	}
}
