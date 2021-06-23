package com.example.response;

import org.springframework.beans.factory.annotation.Value;

public class StudentResponse3 {
	
	@Value("${app.name:Default Value is Displayed}")
	private String name;
	
	private String firstName;
	private String lastName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
