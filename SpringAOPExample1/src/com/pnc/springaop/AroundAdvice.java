package com.pnc.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{
	public Object invoke(MethodInvocation i1) throws Throwable{
		System.out.println("good evening everybody...");
		i1.proceed();
		System.out.println("Good bye...");
		return null;
	}
}
