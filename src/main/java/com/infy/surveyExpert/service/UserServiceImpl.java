package com.infy.surveyExpert.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.model.Question;
import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.repo.QuestionRepo;
import com.infy.surveyExpert.repo.UserRepo;
import com.infy.surveyExpert.entity.QuestionEntity;
import com.infy.surveyExpert.entity.UserEntity;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private QuestionRepo questionRepo;
	
	public User getUserProfile(Integer userId) throws Exception {


		Optional<UserEntity> useren = userRepo.findById(userId);
		if(useren.isPresent()) {
			return User.toModel(useren.get());
		}
		
		else {
			throw new Exception("NO Data Found");
		}


	}
	
	public Question getQuestion(Integer surveyId) throws Exception{
		Optional<QuestionEntity> questionEntity = questionRepo.findBySurveyId(surveyId);
		
		return null;
	}
	
	
		
	
	
}
