package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.repo.UserRepo;

import com.infy.surveyExpert.entity.UserEntity;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User getUserProfile(Integer userId) throws Exception {

		UserEntity user = userRepo.findByuserId(userId);
		return User.toModel(user);

	}
	
	@Override
	public String login(String userId,String password) {
		return null;
		
	}
	
}
