package com.example.CompanyManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CompanyManagement.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

	
}