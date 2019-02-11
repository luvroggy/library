package com.academy.library.dto;

public class Stackbooks {

	private int bookId;
	private String title;
	private String author;
	private String isbn;
	private String translator;
	private int bookCopy;
	private String publisher;
	private String status;
	private String acquisitionId;
	private String requestId;
	private String institutionId;
	private String regdt;
	private String moddt;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	public int getBookCopy() {
		return bookCopy;
	}
	public void setBookCopy(int bookCopy) {
		this.bookCopy = bookCopy;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}
	public String getRegdt() {
		return regdt;
	}
	public void setRegdt(String regdt) {
		this.regdt = regdt;
	}
	public String getModdt() {
		return moddt;
	}
	public void setModdt(String moddt) {
		this.moddt = moddt;
	}
	
	public String getAcquisitionId() {
		return acquisitionId;
	}
	public void setAcquisitionId(String acquisitionId) {
		this.acquisitionId = acquisitionId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stackbooks other = (Stackbooks) obj;
		if (bookId != other.bookId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Stackbooks [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isbn=" + isbn
				+ ", translator=" + translator + ", bookCopy=" + bookCopy + ", publisher=" + publisher + ", status="
				+ status + ", institutionId=" + institutionId + ", regdt=" + regdt + ", moddt=" + moddt + "]";
	}
	
	
	
}
