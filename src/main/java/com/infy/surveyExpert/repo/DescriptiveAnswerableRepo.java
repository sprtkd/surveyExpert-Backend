package com.infy.surveyExpert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.DescriptiveAnswerableEntity;
import com.infy.surveyExpert.entity.QuestionEntity;

	




public interface DescriptiveAnswerableRepo  extends JpaRepository<DescriptiveAnswerableEntity,Integer>  {
	DescriptiveAnswerableEntity findByQuestion(QuestionEntity q);

}
