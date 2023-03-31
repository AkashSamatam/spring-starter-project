package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Students;
import com.example.demo.Repository.std_repo;
@Service
public class std_dao {

	@Autowired
	std_repo repo;

	public Students addStudents(Students S) {
		
		return repo.save(S);
	}
	
	public List<Students> add_Students(List<Students> S){
		
		return repo.saveAll(S);
	}
	
	public String  deleteStudents (int rollno) {
		
		repo.deleteById(rollno);
		return "deleted successfully" +rollno;
	}
	
	public Optional<Students> Getbyid(int rollno) {
		
		return repo.findById(rollno);
		
	}
	
	public List<Students> Getall(){
		
		return repo.findAll();
	
	}
	
	public Students update_students(Students Std) {
		
		int rollno= Std.getRollno();
		
		Students S =repo.findById(rollno).get();
		
		S.setStudentname(Std.getStudentname());
		
		S.setClassname(Std.getClassname());
		
		S.setEmail(Std.getEmail());
		
		S.setPassword(Std.getPassword());
		
		return repo.save(S);
	}
}
