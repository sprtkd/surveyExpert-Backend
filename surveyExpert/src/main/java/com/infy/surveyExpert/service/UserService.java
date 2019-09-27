package com.infy.surveyExpert.service;

import com.infy.surveyExpert.model.UserModel;

public interface UserService {
	public UserModel getUserProfile(Integer userId) throws Exception;
}
