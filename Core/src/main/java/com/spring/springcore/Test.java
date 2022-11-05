package com.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		
		emp.setId(111);
		System.out.println(emp.getId() + emp.getName());
		
		
		
		Employee emp2 = (Employee) ctx.getBean("emp");
		System.out.println(emp.getId() + emp.getName());
		
		
	}
}
