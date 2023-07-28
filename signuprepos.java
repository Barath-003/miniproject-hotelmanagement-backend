package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.signupentity;

public interface signuprepos extends JpaRepository<signupentity,Integer>{

}