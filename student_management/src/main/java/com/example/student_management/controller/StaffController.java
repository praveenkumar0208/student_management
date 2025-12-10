package com.example.student_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_management.entity.Staff;
import com.example.student_management.service.StaffServiceImp;

@RestController
@RequestMapping("/staff")
public class StaffController {
private final StaffServiceImp service;


public StaffController(StaffServiceImp service) {
	this.service=service;
}
@PostMapping
	public Staff createStaff(@RequestBody Staff staff) {
		return service.save(staff);
	}
@GetMapping("/{id}")
public Staff gerStafById(@PathVariable Long id) {
	return service.getStaffById(id);
}
@GetMapping
public List<Staff> getAllStaffs(){
	return service.getAllStaff();
}
	
@DeleteMapping("/{id}")
public String deleteStaff(@PathVariable Long id) {
	service.deleteStaff(id);
	return "Staff deleted succesfully";
}
}
