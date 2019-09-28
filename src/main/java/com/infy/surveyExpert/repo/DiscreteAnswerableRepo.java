package com.infy.surveyExpert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.DiscreteAnswerableEntity;
import com.infy.surveyExpert.entity.QuestionEntity;

public interface DiscreteAnswerableRepo extends JpaRepository<DiscreteAnswerableEntity,Integer>  {
	DiscreteAnswerableEntity findByQuestion(QuestionEntity q);

}
