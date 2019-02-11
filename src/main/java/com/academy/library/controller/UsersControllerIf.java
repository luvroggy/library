package com.academy.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.academy.library.dto.Users;

public interface UsersControllerIf {

	public String list(Model model);

	public String moveInsert(Model model);

	public String insert(Users users, Model model);

	public String moveUpdate(HttpServletRequest req, Model model);

	public String update(HttpServletRequest req, Users users, Model model);

	public String select(String userId, Model model);

	public String delete(String userId, Model model);

}
