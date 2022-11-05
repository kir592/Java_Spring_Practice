package com.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/list/hosconfig.xml");
		Hospital hos = (Hospital) ctx.getBean("hos");
		
		System.out.println(hos.getDepartments());
		
	}

}
