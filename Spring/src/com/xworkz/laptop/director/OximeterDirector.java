package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Oximeter;


public class OximeterDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Oximeter oximeter=application.getBean("oximeter",Oximeter.class);
		boolean spring = oximeter.skinPigmention();
		System.out.println(spring);
		String string = oximeter.detectVirus();
		System.out.println(string);
		

		Oximeter oximeter1=application.getBean("oximeter2",Oximeter.class);
		boolean spring1 = oximeter1.skinPigmention();
		System.out.println(spring1);
		String string1 = oximeter1.detectVirus();
		System.out.println(string1);	
	}

}
