package com.infy.surveyExpert.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.infy.surveyExpert.model.Organizer;
import com.infy.surveyExpert.model.Participant;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.SurveyAttempted;
import com.infy.surveyExpert.model.User;

@Entity
@Table(name="survey_attempted")
public class SurveyAttemptedEntity {

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="organizer_id", unique=true)
	private OrganizerEntity organizer;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="survey_id", unique=true)
	private SurveyEntity survey;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="participant_id", unique=true)
	private ParticipantEntity participant;
	private LocalDateTime attemptedTimestamp;
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
	
	public static SurveyAttempted toModel(SurveyAttemptedEntity s) {
		SurveyAttempted sr=new SurveyAttempted();
		sr.setAttemptedTimestamp(s.getAttemptedTimestamp());
		sr.setId(s.getId());
		Organizer o=new Organizer();
		if(s.getOrganizer()!=null) {
			OrganizerEntity org=s.getOrganizer();
			
			o.setDummy(org.getDummy());
		User u=new User();
		u.setEmailId(org.getUser().getEmailId());
		u.setName(org.getUser().getName());
		u.setPassword(org.getUser().getPassword());
		u.setRole(org.getUser().getRole());
		u.setUserId(org.getUser().getUserId());
		o.setUser(u);
		}
		sr.setOrganizerId(o);
		Participant p=new Participant();
		if(s.getParticipant()!=null)
		{
			p.setDummy(s.getParticipant().getDummy());
			User u=new User();
			UserEntity org=s.getParticipant().getUser();
			if(s.getParticipant().getUser()!=null) {
				
				u.setEmailId(org.getEmailId());
				u.setName(org.getName());
				u.setPassword(org.getPassword());
				u.setRole(org.getRole());
				u.setUserId(org.getUserId());
				p.setUser(u);
			}
			
			
		}
		if(s.getSurvey()!=null)
		{
			SurveyEntity s1=s.getSurvey();
			Survey s2=new Survey();
			s2.setEndDate(s1.getEndDate());
			s2.setId(s1.getId());
			s2.setStartDate(s1.getStartDate());
			s2.setStatus(s1.getStatus());
			if(s1.getOrganizer()!=null) {
				Organizer o1=new Organizer();
				o1.setDummy(s1.getOrganizer().getDummy());
				o1.setUser(null);
				s2.setOrganizer(o1);
			}
		}
		
		return sr;
	}
}
