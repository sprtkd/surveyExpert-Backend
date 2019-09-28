package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="discrete_answers")
public class DiscreteAnswerEntity {

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="organizer_id", unique=true)
	private OrganizerEntity organizer;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="survey_id", unique=true)
	private SurveyEntity survey;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="participant_id", unique=true)
	private ParticipantEntity participant;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="question_id", unique=true)
	private DiscreteAnswerableEntity discreteAnswerable1;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="option_id", unique=true)
	private DiscreteAnswerableEntity discreteAnswerable2;
	@Id
	private Integer id;
	
	public OrganizerEntity getOrganizer() {
		return organizer;
	}
	
	public void setOrganizer(OrganizerEntity organizer) {
		this.organizer = organizer;
	}
	
	public SurveyEntity getSurvey() {
		return survey;
	}
	
	public void setSurvey(SurveyEntity survey) {
		this.survey = survey;
	}
	
	public ParticipantEntity getParticipant() {
		return participant;
	}
	
	public void setParticipant(ParticipantEntity participant) {
		this.participant = participant;
	}
	
	public DiscreteAnswerableEntity getDiscreteAnswerable1() {
		return discreteAnswerable1;
	}
	
	public void setDiscreteAnswerable1(DiscreteAnswerableEntity discreteAnswerable1) {
		this.discreteAnswerable1 = discreteAnswerable1;
	}
	
	public DiscreteAnswerableEntity getDiscreteAnswerable2() {
		return discreteAnswerable2;
	}
	
	public void setDiscreteAnswerable2(DiscreteAnswerableEntity discreteAnswerable2) {
		this.discreteAnswerable2 = discreteAnswerable2;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
