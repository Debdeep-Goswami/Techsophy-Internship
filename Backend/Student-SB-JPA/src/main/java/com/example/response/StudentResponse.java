package com.example.response;

import com.example.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {
	
	@JsonIgnore		//	To Ignore the displaying the data on the browser
	private Long id;	
	
	private String first_name;
	
	private String last_name;
	
	public StudentResponse (Student student) {
		this.id=student.getId();
		this.first_name=student.getFirstName();
		this.last_name=student.getLastName();
		
	}

}
