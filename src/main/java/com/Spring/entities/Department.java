package com.Spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	private long id;
	private String name;
	private String code;
	
	public Department() {
		super();
	}

	public Department(long id, String name, String code, Faculty faculty) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", code=" + code + "]";
	}	
}
