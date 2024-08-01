package com.db.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
////	insert these records manually in the oracle database 
//
//	INSERT INTO emps (id, name, salary) VALUES (101, 'Sonu', 90.75);
//	INSERT INTO emps (id, name, salary) VALUES (102, 'Monu', 95.50);
//	INSERT INTO emps (id, name, salary) VALUES (103, 'Tonu', 92.25);
//
//	COMMIT;
//
//	SELECT * FROM emps;

}
