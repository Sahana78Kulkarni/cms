package com.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.entities.Department;
import com.Spring.service.DepartmentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/departments/")
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/")
	public List<Department> getDepartmentList(){
		return this.deptService.getDepartmentList();
	}
	
	@GetMapping("/{deptId}")
	public Department getDepartmentById(@PathVariable String deptId) {
		return this.deptService.getDepartmentById(Long.parseLong(deptId));
	}
	@PostMapping("/")
	public ResponseEntity <HttpStatus> addDepartment(@RequestBody Department department) {		 
		try {
			Department obj=this.deptService.addDepartment(department);
			System.out.println(obj+ "is Saved");
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/")
	public ResponseEntity <HttpStatus> updateDepartment(@RequestBody Department department) {
		try {
			Department obj=this.deptService.updateDepartment(department);
			System.out.println(obj+ "is updated");
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{deptId}")
	public ResponseEntity <HttpStatus> deleteFaculty(@PathVariable String deptId){
		try {
			 this.deptService.deleteDepartment(Long.parseLong(deptId));
			 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
