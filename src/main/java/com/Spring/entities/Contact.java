package com.Spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;
	private long phoneNo;
	private String subject;
	private String message;
	public Contact() {
		super();		
	}
	public Contact(long id, String name, String email, long phoneNo, String subject, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.subject = subject;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", subject="
				+ subject + ", message=" + message + "]";
	}	
}
