package com.db.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.demo.model.Employee;
import com.db.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) { 
		// your business logic needed 
		return empRepository.findById(id).get();
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		// your business logic needed 
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// your business logic needed 
		return empRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// your business logic needed 
		return empRepository.save(employee);
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		// your business logic needed 
		empRepository.deleteById(id);
		return null;
	}

}

//package com.db.demo.service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.db.demo.model.Employee;
//
//@Service
//public class EmployeeService implements IEmployeeService {
//
//	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 90.50),
//			new Employee(102, "Monu", 95.75), new Employee(103, "Tonu", 92.25)));
//
//	@Override
//	public List<Employee> getAllEmployees() {
//		// return the empList
//		return empList;
//	}
//
//	@Override
//	public Employee getEmployeeById(Integer id) {
//		// find the matching Employee object from empList
//		return empList.stream() /* convert to stream */
//				.filter(e -> e.getId().equals(id)) /* filter the data */
//				.findFirst().orElse(null); /* return if the data available else return null */
//	}
//
//	@Override
//	public List<Employee> getEmployeesByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee updateEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee deleteEmployee(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
