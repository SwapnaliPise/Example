package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/student")
	public List<Student> retrieveStudent( ){
		return studentRepository.findAll();
	}
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student){
		return studentRepository.save(student);
	}
}
