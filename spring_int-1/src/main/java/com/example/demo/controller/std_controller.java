package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Students;
import com.example.demo.dao.std_dao;
@RestController
@RequestMapping("/api/v1")
public class std_controller {

	@Autowired
	
	std_dao dao;
	@PostMapping("/addstd")
	public Students adStudents(@RequestBody Students S) {
		
		return dao.addStudents(S);
		
	}
	@PostMapping("/std_list")
	public List<Students> allStudents(@RequestBody List<Students> S){
		
		return dao.add_Students(S);
	}
	@GetMapping("/get_std/{rollno}")
	public Optional<Students> findbyid (@PathVariable int rollno) {
		
		return dao.Getbyid(rollno);
	}
	@GetMapping("/get_all")
	public List<Students> findall(){
		
		return dao.Getall();
	}
	@DeleteMapping("/delete/{rollno}")
	public String deletebyid(@PathVariable int rollno) {
		
		return dao.deleteStudents(rollno);
	}
	@PutMapping("/up_std")
	public Students updateStudents (@RequestBody Students S) {
		
		return dao.update_students(S);
	}
}
