package com.vaibhu.aop.Demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* get*())")
	 public void loggingAdvice(){
	    System.out.println("Advice run. Get method is called");
	 }
}
