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
import org.tnsif.placemanagement.entities.user;
import org.tnsif.placemanagement.services.collegeservice;
import org.tnsif.placemanagement.services.userservices;

@RestController
public class usercontroller {
	@Autowired
	private userservices service1;
	@PostMapping("/user")
	public void insert(@RequestBody user user1)
	{
		service1.create(user1);
	}
	@DeleteMapping("/user/[id]")
	public void remove(@PathVariable Integer id)
	{
		service1.delete(id);
	}
	@GetMapping("/user")
	public List<user>retriveA()
	{
		return service1.retrivalAll();
	}
	
	public ResponseEntity<user> retrive (@PathVariable Integer id)
	{
		try {
		user user1=service1.retrieve(id);
		return new ResponseEntity<user>(user1,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<user>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/user/{id}")
	public ResponseEntity<user> update (@RequestBody college college,@PathVariable Integer id)
	{
		try {
		user c=service1.retrieve(id);
		service1.create(c);
		return new  ResponseEntity<user> (HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<user>(HttpStatus.NOT_FOUND);
		}
	}
	
}
