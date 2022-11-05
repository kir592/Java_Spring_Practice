package com.spring.springcore.propertyfiletest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/propertyfiletest/config.xml");
		
		AccountDAO dao = (AccountDAO) ctx.getBean("mydao");
		
		System.out.println(dao.toString());
	}

}
