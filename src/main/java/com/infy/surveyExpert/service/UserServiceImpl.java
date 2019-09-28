package com.infy.surveyExpert.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.repo.UserRepo;

import com.infy.surveyExpert.entity.UserEntity;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User getUserProfile(Integer userId) throws Exception {

		Optional<User> user = userRepo.findById(userId);
//		return User.toModel(user);
		return new User();

	}
	
	@Override
	public String login(String userId,String password) {
		return null;
		
	}
	
}
