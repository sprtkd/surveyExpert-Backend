package com.infy.surveyExpert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.QuestionEntity;


public interface QuestionRepo extends JpaRepository<QuestionEntity, Integer>{
	
}
