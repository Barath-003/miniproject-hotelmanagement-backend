package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Flight")
public class flightentity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String departureCity;
	private String destinationCity;
	private String departureDate;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDepartureCity() {
		return departureCity;
	}



	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}


	public String getDepartureDate() {
		return departureDate;
	}



	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public flightentity(int id, String departureCity, String destinationCity, String departureDate) {
		super();
		this.id = id;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.departureDate = departureDate;
	}



	public flightentity() {
		super();
		
	}



	public String getDestinationCity() {
		return destinationCity;
	}



	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	
}