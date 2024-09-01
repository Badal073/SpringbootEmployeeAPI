package com.piersqure.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name="JDBCEmployee")
@Builder
public class Employee {

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String department;
private Double salary;

//No argument constructor
public Employee() {
	super();
}

//all argument constructor
public Employee(Long id, String name, String department, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.salary = salary;
}

//getter & setter
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

//toString
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}


}
