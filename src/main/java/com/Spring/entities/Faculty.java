package com.Spring.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String qualification;
	private String designation;
	private int exp;	
	private String dept_code;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Department department;
	
	
	public Faculty() {
		super();
	}

	public Faculty(long id, String name, String qualification, String designation, int exp, String dept_code,
			Department department) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.designation = designation;
		this.exp = exp;
		this.dept_code = dept_code;
		this.department = department;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDept_code() {
		return dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}	
}
