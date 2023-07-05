package org.tnsif.placemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class placement {
	@Id
	private Integer id;
	private String name;
	private String qualification;
	private int date;
	private int year;
	public placement() {
		
	}
	public placement(Integer id, String name, String qualification, int date, int year) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.date = date;
		this.year = year;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "placement [id=" + id + ", name=" + name + ", qualification=" + qualification + ", date=" + date
				+ ", year=" + year + "]";
	}
	
	
	
	
}
