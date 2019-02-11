package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Request;
import com.academy.library.mapper.RequestMapper;
@Repository(value="requestDao")
public class RequestDaoImpl implements RequestDaoIf {

	@Autowired 
	private SqlSessionFactory factory;
	
	
	public RequestDaoImpl() {}

	@Override
	public List<Request> getAllRequest() {
		SqlSession session = factory.openSession();
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		List<Request> allRequest = null;
		try {
			allRequest = mapper.requestSelect();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allRequest;
	}

	@Override
	public Request get(Request request) {
		SqlSession session = factory.openSession();
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		Request oneProd = null;
		
		try {
			oneProd = mapper.requestSelectOne(request);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return oneProd;
	}

	@Override
	public int insert(Request request) {
		SqlSession session = factory.openSession(true);
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		int count = 0;
		try {
			count = mapper.requestInsert(request);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int update(Request request) {
		SqlSession session = factory.openSession(true);
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		int count = 0;
		try {
			count = mapper.requestUpdate(request);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return count;
	}

	@Override
	public int delete(Request request) {
		SqlSession session = factory.openSession(true);
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		int count = 0;
		try {
			count = mapper.requestDelete(request);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public List<Request> getUser(String userId) {
		SqlSession session = factory.openSession();
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		List<Request> oneProd = null;
		
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
	public List<Request> joinRequest() {
		
		SqlSession session = factory.openSession();
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		List<Request> allRequest = null;
		try {
			allRequest = mapper.requestSelectJoin();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allRequest;
	}

	@Override
	public List<Request> getSuccessRequest() {
		
		SqlSession session = factory.openSession();
		RequestMapper mapper = session.getMapper(RequestMapper.class);
		List<Request> allRequest = null;
		try {
			allRequest = mapper.successRequest();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allRequest;
	}

}
