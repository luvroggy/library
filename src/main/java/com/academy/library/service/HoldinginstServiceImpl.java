package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.HoldinginstDaoIf;
import com.academy.library.dto.Holdinginst;



@Service(value="holdinginstService")
public class HoldinginstServiceImpl implements HoldinginstServiceIf {
	
	@Resource(name="holdinginstDao")
	private HoldinginstDaoIf dao;
	
	public HoldinginstServiceImpl() {}
	
	@Override
	public List<Holdinginst> getAllHoldinginst() {
		return dao.getAllHoldinginst();
	}

	@Override
	public int insert(Holdinginst holdinginst) {
		int successCnt = 0;
		// 이미 있는지 검사
		if (get(holdinginst) == null) {
			successCnt = dao.insert(holdinginst);
		}
		return successCnt;
	}

	@Override
	public Holdinginst get(Holdinginst holdinginst) {
		return dao.get(holdinginst);
	}

	@Override
	public int update(Holdinginst holdinginst) {
		int successCnt = 0;
		// 수정할 제품이 존재하는 경우만
		if (get(holdinginst) != null) {
			successCnt = dao.update(holdinginst);
		}
		return successCnt;
	}

	@Override
	public int delete(Holdinginst holdinginst) {
		int successCnt = 0;
		// 삭제할 제품이 존재하는 경우만
		if (get(holdinginst) != null) {	
			successCnt = dao.delete(holdinginst);
		}
		return successCnt;
	}

}
