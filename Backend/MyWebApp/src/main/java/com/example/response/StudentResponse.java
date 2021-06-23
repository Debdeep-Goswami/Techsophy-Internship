package com.example.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
	
	@JsonIgnore		//	To ignore a field in Json response
	private long id;
	
	@JsonProperty("First Name = ")
	private String firstName;

	@JsonProperty("Last Name = ")
	private String lastName;
	
	@JsonProperty("Course Name = ")
	private String course;

}