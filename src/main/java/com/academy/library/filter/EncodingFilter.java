package com.academy.library.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="encodingFilter",
		   urlPatterns= {"/*"})
public class EncodingFilter implements Filter {


	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("======== 1-1. 인코딩 필터 진입 =======");
		
		req.setCharacterEncoding("utf-8");
		
		chain.doFilter(req, res);
		
		res.setContentType("text/html;charset=utf-8");
		
		System.out.println("======== 1-2. 인코딩 필터 종료 =======");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
