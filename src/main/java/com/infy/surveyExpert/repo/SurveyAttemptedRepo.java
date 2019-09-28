package com.infy.surveyExpert.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.surveyExpert.entity.ParticipantEntity;
import com.infy.surveyExpert.entity.SurveyAttemptedEntity;

public interface SurveyAttemptedRepo  extends JpaRepository<SurveyAttemptedEntity,Integer>{
List<SurveyAttemptedEntity> findAllByParticipant(ParticipantEntity p);
}
