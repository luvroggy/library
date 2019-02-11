package com.academy.library.dao;

import java.util.List;

import com.academy.library.dto.Orderlist;
import com.academy.library.dto.Request;



public interface OrderlistDaoIf {
	
	/** 전체 목록 조회 */
	public abstract List<Orderlist> getAllOrderlist();
	
	/** 1개 목록에 추가 */
	public abstract int insert(Orderlist orderlist);
	
	public abstract List<Orderlist> getJoin();
	
	public abstract List<Orderlist> getUser(String userId);
	
	/** 정보 1개 가져오기 */
	public abstract Orderlist get(Orderlist orderlist);
	
	/** 정보 1개 수정하기 */
	public abstract int update(Orderlist orderlist);
	
	/** 정보 1개 삭제하기 */
	public abstract int delete(Orderlist orderlist);
}
