package com.infy.surveyExpert.service;


import com.infy.surveyExpert.model.Question;
import java.util.List;

import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.User;

public interface UserService {

	
	public User getUserProfile(Integer userId) throws Exception;
	
	public List<Question> getAllQuestion(Survey survey) throws Exception;

	public List<Survey> getAllSurveys() throws Exception;
	
}

