package com.pnc.springcore.DI.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pnc/springcore/DI/constructor/applicationContext.xml");
		Employee employee = (Employee)context.getBean("employeebean");
		employee.show();
	}

}
