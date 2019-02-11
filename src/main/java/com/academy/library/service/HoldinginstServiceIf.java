package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Holdinginst;

public interface HoldinginstServiceIf {
	
	/** 전체 목록 조회 */
	public abstract List<Holdinginst> getAllHoldinginst();
	
	/** 1개 목록에 추가 */
	public abstract int insert(Holdinginst holdinginst);
	
	/** 정보 1개 가져오기 */
	public abstract Holdinginst get(Holdinginst holdinginst);
	
	/** 정보 1개 수정하기 */
	public abstract int update(Holdinginst holdinginst);
	
	/** 정보 1개 삭제하기 */
	public abstract int delete(Holdinginst holdinginst);

}
