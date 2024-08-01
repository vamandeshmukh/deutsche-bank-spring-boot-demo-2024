package com.db.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;

@RestController
public class EmployeeController {

//	View the output here - 
//	http://localhost:8090/emp/101

	@GetMapping("emp/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") Integer id) {
		// find the employee by the given id - 
		Employee employee = new Employee(id, "Sonu", 90.50);
		System.out.println(employee.toString());
		return employee;
	}

	@GetMapping("emp")
	public List<Employee> getAllEmps() {
		// find the employees - 
		return null;
	}
}






