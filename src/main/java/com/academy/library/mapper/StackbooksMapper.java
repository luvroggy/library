package com.academy.library.mapper;

import java.util.List;

import com.academy.library.dto.Stackbooks;

public interface StackbooksMapper {
	public List<Stackbooks> stackbooksSelect();
	public List<Stackbooks> rentalStackbooks();
	public Stackbooks stackbooksSelectOne(Stackbooks stackbooks);
	public List<Stackbooks> stackbooksSearchTitle(String title);
	public int stackbooksInsert(Stackbooks stackbooks);
	public int stackbooksUpdate(Stackbooks stackbooks);
	public int stackbooksDelete(Stackbooks stackbooks);
	public int stackbooksSearchIsbn(String isbn);
	public int statusUpdate(int bookId);
}
