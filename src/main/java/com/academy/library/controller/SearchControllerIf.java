package com.academy.library.controller;

import org.springframework.ui.Model;

import com.academy.library.dto.Book;

public interface SearchControllerIf {
	public String getBookName(String title, Model model);
	public String getAuthor(String author, Model model);
	public String getBooks(Book book, Model model);
}
