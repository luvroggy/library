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

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.academy.library.dto.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller(value="searchController")
public class SearchControllerImpl implements SearchControllerIf {

	private static final String clientId = "Qfk0jYAumhKz_zbmJejb";
	private static final String clientSecret = "pPl3op_lnM";
	private static final Logger logger = LoggerFactory.getLogger(SearchControllerImpl.class);
	
	@Override
//	@RequestMapping(value="/search/author", method=RequestMethod.GET)
	public String getBookName(@Param("author")String author, Model model) {
		try {
			String text = URLEncoder.encode(author, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_auth="+ text;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
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
            List<Map<String, String>> bookItems = (List)searchResultMap.get("items");
            model.addAttribute("bookItems", bookItems);
            
            bookItems.forEach(map -> {
            	logger.info(map.get("title"));
            	logger.info(map.get("discount"));
            	logger.info(map.get("image"));
            	logger.info(map.get("author"));
            	logger.info(map.get("publisher"));
            	logger.info(map.get("isbn"));
            });
            
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
//	@RequestMapping(value="/search/title")
	public String getAuthor(@Param("title")String title, Model model) {
		try {
			String text = URLEncoder.encode(title, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_titl="+ text;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
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
            List<Map<String, String>> bookItems = (List)searchResultMap.get("items");
            model.addAttribute("bookItems", bookItems);
            
            bookItems.forEach(map -> {
            	logger.info(map.get("title"));
            	logger.info(map.get("discount"));
            	logger.info(map.get("image"));
            	logger.info(map.get("author"));
            	logger.info(map.get("publisher"));
            	logger.info(map.get("isbn"));
            });
            
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
//	@RequestMapping(value="/search/detail", method=RequestMethod.GET)
	public String getBooks(@ModelAttribute Book book, Model model) {
		try {
			String title = URLEncoder.encode(book.getTitle(), "UTF-8");
			String author = URLEncoder.encode(book.getAuthor(), "UTF-8");
			String content = URLEncoder.encode(book.getContent(), "UTF-8");
			String isbn = URLEncoder.encode(book.getIsbn(), "UTF-8");
			String publisher = URLEncoder.encode(book.getPublisher(), "UTF-8");
			String firstPub = URLEncoder.encode(book.getFirstPub(), "UTF-8");
			String lastPub = URLEncoder.encode(book.getLastPub(), "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?d_titl="+ title
					+"&d_auth=" + author + "&d_cont=" + content + "&d_isbn=" + isbn + "&d_publ="
					+ publisher + "&d_dafr=" + firstPub + "&d_dato=" + lastPub;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
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
            List<Map<String, String>> bookItems = (List)searchResultMap.get("items");
            model.addAttribute("bookItems", bookItems);
            
            bookItems.forEach(map -> {
            	logger.info(map.get("title"));
            	logger.info(map.get("discount"));
            	logger.info(map.get("image"));
            	logger.info(map.get("author"));
            	logger.info(map.get("publisher"));
            	logger.info(map.get("isbn"));
            });
            
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


}
