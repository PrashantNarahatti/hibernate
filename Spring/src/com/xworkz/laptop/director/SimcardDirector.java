package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Simcard;

public class SimcardDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Simcard sim = application.getBean("simcard", Simcard.class);
		boolean spring = sim.working();
		System.out.println(spring);
		String string = sim.calling();
		System.out.println(string);

		Simcard sim1 = application.getBean("simcard2", Simcard.class);
		boolean spring1 = sim1.working();
		System.out.println(spring1);
		String string1 = sim1.calling();
		System.out.println(string1.toUpperCase());
	}

}
