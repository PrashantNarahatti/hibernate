package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Sanitizer;

public class SanitizerDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Sanitizer sanitizer = application.getBean("sanitizer",Sanitizer.class);
		boolean spring = sanitizer.killGerm();
		System.out.println(spring);
		String string = sanitizer.killsVirus();
		System.out.println(string);
		
		Sanitizer sanitizer1 = application.getBean("sanitizer1",Sanitizer.class);
		boolean spring1 = sanitizer1.killGerm();
		System.out.println(spring1);
		String string1 = sanitizer1.killsVirus();
		System.out.println(string1.toUpperCase());
	}

}
