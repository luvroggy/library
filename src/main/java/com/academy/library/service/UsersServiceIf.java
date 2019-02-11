package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Users;

public interface UsersServiceIf {
public abstract int insert(Users users);
	

	public abstract int update(Users users);
	

	public abstract int delete(Users users);
	
	
	public abstract Users get(Users users);
	

	public abstract List<Users> getAllUsers();
}
