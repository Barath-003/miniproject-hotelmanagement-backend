package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.signupentity;
import com.example.demo.repository.signuprepos;


@Service
public class signupservice {
		@Autowired
		signuprepos stRepo;
		
		public signupentity saveDetails(signupentity e) {
			return stRepo.save(e);
		}
		
		public List<signupentity> getDetails(){
			return stRepo.findAll();
		}
		
		public signupentity updateDetails(signupentity e1) {
			return stRepo.saveAndFlush(e1);
		}
		
		public void deleteDetails(int id) {
			stRepo.deleteById(id);
		}

	}