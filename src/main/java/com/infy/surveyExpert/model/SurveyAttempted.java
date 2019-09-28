package com.infy.surveyExpert.model;

import java.time.LocalDateTime;

public class SurveyAttempted {

	private Integer organizerId;
	private Integer surveyId;
	private Integer participantId;
	private LocalDateTime attemptedTimestamp;
	private Integer id;
	
	public Integer getOrganizerId() {
		return organizerId;
	}
	
	public void setOrganizerId(Integer organizerId) {
		this.organizerId = organizerId;
	}
	
	public Integer getSurveyId() {
		return surveyId;
	}
	
	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}
	
	public Integer getParticipantId() {
		return participantId;
	}
	
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
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
