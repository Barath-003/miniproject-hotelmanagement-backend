package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.flightentity;

public interface flightrepos extends JpaRepository<flightentity,Integer>{

}
