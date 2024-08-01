package com.db.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Employee;
import com.db.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService empService;

//	View the output here - 
//	http://localhost:8090/emp/101

	@GetMapping("emp")
	public List<Employee> getAllEmps() {
		System.out.println("getAllEmps");
		return empService.getAllEmployees();
	}

	@GetMapping("emp/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") Integer id) {
		System.out.println(id);
		return empService.getEmployeeById(id);
	}

	@PostMapping("emp")
	public Employee addEmp(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return empService.addEmployee(employee);
	}

	// create these methods -
// 
//	getEmpsByName
//	
//	addEmp 
//	
//	updateEmp 
//	
//	deleteEmp 

}
