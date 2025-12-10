package com.example.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Staff;
import com.example.student_management.repository.StaffRepository;
@Service
public class StaffService implements StaffServiceImp {
private final StaffRepository repository;

public  StaffService(StaffRepository repository) {
	this.repository=repository;
}

public Staff save(Staff staff) {
	return repository.save(staff);
}
@Override
public List<Staff> getAllStaff(){
	return repository.findAll();
}
@Override
public void deleteStaff(Long id) {
	repository.deleteById(id);
}
@Override
public Staff getStaffById(long id) {
	return repository.findById(id).orElse(null);
	
}


}
