package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Tablet;

public class TabletDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Tablet tablet=application.getBean("tablet",Tablet.class);
		boolean spring = tablet.killBacteria();
		System.out.println(spring);
		String string = tablet.immunity();
		System.out.println(string);
		
		Tablet tablet1=application.getBean("tablet2",Tablet.class);
		boolean spring1 = tablet1.killBacteria();
		System.out.println(spring1);
		String string1= tablet1.immunity();
		System.out.println(string1);
		
		
	}

}
