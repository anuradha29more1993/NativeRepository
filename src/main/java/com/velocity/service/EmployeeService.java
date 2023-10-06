package com.velocity.service;

import java.util.List;

import com.velocity.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployeeByCity(String city);
}
