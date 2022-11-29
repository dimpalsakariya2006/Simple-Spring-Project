package com.miit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HybridMain {
	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) context.getBean("homeWork");
		s.work();
	}

}
