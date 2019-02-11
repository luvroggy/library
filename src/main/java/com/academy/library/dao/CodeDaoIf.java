package com.academy.library.dao;

import java.util.List;

import com.academy.library.dto.Code;

public interface CodeDaoIf {
	
	/** 전체 목록 조회 */
	public abstract List<Code> getAllCode();
	
	
	/** 정보 1개 가져오기 */
	public abstract Code get(String code);
	

	public abstract List<Code> likeCode(String text);
}
