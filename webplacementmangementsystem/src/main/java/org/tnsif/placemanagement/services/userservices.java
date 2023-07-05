package org.tnsif.placemanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemanagement.entities.user;
import org.tnsif.placemanagement.repostier.userrepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class userservices {
	@Autowired
	private userrepository user1;
	
	public void create(user user)
	{
		user1.save(user);
	}
	
	public user retrieve(Integer id)
	{
		return user1.findById(id).get();
	}
//retriev all record
	public List<user> retrivalAll()
	{
		return user1.findAll();
	}
	
	public void delete(Integer id)
	{
		user1.deleteById(id);
	}
}
