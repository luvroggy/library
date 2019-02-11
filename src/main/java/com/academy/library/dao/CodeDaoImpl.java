package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Code;
import com.academy.library.mapper.CodeMapper;




@Repository(value="codeDao")
public class CodeDaoImpl implements CodeDaoIf {
	
	@Autowired
	private SqlSessionFactory factory;
	
	public CodeDaoImpl() {
		super();
	}

	@Override
	public List<Code> getAllCode() {
		SqlSession session = factory.openSession();
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		List<Code> code = null;
		
		try {
			code = mapper.codeSelect();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return code;
	}


	@Override
	public Code get(String code) {
		SqlSession session = factory.openSession(true);
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		Code bud = null;
		
		try {
			bud = mapper.codeSelectOne(code);
		} finally {
			if(session != null) {
				session.close();
			}
		}	
		return bud;
	}

	@Override
	public List<Code> likeCode(String text) {
		SqlSession session = factory.openSession(true);
		CodeMapper mapper = session.getMapper(CodeMapper.class);
		List<Code> codes = null;
		
		try {
			codes = mapper.codeLike(text);
		} finally {
			if(session != null) {
				session.close();
			}
		}	
		return codes;
	}

	

}
