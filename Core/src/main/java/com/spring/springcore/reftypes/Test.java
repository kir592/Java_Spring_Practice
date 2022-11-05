package com.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/reftypes/studentconfig.xml");
		Student s1 = (Student) ctx.getBean("student1");
		
		System.out.println(s1);
		
	}

}
