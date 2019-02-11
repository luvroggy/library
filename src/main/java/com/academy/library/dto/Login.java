package com.academy.library.dto;

public class Login {
	private String userId;
	private String password;
	private String userGrade;
	
	public Login() {}

	
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		Login other = (Login) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userGrade=" + userGrade + "]";
	}

	
	
}
