package com.piersqure.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piersqure.employee.entity.Employee;
import com.piersqure.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}
	
	public Employee getEmployeeById(Long id) {
		Employee  employee = employeeRepository.findById(id).orElse(null);
		return employee;
	}

}
