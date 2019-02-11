package com.academy.library.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academy.library.dto.Stackbooks;
import com.academy.library.mapper.StackbooksMapper;

@Repository(value = "stackbooksDao")
public class StackbooksDaoImpl implements StackbooksDaoIf {

	@Autowired
	private SqlSessionFactory factory;

	public StackbooksDaoImpl() {
	}

	@Override
	public List<Stackbooks> getAllStackbooks() {
		SqlSession session = factory.openSession();
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		List<Stackbooks> allStackbooks = null;
		try {
			allStackbooks = mapper.stackbooksSelect();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return allStackbooks;
	}

	@Override
	public Stackbooks get(Stackbooks stackbooks) {
		SqlSession session = factory.openSession();
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		Stackbooks oneStack = null;
		try {
			oneStack = mapper.stackbooksSelectOne(stackbooks);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return oneStack;
	}

	@Override
	public int insert(Stackbooks stackbooks) {
		SqlSession session = factory.openSession(true);
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		int count = 0;
		try {
			count = mapper.stackbooksInsert(stackbooks);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int update(Stackbooks stackbooks) {
		SqlSession session = factory.openSession(true);
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		int count = 0;
		try {
			count = mapper.stackbooksUpdate(stackbooks);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int delete(Stackbooks stackbooks) {
		SqlSession session = factory.openSession(true);
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		int count = 0;
		try {
			count = mapper.stackbooksDelete(stackbooks);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public List<Stackbooks> getStackbooksTitle(String title) {
		SqlSession session = factory.openSession();
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		List<Stackbooks> titleStackbooks = null;
		try {
			titleStackbooks = mapper.stackbooksSearchTitle("%" + title + "%");
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return titleStackbooks;
	}

	@Override
	public int statusUpdate(int bookId) {
		SqlSession session = factory.openSession(true);
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		int count = 0;
		try {
			count = mapper.statusUpdate(bookId);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return count;
	}

	@Override
	public int getStackbooksIsbn(String isbn) {
		SqlSession session = factory.openSession();
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		int isbnStackbooks = 0;
		try {
			isbnStackbooks = mapper.stackbooksSearchIsbn(isbn);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return isbnStackbooks;
	}

	@Override
	public List<Stackbooks> getRentalStackbooks() {
		SqlSession session = factory.openSession();
		StackbooksMapper mapper = session.getMapper(StackbooksMapper.class);
		List<Stackbooks> allStackbooks = null;
		try {
			allStackbooks = mapper.rentalStackbooks();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return allStackbooks;
	}

}
