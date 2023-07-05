package org.tnsif.placemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemanagement.entities.admin;
import org.tnsif.placemanagement.repostier.adminrepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class adminservice {
	@Autowired
	private adminrepository repo;
	
	//create
	public void create(admin admin )
	{
		repo.save(admin);
	}
	
	
	public admin retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
//retriev all record
	public List<admin> retrivalAll()
	{
		return repo.findAll();
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
