package com.velocity.service.imlp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Employee;
import com.velocity.repository.EmployeeRepository;
import com.velocity.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	//inject
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployeeByCity(String city) {
		List<Employee> emp=employeeRepository.getEmployeeByCity(city);
		return emp;
		
	}

}
