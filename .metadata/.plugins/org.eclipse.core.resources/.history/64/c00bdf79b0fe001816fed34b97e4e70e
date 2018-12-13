package com.spring.question9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean , DisposableBean {
	

	
	public void afterPropertiesSet(){
		System.out.println("Init method called");
	}

	public void getMessage() {
		System.out.println("Hello World");
	}

	public void destroy(){
		System.out.println("Destroy method called");
	}

	
}
