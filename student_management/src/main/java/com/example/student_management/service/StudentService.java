package com.example.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;
@Service
public class StudentService implements StudentServic {
	private final StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	@Override
	public List<Student> getAllStudent(){
		return repository.findAll();
	}
	@Override
	
	public Student getStudentById(Long id) {
		return repository.findById(id).orElse(null);
	}
	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

	
}
