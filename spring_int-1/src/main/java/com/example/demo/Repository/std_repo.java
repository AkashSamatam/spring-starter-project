package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Students;

public interface std_repo extends JpaRepository<Students, Integer> {

	
}
