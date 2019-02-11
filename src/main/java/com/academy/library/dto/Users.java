package com.academy.library.dto;

public class Users {

	
	private String userId;
	private String password;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userPosition;
	private String userAssigned;
	private String userGrade;
	private String regdt;
	private String moddt;
	
	public Users() {
		super();
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}

	public String getUserAssigned() {
		return userAssigned;
	}

	public void setUserAssigned(String userAssigned) {
		this.userAssigned = userAssigned;
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
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		Users other = (Users) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", password=" + password + ", userName=" + userName + ", userPhone="
				+ userPhone + ", userEmail=" + userEmail + ", userPosition=" + userPosition + ", userAssigned="
				+ userAssigned + ", userGrade=" + userGrade + ", regdt=" + regdt + ", moddt=" + moddt + "]";
	}


	
}
