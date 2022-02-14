package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Students;
import com.springrest.springrest.service.StudentService;

@RestController
public class StudentController {
		
	//since we are trying to access the list information from service impl file, we need to create an object of its parent class
		@Autowired //creates an object of its impl file and injects in the variable 
		private StudentService studentService;//declaring variable of service class so we can use in returning the output
		
	//first trying to check the sever by simple endpoint welcome	
		@GetMapping("/welcome")
		public String welcome() {
			return "Welcome Student!";
		}
		
	//trying to get the list of all the students	
		@GetMapping("/students")
		public List<Students> getAllStudents() {
			
			List<Students> result = studentService.getAllStudents();
			return result;
		}
		
	//trying to get the student details based on their particular id	
		@GetMapping("/students/{studentId}")
		public Optional<Students> getStudent(@PathVariable Long studentId ) { //this method takes studentId value dynamically and stores in the variable  studentId
			
			return this.studentService.getStudents(studentId); 	
		}
		
		@PostMapping("/students")
		public Students addStudent(@RequestBody Students student) {
			return this.studentService.addStudent(student);
					
			
		}
}

