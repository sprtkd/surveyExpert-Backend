package com.infy.surveyExpert.model;

import com.infy.surveyExpert.entity.UserEntity;

public class UserModel {
	private Integer userId;
	private String emailId;
	private String name;
	private String password;
	private String role;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public static UserModel toModel(UserEntity u) {
		UserModel user=new UserModel();
		user.setEmailId(u.getEmailId());
		user.setName(u.getName());
		user.setPassword(u.getPassword());
		user.setRole(u.getRole());
		user.setUserId(u.getUserId());
		
		
		
		return user;
		
		
	}
	
}
