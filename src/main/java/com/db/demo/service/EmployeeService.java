package com.db.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.db.demo.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 90.50),
			new Employee(102, "monu", 95.75), new Employee(103, "Tonu", 92.25)));

	@Override
	public List<Employee> getAllEmployees() {
		// return the empList 
		return empList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// find the matching Employee object from empList 
		return null;
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
