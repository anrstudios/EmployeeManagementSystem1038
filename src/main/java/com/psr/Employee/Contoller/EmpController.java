package com.psr.Employee.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psr.Employee.Entity.Employee;
import com.psr.Employee.empService.EmployeeService;


@RestController
@RequestMapping("/")
public class EmpController {
		
		@Autowired
		private EmployeeService employeeService;
		
		@PostMapping("save")
		public void saveEmployee(@RequestBody Employee employee) {
			
			employeeService.saveEmployee(employee);
		
		}
}
