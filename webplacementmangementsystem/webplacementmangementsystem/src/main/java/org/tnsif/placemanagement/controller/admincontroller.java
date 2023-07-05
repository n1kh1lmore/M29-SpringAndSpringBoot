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
import org.tnsif.placemanagement.entities.admin;
import org.tnsif.placemanagement.services.adminservice;


@RestController
public class admincontroller {

	@Autowired
	private adminservice service2;
	@PostMapping("/admin")
	public void insert(@RequestBody admin admin)
	{
		service2.create(admin);
	}
	@DeleteMapping("/admin/[id]")
	public void remove(@PathVariable Integer id)
	{
		service2.delete(id);
	}
	@GetMapping("/admin")
	public List<admin>retriveA()
	{
		return service2.retrivalAll();
	}
	
	public ResponseEntity<admin> retrive (@PathVariable Integer id)
	{
		try {
		admin admin=service2.retrieve(id);
		return new ResponseEntity<admin>(admin,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<admin>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/admin/{id}")
	public ResponseEntity<admin>update (@RequestBody admin admin,@PathVariable Integer id)
	{
		try {
		admin c=service2.retrieve(id);
		service2.create(admin);
		return new  ResponseEntity<admin> (HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<admin>(HttpStatus.NOT_FOUND);
		}
	}
}
