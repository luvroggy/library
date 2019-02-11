package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Users;
import com.academy.library.mapper.UsersMapper;

@Repository(value="usersDao")
public class UsersDaoImpl implements UsersDaoIf {

	@Autowired 
	private SqlSessionFactory factory;
	
	
	public UsersDaoImpl() {	}

	@Override
	public List<Users> getAllUsers() {
		SqlSession session = factory.openSession();
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		List<Users> allUsers= null;
		try {
			allUsers = mapper.usersSelect();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return allUsers;
	}

	@Override
	public Users get(Users users) {
		SqlSession session = factory.openSession();
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		Users oneProd = null;
		
		try {
			oneProd = mapper.usersSelectOne(users);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return oneProd;
	}

	@Override
	public int insert(Users users) {
		SqlSession session = factory.openSession(true);
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		int count = 0;
		try {
			count = mapper.usersInsert(users);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int update(Users users) {
		SqlSession session = factory.openSession(true);
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		int count = 0;
		try {
			count = mapper.usersUpdate(users);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return count;
	}

	@Override
	public int delete(Users users) {
		SqlSession session = factory.openSession(true);
		UsersMapper mapper = session.getMapper(UsersMapper.class);
		int count = 0;
		try {
			count = mapper.usersDelete(users);
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return count;
	}

}
