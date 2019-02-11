package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Inspection;
import com.academy.library.mapper.InspectionMapper;
import com.academy.library.mapper.RequestMapper;
@Repository(value="inspectionDao")
public class InspectionDaoImpl implements InspectionDaoIf {

	@Autowired
	private SqlSessionFactory factory;
	
	public InspectionDaoImpl() {}


	@Override
	public int insert(Inspection inspection) {
		SqlSession session = factory.openSession(true);
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		int count = 0;
		try {
			count = mapper.inspectionInsert(inspection);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int update(Inspection inspection) {
		SqlSession session = factory.openSession(true);
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		int count = 0;
		try {
			count = mapper.inspectionUpdate(inspection);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int delete(Inspection inspection) {
		SqlSession session = factory.openSession(true);
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		int count = 0;
		try {
			count = mapper.inspectionDelete(inspection);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public List<Inspection> getAllInspection() {
		SqlSession session = factory.openSession();
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		List<Inspection> allInspection = null;
		try {
			allInspection = mapper.inspectionSelect();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return allInspection;
	}

	@Override
	public Inspection get(Inspection inspection) {
		SqlSession session = factory.openSession();
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		Inspection oneInspection = null;
		try {
			oneInspection = mapper.inspectionSelectOne(inspection);
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return oneInspection;
	}
	
	@Override
	public List<Inspection> getUser(String userId) {
		SqlSession session = factory.openSession();
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		List<Inspection> oneProd = null;
		
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
	public List<Inspection> getSelectJoin() {
		SqlSession session = factory.openSession();
		InspectionMapper mapper = session.getMapper(InspectionMapper.class);
		List<Inspection> oneProd = null;
		
		try {
			oneProd = mapper.inspectionSelectJoin();
					
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return oneProd;
	}

}
