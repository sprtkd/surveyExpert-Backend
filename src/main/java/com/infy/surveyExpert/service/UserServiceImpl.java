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


		Optional<UserEntity> useren = userRepo.findById(userId);
		if(useren.isPresent()) {
			return User.toModel(useren.get());
		}
		
		else {
			throw new Exception("NO Data Found");
		}


	}
	
	
		
	
	
}
