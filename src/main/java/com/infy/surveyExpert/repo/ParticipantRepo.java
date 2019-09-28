package com.infy.surveyExpert.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.ParticipantEntity;
import com.infy.surveyExpert.entity.SurveyEntity;
import com.infy.surveyExpert.entity.UserEntity;

public interface ParticipantRepo extends JpaRepository<ParticipantEntity,Integer> {
	ParticipantEntity findByUser(UserEntity p);

}
