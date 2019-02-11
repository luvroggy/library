package com.academy.library.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.academy.library.util.GradeChecker;

@WebFilter(filterName="GradeFilter", 
urlPatterns= {"/admin/*"
		    
	         })

public class GradeFilter implements Filter {

	private String pageContext;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
System.out.println("========== 3. 접속 권한 필터 진입 =========");
		
		String role = GradeChecker.getRole(req);
		
		if ("admin".equals(role)) {
			//접속 권한이 어드민이면 그대로 진행
			chain.doFilter(req, res);			
		} else {
			String content = "/WEB-INF/views/main/message.jsp";
			String view = "/WEB-INF/views/main/index.jsp";
			String next = pageContext+"/";
			
			req.setAttribute("message", "사용할 수 있는 권한이 없습니다.");
			req.setAttribute("content", content);
			req.setAttribute("next", next);
			req.getRequestDispatcher(view).forward(req, res);
		}
		
		System.out.println("========== 3. 접속 권한 필터 종료 =========");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		pageContext = config.getServletContext().getContextPath();

	}

}
