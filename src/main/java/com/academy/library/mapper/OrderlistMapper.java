package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Orderlist;
import com.academy.library.dto.Request;

public interface OrderlistMapper {
	
	public List<Orderlist> orderlistSelect();

	public Orderlist orderlistSelectOne(Orderlist orderlist);
	
	public List<Orderlist> requestUserId(String userId);
	
	public int orderlistInsert(Orderlist orderlist);
	
	public int orderlistDelete(Orderlist orderlist);
	
	public int orderlistUpdate(Orderlist orderlist);
	
	public List<Orderlist> orderlistSelectJoin();

}
