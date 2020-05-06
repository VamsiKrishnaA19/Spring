package com.pnc.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pnc/springaop/springconfig.xml");
		IBusinessLogic testObj = (IBusinessLogic)context.getBean("proxyobj");
		testObj.method1();
		testObj.method11();
		testObj.method2();
		testObj.method12();
	}

}
