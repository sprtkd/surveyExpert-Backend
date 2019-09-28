package com.infy.surveyExpert.service;

import com.infy.surveyExpert.model.User;

public interface UserService {
	public User getUserProfile(Integer userId) throws Exception;
}
