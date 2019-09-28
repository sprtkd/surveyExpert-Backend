package com.infy.surveyExpert.service;


import java.util.List;

import com.infy.surveyExpert.model.Question;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.SurveyAttempted;
import com.infy.surveyExpert.model.User;

public interface UserService {

	public List<Survey> getAllSurveys() throws Exception;
	public User getUserProfile(Integer userId) throws Exception;
	
	public List<SurveyAttempted> getAllAttemptedSurveyByUser(Integer p)throws Exception;
	public List<Question> getAllQuestionsInSurvey(Integer surveyId) throws Exception;
}


