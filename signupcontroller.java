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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.signupentity;
import com.example.demo.service.signupservice;


@CrossOrigin
@RestController
public class signupcontroller {

	@Autowired
	signupservice stuservice;
	
	@PostMapping("signpost")
	public signupentity addInfo(@RequestBody signupentity st) {
		return stuservice.saveDetails(st);
	}
	@GetMapping("signget")
	public List<signupentity> fetchDetails(){
		return stuservice.getDetails();
	}
	
	@PutMapping("signupdate")
	public signupentity updateInfo(@RequestBody signupentity st1) {
		return stuservice.updateDetails(st1);
	}
	
	@DeleteMapping("/signdelete/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuservice.deleteDetails(id);
		return "Deleted Details";
	}

}

