package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Tissue;



public class TissueDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Tissue tissue=application.getBean("tissue",Tissue.class);
		boolean spring = tissue.handClean();
		System.out.println(spring);
		String string = tissue.colour();
		System.out.println(string);
		

		Tissue tissue2=application.getBean("tissue2",Tissue.class);
		boolean spring1 = tissue2.handClean();
		System.out.println(spring1);
		String string1 = tissue2.colour();
		System.out.println(string1);	
		}

}
