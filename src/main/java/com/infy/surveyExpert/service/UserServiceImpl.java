package com.infy.surveyExpert.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.model.Question;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.repo.QuestionRepo;
import com.infy.surveyExpert.repo.UserRepo;
import com.infy.surveyExpert.entity.QuestionEntity;
import com.infy.surveyExpert.repo.SurveyRep;
import com.infy.surveyExpert.repo.UserRepo;
import com.infy.surveyExpert.entity.SurveyEntity;
import com.infy.surveyExpert.entity.UserEntity;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private QuestionRepo questionRepo;
	
	@Autowired
	private SurveyRep surveyRep;

	public User getUserProfile(Integer userId) throws Exception {


		Optional<UserEntity> useren = userRepo.findById(userId);
		if(useren.isPresent()) {
			return User.toModel(useren.get());
		}
		
		else {
			throw new Exception("NO Data Found");
		}


	}
	
	public List<Question> getAllQuestion(Survey survey) throws Exception{
		
		List<QuestionEntity> questionEntity = questionRepo.findBySurvey(survey);
		List<Question> qlist = new ArrayList<Question>();
		for(QuestionEntity q: questionEntity)
		{
			qlist.add(QuestionEntity.toModel(q));
		}
		return qlist;
	}
	
	
	public List<Survey> getAllSurveys()throws Exception{
		List<SurveyEntity>li=surveyRep.findAll();
		List<Survey> li1=new ArrayList<Survey>();
		for(SurveyEntity s:li) {
			li1.add(SurveyEntity.toModel(s));
		}
		return li1;
		
	}
}
