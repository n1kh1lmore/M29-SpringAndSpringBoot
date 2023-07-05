package org.tnsif.placemanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placemanagement.entities.student;
import org.tnsif.placemanagement.services.studentservice;

@RestController
public class stuudentcontroller {
	
	@Autowired
	private studentservice service;
	@PostMapping("/student")
	public void insert(@RequestBody student student)
	{
		service.create(student);
	}
	@DeleteMapping("/student/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	@GetMapping("/student")
	public List<student>retriveA()
	{
		return service.retrivalAll();
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<student> retrive (@PathVariable Integer id)
	{
		try {
		student student=service.retrieve(id);
		return new ResponseEntity<student>(student,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<student>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/student/{id}")
	public ResponseEntity<student>update (@RequestBody student student,@PathVariable Integer id)
	{
		try {
		student c=service.retrieve(id);
		service.create(student);
		return new  ResponseEntity<student> (HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<student>(HttpStatus.NOT_FOUND);
		}
	}
		
	
	
	

}
