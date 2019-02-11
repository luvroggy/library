package com.academy.library.service;

import java.util.List;

import com.academy.library.dto.Stackbooks;

public interface StackbooksServiceIf {
	public abstract List<Stackbooks> getAllStackbooks();
	public abstract List<Stackbooks> stackbooksSearchTitle(String title);
	public abstract List<Stackbooks> getRentalStackbooks();
	public abstract int stackbooksSearchIsbn(String isbn);
	public abstract Stackbooks get(Stackbooks stackbooks);
	public abstract int insert(Stackbooks stackbooks);
	public abstract int update(Stackbooks stackbooks);
	public abstract int delete(Stackbooks stackbooks);
	public abstract int update(int bookId);
	
}
