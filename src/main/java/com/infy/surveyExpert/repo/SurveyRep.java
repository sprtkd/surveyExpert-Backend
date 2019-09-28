package com.infy.surveyExpert.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.SurveyEntity;

public interface SurveyRep extends JpaRepository<SurveyEntity,Integer> {
	List<SurveyEntity> findAll();
	
	Optional<SurveyEntity> findById(Integer surveyId);
}