package com.db.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.db.demo.model.Employee;

public class EmployeeService implements IEmployeeService {

	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 90.50),
			new Employee(102, "monu", 95.75), new Employee(103, "Tonu", 92.25)));

	@Override
	public List<Employee> getAllEmployees() {
		return empList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {

//		find data from 
//		empList 
//		and return 

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
