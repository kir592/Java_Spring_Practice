package com.spring.springcoreadvanced.objviaannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcoreadvanced/objviaannotation/config.xml");
		
		Instructor ins = (Instructor) ctx.getBean("instructor");
		
		System.out.println(ins.toString());
	}

}
