package com.infy.surveyExpert.service;


import java.util.List;

import com.infy.surveyExpert.model.DescriptiveAnswerable;
import com.infy.surveyExpert.model.DiscreteAnswerable;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.SurveyAttempted;
import com.infy.surveyExpert.model.User;

public interface UserService {

	public List<Survey> getAllSurveys() throws Exception;
	public User getUserProfile(Integer userId) throws Exception;
	
	public List<SurveyAttempted> getAllAttemptedSurveyByUser(Integer p)throws Exception;
	public String createSurveyForDesciptive(List<DiscreteAnswerable> discreteAnswerables);

	public String createSurveyForDescriptive(List<DescriptiveAnswerable> descriptiveAnswerables);
}


