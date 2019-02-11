package com.academy.library.util;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class GradeChecker {
	
public static String getRole(ServletRequest req) {
		
		HttpSession session = ((HttpServletRequest)req).getSession();
		String grade = (String) session.getAttribute("grade");
		
		return grade;
	}

}
