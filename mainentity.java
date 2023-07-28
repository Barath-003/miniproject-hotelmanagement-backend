package com.example.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name="mainpage")
public class mainentity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String location;
	public String getLocation() {
		return location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public mainentity(int id,String location) {
		super();
		this.id = id;
		this.location = location;
	}

	public mainentity() {
		super();
		
	}
	
	

}

