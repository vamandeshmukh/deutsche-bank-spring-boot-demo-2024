package com.db.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}

//https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#jpa.query-methods

//	For basic CRUD Ops - no need to write any methods 

//	select - findAll();
//	select - findById();
//	insert - save();
//	update - save();
//	delete - deleteById();

//	For business specific queries, abstract methods need to be declared 
	
//	syntax 
//	public abstract List<Employee> findByFieldName(String firstName);
	
////	insert these records manually in the oracle database 
//
// NO Need to create table 
//	INSERT INTO emps (id, name, salary) VALUES (101, 'Sonu', 90.75);
//	INSERT INTO emps (id, name, salary) VALUES (102, 'Monu', 95.50);
//	INSERT INTO emps (id, name, salary) VALUES (103, 'Tonu', 92.25);
//
//	COMMIT;
//
//	SELECT * FROM emps;


