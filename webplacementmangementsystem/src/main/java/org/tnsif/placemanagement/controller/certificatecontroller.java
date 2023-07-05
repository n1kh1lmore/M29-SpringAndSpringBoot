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
import org.tnsif.placemanagement.entities.certificate;
import org.tnsif.placemanagement.services.certificateservice;


@RestController
public class certificatecontroller {
	@Autowired
	private certificateservice service1;
	@PostMapping("/certificate")
	public void insert(@RequestBody certificate certificate)
	{
		service1.create(certificate);
	}
	@DeleteMapping("/certificate/[id]")
	public void remove(@PathVariable Integer id)
	{
		service1.delete(id);
	}
	@GetMapping("/certificate")
	public List<certificate>retriveA()
	{
		return service1.retrivalAll();
	}
	
	public ResponseEntity<certificate> retrive (@PathVariable Integer id)
	{
		try {
		certificate certificate=service1.retrieve(id);
		return new ResponseEntity<certificate>(certificate,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<certificate>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/certificate/{id}")
	public ResponseEntity<certificate>update (@RequestBody certificate certificate,@PathVariable Integer id)
	{
		try {
			certificate c=service1.retrieve(id);
		service1.create(certificate);
		return new  ResponseEntity<certificate> (HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<certificate>(HttpStatus.NOT_FOUND);
		}
	}

}
