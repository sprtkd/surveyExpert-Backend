package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="discrete_answerable")
public class DiscreteAnswerableEntity {

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="question_id")
	private QuestionEntity question;
	@Id
	private Integer id;
	private String optionText;
	
	public QuestionEntity getQuestion() {
		return question;
	}
	
	public void setQuestion(QuestionEntity question) {
		this.question = question;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getOptionText() {
		return optionText;
	}
	
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	
}
