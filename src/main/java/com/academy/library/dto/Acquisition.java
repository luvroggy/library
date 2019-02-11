package com.academy.library.dto;

public class Acquisition {
	
	private String acquisitionId;
	private String requestId;
	private String userId;
	private String acquisitionStatus;
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private String regdt;
	private String moddt;
	private String status;
	
	public Acquisition() {	}
	
	

	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAcquisitionStatus() {
		return acquisitionStatus;
	}

	public void setAcquisitionStatus(String acquisitionStatus) {
		this.acquisitionStatus = acquisitionStatus;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acquisitionId == null) ? 0 : acquisitionId.hashCode());
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
		Acquisition other = (Acquisition) obj;
		if (acquisitionId == null) {
			if (other.acquisitionId != null)
				return false;
		} else if (!acquisitionId.equals(other.acquisitionId))
			return false;
		return true;
	}
	
	
	
}
