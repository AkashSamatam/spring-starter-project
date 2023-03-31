package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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
@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = {"email"})
})

public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int rollno;
	
	@NotEmpty
	@Size(min = 4,message = "studentname must contain atleast 4 characters")
	private String studentname;
	@Email(message = "Enter a valid mail")
//	@Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\\\.[a-z]{2,3}")
	@NotEmpty
	private String email;
	
	private String classname;
	
	private String password;
	
	private String url;
	

}
