package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.infy.surveyExpert.model.DiscreteAnswerable;
import com.infy.surveyExpert.model.Organizer;
import com.infy.surveyExpert.model.Question;
import com.infy.surveyExpert.model.Survey;

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
	
	public static DiscreteAnswerable toModel(DiscreteAnswerableEntity u) {
		DiscreteAnswerable ds=new DiscreteAnswerable();
		ds.setId(u.getId());
		ds.setOptionText(u.getOptionText());
		Question q=new Question();
		if(u.getQuestion()!=null) {
			q.setId(u.getQuestion().getId());
			q.setQuestion(u.getQuestion().getQuestion());
			q.setQuestionType(u.getQuestion().getQuestionType());
			Survey s=new Survey();
			if(u.getQuestion().getSurvey()!=null) {
				s.setEndDate(u.getQuestion().getSurvey().getEndDate());
				s.setId(u.getQuestion().getSurvey().getId());
				s.setStartDate(u.getQuestion().getSurvey().getStartDate());
				s.setStatus(u.getQuestion().getSurvey().getStatus());
				Organizer org=new Organizer();
				if(u.getQuestion().getSurvey().getOrganizer()!=null) {
					org.setDummy(u.getQuestion().getSurvey().getOrganizer().getDummy());
					org.setUser(null);
				}
				s.setOrganizer(org);
			q.setSurvey(s);	
			
			}
		}
		ds.setQuestion(q);
		return ds;
	}
	
}
