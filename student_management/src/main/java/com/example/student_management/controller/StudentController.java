package com.example.student_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_management.entity.Student;
import com.example.student_management.service.StudentServic;
import com.example.student_management.service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentServic service;
	
	public StudentController(StudentServic service) {
		this.service=service;
	}
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Long id) {
		return service.getStudentById(id);
		
	}
	@GetMapping 
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	@DeleteMapping("/{id}")
	public String deletStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "Student deleted successfully";
	}
}
