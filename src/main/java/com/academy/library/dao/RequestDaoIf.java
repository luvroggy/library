package com.academy.library.dao;
import java.util.List;

import com.academy.library.dto.Request;
public interface RequestDaoIf {

	public abstract List<Request> getSuccessRequest();
	/** 상품 전체 목록 조회*/
	public abstract List<Request> getAllRequest();
	
	public abstract List<Request> joinRequest();
	
	/** 상품정보 1개 가져오기*/
	public abstract Request get(Request request);
	
	public abstract List<Request> getUser(String userId);
	
	/** 상품 1개 목록에 추가*/
	public abstract int insert(Request request);

	/** 상품정보 1개 수정하기*/
	public abstract int update(Request request);
	
	/** 상품정보 1개 삭제하기*/
	public abstract int delete(Request request);
}
