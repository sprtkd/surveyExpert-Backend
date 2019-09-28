package com.infy.surveyExpert.service;

import java.util.List;

import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.User;

public interface UserService {
	public List<Survey> getAllSurveys() throws Exception;
	public User getUserProfile(Integer userId) throws Exception;}
