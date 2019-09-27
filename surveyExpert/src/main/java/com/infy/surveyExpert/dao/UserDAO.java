package com.infy.surveyExpert.dao;

import com.infy.surveyExpert.model.UserModel;

public interface UserDAO {
	public UserModel getUserProfile(Integer userId) throws Exception;
}
