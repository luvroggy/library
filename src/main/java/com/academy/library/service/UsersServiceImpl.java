package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.UsersDaoIf;
import com.academy.library.dto.Users;

@Service(value="usersService")
public class UsersServiceImpl implements UsersServiceIf {

	@Resource(name="usersDao")
	private UsersDaoIf dao;
	
	
	public UsersServiceImpl() {	}

	@Override
	public int insert(Users users) {
		int successCnt = 0;
		// 이미 있는지 검사
		if (get(users) == null) {
			successCnt = dao.insert(users);
		}
		return successCnt;
	}

	@Override
	public int update(Users users) {
		int successCnt = 0;
		// 수정할 제품이 존재하는 경우에만
		if (get(users) != null) {
			successCnt = dao.update(users); 
		}
		return successCnt;
	}

	@Override
	public int delete(Users users) {
		int successCnt = 0;
		// 삭제할 제품이 있는 경우에만 실행
		if (get(users) != null) {
			successCnt = dao.delete(users); 
		}
		return successCnt;
	}

	@Override
	public Users get(Users users) {
		return dao.get(users);
	}

	@Override
	public List<Users> getAllUsers() {
		return dao.getAllUsers();
	}

}
