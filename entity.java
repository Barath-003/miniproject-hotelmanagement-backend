package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="loginpage")
public class entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String email;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public entity(String email,String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public entity() {
		super();
		
	}
	
	

}

