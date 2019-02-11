package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Holdinginst;
import com.academy.library.mapper.HoldinginstMapper;


@Repository(value="holdinginstDao")
public class HoldinginstDaoImpl implements HoldinginstDaoIf {
	
	@Autowired
	private SqlSessionFactory factory;
	
	public HoldinginstDaoImpl() {
		super();
	}

	@Override
	public List<Holdinginst> getAllHoldinginst() {
		SqlSession session = factory.openSession();
		HoldinginstMapper mapper = session.getMapper(HoldinginstMapper.class);
		List<Holdinginst> hold = null;
		
		try {
			hold = mapper.holdingSelect();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return hold;
		
	}

	@Override
	public int insert(Holdinginst holdinginst) {
		SqlSession session = factory.openSession(true);
		HoldinginstMapper mapper = session.getMapper(HoldinginstMapper.class);
		int count = 0;
		
		try {
			count = mapper.holdinginstInsert(holdinginst);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public Holdinginst get(Holdinginst holdinginst) {
		SqlSession session = factory.openSession(true);
		HoldinginstMapper mapper = session.getMapper(HoldinginstMapper.class);
		Holdinginst bud = null;
		
		try {
			bud = mapper.holdingSelectOne(holdinginst);
		} finally {
			if(session != null) {
				session.close();
			}
		}	
		return bud;
	}

	@Override
	public int update(Holdinginst holdinginst) {
		SqlSession session = factory.openSession(true);
		HoldinginstMapper mapper = session.getMapper(HoldinginstMapper.class);
		int count = 0;
		
		try {
			count = mapper.holdinginstUpdate(holdinginst);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int delete(Holdinginst holdinginst) {
		SqlSession session = factory.openSession(true);
		HoldinginstMapper mapper = session.getMapper(HoldinginstMapper.class);
		int count = 0;
		
		try {
			count = mapper.holdinginstDelete(holdinginst);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

}
