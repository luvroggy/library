package com.academy.library.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginChecker {
	public static boolean isLogin(HttpServletRequest req) {
		boolean isLogin = false;
		HttpSession session = req.getSession(false);
		if(session != null) {
			String userId = (String)session.getAttribute("userId");
			
			if(userId != null) {
				isLogin = true;
			}
		}
		return isLogin;
	}
}
