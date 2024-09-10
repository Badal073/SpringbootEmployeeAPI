package com.piersqure.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	
	public Employee  insertEmployee(Employee employee) {
		Employee  savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = getEmployeeById(employee.getId());
		if (existingEmployee!= null) {
			existingEmployee.setName(employee.getName());
			existingEmployee.setDepartment(employee.getDepartment());
			existingEmployee.setSalary(employee.getSalary());
			return employeeRepository.save(existingEmployee);
		}
		return null;
	}

}
