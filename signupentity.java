package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Signuppage")
public class signupentity {
	
	private String Firstname;
	private String Lastname;
	@Id
	private String Email;
	private long no;
	private String Password;
	

	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public signupentity(String firstname, String lastname, String email, long no, String password) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.Email = email;
		this.no = no;
		this.Password = password;
	}
	public signupentity() {
		
		
	}
	
}