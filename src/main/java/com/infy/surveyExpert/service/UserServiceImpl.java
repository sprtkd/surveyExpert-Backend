package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.dao.UserDAO;
import com.infy.surveyExpert.model.UserModel;
import com.infy.surveyExpert.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserModel getUserProfile(Integer userId) throws Exception {
		UserModel userModel = userDAO.getUserProfile(userId);
		return userModel;
	}
	
	@Override
	public String login(String userId,String password) {
		
		
	}
	
		
}
