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
import org.tnsif.placemanagement.entities.placement;

import org.tnsif.placemanagement.services.placementservices;

@RestController
public class placementcontroller {
	@Autowired
	private placementservices service3;
	@PostMapping("/placement")
	public void insert(@RequestBody placement placement)
	{
		service3.create(placement);
	}
	@DeleteMapping("/placement/[id]")
	public void remove(@PathVariable Integer id)
	{
		service3.delete(id);
	}
	@GetMapping("/placement")
	public List<placement>retriveA()
	{
		return service3.retrivalAll();
	}
	
	public ResponseEntity<placement> retrive (@PathVariable Integer id)
	{
		try {
		placement placement=service3.retrieve(id);
		return new ResponseEntity<placement>(placement,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<placement>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/placement/{id}")
	public ResponseEntity<placement>update (@RequestBody placement placement,@PathVariable Integer id)
	{
		try {
		placement c=service3.retrieve(id);
		service3.create(placement);
		return new  ResponseEntity<placement> (HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<placement>(HttpStatus.NOT_FOUND);
		}
	}

}
