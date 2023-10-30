package com.Spring.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.Spring.entities.Department;

public interface DepartmentService {
	public List<Department> getDepartmentList();
	
	public Department getDepartmentById(long id);
	
	public Department addDepartment(@RequestBody Department department);
	
	public Department updateDepartment(@RequestBody Department department);

	public void deleteDepartment(long departmentId);
	
	public Department findByCode(String code);

}
