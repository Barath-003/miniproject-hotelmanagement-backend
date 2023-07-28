package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.mainentity;
import com.example.demo.repository.mainrepos;



@Service

public class mainservice {

		@Autowired
		mainrepos stRepo;
		
		public mainentity saveDetails(mainentity e) {
			return stRepo.save(e);
		}
		
		public List<mainentity> getDetails(){
			return stRepo.findAll();
		}
		
		public mainentity updateDetails(mainentity e1) {
			return stRepo.saveAndFlush(e1);
		}
		
		public void deleteDetails(int id) {
			stRepo.deleteById(id);
		}

	}

