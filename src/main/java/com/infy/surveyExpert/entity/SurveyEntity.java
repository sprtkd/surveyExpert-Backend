package com.infy.surveyExpert.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="survey")
public class SurveyEntity {

	@OneToOne
	@JoinColumn(name="organizerId", unique=true)
	private OrganizerEntity organizer;
	
	@Id
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
}

