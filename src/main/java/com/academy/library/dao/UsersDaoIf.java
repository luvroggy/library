package com.academy.library.dao;
import java.util.List;

import com.academy.library.dto.Users;
public interface UsersDaoIf {

	/** 상품 전체 목록 조회*/
	public abstract List<Users> getAllUsers();
	
	/** 상품정보 1개 가져오기*/
	public abstract Users get(Users users);
	
	/** 상품 1개 목록에 추가*/
	public abstract int insert(Users users);

	/** 상품정보 1개 수정하기*/
	public abstract int update(Users users);
	
	/** 상품정보 1개 삭제하기*/
	public abstract int delete(Users users);
}
