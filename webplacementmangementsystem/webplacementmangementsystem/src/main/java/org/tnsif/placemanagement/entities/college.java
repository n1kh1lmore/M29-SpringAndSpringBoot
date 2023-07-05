package org.tnsif.placemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class college {
	@Id
	
	private Integer id;
	private String collegename;
	private String location;
	
	public college()
	{
		System.out.println("spring boot api");
	}

	public college(Integer id, String collegename, String location) {
		super();
		this.id = id;
		this.collegename = collegename;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "college [id=" + id + ", collegename=" + collegename + ", location=" + location + "]";
	}
	

}
