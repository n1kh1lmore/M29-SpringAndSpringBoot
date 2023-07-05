package org.tnsif.placemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class student {
	@Id
	private long id;
	private String name;
	//college college;
	private long roll;
	private  String qualification ;
	private String course;
	private int year;
	private long hallticketno;
	//certificate certificate;
	public student() {
			}
	public student(long id, String name, long roll, String qualification, String course, int year, long hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallticketno = hallticketno;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(long hallticketno) {
		this.hallticketno = hallticketno;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + "]";
	}
	
	

	
}
