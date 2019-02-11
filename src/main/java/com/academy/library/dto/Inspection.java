package com.academy.library.dto;

public class Inspection {
	private String inspectionId;
	private String acquisitionId;
	private String orderId;
	private String requestId;
	private String title;
	private String status;
	private String author;
	private String publisher;
	private String isbn;
	private String regdt;
	private String moddt;
	
	public Inspection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getInspectionId() {
		return inspectionId;
	}

	public void setInspectionId(String inspectionId) {
		this.inspectionId = inspectionId;
	}

	public String getAcquisitionId() {
		return acquisitionId;
	}

	public void setAcquisitionId(String acquisitionId) {
		this.acquisitionId = acquisitionId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
		result = prime * result + ((inspectionId == null) ? 0 : inspectionId.hashCode());
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
		Inspection other = (Inspection) obj;
		if (inspectionId == null) {
			if (other.inspectionId != null)
				return false;
		} else if (!inspectionId.equals(other.inspectionId))
			return false;
		return true;
	}
	
	

	

	
}
