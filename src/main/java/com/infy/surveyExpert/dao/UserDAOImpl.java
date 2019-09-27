package com.infy.surveyExpert.dao;

import org.springframework.stereotype.Repository;

import com.infy.surveyExpert.model.UserModel;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public UserModel getUserProfile(Integer userId) throws Exception {
		return new UserModel();
	}

}
