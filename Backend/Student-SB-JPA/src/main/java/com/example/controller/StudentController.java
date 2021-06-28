package com.example.controller;

import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.request.CreateStudentRequest;
import com.example.request.InQueryStudentRequest;
import com.example.request.UpdateStudentRequest;
import com.example.response.StudentResponse;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService; 

	
	//###########################################  Get methods ###########################################
	
	
	//	All Records
	@GetMapping("/getAll")
	public List<StudentResponse> getAllStudents() {
		List<Student> studentList=studentService.getAllStudents();
		List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		return studentResponseList;
		
	}
	
	//	Using First Name Only
	@GetMapping("/getByFirstName/{firstName}")
	public List<StudentResponse> getByFirstName(@PathVariable("firstName") String firstName  ) {
		List<Student> studentList=studentService.getByFirstName(firstName);
		List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		return studentResponseList;
	
	}
	
	
	//	Using Last Name Only
	@GetMapping("/getByLastName/{lastName}")
	public List<StudentResponse> getByLastName(@PathVariable("lastName") String lastName  ) {
		List<Student> studentList=studentService.getByLastName(lastName);
		List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		return studentResponseList;
	
	}
	
	//	Using AND
	@GetMapping("/getByFirstNameAndLastName/{firstName}/{lastName}")
	public List<StudentResponse> getByFirstNameAndLastName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
		List<Student> studentList=studentService.getByFirstNameAndLastName(firstName, lastName);
		List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		return studentResponseList;
	}
	
	//	Using OR
	@GetMapping("/getByFirstNameOrLastName/{firstName}/{lastName}")
	public List<StudentResponse> getByFirstNameOrLastName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
		List<Student> studentList=studentService.getByFirstNameOrLastName(firstName, lastName);
		List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		return studentResponseList;
	}
	
	
	//	Using IN
	@GetMapping("/getByFirstNameIn")
	public List<StudentResponse> getByFirstNameIn(@RequestBody InQueryStudentRequest inQueryStudentRequest){
		List<Student> studentList=studentService.getByFirstNameIn(inQueryStudentRequest);
		List<StudentResponse> studentResponseList=new ArrayList<StudentResponse>();
		studentList.stream().forEach(student->{
			studentResponseList.add(new StudentResponse(student));
		});
		return studentResponseList;
	}
	
	//________________________________________  End of Get Methods ______________________________________
	
	
	//###################################### Post Method  ######################################################
	
	@PostMapping("/create")
	public StudentResponse createStudent(@Valid @RequestBody CreateStudentRequest createStudentRequest) {
			Student student=studentService.createStudent(createStudentRequest);
			return new StudentResponse(student);
	}
	
	//_____________________________________  End of Post Methods ____________________________________________
	
	
	//#########################################  Put Method  ################################################
	
	@PutMapping("/update")
	public StudentResponse updateStudent(@Valid @RequestBody UpdateStudentRequest updateStudentRequest) {
		
		Student student=studentService.updateStudent(updateStudentRequest);
		
		return new StudentResponse(student);
		
	}
	
	//__________________________________________  End of Put Methods _________________________________________
	
	
	//#########################################  Delete Method  ################################################
	
	@DeleteMapping("/delete")
	public String deleteStudent1(@RequestParam("id") long id) {
		return studentService.deleteStudent(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent2(@PathVariable("id") long id) {
		return studentService.deleteStudent(id);
	}
	
	//__________________________________________  End of Delete Methods _________________________________________
}
