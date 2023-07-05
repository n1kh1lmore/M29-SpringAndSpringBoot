package org.tnsif.placemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemanagement.entities.college;
import org.tnsif.placemanagement.repostier.collegeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class collegeservice {
	@Autowired
	private collegeRepository repo;
	
	//create
	public void create(college college )
	{
		repo.save(college);
	}
	
	
	public college retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
//retriev all record
	public List<college> retrivalAll()
	{
		return repo.findAll();
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
