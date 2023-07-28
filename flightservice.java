package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.flightentity;
import com.example.demo.repository.flightrepos;
@Service

public class flightservice {

		@Autowired
		flightrepos stRepo;
		
		public flightentity saveDetails(flightentity e) {
			return stRepo.save(e);
		}
		
		public List<flightentity> getDetails(){
			return stRepo.findAll();
		}
		
		public flightentity updateDetails(flightentity e1) {
			return stRepo.saveAndFlush(e1);
		}
		
		public void deleteDetails(int id) {
			stRepo.deleteById(id);
		}

	}

