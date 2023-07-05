package org.tnsif.placemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemanagement.entities.certificate;
import org.tnsif.placemanagement.repostier.certificaterepository;


import jakarta.transaction.Transactional;
@Service
@Transactional
public class certificateservice {
	
	@Autowired
	private certificaterepository repo;
	
	//create
	public void create (certificate  certificate )
	{
		repo.save(certificate);
	}
	
	
	public certificate retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
//retriev all record
	public List<certificate> retrivalAll()
	{
		return repo.findAll();
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
