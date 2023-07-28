package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.flightentity;
import com.example.demo.service.flightservice;



@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class flightcontroller {


	@Autowired
	flightservice stuservice;
	
	@PostMapping("p")
	public flightentity addInfo(@RequestBody flightentity st) {
		return stuservice.saveDetails(st);
	}
	@GetMapping("g")
	public List<flightentity> fetchDetails(){
		return stuservice.getDetails();
	}
	
	@PutMapping("u")
	public flightentity updateInfo(@RequestBody flightentity st1) {
		return stuservice.updateDetails(st1);
	}
	
	@DeleteMapping("/d/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuservice.deleteDetails(id);
		return "Deleted Details";
	}

}

