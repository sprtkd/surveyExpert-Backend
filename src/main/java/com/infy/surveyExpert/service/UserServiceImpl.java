package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User getUserProfile(Integer userId) throws Exception {
		User userModel = userDAO.getUserProfile(userId);
		return userModel;
	}
	
}
