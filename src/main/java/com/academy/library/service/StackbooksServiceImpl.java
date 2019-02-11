package com.academy.library.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.academy.library.dao.StackbooksDaoIf;
import com.academy.library.dto.Stackbooks;

@Service(value="stackbooksService")
public class StackbooksServiceImpl implements StackbooksServiceIf {

	@Resource(name="stackbooksDao")
	private StackbooksDaoIf dao;
	
	public StackbooksServiceImpl() {}

	@Override
	public List<Stackbooks> getAllStackbooks() {
		return dao.getAllStackbooks();
	}

	@Override
	public Stackbooks get(Stackbooks stackbooks) {
		return dao.get(stackbooks);
	}

	@Override
	public int insert(Stackbooks stackbooks) {
		int successCnt = 0;
//		if (get(stackbooks) != null) {
			successCnt = dao.insert(stackbooks);
//		}
		return successCnt;
	}

	@Override
	public int update(Stackbooks stackbooks) {
		int successCnt = 0;
		if (get(stackbooks) != null) {
			successCnt = dao.update(stackbooks);
		}
		return successCnt;
	}

	@Override
	public int delete(Stackbooks stackbooks) {
		int successCnt = 0;
		if (get(stackbooks) != null) {
			successCnt = dao.delete(stackbooks);
		}
		return successCnt;
	}

	@Override
	public List<Stackbooks> stackbooksSearchTitle(String title) {
		return dao.getStackbooksTitle(title);
	}

	@Override
	public int update(int bookId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int stackbooksSearchIsbn(String isbn) {
		return dao.getStackbooksIsbn(isbn);
	}

	@Override
	public List<Stackbooks> getRentalStackbooks() {
		return dao.getRentalStackbooks();
	}

}
