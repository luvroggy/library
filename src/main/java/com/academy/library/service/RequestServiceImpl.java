package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.RequestDaoIf;
import com.academy.library.dto.Request;

@Service(value="requestService")
public class RequestServiceImpl implements RequestServiceIf {

	@Resource(name="requestDao")
	private RequestDaoIf dao;	
	
	
	public RequestServiceImpl() {	}

	@Override
	public int insert(Request request) {
		int successCnt = 0;
		// 이미 있는지 검사
		if (get(request) == null) {
			successCnt = dao.insert(request);
		}
		return successCnt;
	}

	@Override
	public int update(Request request) {
			int successCnt = 0;
			// 수정할 제품이 존재하는 경우에만
			if (get(request) != null) {
				successCnt = dao.update(request); 
			}
			return successCnt;
	}

	@Override
	public int delete(Request request) {
		int successCnt = 0;
		// 삭제할 제품이 있는 경우에만 실행
		if (get(request) != null) {
			successCnt = dao.delete(request); 
		}
		return successCnt;
	}

	@Override
	public Request get(Request request) {
		return dao.get(request);
	}

	@Override
	public List<Request> getAllRequest() {
		return dao.getAllRequest();
	}

	@Override
	public List<Request> getUser(String userId) {
		return dao.getUser(userId);
	}

	@Override
	public List<Request> getJoinRequest() {
		return dao.joinRequest();
	}

	@Override
	public List<Request> getSuccessRequest() {
		return dao.getSuccessRequest();
	}

	
	
}
