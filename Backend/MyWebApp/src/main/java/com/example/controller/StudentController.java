package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.StudentResponse;
import com.example.response.StudentResponse3;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	
	@Value("${app.name:Default Value is Displayed}")
	private String appName;
	
	@GetMapping("/get")
	//@RequestMapping(value="/get", method=RequestMethod.GET)
	public String getStudent() {
		return appName;
	}
	
	
	@GetMapping("/get2")
	public StudentResponse getStudent2() {
		StudentResponse myStudentResponse=new StudentResponse(1,"Debdeep","Goswami","M.Tech");		
		return myStudentResponse;
		
	}
	
	private String test;
	@GetMapping("/get3")
	public String getStudent3() {
		StudentResponse3 myStudentResponse3=new StudentResponse3();//("Sunny","Debdeep","Goswami");		
		//return myStudentResponse3;
		test=myStudentResponse3.getName();
		return test;
		
	}
	
}