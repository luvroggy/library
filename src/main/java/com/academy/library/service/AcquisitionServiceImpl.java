package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.AcquisitionDaoIf;
import com.academy.library.dto.Acquisition;
@Service(value="acquisitionService")
public class AcquisitionServiceImpl implements AcquisitionServiceIf {

	@Resource(name="acquisitionDao")
	private AcquisitionDaoIf dao;	
	
	
	
	public AcquisitionServiceImpl() {	}

	@Override
	public int insert(Acquisition acquisition) {
		int successCnt = 0;
		// 이미 있는지 검사
		if (get(acquisition) == null) {
			successCnt = dao.insert(acquisition);
		}
		return successCnt;
	}

	@Override
	public int update(Acquisition acquisition) {
		int successCnt = 0;
		// 수정할 제품이 존재하는 경우에만
		if (get(acquisition) != null) {
			successCnt = dao.update(acquisition); 
		}
		return successCnt;
	}

	@Override
	public int delete(Acquisition acquisition) {
		int successCnt = 0;
		// 삭제할 제품이 있는 경우에만 실행
		if (get(acquisition) != null) {
			successCnt = dao.delete(acquisition); 
		}
		return successCnt;
	}

	@Override
	public Acquisition get(Acquisition acquisition) {
		return dao.get(acquisition);
	}

	@Override
	public List<Acquisition> getAllAcquisition() {
		return dao.getAllAcquisition();
	}

	@Override
	public List<Acquisition> getJoinAcquisition() {
		return dao.getJoinAcquisition();
	}

	@Override
	public int acqJoin(String id) {
		return dao.acquisitionSearchId(id);
	}

}
