package com.miit.spring;


import org.springframework.stereotype.Component;

@Component
public class HomeWork implements Student{

	@Override
	public void work() {

		System.out.println("HomeWork Done...(Using Xml + Annotation)");
		
	}

	@Override
	public void anwork() {
		
		
		System.out.println("HomeWork Done...(Using Annotation)");
		
	}



}
