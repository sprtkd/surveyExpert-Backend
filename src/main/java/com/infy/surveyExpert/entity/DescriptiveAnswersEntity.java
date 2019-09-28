package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class DescriptiveAnswersEntity {

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
	private DescriptiveAnswerableEntity descriptiveAnswerable;
	private String answerText;
	private Integer mediaFileType;
	private String mediaFileLocation;
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
	
	public DescriptiveAnswerableEntity getDescriptiveAnswerable() {
		return descriptiveAnswerable;
	}
	
	public void setDescriptiveAnswerable(DescriptiveAnswerableEntity descriptiveAnswerable) {
		this.descriptiveAnswerable = descriptiveAnswerable;
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
