package com.example.postgresdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "name")
	private String u_name;
	
	@Column(name= "contact")
	private String contact;
	
	public Users() {
		super();
	}
	public Users(String u_name, String contact) {
		super();
		this.u_name = u_name;
		this.contact = contact;
	}
	public long getId() {
		return id;
	}
	public String getU_name() {
		return u_name;
	}
	public String getContact() {
		return contact;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
