package com.academy.library.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.library.dto.Code;
import com.academy.library.dto.Holdinginst;
import com.academy.library.dto.Inspection;
import com.academy.library.dto.Stackbooks;
import com.academy.library.service.CodeServiceImpl;
import com.academy.library.service.HoldinginstServiceImpl;
import com.academy.library.service.StackbooksServiceIf;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller(value = "stackbooksController")
public class StackbooksControllerImpl implements StackbooksControllerIf {

	static final String clientId = "Qfk0jYAumhKz_zbmJejb";
	private static final String clientSecret = "pPl3op_lnM";
	private static final Logger logger = LoggerFactory.getLogger(SearchControllerImpl.class);

	@Resource(name = "stackbooksService")
	private StackbooksServiceIf service;

	@Resource(name = "codeService")
	private CodeServiceImpl serviceCode;

	@Resource(name = "holdinginstService")
	private HoldinginstServiceImpl serviceInst;

	@Override
	@RequestMapping(value = "/stackbooks/list")
	public String list(Model model) {
		List<Stackbooks> stackbookss = service.getAllStackbooks();
		List<Map<String, String>> bookItems = new ArrayList<>();
		List<Code> codes = serviceCode.getAllCode();
		List<Holdinginst> insts = serviceInst.getAllHoldinginst();
		List<Stackbooks> rentalBooks = service.getRentalStackbooks();
		System.out.println("codes.size()=" + codes.size());
		System.out.println("insts.size()=" + insts.size());

		for (Stackbooks stackbooks : stackbookss) {
			try {
				String text = URLEncoder.encode(stackbooks.getIsbn(), "UTF-8");
				String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_isbn=" + text;
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

				ObjectMapper mapper = new ObjectMapper();
				Map<String, Object> searchResultMap = mapper.readValue(response.toString(), Map.class);
				List<Map<String, String>> searchItems = (List) searchResultMap.get("items");
				// List<Map<String, String>> searchItems = (List)searchResultMap.get("items");
				for (Map<String, String> map : searchItems) {

					// System.out.println("bookId="+stackbooks.getBookId());
					// System.out.println("stackbook : isbn=" + stackbooks.getIsbn());
					// System.out.println("item : isbn=" + map.get("isbn"));

					if (map.get("isbn").contains(stackbooks.getIsbn())) {
						map.put("bookId", new Integer(stackbooks.getBookId()).toString());
						for (Stackbooks rentalBook : rentalBooks) {
							if (stackbooks.getBookId() == rentalBook.getBookId()) {
								map.put("bookStatus", rentalBook.getStatus());
							}
						}

						for (Holdinginst inst : insts) {
							if (new Integer(inst.getInstitutionId()).toString()
									.equals(new Integer(stackbooks.getInstitutionId()).toString())) {
								map.put("institutionIdName", inst.getInstitutionName());
							}
						}
					}
				}
				
				bookItems.addAll(searchItems);

				model.addAttribute("bookItems", bookItems);
				model.addAttribute("content", "/WEB-INF/views/main/bookList.jsp");

				// bookItems.forEach(map -> {
				// logger.info(map.get("title"));
				// logger.info(map.get("discount"));
				// logger.info(map.get("image"));
				// logger.info(map.get("author"));
				// logger.info(map.get("publisher"));
				// logger.info(map.get("isbn"));
				// });

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
		}
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/stackbooks/insert", method = RequestMethod.GET)
	public String moveInsert(Model model) {

		model.addAttribute("content", "/WEB-INF/views/stackbooks/insert.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/stackbooks/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute Inspection inspection, Stackbooks stackbooks, @RequestParam("isbn") String isbn, Model model) {




			try {
				String text = URLEncoder.encode(isbn, "UTF-8");
				String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_isbn=" + text;
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

				ObjectMapper mapper = new ObjectMapper();
				Map<String, Object> searchResultMap = mapper.readValue(response.toString(), Map.class);
				List<Map<String, String>> bookItems = (List) searchResultMap.get("items");
				
				for (Map<String, String> map : bookItems) {

					// System.out.println("bookId="+stackbooks.getBookId());
					// System.out.println("stackbook : isbn=" + stackbooks.getIsbn());
					// System.out.println("item : isbn=" + map.get("isbn"));

					if (map.get("isbn").contains(stackbooks.getIsbn())) {
						stackbooks.setIsbn(isbn);
						stackbooks.setTitle(map.get("title"));
						stackbooks.setAuthor(map.get("author"));
						stackbooks.setTranslator("null");
						stackbooks.setPublisher(map.get("publisher"));
						stackbooks.setAcquisitionId(inspection.getAcquisitionId());
						stackbooks.setInstitutionId("1");
						stackbooks.setRequestId(inspection.getRequestId());
						System.out.println(stackbooks.getAuthor());
					}
				}
				
				// System.out.println("----------------------------");
				// System.out.println(bookItems);
				// System.out.println("----------------------------");
				// System.out.println(stackbooks);

				model.addAttribute("stackbooks", stackbooks);
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
			int successCnt = service.insert(stackbooks);
			String message;
			if (successCnt > 0) {
				message = "요청이 완료되었습니다.";
				model.addAttribute("message", message);
				model.addAttribute("next", "/stackbooks/list");
			} else {
				message = "요청에 실패하였습니다.";
				model.addAttribute("message", message);
				model.addAttribute("next", "/");
			}
		

		model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/stackbooks/update", method = RequestMethod.GET)
	public String moveUpdate(@RequestParam("stackbooksId") int bookId, Model model) {

		Stackbooks stackbooks = new Stackbooks();
		stackbooks.setBookId(bookId);

		stackbooks = service.get(stackbooks);

		if (stackbooks != null) {
			model.addAttribute("stackbooks", stackbooks);
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
	@RequestMapping(value = "/admin/stackbooks/update", method = RequestMethod.POST)
	public String update(@ModelAttribute Stackbooks stackbooks, Model model) {

		int successCnt = service.update(stackbooks);

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
	@RequestMapping(value = "/stackbooks/select")
	public String select(@RequestParam("bookId") int bookId, Model model) {

		System.out.println("++++++++++++++++++++");

		Stackbooks stackbooks = new Stackbooks();
		stackbooks.setBookId(bookId);

		stackbooks = service.get(stackbooks);

		if (stackbooks != null) {
			try {
				String text = URLEncoder.encode(stackbooks.getIsbn(), "UTF-8");
				String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_isbn=" + text;
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

				ObjectMapper mapper = new ObjectMapper();
				Map<String, Object> searchResultMap = mapper.readValue(response.toString(), Map.class);
				List<Map<String, String>> bookItems = (List) searchResultMap.get("items");

				// System.out.println("----------------------------");
				// System.out.println(bookItems);
				// System.out.println("----------------------------");
				// System.out.println(stackbooks);

				model.addAttribute("bookItems", bookItems);
				model.addAttribute("stackbooks", stackbooks);
				model.addAttribute("content", "/WEB-INF/views/stackbooks/select.jsp");
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
		} else {
			String message = "잘못된 접근입니다.";
			model.addAttribute("message", message);
			model.addAttribute("content", "/WEB-INF/views/main/message.jsp");
			model.addAttribute("next", "/WEB-INF/views/main/index.jsp");
		}

		return "main/index";
	}

	@Override
	@RequestMapping(value = "/admin/stackbooks/delete")
	public String delete(@RequestParam("bookid") int bookId, Model model) {

		Stackbooks stackbooks = new Stackbooks();
		stackbooks.setBookId(bookId);

		int successCnt = service.delete(stackbooks);

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
	@RequestMapping(value = "/search/title")
	public String searchBooksTitle(@Param("title") String title, Model model) {
		List<Stackbooks> stackbookss = service.stackbooksSearchTitle(title);
		List<Map<String, String>> bookItems = new ArrayList<>();
		List<Holdinginst> insts = serviceInst.getAllHoldinginst();
		List<Stackbooks> rentalBooks = service.getRentalStackbooks();

		for (Stackbooks stackbooks : stackbookss) {
			try {
				String text = URLEncoder.encode(stackbooks.getIsbn(), "UTF-8");
				String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_isbn=" + text;
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

				ObjectMapper mapper = new ObjectMapper();
				Map<String, Object> searchResultMap = mapper.readValue(response.toString(), Map.class);

				List<Map<String, String>> searchItems = (List) searchResultMap.get("items");

				for (Map<String, String> map : searchItems) {

					System.out.println("bookId=" + stackbooks.getBookId());
					System.out.println("stackbook : isbn=" + stackbooks.getIsbn());
					System.out.println("item : isbn=" + map.get("isbn"));

					if (map.get("isbn").contains(stackbooks.getIsbn())) {
						map.put("bookId", new Integer(stackbooks.getBookId()).toString());
						for (Stackbooks rentalBook : rentalBooks) {
							if (stackbooks.getBookId() == rentalBook.getBookId()) {
								map.put("bookStatus", rentalBook.getStatus());
							}
						}

						for (Holdinginst inst : insts) {
							if (new Integer(inst.getInstitutionId()).toString()
									.equals(new Integer(stackbooks.getInstitutionId()).toString())) {
								map.put("institutionIdName", inst.getInstitutionName());
							}
						}
					}
				}

				bookItems.addAll(searchItems);

				model.addAttribute("bookItems", bookItems);
				model.addAttribute("content", "/WEB-INF/views/main/bookList.jsp");
				//
				// bookItems.forEach(map -> {
				// logger.info(map.get("title"));
				// logger.info(map.get("discount"));
				// logger.info(map.get("image"));
				// logger.info(map.get("author"));
				// logger.info(map.get("publisher"));
				// logger.info(map.get("isbn"));
				// });

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
		}
		return "main/index";
	}

	@Override
	public String searchBooksIsbn(String isbn, Model model) {
		// TODO Auto-generated method stub
		return null;
	}

}
