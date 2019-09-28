package com.infy.surveyExpert.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.QuestionEntity;
import com.infy.surveyExpert.model.Survey;


public interface QuestionRepo extends JpaRepository<QuestionEntity, Survey>{
	List<QuestionEntity> findBySurvey(Survey s);	
}
