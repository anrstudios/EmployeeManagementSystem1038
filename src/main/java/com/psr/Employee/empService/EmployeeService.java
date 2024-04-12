package com.psr.Employee.empService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psr.Employee.Entity.Employee;
import com.psr.Employee.empRepository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);

	
	}
}
