package com.infy.surveyExpert.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.SurveyEntity;

public interface SurveyRep extends JpaRepository<SurveyEntity,Integer> {
	int c=1;
	List<SurveyEntity> findAllById(Integer c);
	
	
}