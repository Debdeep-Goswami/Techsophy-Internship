package com.example.response;

/*
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
*/
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StudentResponseOld {
	
	@JsonIgnore		//	To ignore a field in Json response
	private long id;
	
	@JsonProperty("First Name = ")
	private String firstName;
		
	private String lastName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public StudentResponseOld(long id, String firstName, String lastName) {
		//super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/*
	@Override
	@GetMapping("/get")
	public String toString() {
		return "StudentResponse [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	*/
}
