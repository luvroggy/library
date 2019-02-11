package com.academy.library.mapper;
import java.util.List;

import com.academy.library.dto.Request;
public interface RequestMapper {
	
	public List<Request> successRequest();
	
	public List<Request> requestSelect();
	
	public List<Request> requestSelectJoin();
	
	public Request requestSelectOne(Request request);
	
	public List<Request> requestUserId(String userId);
	
	public int requestInsert(Request request);
	
	public int requestUpdate(Request request);
	
	public int requestDelete(Request request);
}
