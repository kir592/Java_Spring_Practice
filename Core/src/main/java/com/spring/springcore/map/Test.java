package com.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/map/customerconfig.xml");
		Customer customer1 = (Customer) ctx.getBean("customer1");
		
		System.out.println(customer1);
		
	}

}
