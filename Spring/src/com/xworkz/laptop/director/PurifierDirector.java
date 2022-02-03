package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Purifier;


public class PurifierDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Purifier purifier=application.getBean("purifier",Purifier.class);
		boolean spring = purifier.cleanWater();
		System.out.println(spring);
		String string = purifier.drinkWater();
		System.out.println(string);
		
		Purifier purifier1=application.getBean("purifier2",Purifier.class);
		boolean spring1 = purifier1.cleanWater();
		System.out.println(spring1);
		String string1= purifier1.drinkWater();
		System.out.println(string1);
	}

}
