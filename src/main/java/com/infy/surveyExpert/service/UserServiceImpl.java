package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.entity.UserEntity;
import com.infy.surveyExpert.model.UserModel;
import com.infy.surveyExpert.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public UserModel getUserProfile(Integer userId) throws Exception {
		UserEntity user = userRepo.findByUserId(userId);
		return UserModel.toModel(user);
		
	}
		
}
