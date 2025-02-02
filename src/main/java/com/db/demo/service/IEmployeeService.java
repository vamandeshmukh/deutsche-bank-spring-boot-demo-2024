package com.db.demo.service;

import java.util.List;

import com.db.demo.model.Employee;

public interface IEmployeeService {

	public abstract List<Employee> getAllEmployees();

	public abstract Employee getEmployeeById(Integer id);

	public abstract List<Employee> getEmployeesByName(String name);

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(Integer id);

}
