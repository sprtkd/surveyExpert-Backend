package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="descriptive_answerable")
public class DescriptiveAnswerableEntity {

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="question_id")
	private QuestionEntity question;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dummy;
	private Integer mediaFileType;
	private String mediaFileLocation;
	
	public QuestionEntity getQuestion() {
		return question;
	}
	
	public void setQuestion(QuestionEntity question) {
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
