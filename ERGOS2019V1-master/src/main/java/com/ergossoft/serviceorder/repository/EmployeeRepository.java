package com.ergossoft.serviceorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ergossoft.serviceorder.model.Employee;

 

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

 @Query ("select e from Employee e , EmployeeSkill es, ProblemType p where e.employeeId=es.employeeId and es.skillTypeId=p.skillTypeId"
			+ " and es.skillLevelId >= p.skillLevelId and p.problemTypeId = ?1" )
	List<Employee> findAllEmployeeByProblemType(int problemType);
}
