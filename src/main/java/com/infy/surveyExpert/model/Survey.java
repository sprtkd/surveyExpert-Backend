package com.infy.surveyExpert.model;

import java.time.LocalDate;

public class Survey {

	private Organizer organizer;
	private Integer id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer status;
	
	public Organizer getOrganizer() {
		return organizer;
	}
	
	public void setOrganizer(Organizer organizer) {
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
