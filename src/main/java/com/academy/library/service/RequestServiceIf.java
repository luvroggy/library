package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Request;

public interface RequestServiceIf {
	public abstract int insert(Request request);
	

	public abstract int update(Request request);
	

	public abstract int delete(Request request);
	
	
	public abstract Request get(Request request);
	
	public abstract List<Request> getUser(String userId);
	
	public abstract List<Request> getSuccessRequest();
	
	public abstract List<Request> getAllRequest();
	
	public abstract List<Request> getJoinRequest();
}
