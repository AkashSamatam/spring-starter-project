package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(uniqueConstraints = {
//		@UniqueConstraint(columnNames = {"email"})
//})
public class Marks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int rollno;
	
	private int Telugu;
	
	private int English;
	
	private int hindi;
	
	private int science;
	
	private int social;
	
	private double Totalmarks;
	
	private double percentage;
	
}
