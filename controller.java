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

import com.example.demo.entity.entity;
import com.example.demo.service.service;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")

public class controller {

	@Autowired
	service stuservice;
	
	@PostMapping("post")
	public entity addInfo(@RequestBody entity st) {
		return stuservice.saveDetails(st);
	}
	@GetMapping("get")
	public List<entity> fetchDetails(){
		return stuservice.getDetails();
	}
	
	@PutMapping("update")
	public entity updateInfo(@RequestBody entity st1) {
		return stuservice.updateDetails(st1);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuservice.deleteDetails(id);
		return "Deleted Details";
	}

}

