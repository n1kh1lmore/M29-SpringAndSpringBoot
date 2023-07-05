package org.tnsif.placemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemanagement.entities.student;
import org.tnsif.placemanagement.repostier.studentrepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class studentservice {

	@Autowired
	private studentrepository repo4;
	
	//create
	public void create(student student )
	{
		repo4.save(student);
	}
	
	
	public student retrieve(Integer id)
	{
		return repo4.findById(id).get();
	}
//retriev all record
	public List<student> retrivalAll()
	{
		return repo4.findAll();
	}
	
	public void delete(Integer id)
	{
		repo4.deleteById(id);
	}
}


