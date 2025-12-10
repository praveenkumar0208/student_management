package com.example.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_management.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
