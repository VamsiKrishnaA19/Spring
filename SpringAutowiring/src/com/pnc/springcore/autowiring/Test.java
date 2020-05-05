package com.pnc.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pnc/springcore/autowiring/applicationContext.xml");
		Employee employee =(Employee)context.getBean("employeebean");
		employee.display();
	}
	
}
