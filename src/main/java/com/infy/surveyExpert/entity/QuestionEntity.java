package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.infy.surveyExpert.model.Organizer;
import com.infy.surveyExpert.model.Question;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.User;

@Entity
@Table(name="question")
public class QuestionEntity {

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="survey_id")
	private SurveyEntity survey;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String questionType;
	private String question;
	
	public SurveyEntity getSurvey() {
		return survey;
	}

	public void setSurvey(SurveyEntity survey) {
		this.survey = survey;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getQuestionType() {
		return questionType;
	}
	
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public static Question toModel(QuestionEntity q) {
		Question que=new Question();
		que.setQuestion(q.getQuestion());
		que.setQuestionType(q.getQuestionType());
		que.setId(q.getId());
		SurveyEntity s= q.getSurvey();
		Survey sur = new Survey();
			sur.setEndDate(s.getEndDate());
			sur.setId(s.getId());
			Organizer o=new Organizer();
			if(s.getOrganizer()!=null) {
				OrganizerEntity or=s.getOrganizer();
				
				o.setDummy(or.getDummy());
				User  u=new User();
				if(or.getUser()!=null) {
					
					u.setEmailId(or.getUser().getEmailId());
					u.setName(or.getUser().getName());
					u.setUserId(or.getUser().getUserId());
					u.setPassword(or.getUser().getPassword());
					u.setRole(or.getUser().getRole());
				}
			}
			sur.setOrganizer(o);
			sur.setStatus(s.getStatus());
			sur.setStartDate(s.getStartDate());
			que.setSurvey(sur);
			return que;
		}
	}