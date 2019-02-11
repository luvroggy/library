package com.academy.library.dto;

public class Holdinginst {
	
	// 인스턴스 선언
	private int		institutionId;
	private String	institutionName;
	private String	institutionAssigned;
	private String regdt;
	private String moddt;
	
	// 생성자 선언

	public Holdinginst() {
		super();
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



	public int getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionAssigned() {
		return institutionAssigned;
	}

	public void setInstitutionAssigned(String institutionAssigned) {
		this.institutionAssigned = institutionAssigned;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + institutionId;
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
		Holdinginst other = (Holdinginst) obj;
		if (institutionId != other.institutionId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Holdinginst [institutionId=" + institutionId + ", institutionName=" + institutionName
				+ ", institutionAssigned=" + institutionAssigned + ", regdt=" + regdt + ", moddt=" + moddt + "]";
	}
	
	

}
