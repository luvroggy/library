package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.CodeDaoIf;
import com.academy.library.dto.Code;


@Service(value="codeService")
public class CodeServiceImpl implements CodeServiceIf {
	
	@Resource(name="codeDao")
	private CodeDaoIf dao;
	
	public CodeServiceImpl() {}
	
	@Override
	public List<Code> getAllCode() {
		return dao.getAllCode();
	}

	@Override
	public Code get(String code) {
		return dao.get(code);
	}

	@Override
	public List<Code> likeCode(String text) {
		return dao.likeCode(text);
	}

	

}
