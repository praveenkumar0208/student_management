package com.example.student_management.service;

import java.util.List;

import com.example.student_management.entity.Staff;

public interface StaffServiceImp {
	Staff save(Staff staff);
	Staff getStaffById(long id);
	
	List<Staff> getAllStaff();
	
	void deleteStaff(Long id);
	
}
