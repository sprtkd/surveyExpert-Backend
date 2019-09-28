package com.infy.surveyExpert.model;

import java.time.LocalDateTime;

public class SurveyAttempted {

	private Organizer organizer;
	private Survey survey;
	private Participant participant;
	private LocalDateTime attemptedTimestamp;
	private Integer id;
	
	public Organizer getOrganizerId() {
		return organizer;
	}
	
	public void setOrganizerId(Organizer organizerId) {
		this.organizer = organizerId;
	}
	
	public Survey getSurveyId() {
		return survey;
	}
	
	public void setSurveyId(Survey surveyId) {
		this.survey = surveyId;
	}
	
	public Participant getParticipantId() {
		return participant;
	}
	
	public void setParticipantId(Participant participantId) {
		this.participant = participantId;
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
