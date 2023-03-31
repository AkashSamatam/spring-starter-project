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

import com.example.demo.Entities.Marks;
import com.example.demo.dao.marks_dao;
@RestController
@RequestMapping("/api/v1")
public class marks_controller {

	@Autowired
	marks_dao dao;
	@PostMapping("/addmarks")
	public Marks add_Marks(@RequestBody Marks m) {
		
		return dao.addmarks(m);
	}
	@PostMapping("/marks_list")
	public List<Marks> markslist(@RequestBody List<Marks> m){
		
		return dao.add_marks(m);
	}
	@GetMapping("/get_marks/{rollno}")
	public Optional<Marks> findbyid (@PathVariable int rollno){
		
		return dao.Getbyid(rollno);
	}
	@GetMapping("/get_allmarks")
	public List<Marks> findall(){
		
		return dao.Getall();
	}
	@DeleteMapping("/deletemarks/{rollno}")
	public String deletebyid(@PathVariable int rollno) {
		
		return dao.deletemarks(rollno);
	}
	@PutMapping("/update_marks")
	public Marks updatemarks(@RequestBody Marks m) {
		
		return dao.update_marks(m);
	}
	
}
