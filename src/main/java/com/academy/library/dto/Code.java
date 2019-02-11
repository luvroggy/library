package com.academy.library.dto;

public class Code {

	private int codeId;
	private String code;
	private String codeName;
	private String codeDesc;
	private String codeSuper;
	private String regdt;
	private String moddt;
	
	public Code() {
		super();
	}

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCodeSuper() {
		return codeSuper;
	}

	public void setCodeSuper(String codeSuper) {
		this.codeSuper = codeSuper;
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
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + codeId;
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
		Code other = (Code) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (codeId != other.codeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Code [codeId=" + codeId + ", code=" + code + ", codeName=" + codeName + ", codeDesc=" + codeDesc
				+ ", codeSuper=" + codeSuper + ", regdt=" + regdt + ", moddt=" + moddt + "]";
	}

	
	
}
