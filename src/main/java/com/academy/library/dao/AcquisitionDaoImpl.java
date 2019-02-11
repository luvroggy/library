package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Acquisition;
import com.academy.library.mapper.AcquisitionMapper;

@Repository(value="acquisitionDao")
public class AcquisitionDaoImpl implements AcquisitionDaoIf {
	@Autowired 
	private SqlSessionFactory factory;
	
	//기본생성자
	public AcquisitionDaoImpl() {}

	
	@Override
	public List<Acquisition> getAllAcquisition() {
		SqlSession session = factory.openSession();
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		List<Acquisition> allAcquisition = null;
		try {
			allAcquisition = mapper.acquisitionSelect();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allAcquisition;
	}

	@Override
	public Acquisition get(Acquisition acquisition) {
		SqlSession session = factory.openSession();
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		Acquisition oneProd = null;
		
		try {
			oneProd = mapper.acquisitionSelectOne(acquisition);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return oneProd;
	}

	@Override
	public int insert(Acquisition acquisition) {
		SqlSession session = factory.openSession(true);
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		int count = 0;
		try {
			count = mapper.acquisitionInsert(acquisition);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int update(Acquisition acquisition) {
		SqlSession session = factory.openSession(true);
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		int count = 0;
		try {
			count = mapper.acquisitionUpdate(acquisition);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return count;
	}

	@Override
	public int delete(Acquisition acquisition) {
		SqlSession session = factory.openSession(true);
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		int count = 0;
		try {
			count = mapper.acquisitionDelete(acquisition);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}


	@Override
	public List<Acquisition> getJoinAcquisition() {
		SqlSession session = factory.openSession();
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		List<Acquisition> allAcquisition = null;
		try {
			allAcquisition = mapper.acquisitionSelectJoin();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allAcquisition;
	}


	@Override
	public int acquisitionSearchId(String id) {
		SqlSession session = factory.openSession(true);
		AcquisitionMapper mapper = session.getMapper(AcquisitionMapper.class);
		int count = 0;
		try {
			count = mapper.acquisitionSearchId(id);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

}
