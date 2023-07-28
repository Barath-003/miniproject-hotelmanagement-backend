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

import com.example.demo.entity.paymententity;
import com.example.demo.service.paymentservice;


@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class paymentcontroller {

	@Autowired
	paymentservice stuservice;
	
	@PostMapping("/paypost")
	public paymententity addInfo(@RequestBody paymententity st) {
		return stuservice.saveDetails(st);
	}
	@GetMapping("payget")
	public List<paymententity> fetchDetails(){
		return stuservice.getDetails();
	}
	
	@PutMapping("payupdate")
	public paymententity updateInfo(@RequestBody paymententity st1) {
		return stuservice.updateDetails(st1);
	}
	
	@DeleteMapping("/paydelete/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuservice.deleteDetails(id);
		return "Deleted Details";
	}

}

