package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Orderlist;
import com.academy.library.dto.Request;

public interface OrderlistServiceIf {
	
	
	public abstract List<Orderlist> getJoin();
	/** 상품 전체 목록 조회*/
	public abstract List<Orderlist> getAllOrderlist();
	
	/** 상품정보 1개 가져오기*/
	public abstract Orderlist get(Orderlist orderlist);
	
	/** 상품 1개 목록에 추가*/
	public abstract int insert(Orderlist orderlist);
	
	/** 상품정보 1개 수정하기*/
	public abstract int update(Orderlist orderlist);
	
	/** 상품정보 1개 삭제하기*/
	public abstract int delete(Orderlist orderlist);
	
	public abstract List<Orderlist> getUser(String userId);

}
