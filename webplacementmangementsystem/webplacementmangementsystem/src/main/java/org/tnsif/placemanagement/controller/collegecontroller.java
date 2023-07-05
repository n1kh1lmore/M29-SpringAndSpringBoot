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
import org.tnsif.placemanagement.entities.college;
import org.tnsif.placemanagement.services.collegeservice;

@RestController
public class collegecontroller {
	@Autowired
	private collegeservice service;
	@PostMapping("/college")
	public void insert(@RequestBody college college)
	{
		service.create(college);
	}
	@DeleteMapping("/college/[id]")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	@GetMapping("/college")
	public List<college>retriveA()
	{
		return service.retrivalAll();
	}
	
	public ResponseEntity<college> retrive (@PathVariable Integer id)
	{
		try {
		college college=service.retrieve(id);
		return new ResponseEntity<college>(college,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<college>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/college/{id}")
	public ResponseEntity<college>update (@RequestBody college college,@PathVariable Integer id)
	{
		try {
		college c=service.retrieve(id);
		service.create(college);
		return new  ResponseEntity<college> (HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<college>(HttpStatus.NOT_FOUND);
		}
	}
		
	
	
	
	
	

}
