package com.infy.surveyExpert.model;

public class DescriptiveAnswers {

	private Integer organizerId;
	private Integer surveyId;
	private Integer participantId;
	private Integer questionId;
	private String answerText;
	private Integer mediaFileType;
	private String mediaFileLocation;
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
	
	public Integer getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	public String getAnswerText() {
		return answerText;
	}
	
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	
	public Integer getMediaFileType() {
		return mediaFileType;
	}
	
	public void setMediaFileType(Integer mediaFileType) {
		this.mediaFileType = mediaFileType;
	}
	
	public String getMediaFileLocation() {
		return mediaFileLocation;
	}
	
	public void setMediaFileLocation(String mediaFileLocation) {
		this.mediaFileLocation = mediaFileLocation;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
