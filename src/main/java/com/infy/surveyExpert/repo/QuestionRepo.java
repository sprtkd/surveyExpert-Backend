package com.infy.surveyExpert.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.QuestionEntity;


public interface QuestionRepo extends JpaRepository<QuestionEntity, Integer>{
	List<QuestionEntity> findBySurveyId(Integer i);	
}
