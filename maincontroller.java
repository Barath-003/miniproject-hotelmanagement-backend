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

import com.example.demo.entity.mainentity;
import com.example.demo.service.mainservice;



@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class maincontroller {

	@Autowired
	mainservice stuservice;
	
	@PostMapping("mpost")
	public mainentity addInfo(@RequestBody mainentity st) {
		return stuservice.saveDetails(st);
	}
	@GetMapping("mget")
	public List<mainentity> fetchDetails(){
		return stuservice.getDetails();
	}
	
	@PutMapping("mupdate")
	public mainentity updateInfo(@RequestBody mainentity st1) {
		return stuservice.updateDetails(st1);
	}
	
	@DeleteMapping("/mdelete/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuservice.deleteDetails(id);
		return "Deleted Details";
	}

}

