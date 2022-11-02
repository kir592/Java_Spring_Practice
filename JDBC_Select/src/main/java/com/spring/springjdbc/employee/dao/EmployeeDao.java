package com.spring.springjdbc.employee.dao;

import com.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	int create(Employee employee);
	
	
	Employee read(int id);
}
