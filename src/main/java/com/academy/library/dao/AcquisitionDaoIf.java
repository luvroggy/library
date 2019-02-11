package com.academy.library.dao;
import java.util.List;

import com.academy.library.dto.Acquisition;
public interface AcquisitionDaoIf {

	public abstract List<Acquisition> getJoinAcquisition();

	/** 상품 전체 목록 조회*/
	public abstract List<Acquisition> getAllAcquisition();
	
	/** 상품정보 1개 가져오기*/
	public abstract Acquisition get(Acquisition acquisition);
	
	/** 상품 1개 목록에 추가*/
	public abstract int insert(Acquisition acquisition);

	/** 상품정보 1개 수정하기*/
	public abstract int update(Acquisition acquisition);
	
	/** 상품정보 1개 삭제하기*/
	public abstract int delete(Acquisition acquisition);
	
	public abstract int acquisitionSearchId(String id);
	
	
	
}
