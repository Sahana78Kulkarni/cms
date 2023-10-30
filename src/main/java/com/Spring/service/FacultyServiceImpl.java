package com.Spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.entities.Department;
import com.Spring.entities.Faculty;
import com.Spring.Dao.CMSDao;
import com.Spring.Dao.DepartmentDao;

@Service
public class FacultyServiceImpl implements FacultyService {
	
	@Autowired
	private CMSDao cmsDao;
	
	@Autowired
	private DepartmentDao deptDao;
	
	
	@Override
	public List<Faculty> getFacultyList() {	
		return cmsDao.findAll();
	}

	@Override
	public Faculty getFacultyById(long id) {
		Faculty faculty=cmsDao.findById(id).get();
		return faculty;
	}

	@Override
	public Faculty addFaculty(Faculty faculty) {
		String code=faculty.getDept_code();
		Department dept=this.deptDao.findByCode(code);
		faculty.setDepartment(dept);
		this.cmsDao.save(faculty);
		System.out.println("faculty obj: "+faculty);
		return faculty;
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		cmsDao.save(faculty);
		return faculty;
	}

	@Override
	public void deleteFaculty(long facultyId) {
		Faculty entity=cmsDao.findById(facultyId).get();		
		cmsDao.delete(entity);
	}
}
