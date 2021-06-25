package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.request.CreateStudentRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="student_details")
public class Student {
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	//	Constructor to create a student record in the table
	public Student(CreateStudentRequest createStudentRequest) {
		
		this.id=createStudentRequest.getId();
		this.firstName=createStudentRequest.getFirstName();
		this.lastName=createStudentRequest.getLastName();
	}
}
