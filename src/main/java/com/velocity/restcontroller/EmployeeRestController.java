package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Employee;
import com.velocity.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("getEmployeeByCity/{city}")
	public List<Employee> getEmployeeByCity(@PathVariable("city") String city) {
		List<Employee> emp=employeeService.getEmployeeByCity(city);
		return emp;
		
	}

}
