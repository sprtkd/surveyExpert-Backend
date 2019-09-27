package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.dao.UserDAO;
import com.infy.surveyExpert.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public User getUserProfile(Integer userId) throws Exception {
		User userModel = userDAO.getUserProfile(userId);
		return userModel;
	}
		
}
