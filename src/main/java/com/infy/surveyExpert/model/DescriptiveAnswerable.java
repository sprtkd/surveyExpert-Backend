package com.infy.surveyExpert.model;

import com.infy.surveyExpert.entity.DescriptiveAnswerableEntity;
import com.infy.surveyExpert.entity.QuestionEntity;
import com.infy.surveyExpert.entity.SurveyEntity;

public class DescriptiveAnswerable {

	private Question question;
	private Integer dummy;
	private Integer mediaFileType;
	private String mediaFileLocation;
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Integer getDummy() {
		return dummy;
	}
	
	public void setDummy(Integer dummy) {
		this.dummy = dummy;
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
	public static DescriptiveAnswerableEntity toEntity(DescriptiveAnswerable descriptiveAnswerable) {
		DescriptiveAnswerableEntity descriptiveAnswerableEntity=new DescriptiveAnswerableEntity();
		descriptiveAnswerableEntity.setMediaFileLocation(descriptiveAnswerable.getMediaFileLocation());
		descriptiveAnswerableEntity.setMediaFileType(descriptiveAnswerable.getMediaFileType());
		QuestionEntity questionEntity=new QuestionEntity();
		questionEntity.setQuestion(descriptiveAnswerable.getQuestion().getQuestion());
		questionEntity.setQuestionType(descriptiveAnswerable.getQuestion().getQuestionType());
		SurveyEntity surveyEntity=new SurveyEntity();
		questionEntity.setSurvey(surveyEntity);
		descriptiveAnswerableEntity.setQuestion(questionEntity);
		return descriptiveAnswerableEntity;
	}
}
