package org.tnsif.placemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemanagement.entities.college;
import org.tnsif.placemanagement.entities.placement;
import org.tnsif.placemanagement.repostier.collegeRepository;
import org.tnsif.placemanagement.repostier.placementrepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class placementservices {

	@Autowired
	private placementrepository repo2;
	
	//create
	public void create(placement placement )
	{
		repo2.save(placement);
	}
	
	
	public placement retrieve(Integer id)
	{
		return repo2.findById(id).get();
	}
//retriev all record
	public List<placement> retrivalAll()
	{
		return repo2.findAll();
	}
	
	public void delete(Integer id)
	{
		repo2.deleteById(id);
	}
}
