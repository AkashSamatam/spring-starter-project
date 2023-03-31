package com.example.demo;

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

@RestController
@RequestMapping("/api/v1")
public class emp_controller {

	@Autowired
	
	emp_repo ER;
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee E) {
		
		return ER.save(E);
	}
	@PostMapping("/add_user")
	public List<Employee>add_emp(@RequestBody List<Employee> emp){
		
		return ER.saveAll(emp);
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteEmployee(@PathVariable int id){
		ER.deleteById(id);
		return "successfully deleted  :"+id;
	}
	@GetMapping("/get/{id}")
	public Optional<Employee> get_user(@PathVariable int id) {
		return ER.findById(id);
	
	}
	
	@GetMapping("/get_list")
	public List<Employee> get_emp(){
		
		return ER.findAll();
	}
	@PutMapping("/update")
	public Employee update_emp(@RequestBody Employee Em) {
	
		int id = Em.getId();
		
		Employee Empl =ER.findById(id).get();
		
		Empl.setName(Em.getName());
		
		Empl.setEmail(Em.getEmail());
		
		return ER.save(Empl);
		
		
		
		
		 
		 
	
	}
	
}
