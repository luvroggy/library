package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.OrderlistDaoIf;
import com.academy.library.dto.Orderlist;
import com.academy.library.dto.Request;



@Service(value="orderlistService")
public class OrderlistServiceImpl implements OrderlistServiceIf {
	
	@Resource(name="orderlistDao")
	private OrderlistDaoIf dao;
	
	public OrderlistServiceImpl() {}
	
	@Override
	public List<Orderlist> getAllOrderlist() {
		return dao.getAllOrderlist();
	}

	@Override
	public Orderlist get(Orderlist orderlist) {
		return dao.get(orderlist);
	}

	@Override
	public int insert(Orderlist orderlist) {
		int successCnt = 0;
		// 이미 있는지 검사
		if (get(orderlist) == null) {
			successCnt = dao.insert(orderlist);
		}
		return successCnt;
	}


	@Override
	public int update(Orderlist orderlist) {
		int successCnt = 0;
		// 수정할 제품이 존재하는 경우만
		if (get(orderlist) != null) {
			successCnt = dao.update(orderlist);
		}
		return successCnt;
	}

	@Override
	public int delete(Orderlist orderlist) {
		int successCnt = 0;
		// 삭제할 제품이 존재하는 경우만
		if (get(orderlist) != null) {	
			successCnt = dao.delete(orderlist);
		}
		return successCnt;
	}
	
	@Override
	public List<Orderlist> getUser(String userId) {
		return dao.getUser(userId);
	}

	@Override
	public List<Orderlist> getJoin() {
		return dao.getJoin();
	}

}
