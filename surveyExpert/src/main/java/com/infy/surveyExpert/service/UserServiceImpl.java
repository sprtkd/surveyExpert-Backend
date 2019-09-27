package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.dao.UserDAO;
import com.infy.surveyExpert.model.UserModel;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public UserModel getUserProfile(Integer userId) throws Exception {
		UserModel userModel = userDAO.getUserProfile(userId);
		return userModel;
	}
		
}
