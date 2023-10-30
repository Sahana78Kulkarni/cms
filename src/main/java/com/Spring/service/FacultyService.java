package com.Spring.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.Spring.entities.Faculty;

public interface FacultyService {
	public List<Faculty> getFacultyList();
	
	public Faculty getFacultyById(long id);
	
	public Faculty addFaculty(@RequestBody Faculty faculty);
	
	public Faculty updateFaculty(@RequestBody Faculty faculty);

	public void deleteFaculty(long facultyId);
}
