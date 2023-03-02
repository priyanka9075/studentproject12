package com.Warstreet.Student.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student
{

	@Id
	private Long Id;
	
	private String name;
	
	private String role;
	
	private String description;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	}
	
	
	

