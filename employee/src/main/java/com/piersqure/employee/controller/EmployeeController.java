package com.piersqure.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piersqure.employee.entity.Employee;
import com.piersqure.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> employeeList = employeeService.getAllEmployee();
		return ResponseEntity.ok(employeeList);
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable Long id){
		Employee employee =  employeeService.getEmployeeById(id);
		return ResponseEntity.ok(employee);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Employee> insertEmployeeDetails(@RequestBody Employee employee){
		Employee createEmployee = employeeService.insertEmployee(employee);
		return ResponseEntity.ok(createEmployee);
	}
	
}
