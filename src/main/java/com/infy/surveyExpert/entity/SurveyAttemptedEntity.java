package com.infy.surveyExpert.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="survey_attempted")
public class SurveyAttemptedEntity {

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="organizer_id", unique=true)
	private OrganizerEntity organizer;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="survey_id", unique=true)
	private SurveyEntity survey;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="participant_id", unique=true)
	private ParticipantEntity participant;
	private LocalDateTime attemptedTimestamp;
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
	
	public LocalDateTime getAttemptedTimestamp() {
		return attemptedTimestamp;
	}
	
	public void setAttemptedTimestamp(LocalDateTime attemptedTimestamp) {
		this.attemptedTimestamp = attemptedTimestamp;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
