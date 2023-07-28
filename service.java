package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.entity;
import com.example.demo.repository.repos;



@Service

public class service {
		@Autowired
		repos stRepo;
		
		public entity saveDetails(entity e) {
			return stRepo.save(e);
		}
		
		public List<entity> getDetails(){
			return stRepo.findAll();
		}
		
		public entity updateDetails(entity e1) {
			return stRepo.saveAndFlush(e1);
		}
		
		public void deleteDetails(int id) {
			stRepo.deleteById(id);
		}

	}

