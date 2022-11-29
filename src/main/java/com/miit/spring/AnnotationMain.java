package com.miit.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);
		HomeWork h = context.getBean(HomeWork.class);
		h.anwork();
		context.close();
	}

}
