package com.Spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.entities.Department;

public interface DepartmentDao extends JpaRepository<Department,Long>{
	public Department findByCode(String code);
}
