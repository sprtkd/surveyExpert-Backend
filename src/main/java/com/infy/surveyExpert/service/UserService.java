package com.infy.surveyExpert.service;

import com.infy.surveyExpert.model.User;

public interface UserService {
	public String login(String userId,String password);
	public User getUserProfile(Integer userId) throws Exception;}
