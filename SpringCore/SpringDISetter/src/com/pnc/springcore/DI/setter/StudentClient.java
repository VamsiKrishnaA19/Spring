package com.pnc.springcore.DI.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/pnc/springcore/DI/setter/beans.xml");
		Student student = (Student)context.getBean("studentbean");
		student.displayInfo();
	}

}
