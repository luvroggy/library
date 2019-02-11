package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.InspectionDaoIf;
import com.academy.library.dto.Inspection;
import com.academy.library.dto.Request;

@Service(value="inspectionService")
public class InspectionServiceImpl implements InspectionServiceIf {

	@Resource(name="inspectionDao")
	private InspectionDaoIf dao;
	
	public InspectionServiceImpl() {}
	
	@Override
	public List<Inspection> getAllInspection() {
		return dao.getAllInspection();
	}

	@Override
	public Inspection get(Inspection inspection) {
		return dao.get(inspection);
	}

	@Override
	public int insert(Inspection inspection) {
		int successCnt = 0;
	    if (get(inspection) == null) {
	    	successCnt = dao.insert(inspection);
	    }
	    return successCnt;
	}

	@Override
	public int update(Inspection inspection) {
		int successCnt = 0;
	    if (get(inspection) != null) {
	    	successCnt = dao.update(inspection);
	    }
	    return successCnt;
	}

	@Override
	public int delete(Inspection inspection) {
		int successCnt = 0;
	    if (get(inspection) != null) {
	    	successCnt = dao.delete(inspection);
	    }
	    return successCnt;
	}
	
	@Override
	public List<Inspection> getUser(String userId) {
		return dao.getUser(userId);
	}

	@Override
	public List<Inspection> getJoin() {
		return dao.getSelectJoin();
	}


}
