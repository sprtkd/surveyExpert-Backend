package com.infy.surveyExpert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.DescriptiveAnswerableEntity;

public interface DescriptiveAnswerableRepo extends JpaRepository<DescriptiveAnswerableEntity,Integer>{
	

}
