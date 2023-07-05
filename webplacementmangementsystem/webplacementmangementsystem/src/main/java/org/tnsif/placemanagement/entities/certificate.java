package org.tnsif.placemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class certificate {
	@Id
	private int id;
	private int year;
	//college college;
	public certificate() {
		System.out.println("certificate");
	}
	public certificate(int id, int year, org.tnsif.placemanagement.entities.college college) {
		super();
		this.id = id;
		this.year = year;
		//this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//public college getCollege() {
		//return college;
//	}
	//public void setCollege(college college) {
		//this.college = college;
//	}
	@Override
	public String toString() {
		return "certificate [id=" + id + ", year=" + year + "]";
	}
	
	
	

}
