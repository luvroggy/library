package com.academy.library.dao;

import java.util.List;

import com.academy.library.dto.Stackbooks;

public interface StackbooksDaoIf {
	public abstract List<Stackbooks> getAllStackbooks();
	public abstract Stackbooks get(Stackbooks stackbooks);
	public abstract int statusUpdate(int bookId);
	public abstract int insert(Stackbooks stackbooks);
	public abstract int update(Stackbooks stackbooks);
	public abstract int delete(Stackbooks stackbooks);
	public abstract List<Stackbooks> getStackbooksTitle(String title);
	public abstract List<Stackbooks> getRentalStackbooks();
	public abstract int getStackbooksIsbn(String isbn);
}
