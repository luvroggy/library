package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Orderlist;
import com.academy.library.dto.Request;
import com.academy.library.mapper.OrderlistMapper;
import com.academy.library.mapper.RequestMapper;




@Repository(value="orderlistDao")
public class OrderlistDaoImpl implements OrderlistDaoIf {
	
	@Autowired
	private SqlSessionFactory factory;
	
		
	public OrderlistDaoImpl() {
		super();
	}

	@Override
	public List<Orderlist> getAllOrderlist() {
		SqlSession session = factory.openSession();
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		List<Orderlist> ordlist = null;
		
		try {
			ordlist = mapper.orderlistSelect();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return ordlist;
	}

	@Override
	public int insert(Orderlist orderlist) {
		SqlSession session = factory.openSession(true);
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		int count = 0;
		
		try {
			count = mapper.orderlistInsert(orderlist);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public Orderlist get(Orderlist orderlist) {
		SqlSession session = factory.openSession(true);
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		Orderlist ordlist = null;
		
		try {
			ordlist = mapper.orderlistSelectOne(orderlist);
		} finally {
			if(session != null) {
				session.close();
			}
		}	
		return ordlist;
	}

	@Override
	public int update(Orderlist orderlist) {
		SqlSession session = factory.openSession(true);
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		int count = 0;
		
		try {
			count = mapper.orderlistUpdate(orderlist);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int delete(Orderlist orderlist) {
		SqlSession session = factory.openSession(true);
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		int count = 0;
		
		try {
			count = mapper.orderlistDelete(orderlist);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}
	
	@Override
	public List<Orderlist> getUser(String userId) {
		SqlSession session = factory.openSession();
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		List<Orderlist> oneProd = null;
		
		try {
			oneProd = mapper.requestUserId(userId);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return oneProd;
	}

	@Override
	public List<Orderlist> getJoin() {
		SqlSession session = factory.openSession();
		OrderlistMapper mapper = session.getMapper(OrderlistMapper.class);
		List<Orderlist> oneProd = null;
		
		try {
			oneProd = mapper.orderlistSelectJoin();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return oneProd;
	}

}
