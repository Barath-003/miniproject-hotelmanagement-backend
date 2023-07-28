package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.paymententity;
import com.example.demo.repository.paymentrepos;


@Service
public class paymentservice {

		@Autowired
		paymentrepos stRepo;
		
		public paymententity saveDetails(paymententity e) {
			return stRepo.save(e);
		}
		
		public List<paymententity> getDetails(){
			return stRepo.findAll();
		}
		
		public paymententity updateDetails(paymententity e1) {
			return stRepo.saveAndFlush(e1);
		}
		
		public void deleteDetails(int id) {
			stRepo.deleteById(id);
		}

	}

