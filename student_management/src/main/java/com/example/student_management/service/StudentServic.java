package com.example.student_management.service;

import java.util.List;

import com.example.student_management.entity.Student;

public interface StudentServic {
Student saveStudent(Student student);

List<Student> getAllStudent();

Student getStudentById(Long id);
void deleteStudent(Long id);
}
