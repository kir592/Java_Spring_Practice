package com.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.employee.dao.EmployeeDao;
import com.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		
		Employee emp = new Employee ();
		emp.setFirstName("lololol");
		emp.setLastName("qwpoe");
		emp.setId(342);
		
		Employee read = dao.read(342);
		
		System.out.println("Employee read: " + read.toString());
		
		
	}

}
