package com.infy.surveyExpert.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="participant")
public class ParticipantEntity {

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id", unique=true)
	private UserEntity user;
	@Id
	private Integer dummy;
	
	public UserEntity getUser() {
		return user;
	}
	
	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	public Integer getDummy() {
		return dummy;
	}
	
	public void setDummy(Integer dummy) {
		this.dummy = dummy;
	}
}
