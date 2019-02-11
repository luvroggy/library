package com.academy.library.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller(value="naverApiController")
public class NaverApiController {

	private static final Logger logger = LoggerFactory.getLogger(NaverApiController.class);
	
	@RequestMapping(value="/naverApi")
	public String getNaverBooks(Model model) {
		String clientId = "Qfk0jYAumhKz_zbmJejb";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "pPl3op_lnM";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("자바", "UTF-8");
            String auth = URLEncoder.encode("조슈아", "UTF-8");
            
            String apiURL = "https://openapi.naver.com/v1/search/book_adv.json?query="+ text 
            		      + "&d_titl=" + text
            		      + "&d_auth=" + auth; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
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
            
            logger.info("=================================================");
            logger.info(response.toString());
            logger.info("=================================================");
//            System.out.println(response.toString());
            
            model.addAttribute("booksJson", response.toString());
            
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> searchResultMap = mapper.readValue(response.toString(), Map.class);
            List<Map<String, String>> bookItems = (List)searchResultMap.get("items");
            model.addAttribute("bookItems", bookItems);
            logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++");
            
//            for (Map<String, String> map : bookItems) {
//            	logger.info(map.get("title"));
//            	logger.info(map.get("image"));
//            	logger.info(map.get("author"));
//            	logger.info(map.get("publisher"));
//            	logger.info(map.get("isbn"));				
//			}
            
            bookItems.forEach(map -> {
            	logger.info(map.get("title"));
            	logger.info(map.get("discount"));
            	logger.info(map.get("image"));
            	logger.info(map.get("author"));
            	logger.info(map.get("publisher"));
            	logger.info(map.get("isbn"));
            });
            
            logger.info("=");
            logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
		
		return "main/index";
	}
}
