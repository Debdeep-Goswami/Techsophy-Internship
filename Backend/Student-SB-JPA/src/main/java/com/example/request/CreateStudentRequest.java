package com.example.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateStudentRequest {
	
	@NotNull(message="Id cannot be blank")
	private Long id;
	
	@NotBlank(message="Provide the first name")
	private String firstName;
	
	@NotBlank(message="Provide the last name")
	private String lastName;
	
}
