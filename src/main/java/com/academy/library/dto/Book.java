package com.academy.library.dto;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String content;
    private String firstPub;
    private String lastPub;
    private String category;
    
	public Book() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFirstPub() {
		return firstPub;
	}
	public void setFirstPub(String firstPub) {
		this.firstPub = firstPub;
	}
	public String getLastPub() {
		return lastPub;
	}
	public void setLastPub(String lastPub) {
		this.lastPub = lastPub;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
    
    
}
