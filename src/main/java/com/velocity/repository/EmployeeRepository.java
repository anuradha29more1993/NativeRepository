package com.velocity.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Serializable>{
		//@Query(value="select * from employees e where city=?1",nativeQuery = true)
		public List<Employee> getEmployeeByCity(String city);
}
