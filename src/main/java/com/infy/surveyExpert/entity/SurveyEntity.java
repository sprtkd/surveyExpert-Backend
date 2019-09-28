package com.infy.surveyExpert.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.infy.surveyExpert.model.Organizer;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.User;

@Entity
@Table(name="survey")
public class SurveyEntity {

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="organizerId", unique=true)
	private OrganizerEntity organizer;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer status;

	public OrganizerEntity getOrganizer() {
		return organizer;
	}

	public void setOrganizer(OrganizerEntity organizer) {
		this.organizer = organizer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public static Survey toModel(SurveyEntity s) {
		Survey sur=new Survey();
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
			o.setUser(u);
			
			
			
		}
		sur.setOrganizer(o);
		sur.setStatus(s.getStatus());
		sur.setStartDate(s.getStartDate());
		return sur;
	}
}

