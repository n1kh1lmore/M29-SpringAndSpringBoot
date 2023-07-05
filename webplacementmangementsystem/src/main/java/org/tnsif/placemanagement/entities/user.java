package org.tnsif.placemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
	@Id
	private long id;
	private String  name1;
	private String type;
	private String password;
	
	public user() {
		
		System.out.println("user api ");
	}
	public user(long id, String name1, String type, String password) {
		super();
		this.id = id;
		this.name1 = name1;
		this.type = type;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name1=" + name1 + ", type=" + type + ", password=" + password + "]";
	}

}
