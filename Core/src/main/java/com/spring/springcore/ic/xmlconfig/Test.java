package com.spring.springcore.ic.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/ic/xmlconfig/patientconfig.xml");
		Patient p = (Patient) ctx.getBean("p1");
		
		System.out.println(p);
		ctx.registerShutdownHook();
		
	}

}
