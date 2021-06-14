package com.example.postgresdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tracking")
public class Track {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "user")
	private String user;
	
	@Column(name= "day")
	private int days;
	
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Track(String user, int days) {
		super();
		this.user = user;
		this.days = days;
	}
	public long getId() {
		return id;
	}
	public String getUser() {
		return user;
	}
	public int getDays() {
		return days;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
}
