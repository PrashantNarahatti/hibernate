package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;


public class JuiceDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Juice juice = application.getBean("juice", Juice.class);
		boolean spring = juice.drink();
		System.out.println(spring);
		String string = juice.coldJuice();
		System.out.println(string);

		Juice juice1 = application.getBean("juice", Juice.class);
		boolean spring1 = juice1.drink();
		System.out.println(spring1);
		String string1 = juice1.coldJuice();
		System.out.println(string1.toUpperCase());
	}

}
