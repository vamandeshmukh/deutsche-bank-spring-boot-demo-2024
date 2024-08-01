package com.db.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
