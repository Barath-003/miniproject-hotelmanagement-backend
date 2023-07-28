package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.paymententity;

public interface paymentrepos extends JpaRepository<paymententity,Integer>{

}

