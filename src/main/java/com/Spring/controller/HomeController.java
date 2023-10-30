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

import com.Spring.entities.Contact;
import com.Spring.entities.Faculty;
import com.Spring.service.ContactService;
import com.Spring.service.FacultyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class HomeController {
	@Autowired
	private FacultyService facultyService;
	
	@Autowired(required=true)
	private ContactService contactService;
	
	@GetMapping("/faculties")
	public List<Faculty> getFacultyList(){
		return this.facultyService.getFacultyList();
	}
	@GetMapping("/faculties/{facultyId}")
	public Faculty getFacultyById(@PathVariable String facultyId) {
		return this.facultyService.getFacultyById(Long.parseLong(facultyId));
	}
	
	@PostMapping("/faculties")
	public ResponseEntity <HttpStatus> addFaculty(@RequestBody Faculty faculty) {		 
		try {
			Faculty obj=this.facultyService.addFaculty(faculty);
			System.out.println(obj+ "is Saved");
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/faculties")
	public ResponseEntity <HttpStatus> updateFaculty(@RequestBody Faculty faculty) {
		try {
			Faculty obj=this.facultyService.updateFaculty(faculty);
			System.out.println(obj+ "is updated");
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/faculties/{facultyId}")
	public ResponseEntity <HttpStatus> deleteFaculty1(@PathVariable String facultyId){
		try {
			 this.facultyService.deleteFaculty(Long.parseLong(facultyId));
			 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/contact")
	public ResponseEntity <HttpStatus> addContact(@RequestBody Contact contact) {		 
		try {
			Contact obj=this.contactService.addContact(contact);
			System.out.println(obj+ "is Saved");
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
