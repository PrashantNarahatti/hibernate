package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Mask;


public class MaskDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Mask mask = application.getBean("mask", Mask.class);
		boolean spring = mask.safety();
		System.out.println(spring);
		String string = mask.protectVirus();
		System.out.println(string);

		Mask mask1 = application.getBean("mask2", Mask.class);
		boolean spring1 = mask1.safety();
		System.out.println(spring1);
		String string1 = mask1.protectVirus();
		System.out.println(string1.toUpperCase());
	}

}
