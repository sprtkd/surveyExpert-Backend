package com.infy.surveyExpert.model;

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
	
	
}
