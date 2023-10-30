package com.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Dao.DepartmentDao;
import com.Spring.entities.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao deptDao;
	
	@Override
	public List<Department> getDepartmentList() {
		List<Department> list=this.deptDao.findAll();
		return list;
	}

	@Override
	public Department getDepartmentById(long id) {
		Department dept=this.deptDao.findById(id).get();
		return dept;
	}

	@Override
	public Department addDepartment(Department department) {		
		this.deptDao.save(department);
		return department;
	}

	@Override
	public Department updateDepartment(Department department) {
		long id=department.getId();
		Department dept=this.deptDao.findById(id).get();
		this.deptDao.save(dept);
		return dept;
	}

	@Override
	public void deleteDepartment(long departmentId) {
		Department dept=this.deptDao.findById(departmentId).get();
		this.deptDao.delete(dept);
	}
	
	@Override
	public Department findByCode(String code) {
		Department dept=this.deptDao.findByCode(code);
		System.out.println("Department obj: "+dept);
		return dept;
	}


}
