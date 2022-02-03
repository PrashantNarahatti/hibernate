package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Steamer;



public class SteamerDirector {

	public static void main(String[] args) {
		String xmlpath = "resource/spring.xml";
		ApplicationContext application = new ClassPathXmlApplicationContext(xmlpath);

		Steamer steamer=application.getBean("steamer",Steamer.class);
		boolean spring = steamer.clean();
		System.out.println(spring);
		String string = steamer.heat();
		System.out.println(string);
		
		Steamer steamer1=application.getBean("steamer2",Steamer.class);
		boolean spring1 = steamer1.clean();
		System.out.println(spring1);
		String string1= steamer1.heat();
		System.out.println(string1);
	}

}
